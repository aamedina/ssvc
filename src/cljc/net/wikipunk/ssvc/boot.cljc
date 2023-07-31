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
   :dcat/downloadURL "resources/tac/stix.ttl"})

(def tac
  {:rdf/type         :rdfa/PrefixMapping
   :rdfa/uri         "http://docs.oasis-open.org/tac/ns/tac#"
   :rdfa/prefix      "tac"
   :dcat/downloadURL "resources/tac/tac.owl"
   :private          true})

(def tal
  {:rdf/type         :rdfa/PrefixMapping
   :rdfa/uri         "http://www.intel.com/ns/ta-library#"
   :rdfa/prefix      "tal"
   :dcat/downloadURL "resources/tac/ta-library.owl"})

(def security-playbook
  {:rdf/type         :rdfa/PrefixMapping
   :rdfa/uri         "http://docs.oasis-open.org/tac/ns/security-playbook#"
   :rdfa/prefix      "security-playbook"
   :dcat/downloadURL "resources/tac/security-playbook.owl"
   :private          true})

(def spdx-ai
  {:rdfa/uri         "https://spdx.org/rdf/v3/AI/"
   :rdfa/prefix      "spdx-ai"
   :rdf/type         :rdfa/PrefixMapping
   :dcat/downloadURL "resources/spdx/model.ttl"})

(def spdx-build
  {:rdfa/uri    "https://spdx.org/rdf/v3/Build/"
   :rdfa/prefix "spdx-build"
   :rdf/type    :rdfa/PrefixMapping
   :dcat/downloadURL "resources/spdx/model.ttl"})

(def spdx-core
  {:rdfa/uri    "https://spdx.org/rdf/v3/Core/"
   :rdfa/prefix "spdx-core"
   :rdf/type    :rdfa/PrefixMapping
   :dcat/downloadURL "resources/spdx/model.ttl"})

(def spdx-dataset
  {:rdfa/uri    "https://spdx.org/rdf/v3/Dataset/"
   :rdfa/prefix "spdx-dataset"
   :rdf/type    :rdfa/PrefixMapping
   :dcat/downloadURL "resources/spdx/model.ttl"})

(def spdx-security
  {:rdfa/uri    "https://spdx.org/rdf/v3/Security/"
   :rdfa/prefix "spdx-security"
   :rdf/type    :rdfa/PrefixMapping
   :dcat/downloadURL "resources/spdx/model.ttl"})

(def spdx-simplelicensing
  {:rdfa/uri    "https://spdx.org/rdf/v3/SimpleLicensing/"
   :rdfa/prefix "spdx-simplelicensing"
   :rdf/type    :rdfa/PrefixMapping
   :dcat/downloadURL "resources/spdx/model.ttl"})

(def spdx-expandedlicensing
  {:rdfa/uri    "https://spdx.org/rdf/v3/ExpandedLicensing/"
   :rdfa/prefix "spdx-expandedlicensing"
   :rdf/type    :rdfa/PrefixMapping
   :dcat/downloadURL "resources/spdx/model.ttl"})

(def spdx-software
  {:rdfa/uri    "https://spdx.org/rdf/v3/Software/"
   :rdfa/prefix "spdx-software"
   :rdf/type    :rdfa/PrefixMapping
   :dcat/downloadURL "resources/spdx/model.ttl"})
