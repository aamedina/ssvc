(ns net.wikipunk.ssvc.boot
  {:rdf/type :jsonld/Context})

(def ssvc
  {:rdf/type         :rdfa/PrefixMapping
   :rdfa/uri         "https://wikipunk.net/ssvc/"
   :rdfa/prefix      "ssvc"
   :dcat/downloadURL "resources/ssvc.ttl"})

(def stix
  {:rdf/type         :rdfa/PrefixMapping
   :rdfa/uri         "http://docs.oasis-open.org/cti/ns/stix#"
   :rdfa/prefix      "stix"
   :dcat/downloadURL "resources/stix.ttl"})

(def tal
  {:rdf/type         :rdfa/PrefixMapping
   :rdfa/uri         "http://www.intel.com/ns/ta-library#"
   :rdfa/prefix      "tal"
   :dcat/downloadURL "resources/tac-ontology/threat-agent-lib/ta-library.owl"})

(def security-playbook
  {:rdf/type         :rdfa/PrefixMapping
   :rdfa/uri         "http://docs.oasis-open.org/tac/ns/security-playbook#"
   :rdfa/prefix      "security-playbook"
   :dcat/downloadURL "resources/tac-ontology/security-playbook/security-playbook.owl"
   :private          true})
