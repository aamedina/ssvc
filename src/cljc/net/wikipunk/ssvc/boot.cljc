(ns net.wikipunk.ssvc.boot
  {:rdf/type :jsonld/Context}
  (:require
   [net.wikipunk.rdf.rdf]
   [net.wikipunk.rdf.rdfs]
   [net.wikipunk.rdf.owl]
   [net.wikipunk.rdf.xsd]
   [net.wikipunk.rdf.spdx]
   [net.wikipunk.rdf.d3fend]
   [net.wikipunk.rdf.dcterms]
   [net.wikipunk.rdf.prov]))

(def ssvc
  {:rdf/type         :rdfa/PrefixMapping
   :rdfa/uri         "https://wikipunk.net/ssvc/"
   :rdfa/prefix      "ssvc"
   :dcat/downloadURL "resources/ssvc.ttl"})
