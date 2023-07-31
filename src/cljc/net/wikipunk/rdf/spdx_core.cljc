(ns net.wikipunk.rdf.spdx-core
  {:dcat/downloadURL  "resources/spdx/model.ttl",
   :rdf/ns-prefix-map {"owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "sh" "http://www.w3.org/ns/shacl#",
                       "spdx-ai" "https://spdx.org/rdf/v3/AI/",
                       "spdx-build" "https://spdx.org/rdf/v3/Build/",
                       "spdx-core" "https://spdx.org/rdf/v3/Core/",
                       "spdx-dataset" "https://spdx.org/rdf/v3/Dataset/",
                       "spdx-expandedlicensing"
                       "https://spdx.org/rdf/v3/ExpandedLicensing/",
                       "spdx-security" "https://spdx.org/rdf/v3/Security/",
                       "spdx-simplelicensing"
                       "https://spdx.org/rdf/v3/SimpleLicensing/",
                       "spdx-software" "https://spdx.org/rdf/v3/Software/",
                       "vs" "http://www.w3.org/2003/06/sw-vocab-status/ns#",
                       "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type          :rdfa/PrefixMapping,
   :rdfa/prefix       "spdx-core",
   :rdfa/uri          "https://spdx.org/rdf/v3/Core/"}
  (:refer-clojure :exclude [comment key name]))

(def Agent
  "The Agent class represents anything that has the potential to act on a system. This could be a person, organization, software agent, etc. This is not to be confused with tools that are used to perform tasks."
  {:db/ident :spdx-core/Agent,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "The Agent class represents anything that has the potential to act on a system. This could be a person, organization, software agent, etc. This is not to be confused with tools that are used to perform tasks.",
   :rdfs/subClassOf :spdx-core/Element,
   :vs/term_status "Stable"})

(def Annotation
  "An Annotation is an assertion made in relation to one or more elements."
  {:db/ident :spdx-core/Annotation,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "An Annotation is an assertion made in relation to one or more elements.",
   :rdfs/subClassOf :spdx-core/Element,
   :sh/property [{:sh/class    :spdx-core/Element,
                  :sh/maxCount #xsd/integer 1,
                  :sh/minCount #xsd/integer 1,
                  :sh/name     "subject",
                  :sh/path     :spdx-core/subject}
                 {:sh/datatype :xsd/string,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "statement",
                  :sh/path     :spdx-core/statement}
                 {:sh/class    :spdx-core/AnnotationType,
                  :sh/maxCount #xsd/integer 1,
                  :sh/minCount #xsd/integer 1,
                  :sh/name     "annotationType",
                  :sh/path     :spdx-core/annotationType}
                 {:sh/datatype :spdx-core/MediaType,
                  :sh/name     "contentType",
                  :sh/path     :spdx-core/contentType}],
   :vs/term_status "Stable"})

(def AnnotationType
  "AnnotationType specifies the type of an annotation."
  {:db/ident       :spdx-core/AnnotationType,
   :owl/oneOf      [{:rdfa/uri
                     "https://spdx.org/rdf/v3/Core/AnnotationType/review"}
                    {:rdfa/uri
                     "https://spdx.org/rdf/v3/Core/AnnotationType/other"}],
   :rdf/type       :owl/Class,
   :rdfs/comment   "AnnotationType specifies the type of an annotation.",
   :vs/term_status "Stable"})

(def Artifact
  "An artifact is a distinct article or unit within the digital domain,\nsuch as an electronic file, a software package, a device or an element of data."
  {:db/ident :spdx-core/Artifact,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "An artifact is a distinct article or unit within the digital domain,\nsuch as an electronic file, a software package, a device or an element of data.",
   :rdfs/subClassOf :spdx-core/Element,
   :sh/property [{:sh/datatype :spdx-core/DateTime,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "releaseTime",
                  :sh/path     :spdx-core/releaseTime}
                 {:sh/datatype :xsd/string,
                  :sh/name     "standard",
                  :sh/path     :spdx-core/standard}
                 {:sh/class :spdx-core/Agent,
                  :sh/name  "originatedBy",
                  :sh/path  :spdx-core/originatedBy}
                 {:sh/datatype :spdx-core/DateTime,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "builtTime",
                  :sh/path     :spdx-core/builtTime}
                 {:sh/datatype :spdx-core/DateTime,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "validUntilTime",
                  :sh/path     :spdx-core/validUntilTime}
                 {:sh/class :spdx-core/Agent,
                  :sh/name  "suppliedBy",
                  :sh/path  :spdx-core/suppliedBy}],
   :vs/term_status "Stable"})

(def Bom
  "A Bill Of Materials (BOM) is a container for a grouping of SPDX-3.0 content\ncharacterizing details about a product.\nThis could include details of the content and composition of the product,\nprovenence details of the product and/or\nits composition, licensing information, known quality or security issues, etc."
  {:db/ident :spdx-core/Bom,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "A Bill Of Materials (BOM) is a container for a grouping of SPDX-3.0 content\ncharacterizing details about a product.\nThis could include details of the content and composition of the product,\nprovenence details of the product and/or\nits composition, licensing information, known quality or security issues, etc.",
   :rdfs/subClassOf
   [:spdx-core/Bundle :spdx-core/ElementCollection :spdx-core/Element],
   :vs/term_status "Stable"})

(def Bundle
  "A bundle is a collection of Elements that have a shared context."
  {:db/ident :spdx-core/Bundle,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "A bundle is a collection of Elements that have a shared context.",
   :rdfs/subClassOf [:spdx-core/ElementCollection :spdx-core/Element],
   :sh/property {:sh/datatype :xsd/string,
                 :sh/maxCount #xsd/integer 1,
                 :sh/name     "context",
                 :sh/path     :spdx-core/context},
   :vs/term_status "Stable"})

(def CreationInfo
  "The CreationInfo provides information about who created the Element, and when and how it was created. \n\nThe dateTime created is often the date of last change (e.g., a git commit date), not the date when the SPDX data was created, as doing so supports reproducible builds."
  {:db/ident :spdx-core/CreationInfo,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "The CreationInfo provides information about who created the Element, and when and how it was created. \n\nThe dateTime created is often the date of last change (e.g., a git commit date), not the date when the SPDX data was created, as doing so supports reproducible builds.",
   :sh/property [{:sh/datatype :spdx-core/SemVer,
                  :sh/maxCount #xsd/integer 1,
                  :sh/minCount #xsd/integer 1,
                  :sh/name     "specVersion",
                  :sh/path     :spdx-core/specVersion}
                 {:sh/datatype :xsd/string,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "comment",
                  :sh/path     :spdx-core/comment}
                 {:sh/datatype :spdx-core/DateTime,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "created",
                  :sh/path     :spdx-core/created}
                 {:sh/datatype :xsd/string,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "dataLicense",
                  :sh/path     :spdx-core/dataLicense}
                 {:sh/class    :spdx-core/Agent,
                  :sh/minCount #xsd/integer 1,
                  :sh/name     "createdBy",
                  :sh/path     :spdx-core/createdBy}
                 {:sh/class    :spdx-core/ProfileIdentifierType,
                  :sh/minCount #xsd/integer 1,
                  :sh/name     "profile",
                  :sh/path     :spdx-core/profile}
                 {:sh/class :spdx-core/Tool,
                  :sh/name  "createdUsing",
                  :sh/path  :spdx-core/createdUsing}],
   :vs/term_status "Stable"})

(def DateTime
  "A Datetime is a string representation of a specific date and time. It has resolution of seconds and is always expressed in UTC timezone. The specific format is one of the most commonly used ISO-8601 formats."
  {:db/ident :spdx-core/DateTime,
   :owl/withRestrictions
   [{:xsd/pattern "^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$"}],
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   "A Datetime is a string representation of a specific date and time. It has resolution of seconds and is always expressed in UTC timezone. The specific format is one of the most commonly used ISO-8601 formats.",
   :rdfs/subClassOf :xsd/string,
   :vs/term_status "Stable"})

(def DictionaryEntry
  "The class used for implementing a generic string mapping (also known as associative array, dictionary, or hash map) in SPDX.  Each DictionaryEntry contains a key-value pair which maps the key to its associated value.  To implement a dictionary, this class is to be used in a collection with unique keys."
  {:db/ident :spdx-core/DictionaryEntry,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "The class used for implementing a generic string mapping (also known as associative array, dictionary, or hash map) in SPDX.  Each DictionaryEntry contains a key-value pair which maps the key to its associated value.  To implement a dictionary, this class is to be used in a collection with unique keys.",
   :sh/property [{:sh/datatype :xsd/string,
                  :sh/maxCount #xsd/integer 1,
                  :sh/minCount #xsd/integer 1,
                  :sh/name     "key",
                  :sh/path     :spdx-core/key}
                 {:sh/datatype :xsd/string,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "value",
                  :sh/path     :spdx-core/value}],
   :vs/term_status "Stable"})

(def Element
  "An Element is a representation of a fundamental concept either directly inherent\nto the Bill of Materials (BOM) domain or indirectly related to the BOM domain\nand necessary for contextually characterizing BOM concepts and relationships.\nWithin SPDX-3.0 structure this is the base class acting as a consistent,\nunifying, and interoperable foundation for all explicit\nand inter-relatable content objects."
  {:db/ident :spdx-core/Element,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "An Element is a representation of a fundamental concept either directly inherent\nto the Bill of Materials (BOM) domain or indirectly related to the BOM domain\nand necessary for contextually characterizing BOM concepts and relationships.\nWithin SPDX-3.0 structure this is the base class acting as a consistent,\nunifying, and interoperable foundation for all explicit\nand inter-relatable content objects.",
   :sh/property [{:sh/class :spdx-core/ExternalReference,
                  :sh/name  "externalReference",
                  :sh/path  :spdx-core/externalReference}
                 {:sh/class :spdx-core/IntegrityMethod,
                  :sh/name  "verifiedUsing",
                  :sh/path  :spdx-core/verifiedUsing}
                 {:sh/datatype :xsd/string,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "name",
                  :sh/path     :spdx-core/name}
                 {:sh/datatype :xsd/string,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "description",
                  :sh/path     :spdx-core/description}
                 {:sh/datatype :xsd/string,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "summary",
                  :sh/path     :spdx-core/summary}
                 {:sh/class    :spdx-core/CreationInfo,
                  :sh/maxCount #xsd/integer 1,
                  :sh/minCount #xsd/integer 1,
                  :sh/name     "creationInfo",
                  :sh/path     :spdx-core/creationInfo}
                 {:sh/class :spdx-core/ExternalIdentifier,
                  :sh/name  "externalIdentifier",
                  :sh/path  :spdx-core/externalIdentifier}
                 {:sh/datatype :xsd/string,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "comment",
                  :sh/path     :spdx-core/comment}],
   :vs/term_status "Stable"})

(def ElementCollection
  "An SpdxCollection is a collection of Elements, not necessarily with unifying context."
  {:db/ident :spdx-core/ElementCollection,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "An SpdxCollection is a collection of Elements, not necessarily with unifying context.",
   :rdfs/subClassOf :spdx-core/Element,
   :sh/property [{:sh/class :spdx-core/ExternalMap,
                  :sh/name  "imports",
                  :sh/path  :spdx-core/imports}
                 {:sh/class    :spdx-core/Element,
                  :sh/minCount #xsd/integer 1,
                  :sh/name     "element",
                  :sh/path     :spdx-core/element}
                 {:sh/class    :spdx-core/Element,
                  :sh/minCount #xsd/integer 1,
                  :sh/name     "rootElement",
                  :sh/path     :spdx-core/rootElement}],
   :vs/term_status "Stable"})

(def ExternalIdentifier
  "An ExternalIdentifier is a reference to a resource outside the scope of SPDX-3.0 content\nthat uniquely identifies an Element."
  {:db/ident :spdx-core/ExternalIdentifier,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "An ExternalIdentifier is a reference to a resource outside the scope of SPDX-3.0 content\nthat uniquely identifies an Element.",
   :sh/property [{:sh/datatype :xsd/string,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "comment",
                  :sh/path     :spdx-core/comment}
                 {:sh/class    :spdx-core/ExternalIdentifierType,
                  :sh/maxCount #xsd/integer 1,
                  :sh/minCount #xsd/integer 1,
                  :sh/name     "externalIdentifierType",
                  :sh/path     :spdx-core/externalIdentifierType}
                 {:sh/datatype :xsd/string,
                  :sh/maxCount #xsd/integer 1,
                  :sh/minCount #xsd/integer 1,
                  :sh/name     "identifier",
                  :sh/path     :spdx-core/identifier}
                 {:sh/datatype :xsd/anyURI,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "issuingAuthority",
                  :sh/path     :spdx-core/issuingAuthority}
                 {:sh/datatype :xsd/anyURI,
                  :sh/name     "identifierLocator",
                  :sh/path     :spdx-core/identifierLocator}],
   :vs/term_status "Stable"})

(def ExternalIdentifierType
  "ExteralIdentifierType specifies the type of an external identifier."
  {:db/ident :spdx-core/ExternalIdentifierType,
   :owl/oneOf
   [{:rdfa/uri "https://spdx.org/rdf/v3/Core/ExternalIdentifierType/email"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/ExternalIdentifierType/cpe22"}
    {:rdfa/uri
     "https://spdx.org/rdf/v3/Core/ExternalIdentifierType/securityOther"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/ExternalIdentifierType/swhid"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/ExternalIdentifierType/other"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/ExternalIdentifierType/urlScheme"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/ExternalIdentifierType/cpe23"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/ExternalIdentifierType/gitoid"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/ExternalIdentifierType/pkgUrl"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/ExternalIdentifierType/swid"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/ExternalIdentifierType/cve"}],
   :rdf/type :owl/Class,
   :rdfs/comment
   "ExteralIdentifierType specifies the type of an external identifier.",
   :vs/term_status "Stable"})

(def ExternalMap
  "An External Map is a map of Element identifiers that are used within a Document\nbut defined external to that Document.\nThe external map provides details about the externally-defined Element\nsuch as its provenance, where to retrieve it, and how to verify its integrity."
  {:db/ident :spdx-core/ExternalMap,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "An External Map is a map of Element identifiers that are used within a Document\nbut defined external to that Document.\nThe external map provides details about the externally-defined Element\nsuch as its provenance, where to retrieve it, and how to verify its integrity.",
   :sh/property [{:sh/datatype :xsd/anyURI,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "definingDocument",
                  :sh/path     :spdx-core/definingDocument}
                 {:sh/datatype :xsd/anyURI,
                  :sh/maxCount #xsd/integer 1,
                  :sh/minCount #xsd/integer 1,
                  :sh/name     "externalId",
                  :sh/path     :spdx-core/externalId}
                 {:sh/class :spdx-core/IntegrityMethod,
                  :sh/name  "verifiedUsing",
                  :sh/path  :spdx-core/verifiedUsing}
                 {:sh/datatype :xsd/anyURI,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "locationHint",
                  :sh/path     :spdx-core/locationHint}],
   :vs/term_status "Stable"})

(def ExternalReference
  "An External Reference points to a resource outside the scope of the SPDX-3.0 content\nthat provides additional characteristics of an Element."
  {:db/ident :spdx-core/ExternalReference,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "An External Reference points to a resource outside the scope of the SPDX-3.0 content\nthat provides additional characteristics of an Element.",
   :sh/property [{:sh/datatype :xsd/anyURI,
                  :sh/name     "locator",
                  :sh/path     :spdx-core/locator}
                 {:sh/datatype :spdx-core/MediaType,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "contentType",
                  :sh/path     :spdx-core/contentType}
                 {:sh/class    :spdx-core/ExternalReferenceType,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "externalReferenceType",
                  :sh/path     :spdx-core/externalReferenceType}
                 {:sh/datatype :xsd/string,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "comment",
                  :sh/path     :spdx-core/comment}],
   :vs/term_status "Stable"})

(def ExternalReferenceType
  "ExteralReferenceType specifies the type of an external reference."
  {:db/ident :spdx-core/ExternalReferenceType,
   :owl/oneOf
   [{:rdfa/uri
     "https://spdx.org/rdf/v3/Core/ExternalReferenceType/componentAnalysisReport"}
    {:rdfa/uri
     "https://spdx.org/rdf/v3/Core/ExternalReferenceType/securityAdvisory"}
    {:rdfa/uri
     "https://spdx.org/rdf/v3/Core/ExternalReferenceType/vulnerabilityExploitabilityAssessment"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/ExternalReferenceType/buildSystem"}
    {:rdfa/uri
     "https://spdx.org/rdf/v3/Core/ExternalReferenceType/releaseHistory"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/ExternalReferenceType/funding"}
    {:rdfa/uri
     "https://spdx.org/rdf/v3/Core/ExternalReferenceType/sourceArtifact"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/ExternalReferenceType/vcs"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/ExternalReferenceType/chat"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/ExternalReferenceType/buildMeta"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/ExternalReferenceType/eolNotice"}
    {:rdfa/uri
     "https://spdx.org/rdf/v3/Core/ExternalReferenceType/releaseNotes"}
    {:rdfa/uri
     "https://spdx.org/rdf/v3/Core/ExternalReferenceType/securityAdversaryModel"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/ExternalReferenceType/altWebPage"}
    {:rdfa/uri
     "https://spdx.org/rdf/v3/Core/ExternalReferenceType/altDownloadLocation"}
    {:rdfa/uri
     "https://spdx.org/rdf/v3/Core/ExternalReferenceType/certificationReport"}
    {:rdfa/uri
     "https://spdx.org/rdf/v3/Core/ExternalReferenceType/purchaseOrder"}
    {:rdfa/uri
     "https://spdx.org/rdf/v3/Core/ExternalReferenceType/privacyAssessment"}
    {:rdfa/uri
     "https://spdx.org/rdf/v3/Core/ExternalReferenceType/securityPenTestReport"}
    {:rdfa/uri
     "https://spdx.org/rdf/v3/Core/ExternalReferenceType/issueTracker"}
    {:rdfa/uri
     "https://spdx.org/rdf/v3/Core/ExternalReferenceType/qualityAssessmentReport"}
    {:rdfa/uri
     "https://spdx.org/rdf/v3/Core/ExternalReferenceType/secureSoftwareAttestation"}
    {:rdfa/uri
     "https://spdx.org/rdf/v3/Core/ExternalReferenceType/riskAssessment"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/ExternalReferenceType/support"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/ExternalReferenceType/securityFix"}
    {:rdfa/uri
     "https://spdx.org/rdf/v3/Core/ExternalReferenceType/staticAnalysisReport"}
    {:rdfa/uri
     "https://spdx.org/rdf/v3/Core/ExternalReferenceType/runtimeAnalysisReport"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/ExternalReferenceType/socialMedia"}
    {:rdfa/uri
     "https://spdx.org/rdf/v3/Core/ExternalReferenceType/productMetadata"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/ExternalReferenceType/mailingList"}
    {:rdfa/uri
     "https://spdx.org/rdf/v3/Core/ExternalReferenceType/securityPolicy"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/ExternalReferenceType/license"}
    {:rdfa/uri
     "https://spdx.org/rdf/v3/Core/ExternalReferenceType/exportControlAssessment"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/ExternalReferenceType/other"}
    {:rdfa/uri
     "https://spdx.org/rdf/v3/Core/ExternalReferenceType/securityThreatModel"}
    {:rdfa/uri
     "https://spdx.org/rdf/v3/Core/ExternalReferenceType/binaryArtifact"}
    {:rdfa/uri
     "https://spdx.org/rdf/v3/Core/ExternalReferenceType/dynamicAnalysisReport"}
    {:rdfa/uri
     "https://spdx.org/rdf/v3/Core/ExternalReferenceType/securityOther"}
    {:rdfa/uri
     "https://spdx.org/rdf/v3/Core/ExternalReferenceType/documentation"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/ExternalReferenceType/metrics"}
    {:rdfa/uri
     "https://spdx.org/rdf/v3/Core/ExternalReferenceType/vulnerabilityDisclosureReport"}],
   :rdf/type :owl/Class,
   :rdfs/comment
   "ExteralReferenceType specifies the type of an external reference.",
   :vs/term_status "Stable"})

(def Hash
  "A hash is a grouping of characteristics unique to the result\nof applying a mathematical algorithm\nthat maps data of arbitrary size to a bit string (the hash)\nand is a one-way function, that is,\na function which is practically infeasible to invert.\nThis is commonly used for integrity checking of data."
  {:db/ident :spdx-core/Hash,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "A hash is a grouping of characteristics unique to the result\nof applying a mathematical algorithm\nthat maps data of arbitrary size to a bit string (the hash)\nand is a one-way function, that is,\na function which is practically infeasible to invert.\nThis is commonly used for integrity checking of data.",
   :rdfs/subClassOf :spdx-core/IntegrityMethod,
   :sh/property [{:sh/class    :spdx-core/HashAlgorithm,
                  :sh/maxCount #xsd/integer 1,
                  :sh/minCount #xsd/integer 1,
                  :sh/name     "algorithm",
                  :sh/path     :spdx-core/algorithm}
                 {:sh/datatype :xsd/string,
                  :sh/maxCount #xsd/integer 1,
                  :sh/minCount #xsd/integer 1,
                  :sh/name     "hashValue",
                  :sh/path     :spdx-core/hashValue}],
   :vs/term_status "Stable"})

(def HashAlgorithm
  "A HashAlgorithm is a mathematical algorithm that maps data of arbitrary size to a bit string (the hash)\nand is a one-way function, that is, a function which is practically infeasible to invert."
  {:db/ident :spdx-core/HashAlgorithm,
   :owl/oneOf
   [{:rdfa/uri "https://spdx.org/rdf/v3/Core/HashAlgorithm/blake3"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/HashAlgorithm/blake2b384"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/HashAlgorithm/sha512"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/HashAlgorithm/spdxPvcSha1"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/HashAlgorithm/sha1"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/HashAlgorithm/sha224"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/HashAlgorithm/sphincsPlus"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/HashAlgorithm/md5"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/HashAlgorithm/sha3_224"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/HashAlgorithm/blake2b256"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/HashAlgorithm/md4"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/HashAlgorithm/other"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/HashAlgorithm/crystalsDilithium"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/HashAlgorithm/md2"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/HashAlgorithm/blake2b512"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/HashAlgorithm/sha256"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/HashAlgorithm/sha3_384"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/HashAlgorithm/sha3_512"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/HashAlgorithm/md6"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/HashAlgorithm/spdxPvcSha256"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/HashAlgorithm/crystalsKyber"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/HashAlgorithm/falcon"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/HashAlgorithm/sha3_256"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/HashAlgorithm/sha384"}],
   :rdf/type :owl/Class,
   :rdfs/comment
   "A HashAlgorithm is a mathematical algorithm that maps data of arbitrary size to a bit string (the hash)\nand is a one-way function, that is, a function which is practically infeasible to invert.",
   :vs/term_status "Stable"})

(def IntegrityMethod
  "An IntegrityMethod provides an independently reproducible mechanism that permits verification\nof a specific Element that correlates to the data in this SPDX document. This identifier enables\na recipient to determine if anything in the original Element has been changed and eliminates\nconfusion over which version or modification of a specific Element is referenced."
  {:db/ident :spdx-core/IntegrityMethod,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "An IntegrityMethod provides an independently reproducible mechanism that permits verification\nof a specific Element that correlates to the data in this SPDX document. This identifier enables\na recipient to determine if anything in the original Element has been changed and eliminates\nconfusion over which version or modification of a specific Element is referenced.",
   :sh/property {:sh/datatype :xsd/string,
                 :sh/maxCount #xsd/integer 1,
                 :sh/name     "comment",
                 :sh/path     :spdx-core/comment},
   :vs/term_status "Stable"})

(def LifecycleScopeType
  "TODO"
  {:db/ident :spdx-core/LifecycleScopeType,
   :owl/oneOf
   [{:rdfa/uri "https://spdx.org/rdf/v3/Core/LifecycleScopeType/build"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/LifecycleScopeType/runtime"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/LifecycleScopeType/test"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/LifecycleScopeType/other"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/LifecycleScopeType/design"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/LifecycleScopeType/development"}],
   :rdf/type :owl/Class,
   :rdfs/comment "TODO",
   :vs/term_status "Stable"})

(def LifecycleScopedRelationship
  "TODO"
  {:db/ident        :spdx-core/LifecycleScopedRelationship,
   :rdf/type        [:sh/NodeShape :owl/Class],
   :rdfs/comment    "TODO",
   :rdfs/subClassOf [:spdx-core/Relationship :spdx-core/Element],
   :sh/property     {:sh/class    :spdx-core/LifecycleScopeType,
                     :sh/maxCount #xsd/integer 1,
                     :sh/name     "scope",
                     :sh/path     :spdx-core/scope},
   :vs/term_status  "Stable"})

(def MediaType
  "A MediaType is a string constrained to the RFC 6838 specification, and includes type-name, subtype-name and optional parameters. It provides a standardized way of indicating the type of content of an Element. A list of all possible media types is available at https://www.iana.org/assignments/media-types/media-types.xhtml."
  {:db/ident :spdx-core/MediaType,
   :owl/withRestrictions
   [{:xsd/pattern
     "^([a-zA-Z0-9][-a-zA-Z0-9!#$&^.+]{0,126})/([a-zA-Z0-9][-a-zA-Z0-9!#$&^.+]{0,126})(;.+)?$"}],
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   "A MediaType is a string constrained to the RFC 6838 specification, and includes type-name, subtype-name and optional parameters. It provides a standardized way of indicating the type of content of an Element. A list of all possible media types is available at https://www.iana.org/assignments/media-types/media-types.xhtml.",
   :rdfs/subClassOf :xsd/string,
   :vs/term_status "Stable"})

(def Organization
  "An Organization is a group of people who work together in an organized way for a shared purpose."
  {:db/ident :spdx-core/Organization,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "An Organization is a group of people who work together in an organized way for a shared purpose.",
   :rdfs/subClassOf [:spdx-core/Agent :spdx-core/Element],
   :vs/term_status "Stable"})

(def Person
  "A Person is an individual human being."
  {:db/ident        :spdx-core/Person,
   :rdf/type        [:sh/NodeShape :owl/Class],
   :rdfs/comment    "A Person is an individual human being.",
   :rdfs/subClassOf [:spdx-core/Agent :spdx-core/Element],
   :vs/term_status  "Stable"})

(def PositiveIntegerRange
  "PositiveIntegerRange is a tuple of two positive integers that define a range.\n\"begin\" must be less than or equal to \"end\"."
  {:db/ident :spdx-core/PositiveIntegerRange,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "PositiveIntegerRange is a tuple of two positive integers that define a range.\n\"begin\" must be less than or equal to \"end\".",
   :sh/property [{:sh/datatype :xsd/positiveInteger,
                  :sh/maxCount #xsd/integer 1,
                  :sh/minCount #xsd/integer 1,
                  :sh/name     "begin",
                  :sh/path     :spdx-core/begin}
                 {:sh/datatype :xsd/positiveInteger,
                  :sh/maxCount #xsd/integer 1,
                  :sh/minCount #xsd/integer 1,
                  :sh/name     "end",
                  :sh/path     :spdx-core/end}],
   :vs/term_status "Stable"})

(def ProfileIdentifierType
  "There are a set of profiles that have been defined to be valid for a specific release   This file enumerates the values that have been agreed on, and may be applied to the creation information for an an element."
  {:db/ident :spdx-core/ProfileIdentifierType,
   :owl/oneOf
   [{:rdfa/uri "https://spdx.org/rdf/v3/Core/ProfileIdentifierType/extension"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/ProfileIdentifierType/ai"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/ProfileIdentifierType/core"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/ProfileIdentifierType/dataset"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/ProfileIdentifierType/software"}
    {:rdfa/uri
     "https://spdx.org/rdf/v3/Core/ProfileIdentifierType/simpleLicensing"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/ProfileIdentifierType/security"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/ProfileIdentifierType/usage"}
    {:rdfa/uri
     "https://spdx.org/rdf/v3/Core/ProfileIdentifierType/expandedLicensing"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/ProfileIdentifierType/build"}],
   :rdf/type :owl/Class,
   :rdfs/comment
   "There are a set of profiles that have been defined to be valid for a specific release   This file enumerates the values that have been agreed on, and may be applied to the creation information for an an element.",
   :vs/term_status "Stable"})

(def Relationship
  "A Relationship is a grouping of characteristics unique to an assertion\nthat one Element is related to one or more other Elements in some way."
  {:db/ident :spdx-core/Relationship,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "A Relationship is a grouping of characteristics unique to an assertion\nthat one Element is related to one or more other Elements in some way.",
   :rdfs/subClassOf :spdx-core/Element,
   :sh/property [{:sh/class    :spdx-core/RelationshipType,
                  :sh/maxCount #xsd/integer 1,
                  :sh/minCount #xsd/integer 1,
                  :sh/name     "relationshipType",
                  :sh/path     :spdx-core/relationshipType}
                 {:sh/datatype :spdx-core/DateTime,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "endTime",
                  :sh/path     :spdx-core/endTime}
                 {:sh/class    :spdx-core/Element,
                  :sh/maxCount #xsd/integer 1,
                  :sh/minCount #xsd/integer 1,
                  :sh/name     "from",
                  :sh/path     :spdx-core/from}
                 {:sh/class :spdx-core/Element,
                  :sh/name  "to",
                  :sh/path  :spdx-core/to}
                 {:sh/datatype :spdx-core/DateTime,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "startTime",
                  :sh/path     :spdx-core/startTime}
                 {:sh/class    :spdx-core/RelationshipCompleteness,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "completeness",
                  :sh/path     :spdx-core/completeness}],
   :vs/term_status "Stable"})

(def RelationshipCompleteness
  "RelationshipCompleteness indicates whether a relationship is complete or \nknown to be incomplete or if there is made no assertion either way."
  {:db/ident :spdx-core/RelationshipCompleteness,
   :owl/oneOf
   [{:rdfa/uri "https://spdx.org/rdf/v3/Core/RelationshipCompleteness/complete"}
    {:rdfa/uri
     "https://spdx.org/rdf/v3/Core/RelationshipCompleteness/incomplete"}
    {:rdfa/uri
     "https://spdx.org/rdf/v3/Core/RelationshipCompleteness/noAssertion"}],
   :rdf/type :owl/Class,
   :rdfs/comment
   "RelationshipCompleteness indicates whether a relationship is complete or \nknown to be incomplete or if there is made no assertion either way.",
   :vs/term_status "Stable"})

(def RelationshipType
  "Provides information about the relationship between two Elements.\nFor example, you can represent a relationship between two different Files,\nbetween a Package and a File, between two Packages, or between one SPDXDocument and another SPDXDocument."
  {:db/ident :spdx-core/RelationshipType,
   :owl/oneOf
   [{:rdfa/uri
     "https://spdx.org/rdf/v3/Core/RelationshipType/hasAssociatedVulnerability"}
    {:rdfa/uri
     "https://spdx.org/rdf/v3/Core/RelationshipType/providedDependency"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/RelationshipType/testDependency"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/RelationshipType/dependsOn"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/RelationshipType/configOf"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/RelationshipType/copy"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/RelationshipType/invokedBy"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/RelationshipType/evidenceFor"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/RelationshipType/fixedIn"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/RelationshipType/reportedBy"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/RelationshipType/describes"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/RelationshipType/packages"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/RelationshipType/other"}
    {:rdfa/uri
     "https://spdx.org/rdf/v3/Core/RelationshipType/optionalComponent"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/RelationshipType/patch"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/RelationshipType/coordinatedBy"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/RelationshipType/devTool"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/RelationshipType/fileDeleted"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/RelationshipType/amends"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/RelationshipType/fileModified"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/RelationshipType/test"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/RelationshipType/testTool"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/RelationshipType/exploitCreatedBy"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/RelationshipType/dynamicLink"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/RelationshipType/contains"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/RelationshipType/doesNotAffect"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/RelationshipType/hasAssessmentFor"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/RelationshipType/devDependency"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/RelationshipType/ancestor"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/RelationshipType/inputOf"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/RelationshipType/testedOn"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/RelationshipType/variant"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/RelationshipType/hostOf"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/RelationshipType/staticLink"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/RelationshipType/specificationFor"}
    {:rdfa/uri
     "https://spdx.org/rdf/v3/Core/RelationshipType/expandedFromArchive"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/RelationshipType/requirementFor"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/RelationshipType/buildDependency"}
    {:rdfa/uri
     "https://spdx.org/rdf/v3/Core/RelationshipType/optionalDependency"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/RelationshipType/outputOf"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/RelationshipType/documentation"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/RelationshipType/onBehalfOf"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/RelationshipType/metafile"}
    {:rdfa/uri
     "https://spdx.org/rdf/v3/Core/RelationshipType/dependencyManifest"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/RelationshipType/trainedOn"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/RelationshipType/publishedBy"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/RelationshipType/prerequisite"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/RelationshipType/fileAdded"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/RelationshipType/generates"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/RelationshipType/republishedBy"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/RelationshipType/descendant"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/RelationshipType/example"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/RelationshipType/availableFrom"}
    {:rdfa/uri
     "https://spdx.org/rdf/v3/Core/RelationshipType/runtimeDependency"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/RelationshipType/buildTool"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/RelationshipType/affects"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/RelationshipType/testCase"}
    {:rdfa/uri
     "https://spdx.org/rdf/v3/Core/RelationshipType/underInvestigationFor"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/RelationshipType/dataFile"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/RelationshipType/fixedBy"}
    {:rdfa/uri
     "https://spdx.org/rdf/v3/Core/RelationshipType/distributionArtifact"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Core/RelationshipType/foundBy"}],
   :rdf/type :owl/Class,
   :rdfs/comment
   "Provides information about the relationship between two Elements.\nFor example, you can represent a relationship between two different Files,\nbetween a Package and a File, between two Packages, or between one SPDXDocument and another SPDXDocument.",
   :vs/term_status "Stable"})

(def SemVer
  "A string constrained to be the SemVer 2.0.0 specification."
  {:db/ident :spdx-core/SemVer,
   :owl/withRestrictions
   [{:xsd/pattern
     "^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)\\.(0|[1-9]\\d*)(?:-((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$"}],
   :rdf/type :rdfs/Datatype,
   :rdfs/comment "A string constrained to be the SemVer 2.0.0 specification.",
   :rdfs/subClassOf :xsd/string,
   :vs/term_status "Stable"})

(def SoftwareAgent
  "A SoftwareAgent is a software program that is given the authority (similar to a user's authority) to act on a system."
  {:db/ident :spdx-core/SoftwareAgent,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "A SoftwareAgent is a software program that is given the authority (similar to a user's authority) to act on a system.",
   :rdfs/subClassOf [:spdx-core/Agent :spdx-core/Element],
   :vs/term_status "Stable"})

(def SpdxDocument
  "An SpdxDocument assembles a collection of Elements under a common string, the name of the document.\nCommonly used when representing a unit of transfer of SPDX Elements.\nExternal property restriction on /Core/Element/name: minCount: 1"
  {:db/ident :spdx-core/SpdxDocument,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "An SpdxDocument assembles a collection of Elements under a common string, the name of the document.\nCommonly used when representing a unit of transfer of SPDX Elements.\nExternal property restriction on /Core/Element/name: minCount: 1",
   :rdfs/subClassOf
   [:spdx-core/Bundle :spdx-core/ElementCollection :spdx-core/Element],
   :vs/term_status "Stable"})

(def Tool
  "A Tool is an element of hardware and/or software utilized to carry out a particular function."
  {:db/ident :spdx-core/Tool,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "A Tool is an element of hardware and/or software utilized to carry out a particular function.",
   :rdfs/subClassOf :spdx-core/Element,
   :vs/term_status "Stable"})

(def algorithm
  "An algorithm specifies the algorithm that was used for calculating the hash value."
  {:db/ident :spdx-core/algorithm,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "An algorithm specifies the algorithm that was used for calculating the hash value.",
   :rdfs/domain :spdx-core/Hash,
   :rdfs/range :spdx-core/HashAlgorithm,
   :vs/term_status "Stable"})

(def annotationType
  "An annotationType describes the type of an annotation."
  {:db/ident       :spdx-core/annotationType,
   :rdf/type       :owl/ObjectProperty,
   :rdfs/comment   "An annotationType describes the type of an annotation.",
   :rdfs/domain    :spdx-core/Annotation,
   :rdfs/range     :spdx-core/AnnotationType,
   :vs/term_status "Stable"})

(def begin
  "begin is a positive integer that defines the beginning of a range."
  {:db/ident :spdx-core/begin,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "begin is a positive integer that defines the beginning of a range.",
   :rdfs/domain :spdx-core/PositiveIntegerRange,
   :rdfs/range :xsd/positiveInteger,
   :vs/term_status "Stable"})

(def builtTime
  "A builtTime specifies the time an artifact was built."
  {:db/ident       :spdx-core/builtTime,
   :rdf/type       :owl/DatatypeProperty,
   :rdfs/comment   "A builtTime specifies the time an artifact was built.",
   :rdfs/domain    :spdx-core/Artifact,
   :rdfs/range     :spdx-core/DateTime,
   :vs/term_status "Stable"})

(def comment
  "A comment is an optional field for creators of the Element to provide comments\nto the readers/reviewers of the document."
  {:db/ident :spdx-core/comment,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "A comment is an optional field for creators of the Element to provide comments\nto the readers/reviewers of the document.",
   :rdfs/range :xsd/string,
   :sh/or [{:rdfs/domain [:spdx-core/IntegrityMethod
                          :spdx-core/ExternalReference
                          :spdx-core/ExternalIdentifier
                          :spdx-core/Element
                          :spdx-core/CreationInfo]}],
   :vs/term_status "Stable"})

(def completeness
  "Completeness gives information about whether the provided relationships are\ncomplete, known to be incomplete or if no assertion is made either way."
  {:db/ident :spdx-core/completeness,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Completeness gives information about whether the provided relationships are\ncomplete, known to be incomplete or if no assertion is made either way.",
   :rdfs/domain :spdx-core/Relationship,
   :rdfs/range :spdx-core/RelationshipCompleteness,
   :vs/term_status "Stable"})

(def contentType
  "ContentType specifies the media type of an Element."
  {:db/ident       :spdx-core/contentType,
   :rdf/type       :owl/DatatypeProperty,
   :rdfs/comment   "ContentType specifies the media type of an Element.",
   :rdfs/range     :spdx-core/MediaType,
   :sh/or          [{:rdfs/domain [:spdx-core/ExternalReference
                                   :spdx-core/Annotation]}],
   :vs/term_status "Stable"})

(def context
  "A context gives information about the circumstances or unifying properties\nthat Elements of the bundle have been assembled under."
  {:db/ident :spdx-core/context,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "A context gives information about the circumstances or unifying properties\nthat Elements of the bundle have been assembled under.",
   :rdfs/domain :spdx-core/Bundle,
   :rdfs/range :xsd/string,
   :vs/term_status "Stable"})

(def created
  "Created is a date that identifies when the Element was originally created.\nThe time stamp can serve as an indication as to whether the analysis needs to be updated. This is often the date of last change (e.g., a git commit date), not the date when the SPDX data was created, as doing so supports reproducible builds."
  {:db/ident :spdx-core/created,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Created is a date that identifies when the Element was originally created.\nThe time stamp can serve as an indication as to whether the analysis needs to be updated. This is often the date of last change (e.g., a git commit date), not the date when the SPDX data was created, as doing so supports reproducible builds.",
   :rdfs/domain :spdx-core/CreationInfo,
   :rdfs/range :spdx-core/DateTime,
   :vs/term_status "Stable"})

(def createdBy
  "CreatedBy identifies who or what created the Element.\nThe generation method will assist the recipient of the Element in assessing\nthe general reliability/accuracy of the analysis information."
  {:db/ident :spdx-core/createdBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "CreatedBy identifies who or what created the Element.\nThe generation method will assist the recipient of the Element in assessing\nthe general reliability/accuracy of the analysis information.",
   :rdfs/domain :spdx-core/CreationInfo,
   :rdfs/range :spdx-core/Agent,
   :vs/term_status "Stable"})

(def createdUsing
  "CreatedUsing identifies the tooling that was used during the creation of the Element.\nThe generation method will assist the recipient of the Element in assessing\nthe general reliability/accuracy of the analysis information."
  {:db/ident :spdx-core/createdUsing,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "CreatedUsing identifies the tooling that was used during the creation of the Element.\nThe generation method will assist the recipient of the Element in assessing\nthe general reliability/accuracy of the analysis information.",
   :rdfs/domain :spdx-core/CreationInfo,
   :rdfs/range :spdx-core/Tool,
   :vs/term_status "Stable"})

(def creationInfo
  "CreationInfo provides information about the creation of the Element."
  {:db/ident :spdx-core/creationInfo,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "CreationInfo provides information about the creation of the Element.",
   :rdfs/domain :spdx-core/Element,
   :rdfs/range :spdx-core/CreationInfo,
   :vs/term_status "Stable"})

(def dataLicense
  "The data license provides the license under which the SPDX documentation of the Element can be used.\nThis is to alleviate any concern that content (the data or database) in an SPDX file\nis subject to any form of intellectual property right that could restrict the re-use\nof the information or the creation of another SPDX file for the same project(s).\nThis approach avoids intellectual property and related restrictions over the SPDX file,\nhowever individuals can still contract with each other to restrict release\nof specific collections of SPDX files (which map to software bill of materials)\nand the identification of the supplier of SPDX files.\nCompliance with this document includes populating the SPDX fields therein\nwith data related to such fields (\"SPDX-Metadata\"). \nThis document contains numerous fields where an SPDX file creator may provide\nrelevant explanatory text in SPDX-Metadata. Without opining on the lawfulness\nof \"database rights\" (in jurisdictions where applicable),\nsuch explanatory text is copyrightable subject matter in most Berne Convention countries.\nBy using the SPDX specification, or any portion hereof,\nyou hereby agree that any copyright rights (as determined by your jurisdiction)\nin any SPDX-Metadata, including without limitation explanatory text,\nshall be subject to the terms of the Creative Commons CC0 1.0 Universal license. \nFor SPDX-Metadata not containing any copyright rights, \nyou hereby agree and acknowledge that the SPDX-Metadata is provided to you “as-is”\nand without any representations or warranties of any kind concerning the SPDX-Metadata,\nexpress, implied, statutory or otherwise, including without limitation warranties\nof title, merchantability, fitness for a particular purpose, non-infringement,\nor the absence of latent or other defects, accuracy, or the presence or absence of errors,\nwhether or not discoverable, all to the greatest extent permissible under applicable law."
  {:db/ident :spdx-core/dataLicense,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "The data license provides the license under which the SPDX documentation of the Element can be used.\nThis is to alleviate any concern that content (the data or database) in an SPDX file\nis subject to any form of intellectual property right that could restrict the re-use\nof the information or the creation of another SPDX file for the same project(s).\nThis approach avoids intellectual property and related restrictions over the SPDX file,\nhowever individuals can still contract with each other to restrict release\nof specific collections of SPDX files (which map to software bill of materials)\nand the identification of the supplier of SPDX files.\nCompliance with this document includes populating the SPDX fields therein\nwith data related to such fields (\"SPDX-Metadata\"). \nThis document contains numerous fields where an SPDX file creator may provide\nrelevant explanatory text in SPDX-Metadata. Without opining on the lawfulness\nof \"database rights\" (in jurisdictions where applicable),\nsuch explanatory text is copyrightable subject matter in most Berne Convention countries.\nBy using the SPDX specification, or any portion hereof,\nyou hereby agree that any copyright rights (as determined by your jurisdiction)\nin any SPDX-Metadata, including without limitation explanatory text,\nshall be subject to the terms of the Creative Commons CC0 1.0 Universal license. \nFor SPDX-Metadata not containing any copyright rights, \nyou hereby agree and acknowledge that the SPDX-Metadata is provided to you “as-is”\nand without any representations or warranties of any kind concerning the SPDX-Metadata,\nexpress, implied, statutory or otherwise, including without limitation warranties\nof title, merchantability, fitness for a particular purpose, non-infringement,\nor the absence of latent or other defects, accuracy, or the presence or absence of errors,\nwhether or not discoverable, all to the greatest extent permissible under applicable law.",
   :rdfs/domain :spdx-core/CreationInfo,
   :rdfs/range :xsd/string,
   :vs/term_status "Stable"})

(def definingDocument
  "A definingDocument property is used to link an Element identifier to an SpdxDocument which contains the definition for the Element."
  {:db/ident :spdx-core/definingDocument,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "A definingDocument property is used to link an Element identifier to an SpdxDocument which contains the definition for the Element.",
   :rdfs/domain :spdx-core/ExternalMap,
   :rdfs/range :xsd/anyURI,
   :vs/term_status "Stable"})

(def description
  "This field is a detailed description of the Element. It may also be extracted from the Element itself.\nThe intent is to provide recipients of the SPDX file with a detailed technical explanation\nof the functionality, anticipated use, and anticipated implementation of the Element.\nThis field may also include a description of improvements over prior versions of the Element."
  {:db/ident :spdx-core/description,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "This field is a detailed description of the Element. It may also be extracted from the Element itself.\nThe intent is to provide recipients of the SPDX file with a detailed technical explanation\nof the functionality, anticipated use, and anticipated implementation of the Element.\nThis field may also include a description of improvements over prior versions of the Element.",
   :rdfs/domain :spdx-core/Element,
   :rdfs/range :xsd/string,
   :vs/term_status "Stable"})

(def element
  "This field refers to one or more Elements that are part of an ElementCollection."
  {:db/ident :spdx-core/element,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "This field refers to one or more Elements that are part of an ElementCollection.",
   :rdfs/domain :spdx-core/ElementCollection,
   :rdfs/range :spdx-core/Element,
   :vs/term_status "Stable"})

(def end
  "end is a positive integer that defines the end of a range."
  {:db/ident       :spdx-core/end,
   :rdf/type       :owl/DatatypeProperty,
   :rdfs/comment   "end is a positive integer that defines the end of a range.",
   :rdfs/domain    :spdx-core/PositiveIntegerRange,
   :rdfs/range     :xsd/positiveInteger,
   :vs/term_status "Stable"})

(def endTime
  "A endTime specifies the time from which element is no applicable / valid."
  {:db/ident :spdx-core/endTime,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "A endTime specifies the time from which element is no applicable / valid.",
   :rdfs/domain :spdx-core/Relationship,
   :rdfs/range :spdx-core/DateTime,
   :vs/term_status "Stable"})

(def extension
  "TODO"
  {:db/ident       :spdx-core/extension,
   :rdf/type       :owl/ObjectProperty,
   :rdfs/comment   "TODO",
   :rdfs/domain    :spdx-core/Element,
   :vs/term_status "unstable"})

(def externalId
  "ExternalId identifies an external Element used within a Document but defined external to that Document."
  {:db/ident :spdx-core/externalId,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "ExternalId identifies an external Element used within a Document but defined external to that Document.",
   :rdfs/domain :spdx-core/ExternalMap,
   :rdfs/range :xsd/anyURI,
   :vs/term_status "Stable"})

(def externalIdentifier
  "ExternalIdentifier points to a resource outside the scope of SPDX-3.0 content\nthat uniquely identifies an Element."
  {:db/ident :spdx-core/externalIdentifier,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "ExternalIdentifier points to a resource outside the scope of SPDX-3.0 content\nthat uniquely identifies an Element.",
   :rdfs/domain :spdx-core/Element,
   :rdfs/range :spdx-core/ExternalIdentifier,
   :vs/term_status "Stable"})

(def externalIdentifierType
  "An externalIdentifierType specifies the type of the external identifier."
  {:db/ident :spdx-core/externalIdentifierType,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "An externalIdentifierType specifies the type of the external identifier.",
   :rdfs/domain :spdx-core/ExternalIdentifier,
   :rdfs/range :spdx-core/ExternalIdentifierType,
   :vs/term_status "Stable"})

(def externalReference
  "This field points to a resource outside the scope of the SPDX-3.0 content\nthat provides additional characteristics of an Element."
  {:db/ident :spdx-core/externalReference,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "This field points to a resource outside the scope of the SPDX-3.0 content\nthat provides additional characteristics of an Element.",
   :rdfs/domain :spdx-core/Element,
   :rdfs/range :spdx-core/ExternalReference,
   :vs/term_status "Stable"})

(def externalReferenceType
  "An externalReferenceType specifies the type of the external reference."
  {:db/ident :spdx-core/externalReferenceType,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "An externalReferenceType specifies the type of the external reference.",
   :rdfs/domain :spdx-core/ExternalReference,
   :rdfs/range :spdx-core/ExternalReferenceType,
   :vs/term_status "Stable"})

(def from
  "This field references the Element on the left-hand side of a relationship."
  {:db/ident :spdx-core/from,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "This field references the Element on the left-hand side of a relationship.",
   :rdfs/domain :spdx-core/Relationship,
   :rdfs/range :spdx-core/Element,
   :vs/term_status "Stable"})

(def hashValue
  "HashValue is the result of applying a hash algorithm to an Element."
  {:db/ident :spdx-core/hashValue,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "HashValue is the result of applying a hash algorithm to an Element.",
   :rdfs/domain :spdx-core/Hash,
   :rdfs/range :xsd/string,
   :vs/term_status "Stable"})

(def identifier
  "An identifier uniquely identifies an external element."
  {:db/ident       :spdx-core/identifier,
   :rdf/type       :owl/DatatypeProperty,
   :rdfs/comment   "An identifier uniquely identifies an external element.",
   :rdfs/domain    :spdx-core/ExternalIdentifier,
   :rdfs/range     :xsd/string,
   :vs/term_status "Stable"})

(def identifierLocator
  "A identifierLocator is TODO"
  {:db/ident       :spdx-core/identifierLocator,
   :rdf/type       :owl/DatatypeProperty,
   :rdfs/comment   "A identifierLocator is TODO",
   :rdfs/domain    :spdx-core/ExternalIdentifier,
   :rdfs/range     :xsd/anyURI,
   :vs/term_status "Stable"})

(def imports
  "Imports provides an ExternalMap of Element identifiers that are used within a document\nbut defined external to that document."
  {:db/ident :spdx-core/imports,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Imports provides an ExternalMap of Element identifiers that are used within a document\nbut defined external to that document.",
   :rdfs/domain :spdx-core/ElementCollection,
   :rdfs/range :spdx-core/ExternalMap,
   :vs/term_status "Stable"})

(def issuingAuthority
  "A issuingAuthority is TODO"
  {:db/ident       :spdx-core/issuingAuthority,
   :rdf/type       :owl/DatatypeProperty,
   :rdfs/comment   "A issuingAuthority is TODO",
   :rdfs/domain    :spdx-core/ExternalIdentifier,
   :rdfs/range     :xsd/anyURI,
   :vs/term_status "Stable"})

(def key
  "A key used in generic a key-value pair.\nA key-value pair can be used to implement a dictionary which associates a key with a value."
  {:db/ident :spdx-core/key,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "A key used in generic a key-value pair.\nA key-value pair can be used to implement a dictionary which associates a key with a value.",
   :rdfs/domain :spdx-core/DictionaryEntry,
   :rdfs/range :xsd/string,
   :vs/term_status "Stable"})

(def locationHint
  "A locationHint provides an indication of where to retrieve an external Element."
  {:db/ident :spdx-core/locationHint,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "A locationHint provides an indication of where to retrieve an external Element.",
   :rdfs/domain :spdx-core/ExternalMap,
   :rdfs/range :xsd/anyURI,
   :vs/term_status "Stable"})

(def locator
  "A locator provides the location of an external reference."
  {:db/ident       :spdx-core/locator,
   :rdf/type       :owl/DatatypeProperty,
   :rdfs/comment   "A locator provides the location of an external reference.",
   :rdfs/domain    :spdx-core/ExternalReference,
   :rdfs/range     :xsd/anyURI,
   :vs/term_status "Stable"})

(def name
  "This field identifies the name of an Element as designated by the creator. \nThe name of an Element is an important convention and easier to refer to than the URI."
  {:db/ident :spdx-core/name,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "This field identifies the name of an Element as designated by the creator. \nThe name of an Element is an important convention and easier to refer to than the URI.",
   :rdfs/domain :spdx-core/Element,
   :rdfs/range :xsd/string,
   :vs/term_status "Stable"})

(def originatedBy
  "OriginatedBy identifies from where or whom the Element originally came."
  {:db/ident :spdx-core/originatedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "OriginatedBy identifies from where or whom the Element originally came.",
   :rdfs/domain :spdx-core/Artifact,
   :rdfs/range :spdx-core/Agent,
   :vs/term_status "Stable"})

(def prefix
  "A prefix is a substitute for a URI."
  {:db/ident       :spdx-core/prefix,
   :rdf/type       :owl/DatatypeProperty,
   :rdfs/comment   "A prefix is a substitute for a URI.",
   :rdfs/range     :xsd/string,
   :vs/term_status "Stable"})

(def profile
  "This field provides information about which profiles the Element belongs to."
  {:db/ident :spdx-core/profile,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "This field provides information about which profiles the Element belongs to.",
   :rdfs/domain :spdx-core/CreationInfo,
   :rdfs/range :spdx-core/ProfileIdentifierType,
   :vs/term_status "Stable"})

(def relationshipType
  "This field provides information about the relationship between two Elements.\nFor example, you can represent a relationship between two different Files,\nbetween a Package and a File, between two Packages, or between one SPDXDocument and another SPDXDocument."
  {:db/ident :spdx-core/relationshipType,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "This field provides information about the relationship between two Elements.\nFor example, you can represent a relationship between two different Files,\nbetween a Package and a File, between two Packages, or between one SPDXDocument and another SPDXDocument.",
   :rdfs/domain :spdx-core/Relationship,
   :rdfs/range :spdx-core/RelationshipType,
   :vs/term_status "Stable"})

(def releaseTime
  "A releaseTime specifies the time an artifact was released."
  {:db/ident       :spdx-core/releaseTime,
   :rdf/type       :owl/DatatypeProperty,
   :rdfs/comment   "A releaseTime specifies the time an artifact was released.",
   :rdfs/domain    :spdx-core/Artifact,
   :rdfs/range     :spdx-core/DateTime,
   :vs/term_status "Stable"})

(def rootElement
  "A rootElement of a collection is the top level Element from which all other Elements are reached via relationships."
  {:db/ident :spdx-core/rootElement,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A rootElement of a collection is the top level Element from which all other Elements are reached via relationships.",
   :rdfs/domain :spdx-core/ElementCollection,
   :rdfs/range :spdx-core/Element,
   :vs/term_status "Stable"})

(def scope
  "A scope is TODO"
  {:db/ident       :spdx-core/scope,
   :rdf/type       :owl/ObjectProperty,
   :rdfs/comment   "A scope is TODO",
   :rdfs/domain    :spdx-core/LifecycleScopedRelationship,
   :rdfs/range     :spdx-core/LifecycleScopeType,
   :vs/term_status "Stable"})

(def specVersion
  "The specVersion provides a reference number that can be used to understand how to parse and interpret an Element.\nIt will enable both future changes to the specification and to support backward compatibility.\nThe major version number shall be incremented when incompatible changes between versions are made\n(one or more sections are created, modified or deleted).\nThe minor version number shall be incremented when backwards compatible changes are made.\n\nHere, parties exchanging information in accordance with the SPDX specification need to provide \n100% transparency as to which SPDX specification version such information is conforming to."
  {:db/ident :spdx-core/specVersion,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "The specVersion provides a reference number that can be used to understand how to parse and interpret an Element.\nIt will enable both future changes to the specification and to support backward compatibility.\nThe major version number shall be incremented when incompatible changes between versions are made\n(one or more sections are created, modified or deleted).\nThe minor version number shall be incremented when backwards compatible changes are made.\n\nHere, parties exchanging information in accordance with the SPDX specification need to provide \n100% transparency as to which SPDX specification version such information is conforming to.",
   :rdfs/domain :spdx-core/CreationInfo,
   :rdfs/range :spdx-core/SemVer,
   :vs/term_status "Stable"})

(def standard
  "Various standards may be relevant to useful to capture for specific artifacts."
  {:db/ident :spdx-core/standard,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Various standards may be relevant to useful to capture for specific artifacts.",
   :rdfs/domain :spdx-core/Artifact,
   :rdfs/range :xsd/string,
   :vs/term_status "Stable"})

(def startTime
  "A startTime specifies the time from which element is applicable / valid."
  {:db/ident :spdx-core/startTime,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "A startTime specifies the time from which element is applicable / valid.",
   :rdfs/domain :spdx-core/Relationship,
   :rdfs/range :spdx-core/DateTime,
   :vs/term_status "Stable"})

(def statement
  "A statement is a commentary on an assertion that an annotator has made."
  {:db/ident :spdx-core/statement,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "A statement is a commentary on an assertion that an annotator has made.",
   :rdfs/domain :spdx-core/Annotation,
   :rdfs/range :xsd/string,
   :vs/term_status "Stable"})

(def subject
  "A subject is an Element an annotator has made an assertion about."
  {:db/ident :spdx-core/subject,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A subject is an Element an annotator has made an assertion about.",
   :rdfs/domain :spdx-core/Annotation,
   :rdfs/range :spdx-core/Element,
   :vs/term_status "Stable"})

(def summary
  "A summary is a short description of an Element. Here, the intent is to allow the Element creator to \nprovide concise information about the function or use of the Element."
  {:db/ident :spdx-core/summary,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "A summary is a short description of an Element. Here, the intent is to allow the Element creator to \nprovide concise information about the function or use of the Element.",
   :rdfs/domain :spdx-core/Element,
   :rdfs/range :xsd/string,
   :vs/term_status "Stable"})

(def suppliedBy
  "Identify the actual distribution source for the Artifact being referenced.\nThis might or might not be different from the originating distribution source for the artifact."
  {:db/ident :spdx-core/suppliedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Identify the actual distribution source for the Artifact being referenced.\nThis might or might not be different from the originating distribution source for the artifact.",
   :rdfs/domain :spdx-core/Artifact,
   :rdfs/range :spdx-core/Agent,
   :vs/term_status "Stable"})

(def to
  "This field references an Element on the right-hand side of a relationship."
  {:db/ident :spdx-core/to,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "This field references an Element on the right-hand side of a relationship.",
   :rdfs/domain :spdx-core/Relationship,
   :rdfs/range :spdx-core/Element,
   :vs/term_status "Stable"})

(def validUntilTime
  "A validUntilTime specifies until when the artifact can be used before its usage needs to be reassessed."
  {:db/ident :spdx-core/validUntilTime,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "A validUntilTime specifies until when the artifact can be used before its usage needs to be reassessed.",
   :rdfs/domain :spdx-core/Artifact,
   :rdfs/range :spdx-core/DateTime,
   :vs/term_status "Stable"})

(def value
  "A value used in a generic key-value pair.\nA key-value pair can be used to implement a dictionary which associates a key with a value."
  {:db/ident :spdx-core/value,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "A value used in a generic key-value pair.\nA key-value pair can be used to implement a dictionary which associates a key with a value.",
   :rdfs/domain :spdx-core/DictionaryEntry,
   :rdfs/range :xsd/string,
   :vs/term_status "Stable"})

(def verifiedUsing
  "VerifiedUsing provides an IntegrityMethod with which the integrity of an Element can be asserted."
  {:db/ident :spdx-core/verifiedUsing,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "VerifiedUsing provides an IntegrityMethod with which the integrity of an Element can be asserted.",
   :rdfs/range :spdx-core/IntegrityMethod,
   :sh/or [{:rdfs/domain [:spdx-core/ExternalMap :spdx-core/Element]}],
   :vs/term_status "Stable"})