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
   [net.wikipunk.rdf.exif]
   [net.wikipunk.rdf.stix]
   [net.wikipunk.rdf.d3f]
   [net.wikipunk.rdf.spdx]
   [net.wikipunk.rdf.doap]
   [net.wikipunk.rdf.sioc.types]
   [net.wikipunk.rdf.pointers]
   [net.wikipunk.rdf.tal]
   [net.wikipunk.rdf.tac]
   [net.wikipunk.rdf.sh]))

(defrecord SSVC []
  com/Lifecycle
  (start [this]
    (defmethod rdf/infer-datomic-type :sh/name [_] :db.type/string)
    (defmethod rdf/infer-datomic-type :sh/minCount [_] :db.type/long)
    (defmethod rdf/infer-datomic-type :sh/maxCount [_] :db.type/long)
    this)
  (stop [this]
    this))
