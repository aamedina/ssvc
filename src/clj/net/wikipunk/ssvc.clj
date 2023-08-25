(ns net.wikipunk.ssvc
  "Stakeholder Specific Vulnerability Categorization"
  (:require
   [com.stuartsierra.component :as com]
   [net.wikipunk.ssvc.boot]
   [net.wikipunk.mop :as mop]
   [net.wikipunk.rdf :as rdf]
   [net.wikipunk.rdf.ssvc]
   [net.wikipunk.rdf.annotea]
   [net.wikipunk.rdf.annotation]
   [net.wikipunk.rdf.frbr]
   [net.wikipunk.rdf.exif]
   [net.wikipunk.rdf.stix]
   [net.wikipunk.rdf.d3f]
   [net.wikipunk.rdf.spdx]
   [net.wikipunk.rdf.doap]
   [net.wikipunk.rdf.sioc.types]
   [net.wikipunk.rdf.ptr]
   [net.wikipunk.rdf.tal]
   [net.wikipunk.rdf.tac]
   [net.wikipunk.rdf.sh]      
   [net.wikipunk.rdf.spdx-ai]
   [net.wikipunk.rdf.spdx-build]
   [net.wikipunk.rdf.spdx-core]
   [net.wikipunk.rdf.spdx-dataset]
   [net.wikipunk.rdf.spdx-expandedlicensing]
   [net.wikipunk.rdf.spdx-security]
   [net.wikipunk.rdf.spdx-simplelicensing]
   [net.wikipunk.rdf.spdx-software]
   [net.wikipunk.rdf.spdx-spec]
   [net.wikipunk.rdf.openvex]))

(defrecord SSVC []
  com/Lifecycle
  (start [this]
    (defmethod rdf/infer-datomic-type :sh/name [_] :db.type/string)
    (defmethod rdf/infer-datomic-type :sh/minCount [_] :db.type/long)
    (defmethod rdf/infer-datomic-type :sh/maxCount [_] :db.type/long)
    (defmethod rdf/infer-datomic-type :spdx/referenceLocator [_] :db.type/string)
    (defmethod rdf/infer-datomic-unique :spdx/referenceLocator [_] :db.unique/identity)
    (defmethod rdf/infer-datomic-cardinality :spdx/referenceLocator [_] :db.cardinality/one)
    (defmethod rdf/infer-datomic-unique :spdx/licenseId [_] :db.unique/identity)
    (defmethod rdf/infer-datomic-cardinality :spdx/licenseId [_] :db.cardinality/one)
    (defmethod rdf/infer-datomic-type :spdx-core/DateTime [_] :db.type/instant)
    (rdf/import-from 'net.wikipunk.rdf.spdx-spec 'net.wikipunk.rdf.spdx-core)
    this)
  (stop [this]
    this))
