(ns net.wikipunk.rdf.security-playbook
  ^{:base       "http://docs.oasis-open.org/tac/ns/security-playbook#",
    :namespaces {"marking" "http://docs.oasis-open.org/cti/ns/data-marking#",
                 "owl"     "http://www.w3.org/2002/07/owl#",
                 "rdf"     "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                 "rdfs"    "http://www.w3.org/2000/01/rdf-schema#",
                 "security-playbook"
                 "http://docs.oasis-open.org/tac/ns/security-playbook#",
                 "stix"    "http://docs.oasis-open.org/cti/ns/stix#",
                 "xsd"     "http://www.w3.org/2001/XMLSchema#"},
    :prefix     "security-playbook",
    :source     "resources/tac/security-playbook.owl"}
  {:owl/imports
   #{{:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/vulnerability"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/indicator"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/malware"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/attack-pattern"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/tool"}},
   :rdf/type :owl/Ontology,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "An ontology for encapsulating security playbooks and their metadata. This ontology (security-playbook.owl) is based on the metadata template for security playbooks provided at: https://github.com/Vasileios-Mavroeidis/coa-playbook-metadata"},
   :xsd/anyURI "http://docs.oasis-open.org/tac/ns/security-playbook"})

(def SecurityPlaybook
  {:db/ident        :security-playbook/SecurityPlaybook,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :stix/CourseOfAction})

(def SecurityPlaybookAbstractionLevelOpenVocab
  {:db/ident :security-playbook/SecurityPlaybookAbstractionLevelOpenVocab,
   :owl/equivalentClass {:owl/oneOf [{:rdf/value "user-definition-01"}
                                     {:rdf/value "user-definition-02"}],
                         :rdf/type  :rdfs/Datatype},
   :rdf/type :rdfs/Datatype})

(def SecurityPlaybookAbstractionLevelVocab
  {:db/ident :security-playbook/SecurityPlaybookAbstractionLevelVocab,
   :owl/equivalentClass {:owl/oneOf [{:rdf/value "executable"}
                                     {:rdf/value "template"}],
                         :rdf/type  :rdfs/Datatype},
   :rdf/type :rdfs/Datatype})

(def SecurityPlaybookTypeOpenVocab
  {:db/ident :security-playbook/SecurityPlaybookTypeOpenVocab,
   :owl/equivalentClass {:owl/oneOf [{:rdf/value "user-definition-01"}
                                     {:rdf/value "user-definition-02"}],
                         :rdf/type  :rdfs/Datatype},
   :rdf/type :rdfs/Datatype})

(def SecurityPlaybookTypeVocab
  {:db/ident :security-playbook/SecurityPlaybookTypeVocab,
   :owl/equivalentClass {:owl/oneOf [{:rdf/value "attack"}
                                     {:rdf/value "detection"}
                                     {:rdf/value "investigation"}
                                     {:rdf/value "mitigation"}
                                     {:rdf/value "notification"}
                                     {:rdf/value "prevention"}
                                     {:rdf/value "remediation"}],
                         :rdf/type  :rdfs/Datatype},
   :rdf/type :rdfs/Datatype})

(def impact
  {:db/ident :security-playbook/impact,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "An integer that represents the impact the playbook has on the organization from 0 to 100. A value of 0 means specifically undefined. Values range from 1, the lowest impact, to a value of 100, the highest. For example, a purely investigative playbook that is non-invasive would have a low impact value of 1, whereas a playbook that performs changes such as adding rules into a firewall would have a higher impact value."},
   :rdfs/label "impact",
   :rdfs/range {:owl/onDatatype :xsd/integer,
                :owl/withRestrictions [{:xsd/minInclusive 0M}
                                       {:xsd/maxInclusive 100M}],
                :rdf/type       :rdfs/Datatype}})

(def organization_type
  {:db/ident :security-playbook/organization_type,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The type of organization that the playbook is intended for. This can be an industry sector."},
   :rdfs/domain :security-playbook/SecurityPlaybook,
   :rdfs/label "organization_type",
   :rdfs/range :xsd/string})

(def playbook
  {:db/ident :security-playbook/playbook,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The whole playbook in its native format (e.g., CACAO JSON - Stringified). Security playbook producers and consumers of playbooks use this property to share and retrieve playbooks."},
   :rdfs/domain :security-playbook/SecurityPlaybook,
   :rdfs/label "playbook",
   :rdfs/range :xsd/string})

(def playbook_abstraction
  {:db/ident     :security-playbook/playbook_abstraction,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en-us",
                  :rdf/value    "Identifies the playbook abstraction level."},
   :rdfs/domain  :security-playbook/SecurityPlaybook,
   :rdfs/label   "playbook_abstraction",
   :rdfs/range   {:owl/unionOf
                  [:security-playbook/SecurityPlaybookAbstractionLevelOpenVocab
                   :security-playbook/SecurityPlaybookAbstractionLevelVocab],
                  :rdf/type :rdfs/Datatype}})

(def playbook_base64
  {:db/ident :security-playbook/playbook_base64,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The whole playbook encoded in base64. Security playbook producers and consumers of playbooks use this property to share and retrieve playbooks."},
   :rdfs/domain :security-playbook/SecurityPlaybook,
   :rdfs/range :xsd/string})

(def playbook_standard
  {:db/ident     :security-playbook/playbook_standard,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en-us",
                  :rdf/value
                  "Identification of the playbook standard (e.g., CACAO)."},
   :rdfs/domain  :security-playbook/SecurityPlaybook,
   :rdfs/label   "playbook_standard",
   :rdfs/range   :xsd/string})

(def playbook_type
  {:db/ident :security-playbook/playbook_type,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The security-focused operational functions the playbook addresses. A playbook may account for multiple types (e.g., detection and investigation)."},
   :rdfs/domain :security-playbook/SecurityPlaybook,
   :rdfs/label "playbook_type",
   :rdfs/range {:owl/unionOf [:security-playbook/SecurityPlaybookTypeOpenVocab
                              :security-playbook/SecurityPlaybookTypeVocab],
                :rdf/type    :rdfs/Datatype}})

(def priority
  {:db/ident :security-playbook/priority,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "An integer that represents the priority of this playbook relative to other defined playbooks. A value of 0 means specifically undefined. Values range from 1, the highest priority, to a value of 100, the lowest."},
   :rdfs/domain :security-playbook/SecurityPlaybook,
   :rdfs/label "priority",
   :rdfs/range {:owl/onDatatype :xsd/integer,
                :owl/withRestrictions [{:xsd/minInclusive 0M}
                                       {:xsd/maxInclusive 100M}],
                :rdf/type       :rdfs/Datatype}})

(def severity
  {:db/ident :security-playbook/severity,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "An integer that represents the seriousness of the conditions that this playbook addresses. A value of 0 means specifically undefined. Values range from 1, the lowest severity, to a value of 100, the highest."},
   :rdfs/domain :security-playbook/SecurityPlaybook,
   :rdfs/label "severity",
   :rdfs/range {:owl/onDatatype :xsd/integer,
                :owl/withRestrictions [{:xsd/minInclusive 0M}
                                       {:xsd/maxInclusive 100M}],
                :rdf/type       :rdfs/Datatype}})

(def ^{:private true} investigates
  {:db/ident   :stix/investigates,
   :rdf/type   :owl/ObjectProperty,
   :rdfs/range :stix/Indicator})

(def ^{:private true} mitigates
  {:db/ident   :stix/mitigates,
   :rdf/type   :owl/ObjectProperty,
   :rdfs/range #{:stix/AttackPattern :stix/Indicator :stix/Vulnerability
                 :stix/Malware :stix/Tool}})

(def ^{:private true} remediates
  {:db/ident   :stix/remediates,
   :rdf/type   :owl/ObjectProperty,
   :rdfs/range #{:stix/Vulnerability :stix/Malware}})

(def urn:uuid:793b0487-f562-501b-8ff7-ec087d8246e4
  {:owl/imports
   #{{:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/vulnerability"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/indicator"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/malware"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/attack-pattern"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/tool"}},
   :rdf/type :owl/Ontology,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "An ontology for encapsulating security playbooks and their metadata. This ontology (security-playbook.owl) is based on the metadata template for security playbooks provided at: https://github.com/Vasileios-Mavroeidis/coa-playbook-metadata"},
   :xsd/anyURI "http://docs.oasis-open.org/tac/ns/security-playbook"})