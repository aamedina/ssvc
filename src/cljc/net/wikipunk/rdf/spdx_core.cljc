(ns net.wikipunk.rdf.spdx-core
  "The Core namespace defines foundational concepts serving as the basis for all SPDX-3.0 profiles."
  {:dcat/downloadURL "resources/spdx/Core/Core.ttl",
   :rdf/ns-prefix-map {"owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "sh" "http://www.w3.org/ns/shacl#",
                       "spdx-core" "https://spdx.org/rdf/v3/Core/",
                       "vs" "http://www.w3.org/2003/06/sw-vocab-status/ns#",
                       "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "spdx-core",
   :rdfa/uri "https://spdx.org/rdf/v3/Core/",
   :rdfs/comment
   "The Core namespace defines foundational concepts serving as the basis for all SPDX-3.0 profiles.",
   :sh/declare {:sh/namespace "https://spdx.org/rdf/v3/Core/",
                :sh/prefix    "spdx-core"}}
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
   :sh/property [{:sh/class    :spdx-core/AnnotationType,
                  :sh/maxCount #xsd/integer 1,
                  :sh/minCount #xsd/integer 1,
                  :sh/name     "annotationType",
                  :sh/path     :spdx-core/annotationType}
                 {:sh/datatype :xsd/string,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "statement",
                  :sh/path     :spdx-core/statement}
                 {:sh/datatype :spdx-core/MediaType,
                  :sh/name     "contentType",
                  :sh/path     :spdx-core/contentType}
                 {:sh/class    :spdx-core/Element,
                  :sh/maxCount #xsd/integer 1,
                  :sh/minCount #xsd/integer 1,
                  :sh/name     "subject",
                  :sh/path     :spdx-core/subject}],
   :vs/term_status "Stable"})

(def AnnotationType
  "AnnotationType specifies the type of an annotation."
  {:db/ident       :spdx-core/AnnotationType,
   :rdf/type       :owl/Class,
   :rdfs/comment   "AnnotationType specifies the type of an annotation.",
   :vs/term_status "Stable"})

(def AnnotationType-Other
  "Type of annotation which does not fit in any of the pre-defined annotation types."
  {:db/ident :spdx-core/AnnotationType-Other,
   :rdf/type [:spdx-core/AnnotationType :owl/NamedIndividual],
   :rdfs/comment
   "Type of annotation which does not fit in any of the pre-defined annotation types.",
   :rdfs/label "other"})

(def AnnotationType-Review
  "A Review represents an audit and signoff by an individual, organization or tool on the information for an SpdxElement."
  {:db/ident :spdx-core/AnnotationType-Review,
   :rdf/type [:spdx-core/AnnotationType :owl/NamedIndividual],
   :rdfs/comment
   "A Review represents an audit and signoff by an individual, organization or tool on the information for an SpdxElement.",
   :rdfs/label "review"})

(def Artifact
  "An artifact is a distinct article or unit within the digital domain,\nsuch as an electronic file, a software package, a device or an element of data."
  {:db/ident :spdx-core/Artifact,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "An artifact is a distinct article or unit within the digital domain,\nsuch as an electronic file, a software package, a device or an element of data.",
   :rdfs/subClassOf :spdx-core/Element,
   :sh/property [{:sh/datatype :spdx-core/DateTime,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "validUntilTime",
                  :sh/path     :spdx-core/validUntilTime}
                 {:sh/datatype :xsd/string,
                  :sh/name     "standard",
                  :sh/path     :spdx-core/standard}
                 {:sh/class :spdx-core/Agent,
                  :sh/name  "originatedBy",
                  :sh/path  :spdx-core/originatedBy}
                 {:sh/datatype :spdx-core/DateTime,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "releaseTime",
                  :sh/path     :spdx-core/releaseTime}
                 {:sh/datatype :spdx-core/DateTime,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "builtTime",
                  :sh/path     :spdx-core/builtTime}
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
   [:spdx-core/Bundle :spdx-core/Element :spdx-core/ElementCollection],
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
   :sh/property [{:sh/datatype :spdx-core/DateTime,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "created",
                  :sh/path     :spdx-core/created}
                 {:sh/class :spdx-core/Tool,
                  :sh/name  "createdUsing",
                  :sh/path  :spdx-core/createdUsing}
                 {:sh/datatype :spdx-core/SemVer,
                  :sh/maxCount #xsd/integer 1,
                  :sh/minCount #xsd/integer 1,
                  :sh/name     "specVersion",
                  :sh/path     :spdx-core/specVersion}
                 {:sh/class    :spdx-core/Agent,
                  :sh/minCount #xsd/integer 1,
                  :sh/name     "createdBy",
                  :sh/path     :spdx-core/createdBy}
                 {:sh/datatype :xsd/string,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "comment",
                  :sh/path     :spdx-core/comment}
                 {:sh/class    :spdx-core/ProfileIdentifierType,
                  :sh/minCount #xsd/integer 1,
                  :sh/name     "profile",
                  :sh/path     :spdx-core/profile}
                 {:sh/datatype :xsd/string,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "dataLicense",
                  :sh/path     :spdx-core/dataLicense}],
   :vs/term_status "Stable"})

(def DateTime
  "A Datetime is a string representation of a specific date and time. It has resolution of seconds and is always expressed in UTC timezone. The specific format is one of the most commonly used ISO-8601 formats."
  {:db/ident :spdx-core/DateTime,
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   "A Datetime is a string representation of a specific date and time. It has resolution of seconds and is always expressed in UTC timezone. The specific format is one of the most commonly used ISO-8601 formats.",
   :rdfs/subClassOf :xsd/string,
   :sh/pattern "^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$",
   :vs/term_status "Stable"})

(def DictionaryEntry
  "The class used for implementing a generic string mapping (also known as associative array, dictionary, or hash map) in SPDX.  Each DictionaryEntry contains a key-value pair which maps the key to its associated value.  To implement a dictionary, this class is to be used in a collection with unique keys."
  {:db/ident :spdx-core/DictionaryEntry,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "The class used for implementing a generic string mapping (also known as associative array, dictionary, or hash map) in SPDX.  Each DictionaryEntry contains a key-value pair which maps the key to its associated value.  To implement a dictionary, this class is to be used in a collection with unique keys.",
   :sh/property [{:sh/datatype :xsd/string,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "value",
                  :sh/path     :spdx-core/value}
                 {:sh/datatype :xsd/string,
                  :sh/maxCount #xsd/integer 1,
                  :sh/minCount #xsd/integer 1,
                  :sh/name     "key",
                  :sh/path     :spdx-core/key}],
   :vs/term_status "Stable"})

(def Element
  "An Element is a representation of a fundamental concept either directly inherent\nto the Bill of Materials (BOM) domain or indirectly related to the BOM domain\nand necessary for contextually characterizing BOM concepts and relationships.\nWithin SPDX-3.0 structure this is the base class acting as a consistent,\nunifying, and interoperable foundation for all explicit\nand inter-relatable content objects."
  {:db/ident :spdx-core/Element,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "An Element is a representation of a fundamental concept either directly inherent\nto the Bill of Materials (BOM) domain or indirectly related to the BOM domain\nand necessary for contextually characterizing BOM concepts and relationships.\nWithin SPDX-3.0 structure this is the base class acting as a consistent,\nunifying, and interoperable foundation for all explicit\nand inter-relatable content objects.",
   :sh/property [{:sh/datatype :xsd/string,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "comment",
                  :sh/path     :spdx-core/comment}
                 {:sh/datatype :xsd/string,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "description",
                  :sh/path     :spdx-core/description}
                 {:sh/datatype :xsd/string,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "summary",
                  :sh/path     :spdx-core/summary}
                 {:sh/class :spdx-core/IntegrityMethod,
                  :sh/name  "verifiedUsing",
                  :sh/path  :spdx-core/verifiedUsing}
                 {:sh/datatype :xsd/string,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "name",
                  :sh/path     :spdx-core/name}
                 {:sh/class :spdx-core/ExternalIdentifier,
                  :sh/name  "externalIdentifier",
                  :sh/path  :spdx-core/externalIdentifier}
                 {:sh/class :spdx-core/ExternalReference,
                  :sh/name  "externalReference",
                  :sh/path  :spdx-core/externalReference}
                 {:sh/class    :spdx-core/CreationInfo,
                  :sh/maxCount #xsd/integer 1,
                  :sh/minCount #xsd/integer 1,
                  :sh/name     "creationInfo",
                  :sh/path     :spdx-core/creationInfo}],
   :vs/term_status "Stable"})

(def ElementCollection
  "An SpdxCollection is a collection of Elements, not necessarily with unifying context."
  {:db/ident :spdx-core/ElementCollection,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "An SpdxCollection is a collection of Elements, not necessarily with unifying context.",
   :rdfs/subClassOf :spdx-core/Element,
   :sh/property [{:sh/class    :spdx-core/Element,
                  :sh/minCount #xsd/integer 1,
                  :sh/name     "element",
                  :sh/path     :spdx-core/element}
                 {:sh/class    :spdx-core/Element,
                  :sh/minCount #xsd/integer 1,
                  :sh/name     "rootElement",
                  :sh/path     :spdx-core/rootElement}
                 {:sh/class :spdx-core/ExternalMap,
                  :sh/name  "imports",
                  :sh/path  :spdx-core/imports}],
   :vs/term_status "Stable"})

(def ExternalIdentifier
  "An ExternalIdentifier is a reference to a resource outside the scope of SPDX-3.0 content\nthat uniquely identifies an Element."
  {:db/ident :spdx-core/ExternalIdentifier,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "An ExternalIdentifier is a reference to a resource outside the scope of SPDX-3.0 content\nthat uniquely identifies an Element.",
   :sh/property [{:sh/datatype :xsd/anyURI,
                  :sh/name     "identifierLocator",
                  :sh/path     :spdx-core/identifierLocator}
                 {:sh/datatype :xsd/string,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "comment",
                  :sh/path     :spdx-core/comment}
                 {:sh/datatype :xsd/anyURI,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "issuingAuthority",
                  :sh/path     :spdx-core/issuingAuthority}
                 {:sh/datatype :xsd/string,
                  :sh/maxCount #xsd/integer 1,
                  :sh/minCount #xsd/integer 1,
                  :sh/name     "identifier",
                  :sh/path     :spdx-core/identifier}
                 {:sh/class    :spdx-core/ExternalIdentifierType,
                  :sh/maxCount #xsd/integer 1,
                  :sh/minCount #xsd/integer 1,
                  :sh/name     "externalIdentifierType",
                  :sh/path     :spdx-core/externalIdentifierType}],
   :vs/term_status "Stable"})

(def ExternalIdentifierType
  "ExteralIdentifierType specifies the type of an external identifier."
  {:db/ident :spdx-core/ExternalIdentifierType,
   :rdf/type :owl/Class,
   :rdfs/comment
   "ExteralIdentifierType specifies the type of an external identifier.",
   :sh/in [:spdx-core/ExternalIdentifierType-Email
           :spdx-core/ExternalIdentifierType-PkgUrl
           :spdx-core/ExternalIdentifierType-Swid
           :spdx-core/ExternalIdentifierType-Cpe23
           :spdx-core/ExternalIdentifierType-Gitoid
           :spdx-core/ExternalIdentifierType-Swhid
           :spdx-core/ExternalIdentifierType-Cpe22
           :spdx-core/ExternalIdentifierType-Other
           :spdx-core/ExternalIdentifierType-SecurityOther
           :spdx-core/ExternalIdentifierType-UrlScheme],
   :vs/term_status "Stable"})

(def ExternalIdentifierType-Cpe22
  "cpe22"
  {:db/ident   :spdx-core/ExternalIdentifierType-Cpe22,
   :rdf/type   [:spdx-core/ExternalIdentifierType :owl/NamedIndividual],
   :rdfs/label "cpe22"})

(def ExternalIdentifierType-Cpe23
  "cpe23"
  {:db/ident   :spdx-core/ExternalIdentifierType-Cpe23,
   :rdf/type   [:spdx-core/ExternalIdentifierType :owl/NamedIndividual],
   :rdfs/label "cpe23"})

(def ExternalIdentifierType-Cve
  "cve"
  {:db/ident   :spdx-core/ExternalIdentifierType-Cve,
   :rdf/type   [:spdx-core/ExternalIdentifierType :owl/NamedIndividual],
   :rdfs/label "cve"})

(def ExternalIdentifierType-Email
  "email"
  {:db/ident   :spdx-core/ExternalIdentifierType-Email,
   :rdf/type   [:spdx-core/ExternalIdentifierType :owl/NamedIndividual],
   :rdfs/label "email"})

(def ExternalIdentifierType-Gitoid
  "gitoid"
  {:db/ident   :spdx-core/ExternalIdentifierType-Gitoid,
   :rdf/type   [:spdx-core/ExternalIdentifierType :owl/NamedIndividual],
   :rdfs/label "gitoid"})

(def ExternalIdentifierType-Other
  "other"
  {:db/ident   :spdx-core/ExternalIdentifierType-Other,
   :rdf/type   [:spdx-core/ExternalIdentifierType :owl/NamedIndividual],
   :rdfs/label "other"})

(def ExternalIdentifierType-PkgUrl
  "pkgUrl"
  {:db/ident   :spdx-core/ExternalIdentifierType-PkgUrl,
   :rdf/type   [:spdx-core/ExternalIdentifierType :owl/NamedIndividual],
   :rdfs/label "pkgUrl"})

(def ExternalIdentifierType-SecurityOther
  "securityOther"
  {:db/ident   :spdx-core/ExternalIdentifierType-SecurityOther,
   :rdf/type   [:spdx-core/ExternalIdentifierType :owl/NamedIndividual],
   :rdfs/label "securityOther"})

(def ExternalIdentifierType-Swhid
  "swhid"
  {:db/ident   :spdx-core/ExternalIdentifierType-Swhid,
   :rdf/type   [:spdx-core/ExternalIdentifierType :owl/NamedIndividual],
   :rdfs/label "swhid"})

(def ExternalIdentifierType-Swid
  "swid"
  {:db/ident   :spdx-core/ExternalIdentifierType-Swid,
   :rdf/type   [:spdx-core/ExternalIdentifierType :owl/NamedIndividual],
   :rdfs/label "swid"})

(def ExternalIdentifierType-UrlScheme
  "urlScheme"
  {:db/ident   :spdx-core/ExternalIdentifierType-UrlScheme,
   :rdf/type   [:spdx-core/ExternalIdentifierType :owl/NamedIndividual],
   :rdfs/label "urlScheme"})

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
   :rdf/type :owl/Class,
   :rdfs/comment
   "ExteralReferenceType specifies the type of an external reference.",
   :sh/in
   [:spdx-core/ExternalReferenceType-SecurityFix
    :spdx-core/ExternalReferenceType-MailingList
    :spdx-core/ExternalReferenceType-SecurityAdvisory
    :spdx-core/ExternalReferenceType-ReleaseHistory
    :spdx-core/ExternalReferenceType-SocialMedia
    :spdx-core/ExternalReferenceType-AltWebPage
    :spdx-core/ExternalReferenceType-DynamicAnalysisReport
    :spdx-core/ExternalReferenceType-RiskAssessment
    :spdx-core/ExternalReferenceType-QualityAssessmentReport
    :spdx-core/ExternalReferenceType-Vcs
    :spdx-core/ExternalReferenceType-VulnerabilityExploitabilityAssessment
    :spdx-core/ExternalReferenceType-ProductMetadata
    :spdx-core/ExternalReferenceType-ExportControlAssessment
    :spdx-core/ExternalReferenceType-PurchaseOrder
    :spdx-core/ExternalReferenceType-BuildMeta
    :spdx-core/ExternalReferenceType-ComponentAnalysisReport
    :spdx-core/ExternalReferenceType-ReleaseNotes
    :spdx-core/ExternalReferenceType-Documentation
    :spdx-core/ExternalReferenceType-SecurityThreatModel
    :spdx-core/ExternalReferenceType-SecurityAdversaryModel
    :spdx-core/ExternalReferenceType-CertificationReport
    :spdx-core/ExternalReferenceType-EolNotice
    :spdx-core/ExternalReferenceType-Chat
    :spdx-core/ExternalReferenceType-IssueTracker
    :spdx-core/ExternalReferenceType-SourceArtifact
    :spdx-core/ExternalReferenceType-Other
    :spdx-core/ExternalReferenceType-BuildSystem
    :spdx-core/ExternalReferenceType-SecurityPenTestReport
    :spdx-core/ExternalReferenceType-VulnerabilityDisclosureReport
    :spdx-core/ExternalReferenceType-License
    :spdx-core/ExternalReferenceType-Metrics
    :spdx-core/ExternalReferenceType-PrivacyAssessment
    :spdx-core/ExternalReferenceType-Funding
    :spdx-core/ExternalReferenceType-SecurityPolicy
    :spdx-core/ExternalReferenceType-Support
    :spdx-core/ExternalReferenceType-SecurityOther
    :spdx-core/ExternalReferenceType-AltDownloadLocation
    :spdx-core/ExternalReferenceType-RuntimeAnalysisReport
    :spdx-core/ExternalReferenceType-BinaryArtifact
    :spdx-core/ExternalReferenceType-SecureSoftwareAttestation
    :spdx-core/ExternalReferenceType-StaticAnalysisReport],
   :vs/term_status "Stable"})

(def ExternalReferenceType-AltDownloadLocation
  "altDownloadLocation"
  {:db/ident   :spdx-core/ExternalReferenceType-AltDownloadLocation,
   :rdf/type   [:spdx-core/ExternalReferenceType :owl/NamedIndividual],
   :rdfs/label "altDownloadLocation"})

(def ExternalReferenceType-AltWebPage
  "altWebPage"
  {:db/ident   :spdx-core/ExternalReferenceType-AltWebPage,
   :rdf/type   [:spdx-core/ExternalReferenceType :owl/NamedIndividual],
   :rdfs/label "altWebPage"})

(def ExternalReferenceType-BinaryArtifact
  "binaryArtifact"
  {:db/ident   :spdx-core/ExternalReferenceType-BinaryArtifact,
   :rdf/type   [:spdx-core/ExternalReferenceType :owl/NamedIndividual],
   :rdfs/label "binaryArtifact"})

(def ExternalReferenceType-BuildMeta
  "buildMeta"
  {:db/ident   :spdx-core/ExternalReferenceType-BuildMeta,
   :rdf/type   [:spdx-core/ExternalReferenceType :owl/NamedIndividual],
   :rdfs/label "buildMeta"})

(def ExternalReferenceType-BuildSystem
  "buildSystem"
  {:db/ident   :spdx-core/ExternalReferenceType-BuildSystem,
   :rdf/type   [:spdx-core/ExternalReferenceType :owl/NamedIndividual],
   :rdfs/label "buildSystem"})

(def ExternalReferenceType-CertificationReport
  "certificationReport"
  {:db/ident   :spdx-core/ExternalReferenceType-CertificationReport,
   :rdf/type   [:spdx-core/ExternalReferenceType :owl/NamedIndividual],
   :rdfs/label "certificationReport"})

(def ExternalReferenceType-Chat
  "chat"
  {:db/ident   :spdx-core/ExternalReferenceType-Chat,
   :rdf/type   [:spdx-core/ExternalReferenceType :owl/NamedIndividual],
   :rdfs/label "chat"})

(def ExternalReferenceType-ComponentAnalysisReport
  "componentAnalysisReport"
  {:db/ident   :spdx-core/ExternalReferenceType-ComponentAnalysisReport,
   :rdf/type   [:spdx-core/ExternalReferenceType :owl/NamedIndividual],
   :rdfs/label "componentAnalysisReport"})

(def ExternalReferenceType-Documentation
  "documentation"
  {:db/ident   :spdx-core/ExternalReferenceType-Documentation,
   :rdf/type   [:spdx-core/ExternalReferenceType :owl/NamedIndividual],
   :rdfs/label "documentation"})

(def ExternalReferenceType-DynamicAnalysisReport
  "dynamicAnalysisReport"
  {:db/ident   :spdx-core/ExternalReferenceType-DynamicAnalysisReport,
   :rdf/type   [:spdx-core/ExternalReferenceType :owl/NamedIndividual],
   :rdfs/label "dynamicAnalysisReport"})

(def ExternalReferenceType-EolNotice
  "eolNotice"
  {:db/ident   :spdx-core/ExternalReferenceType-EolNotice,
   :rdf/type   [:spdx-core/ExternalReferenceType :owl/NamedIndividual],
   :rdfs/label "eolNotice"})

(def ExternalReferenceType-ExportControlAssessment
  "exportControlAssessment"
  {:db/ident   :spdx-core/ExternalReferenceType-ExportControlAssessment,
   :rdf/type   [:spdx-core/ExternalReferenceType :owl/NamedIndividual],
   :rdfs/label "exportControlAssessment"})

(def ExternalReferenceType-Funding
  "funding"
  {:db/ident   :spdx-core/ExternalReferenceType-Funding,
   :rdf/type   [:spdx-core/ExternalReferenceType :owl/NamedIndividual],
   :rdfs/label "funding"})

(def ExternalReferenceType-IssueTracker
  "issueTracker"
  {:db/ident   :spdx-core/ExternalReferenceType-IssueTracker,
   :rdf/type   [:spdx-core/ExternalReferenceType :owl/NamedIndividual],
   :rdfs/label "issueTracker"})

(def ExternalReferenceType-License
  "license"
  {:db/ident   :spdx-core/ExternalReferenceType-License,
   :rdf/type   [:spdx-core/ExternalReferenceType :owl/NamedIndividual],
   :rdfs/label "license"})

(def ExternalReferenceType-MailingList
  "mailingList"
  {:db/ident   :spdx-core/ExternalReferenceType-MailingList,
   :rdf/type   [:spdx-core/ExternalReferenceType :owl/NamedIndividual],
   :rdfs/label "mailingList"})

(def ExternalReferenceType-Metrics
  "metrics"
  {:db/ident   :spdx-core/ExternalReferenceType-Metrics,
   :rdf/type   [:spdx-core/ExternalReferenceType :owl/NamedIndividual],
   :rdfs/label "metrics"})

(def ExternalReferenceType-Other
  "other"
  {:db/ident   :spdx-core/ExternalReferenceType-Other,
   :rdf/type   [:spdx-core/ExternalReferenceType :owl/NamedIndividual],
   :rdfs/label "other"})

(def ExternalReferenceType-PrivacyAssessment
  "privacyAssessment"
  {:db/ident   :spdx-core/ExternalReferenceType-PrivacyAssessment,
   :rdf/type   [:spdx-core/ExternalReferenceType :owl/NamedIndividual],
   :rdfs/label "privacyAssessment"})

(def ExternalReferenceType-ProductMetadata
  "productMetadata"
  {:db/ident   :spdx-core/ExternalReferenceType-ProductMetadata,
   :rdf/type   [:spdx-core/ExternalReferenceType :owl/NamedIndividual],
   :rdfs/label "productMetadata"})

(def ExternalReferenceType-PurchaseOrder
  "purchaseOrder"
  {:db/ident   :spdx-core/ExternalReferenceType-PurchaseOrder,
   :rdf/type   [:spdx-core/ExternalReferenceType :owl/NamedIndividual],
   :rdfs/label "purchaseOrder"})

(def ExternalReferenceType-QualityAssessmentReport
  "qualityAssessmentReport"
  {:db/ident   :spdx-core/ExternalReferenceType-QualityAssessmentReport,
   :rdf/type   [:spdx-core/ExternalReferenceType :owl/NamedIndividual],
   :rdfs/label "qualityAssessmentReport"})

(def ExternalReferenceType-ReleaseHistory
  "releaseHistory"
  {:db/ident   :spdx-core/ExternalReferenceType-ReleaseHistory,
   :rdf/type   [:spdx-core/ExternalReferenceType :owl/NamedIndividual],
   :rdfs/label "releaseHistory"})

(def ExternalReferenceType-ReleaseNotes
  "releaseNotes"
  {:db/ident   :spdx-core/ExternalReferenceType-ReleaseNotes,
   :rdf/type   [:spdx-core/ExternalReferenceType :owl/NamedIndividual],
   :rdfs/label "releaseNotes"})

(def ExternalReferenceType-RiskAssessment
  "riskAssessment"
  {:db/ident   :spdx-core/ExternalReferenceType-RiskAssessment,
   :rdf/type   [:spdx-core/ExternalReferenceType :owl/NamedIndividual],
   :rdfs/label "riskAssessment"})

(def ExternalReferenceType-RuntimeAnalysisReport
  "runtimeAnalysisReport"
  {:db/ident   :spdx-core/ExternalReferenceType-RuntimeAnalysisReport,
   :rdf/type   [:spdx-core/ExternalReferenceType :owl/NamedIndividual],
   :rdfs/label "runtimeAnalysisReport"})

(def ExternalReferenceType-SecureSoftwareAttestation
  "secureSoftwareAttestation"
  {:db/ident   :spdx-core/ExternalReferenceType-SecureSoftwareAttestation,
   :rdf/type   [:spdx-core/ExternalReferenceType :owl/NamedIndividual],
   :rdfs/label "secureSoftwareAttestation"})

(def ExternalReferenceType-SecurityAdversaryModel
  "securityAdversaryModel"
  {:db/ident   :spdx-core/ExternalReferenceType-SecurityAdversaryModel,
   :rdf/type   [:spdx-core/ExternalReferenceType :owl/NamedIndividual],
   :rdfs/label "securityAdversaryModel"})

(def ExternalReferenceType-SecurityAdvisory
  "securityAdvisory"
  {:db/ident   :spdx-core/ExternalReferenceType-SecurityAdvisory,
   :rdf/type   [:spdx-core/ExternalReferenceType :owl/NamedIndividual],
   :rdfs/label "securityAdvisory"})

(def ExternalReferenceType-SecurityFix
  "securityFix"
  {:db/ident   :spdx-core/ExternalReferenceType-SecurityFix,
   :rdf/type   [:spdx-core/ExternalReferenceType :owl/NamedIndividual],
   :rdfs/label "securityFix"})

(def ExternalReferenceType-SecurityOther
  "securityOther"
  {:db/ident   :spdx-core/ExternalReferenceType-SecurityOther,
   :rdf/type   [:spdx-core/ExternalReferenceType :owl/NamedIndividual],
   :rdfs/label "securityOther"})

(def ExternalReferenceType-SecurityPenTestReport
  "securityPenTestReport"
  {:db/ident   :spdx-core/ExternalReferenceType-SecurityPenTestReport,
   :rdf/type   [:spdx-core/ExternalReferenceType :owl/NamedIndividual],
   :rdfs/label "securityPenTestReport"})

(def ExternalReferenceType-SecurityPolicy
  "securityPolicy"
  {:db/ident   :spdx-core/ExternalReferenceType-SecurityPolicy,
   :rdf/type   [:spdx-core/ExternalReferenceType :owl/NamedIndividual],
   :rdfs/label "securityPolicy"})

(def ExternalReferenceType-SecurityThreatModel
  "securityThreatModel"
  {:db/ident   :spdx-core/ExternalReferenceType-SecurityThreatModel,
   :rdf/type   [:spdx-core/ExternalReferenceType :owl/NamedIndividual],
   :rdfs/label "securityThreatModel"})

(def ExternalReferenceType-SocialMedia
  "socialMedia"
  {:db/ident   :spdx-core/ExternalReferenceType-SocialMedia,
   :rdf/type   [:spdx-core/ExternalReferenceType :owl/NamedIndividual],
   :rdfs/label "socialMedia"})

(def ExternalReferenceType-SourceArtifact
  "sourceArtifact"
  {:db/ident   :spdx-core/ExternalReferenceType-SourceArtifact,
   :rdf/type   [:spdx-core/ExternalReferenceType :owl/NamedIndividual],
   :rdfs/label "sourceArtifact"})

(def ExternalReferenceType-StaticAnalysisReport
  "staticAnalysisReport"
  {:db/ident   :spdx-core/ExternalReferenceType-StaticAnalysisReport,
   :rdf/type   [:spdx-core/ExternalReferenceType :owl/NamedIndividual],
   :rdfs/label "staticAnalysisReport"})

(def ExternalReferenceType-Support
  "support"
  {:db/ident   :spdx-core/ExternalReferenceType-Support,
   :rdf/type   [:spdx-core/ExternalReferenceType :owl/NamedIndividual],
   :rdfs/label "support"})

(def ExternalReferenceType-Vcs
  "vcs"
  {:db/ident   :spdx-core/ExternalReferenceType-Vcs,
   :rdf/type   [:spdx-core/ExternalReferenceType :owl/NamedIndividual],
   :rdfs/label "vcs"})

(def ExternalReferenceType-VulnerabilityDisclosureReport
  "vulnerabilityDisclosureReport"
  {:db/ident   :spdx-core/ExternalReferenceType-VulnerabilityDisclosureReport,
   :rdf/type   [:spdx-core/ExternalReferenceType :owl/NamedIndividual],
   :rdfs/label "vulnerabilityDisclosureReport"})

(def ExternalReferenceType-VulnerabilityExploitabilityAssessment
  "vulnerabilityExploitabilityAssessment"
  {:db/ident
   :spdx-core/ExternalReferenceType-VulnerabilityExploitabilityAssessment,
   :rdf/type [:spdx-core/ExternalReferenceType :owl/NamedIndividual],
   :rdfs/label "vulnerabilityExploitabilityAssessment"})

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
   :rdf/type :owl/Class,
   :rdfs/comment
   "A HashAlgorithm is a mathematical algorithm that maps data of arbitrary size to a bit string (the hash)\nand is a one-way function, that is, a function which is practically infeasible to invert.",
   :sh/in [:spdx-core/HashAlgorithm-SphincsPlus
           :spdx-core/HashAlgorithm-Sha3-384
           :spdx-core/HashAlgorithm-Md4
           :spdx-core/HashAlgorithm-Sha1
           :spdx-core/HashAlgorithm-Blake2b512
           :spdx-core/HashAlgorithm-Md2
           :spdx-core/HashAlgorithm-Sha3-224
           :spdx-core/HashAlgorithm-Sha256
           :spdx-core/HashAlgorithm-Md6
           :spdx-core/HashAlgorithm-Other
           :spdx-core/HashAlgorithm-Blake2b256
           :spdx-core/HashAlgorithm-Sha512
           :spdx-core/HashAlgorithm-Sha3-256
           :spdx-core/HashAlgorithm-Md5
           :spdx-core/HashAlgorithm-CrystalsDilithium
           :spdx-core/HashAlgorithm-Blake3
           :spdx-core/HashAlgorithm-SpdxPvcSha256
           :spdx-core/HashAlgorithm-Sha3-512
           :spdx-core/HashAlgorithm-SpdxPvcSha1
           :spdx-core/HashAlgorithm-Sha384
           :spdx-core/HashAlgorithm-Falcon
           :spdx-core/HashAlgorithm-Sha224
           :spdx-core/HashAlgorithm-CrystalsKyber
           :spdx-core/HashAlgorithm-Blake2b384],
   :vs/term_status "Stable"})

(def HashAlgorithm-Blake2b256
  "blake2b256"
  {:db/ident   :spdx-core/HashAlgorithm-Blake2b256,
   :rdf/type   [:spdx-core/HashAlgorithm :owl/NamedIndividual],
   :rdfs/label "blake2b256"})

(def HashAlgorithm-Blake2b384
  "blake2b384"
  {:db/ident   :spdx-core/HashAlgorithm-Blake2b384,
   :rdf/type   [:spdx-core/HashAlgorithm :owl/NamedIndividual],
   :rdfs/label "blake2b384"})

(def HashAlgorithm-Blake2b512
  "blake2b512"
  {:db/ident   :spdx-core/HashAlgorithm-Blake2b512,
   :rdf/type   [:spdx-core/HashAlgorithm :owl/NamedIndividual],
   :rdfs/label "blake2b512"})

(def HashAlgorithm-Blake3
  "blake3"
  {:db/ident   :spdx-core/HashAlgorithm-Blake3,
   :rdf/type   [:spdx-core/HashAlgorithm :owl/NamedIndividual],
   :rdfs/label "blake3"})

(def HashAlgorithm-CrystalsDilithium
  "crystalsDilithium"
  {:db/ident   :spdx-core/HashAlgorithm-CrystalsDilithium,
   :rdf/type   [:spdx-core/HashAlgorithm :owl/NamedIndividual],
   :rdfs/label "crystalsDilithium"})

(def HashAlgorithm-CrystalsKyber
  "crystalsKyber"
  {:db/ident   :spdx-core/HashAlgorithm-CrystalsKyber,
   :rdf/type   [:spdx-core/HashAlgorithm :owl/NamedIndividual],
   :rdfs/label "crystalsKyber"})

(def HashAlgorithm-Falcon
  "falcon"
  {:db/ident   :spdx-core/HashAlgorithm-Falcon,
   :rdf/type   [:spdx-core/HashAlgorithm :owl/NamedIndividual],
   :rdfs/label "falcon"})

(def HashAlgorithm-Md2
  "md2"
  {:db/ident   :spdx-core/HashAlgorithm-Md2,
   :rdf/type   [:spdx-core/HashAlgorithm :owl/NamedIndividual],
   :rdfs/label "md2"})

(def HashAlgorithm-Md4
  "md4"
  {:db/ident   :spdx-core/HashAlgorithm-Md4,
   :rdf/type   [:spdx-core/HashAlgorithm :owl/NamedIndividual],
   :rdfs/label "md4"})

(def HashAlgorithm-Md5
  "md5"
  {:db/ident   :spdx-core/HashAlgorithm-Md5,
   :rdf/type   [:spdx-core/HashAlgorithm :owl/NamedIndividual],
   :rdfs/label "md5"})

(def HashAlgorithm-Md6
  "md6"
  {:db/ident   :spdx-core/HashAlgorithm-Md6,
   :rdf/type   [:spdx-core/HashAlgorithm :owl/NamedIndividual],
   :rdfs/label "md6"})

(def HashAlgorithm-Other
  "other"
  {:db/ident   :spdx-core/HashAlgorithm-Other,
   :rdf/type   [:spdx-core/HashAlgorithm :owl/NamedIndividual],
   :rdfs/label "other"})

(def HashAlgorithm-Sha1
  "sha1"
  {:db/ident   :spdx-core/HashAlgorithm-Sha1,
   :rdf/type   [:spdx-core/HashAlgorithm :owl/NamedIndividual],
   :rdfs/label "sha1"})

(def HashAlgorithm-Sha224
  "sha224"
  {:db/ident   :spdx-core/HashAlgorithm-Sha224,
   :rdf/type   [:spdx-core/HashAlgorithm :owl/NamedIndividual],
   :rdfs/label "sha224"})

(def HashAlgorithm-Sha256
  "sha256"
  {:db/ident   :spdx-core/HashAlgorithm-Sha256,
   :rdf/type   [:spdx-core/HashAlgorithm :owl/NamedIndividual],
   :rdfs/label "sha256"})

(def HashAlgorithm-Sha3-224
  "sha3_224"
  {:db/ident   :spdx-core/HashAlgorithm-Sha3-224,
   :rdf/type   [:spdx-core/HashAlgorithm :owl/NamedIndividual],
   :rdfs/label "sha3_224"})

(def HashAlgorithm-Sha3-256
  "sha3_256"
  {:db/ident   :spdx-core/HashAlgorithm-Sha3-256,
   :rdf/type   [:spdx-core/HashAlgorithm :owl/NamedIndividual],
   :rdfs/label "sha3_256"})

(def HashAlgorithm-Sha3-384
  "sha3_384"
  {:db/ident   :spdx-core/HashAlgorithm-Sha3-384,
   :rdf/type   [:spdx-core/HashAlgorithm :owl/NamedIndividual],
   :rdfs/label "sha3_384"})

(def HashAlgorithm-Sha3-512
  "sha3_512"
  {:db/ident   :spdx-core/HashAlgorithm-Sha3-512,
   :rdf/type   [:spdx-core/HashAlgorithm :owl/NamedIndividual],
   :rdfs/label "sha3_512"})

(def HashAlgorithm-Sha384
  "sha384"
  {:db/ident   :spdx-core/HashAlgorithm-Sha384,
   :rdf/type   [:spdx-core/HashAlgorithm :owl/NamedIndividual],
   :rdfs/label "sha384"})

(def HashAlgorithm-Sha512
  "sha512"
  {:db/ident   :spdx-core/HashAlgorithm-Sha512,
   :rdf/type   [:spdx-core/HashAlgorithm :owl/NamedIndividual],
   :rdfs/label "sha512"})

(def HashAlgorithm-SpdxPvcSha1
  "spdxPvcSha1"
  {:db/ident   :spdx-core/HashAlgorithm-SpdxPvcSha1,
   :rdf/type   [:spdx-core/HashAlgorithm :owl/NamedIndividual],
   :rdfs/label "spdxPvcSha1"})

(def HashAlgorithm-SpdxPvcSha256
  "spdxPvcSha256"
  {:db/ident   :spdx-core/HashAlgorithm-SpdxPvcSha256,
   :rdf/type   [:spdx-core/HashAlgorithm :owl/NamedIndividual],
   :rdfs/label "spdxPvcSha256"})

(def HashAlgorithm-SphincsPlus
  "sphincsPlus"
  {:db/ident   :spdx-core/HashAlgorithm-SphincsPlus,
   :rdf/type   [:spdx-core/HashAlgorithm :owl/NamedIndividual],
   :rdfs/label "sphincsPlus"})

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
  {:db/ident       :spdx-core/LifecycleScopeType,
   :rdf/type       :owl/Class,
   :rdfs/comment   "TODO",
   :sh/in          [:spdx-core/LifecycleScopeType-Test
                    :spdx-core/LifecycleScopeType-Runtime
                    :spdx-core/LifecycleScopeType-Other
                    :spdx-core/LifecycleScopeType-Development
                    :spdx-core/LifecycleScopeType-Design
                    :spdx-core/LifecycleScopeType-Build],
   :vs/term_status "Stable"})

(def LifecycleScopeType-Build
  "build"
  {:db/ident   :spdx-core/LifecycleScopeType-Build,
   :rdf/type   [:spdx-core/LifecycleScopeType :owl/NamedIndividual],
   :rdfs/label "build"})

(def LifecycleScopeType-Design
  "design"
  {:db/ident   :spdx-core/LifecycleScopeType-Design,
   :rdf/type   [:spdx-core/LifecycleScopeType :owl/NamedIndividual],
   :rdfs/label "design"})

(def LifecycleScopeType-Development
  "development"
  {:db/ident   :spdx-core/LifecycleScopeType-Development,
   :rdf/type   [:spdx-core/LifecycleScopeType :owl/NamedIndividual],
   :rdfs/label "development"})

(def LifecycleScopeType-Other
  "other"
  {:db/ident   :spdx-core/LifecycleScopeType-Other,
   :rdf/type   [:spdx-core/LifecycleScopeType :owl/NamedIndividual],
   :rdfs/label "other"})

(def LifecycleScopeType-Runtime
  "runtime"
  {:db/ident   :spdx-core/LifecycleScopeType-Runtime,
   :rdf/type   [:spdx-core/LifecycleScopeType :owl/NamedIndividual],
   :rdfs/label "runtime"})

(def LifecycleScopeType-Test
  "test"
  {:db/ident   :spdx-core/LifecycleScopeType-Test,
   :rdf/type   [:spdx-core/LifecycleScopeType :owl/NamedIndividual],
   :rdfs/label "test"})

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
   :rdf/type :rdfs/Datatype,
   :rdfs/comment
   "A MediaType is a string constrained to the RFC 6838 specification, and includes type-name, subtype-name and optional parameters. It provides a standardized way of indicating the type of content of an Element. A list of all possible media types is available at https://www.iana.org/assignments/media-types/media-types.xhtml.",
   :rdfs/subClassOf :xsd/string,
   :sh/pattern
   "^([a-zA-Z0-9][-a-zA-Z0-9!#$&^.+]{0,126})/([a-zA-Z0-9][-a-zA-Z0-9!#$&^.+]{0,126})(;.+)?$",
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
                  :sh/name     "end",
                  :sh/path     :spdx-core/end}
                 {:sh/datatype :xsd/positiveInteger,
                  :sh/maxCount #xsd/integer 1,
                  :sh/minCount #xsd/integer 1,
                  :sh/name     "begin",
                  :sh/path     :spdx-core/begin}],
   :vs/term_status "Stable"})

(def PresenceType
  "This type is used to indicate if a given field is present or absent or unknown."
  {:db/ident :spdx-core/PresenceType,
   :rdf/type :owl/Class,
   :rdfs/comment
   "This type is used to indicate if a given field is present or absent or unknown.",
   :sh/in [:spdx-core/PresenceType-Yes
           :spdx-core/PresenceType-NoAssertion
           :spdx-core/PresenceType-No],
   :vs/term_status "Stable"})

(def PresenceType-No
  "no"
  {:db/ident   :spdx-core/PresenceType-No,
   :rdf/type   [:spdx-core/PresenceType :owl/NamedIndividual],
   :rdfs/label "no"})

(def PresenceType-NoAssertion
  "noAssertion"
  {:db/ident   :spdx-core/PresenceType-NoAssertion,
   :rdf/type   [:spdx-core/PresenceType :owl/NamedIndividual],
   :rdfs/label "noAssertion"})

(def PresenceType-Yes
  "yes"
  {:db/ident   :spdx-core/PresenceType-Yes,
   :rdf/type   [:spdx-core/PresenceType :owl/NamedIndividual],
   :rdfs/label "yes"})

(def ProfileIdentifierType
  "There are a set of profiles that have been defined to be valid for a specific release   This file enumerates the values that have been agreed on, and may be applied to the creation information for an an element."
  {:db/ident :spdx-core/ProfileIdentifierType,
   :rdf/type :owl/Class,
   :rdfs/comment
   "There are a set of profiles that have been defined to be valid for a specific release   This file enumerates the values that have been agreed on, and may be applied to the creation information for an an element.",
   :sh/in [:spdx-core/ProfileIdentifierType-Dataset
           :spdx-core/ProfileIdentifierType-Build
           :spdx-core/ProfileIdentifierType-Security
           :spdx-core/ProfileIdentifierType-Usage
           :spdx-core/ProfileIdentifierType-Extension
           :spdx-core/ProfileIdentifierType-ExpandedLicensing
           :spdx-core/ProfileIdentifierType-SimpleLicensing
           :spdx-core/ProfileIdentifierType-Core
           :spdx-core/ProfileIdentifierType-AI
           :spdx-core/ProfileIdentifierType-Software],
   :vs/term_status "Stable"})

(def ProfileIdentifierType-AI
  "ai"
  {:db/ident   :spdx-core/ProfileIdentifierType-AI,
   :rdf/type   [:spdx-core/ProfileIdentifierType :owl/NamedIndividual],
   :rdfs/label "ai"})

(def ProfileIdentifierType-Build
  "build"
  {:db/ident   :spdx-core/ProfileIdentifierType-Build,
   :rdf/type   [:spdx-core/ProfileIdentifierType :owl/NamedIndividual],
   :rdfs/label "build"})

(def ProfileIdentifierType-Core
  "core"
  {:db/ident   :spdx-core/ProfileIdentifierType-Core,
   :rdf/type   [:spdx-core/ProfileIdentifierType :owl/NamedIndividual],
   :rdfs/label "core"})

(def ProfileIdentifierType-Dataset
  "dataset"
  {:db/ident   :spdx-core/ProfileIdentifierType-Dataset,
   :rdf/type   [:spdx-core/ProfileIdentifierType :owl/NamedIndividual],
   :rdfs/label "dataset"})

(def ProfileIdentifierType-ExpandedLicensing
  "expandedLicensing"
  {:db/ident   :spdx-core/ProfileIdentifierType-ExpandedLicensing,
   :rdf/type   [:spdx-core/ProfileIdentifierType :owl/NamedIndividual],
   :rdfs/label "expandedLicensing"})

(def ProfileIdentifierType-Extension
  "extension"
  {:db/ident   :spdx-core/ProfileIdentifierType-Extension,
   :rdf/type   [:spdx-core/ProfileIdentifierType :owl/NamedIndividual],
   :rdfs/label "extension"})

(def ProfileIdentifierType-Security
  "security"
  {:db/ident   :spdx-core/ProfileIdentifierType-Security,
   :rdf/type   [:spdx-core/ProfileIdentifierType :owl/NamedIndividual],
   :rdfs/label "security"})

(def ProfileIdentifierType-SimpleLicensing
  "simpleLicensing"
  {:db/ident   :spdx-core/ProfileIdentifierType-SimpleLicensing,
   :rdf/type   [:spdx-core/ProfileIdentifierType :owl/NamedIndividual],
   :rdfs/label "simpleLicensing"})

(def ProfileIdentifierType-Software
  "software"
  {:db/ident   :spdx-core/ProfileIdentifierType-Software,
   :rdf/type   [:spdx-core/ProfileIdentifierType :owl/NamedIndividual],
   :rdfs/label "software"})

(def ProfileIdentifierType-Usage
  "usage"
  {:db/ident   :spdx-core/ProfileIdentifierType-Usage,
   :rdf/type   [:spdx-core/ProfileIdentifierType :owl/NamedIndividual],
   :rdfs/label "usage"})

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
                 {:sh/class    :spdx-core/RelationshipCompleteness,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "completeness",
                  :sh/path     :spdx-core/completeness}
                 {:sh/class :spdx-core/Element,
                  :sh/name  "to",
                  :sh/path  :spdx-core/to}
                 {:sh/class    :spdx-core/Element,
                  :sh/maxCount #xsd/integer 1,
                  :sh/minCount #xsd/integer 1,
                  :sh/name     "from",
                  :sh/path     :spdx-core/from}
                 {:sh/datatype :spdx-core/DateTime,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "startTime",
                  :sh/path     :spdx-core/startTime}
                 {:sh/datatype :spdx-core/DateTime,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "endTime",
                  :sh/path     :spdx-core/endTime}],
   :vs/term_status "Stable"})

(def RelationshipCompleteness
  "RelationshipCompleteness indicates whether a relationship is complete or \nknown to be incomplete or if there is made no assertion either way."
  {:db/ident :spdx-core/RelationshipCompleteness,
   :rdf/type :owl/Class,
   :rdfs/comment
   "RelationshipCompleteness indicates whether a relationship is complete or \nknown to be incomplete or if there is made no assertion either way.",
   :sh/in [:spdx-core/RelationshipCompleteness-NoAssertion
           :spdx-core/RelationshipCompleteness-Incomplete
           :spdx-core/RelationshipCompleteness-Complete],
   :vs/term_status "Stable"})

(def RelationshipCompleteness-Complete
  "complete"
  {:db/ident   :spdx-core/RelationshipCompleteness-Complete,
   :rdf/type   [:spdx-core/RelationshipCompleteness :owl/NamedIndividual],
   :rdfs/label "complete"})

(def RelationshipCompleteness-Incomplete
  "incomplete"
  {:db/ident   :spdx-core/RelationshipCompleteness-Incomplete,
   :rdf/type   [:spdx-core/RelationshipCompleteness :owl/NamedIndividual],
   :rdfs/label "incomplete"})

(def RelationshipCompleteness-NoAssertion
  "noAssertion"
  {:db/ident   :spdx-core/RelationshipCompleteness-NoAssertion,
   :rdf/type   [:spdx-core/RelationshipCompleteness :owl/NamedIndividual],
   :rdfs/label "noAssertion"})

(def RelationshipType
  "Provides information about the relationship between two Elements.\nFor example, you can represent a relationship between two different Files,\nbetween a Package and a File, between two Packages, or between one SPDXDocument and another SPDXDocument."
  {:db/ident :spdx-core/RelationshipType,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Provides information about the relationship between two Elements.\nFor example, you can represent a relationship between two different Files,\nbetween a Package and a File, between two Packages, or between one SPDXDocument and another SPDXDocument.",
   :sh/in [:spdx-core/RelationshipType-UnderInvestigationFor
           :spdx-core/RelationshipType-DevDependency
           :spdx-core/RelationshipType-ConcludedLicense
           :spdx-core/RelationshipType-StaticLink
           :spdx-core/RelationshipType-HasAssociatedVulnerability
           :spdx-core/RelationshipType-Metafile
           :spdx-core/RelationshipType-ReportedBy
           :spdx-core/RelationshipType-Other
           :spdx-core/RelationshipType-Documentation
           :spdx-core/RelationshipType-Patch
           :spdx-core/RelationshipType-ExpandedFromArchive
           :spdx-core/RelationshipType-Prerequisite
           :spdx-core/RelationshipType-OptionalDependency
           :spdx-core/RelationshipType-FileDeleted
           :spdx-core/RelationshipType-CoordinatedBy
           :spdx-core/RelationshipType-DeclaredLicense
           :spdx-core/RelationshipType-TestTool
           :spdx-core/RelationshipType-Ancestor
           :spdx-core/RelationshipType-Copy
           :spdx-core/RelationshipType-TestCase
           :spdx-core/RelationshipType-OutputOf
           :spdx-core/RelationshipType-DistributionArtifact
           :spdx-core/RelationshipType-BuildDependency
           :spdx-core/RelationshipType-ExploitCreatedBy
           :spdx-core/RelationshipType-OnBehalfOf
           :spdx-core/RelationshipType-SpecificationFor
           :spdx-core/RelationshipType-Descendant
           :spdx-core/RelationshipType-Affects
           :spdx-core/RelationshipType-EvidenceFor
           :spdx-core/RelationshipType-DependencyManifest
           :spdx-core/RelationshipType-Amends
           :spdx-core/RelationshipType-RequirementFor
           :spdx-core/RelationshipType-HasAssessmentFor
           :spdx-core/RelationshipType-DataFile
           :spdx-core/RelationshipType-Test
           :spdx-core/RelationshipType-FileAdded
           :spdx-core/RelationshipType-InputOf
           :spdx-core/RelationshipType-Variant
           :spdx-core/RelationshipType-ProvidedDependency
           :spdx-core/RelationshipType-Contains
           :spdx-core/RelationshipType-AvailableFrom
           :spdx-core/RelationshipType-FoundBy
           :spdx-core/RelationshipType-TestedOn
           :spdx-core/RelationshipType-DependsOn
           :spdx-core/RelationshipType-DoesNotAffect
           :spdx-core/RelationshipType-FixedBy
           :spdx-core/RelationshipType-TestDependency
           :spdx-core/RelationshipType-DevTool
           :spdx-core/RelationshipType-FixedIn
           :spdx-core/RelationshipType-RepublishedBy
           :spdx-core/RelationshipType-TrainedOn
           :spdx-core/RelationshipType-DynamicLink
           :spdx-core/RelationshipType-Generates
           :spdx-core/RelationshipType-InvokedBy
           :spdx-core/RelationshipType-Example
           :spdx-core/RelationshipType-ConfigOf
           :spdx-core/RelationshipType-Describes
           :spdx-core/RelationshipType-Packages
           :spdx-core/RelationshipType-OptionalComponent
           :spdx-core/RelationshipType-PublishedBy
           :spdx-core/RelationshipType-FileModified
           :spdx-core/RelationshipType-BuildTool
           :spdx-core/RelationshipType-RuntimeDependency
           :spdx-core/RelationshipType-HostOf],
   :vs/term_status "Stable"})

(def RelationshipType-Affects
  "affects"
  {:db/ident   :spdx-core/RelationshipType-Affects,
   :rdf/type   [:spdx-core/RelationshipType :owl/NamedIndividual],
   :rdfs/label "affects"})

(def RelationshipType-Amends
  "amends"
  {:db/ident   :spdx-core/RelationshipType-Amends,
   :rdf/type   [:spdx-core/RelationshipType :owl/NamedIndividual],
   :rdfs/label "amends"})

(def RelationshipType-Ancestor
  "ancestor"
  {:db/ident   :spdx-core/RelationshipType-Ancestor,
   :rdf/type   [:spdx-core/RelationshipType :owl/NamedIndividual],
   :rdfs/label "ancestor"})

(def RelationshipType-AvailableFrom
  "availableFrom"
  {:db/ident   :spdx-core/RelationshipType-AvailableFrom,
   :rdf/type   [:spdx-core/RelationshipType :owl/NamedIndividual],
   :rdfs/label "availableFrom"})

(def RelationshipType-BuildDependency
  "buildDependency"
  {:db/ident   :spdx-core/RelationshipType-BuildDependency,
   :rdf/type   [:spdx-core/RelationshipType :owl/NamedIndividual],
   :rdfs/label "buildDependency"})

(def RelationshipType-BuildTool
  "buildTool"
  {:db/ident   :spdx-core/RelationshipType-BuildTool,
   :rdf/type   [:spdx-core/RelationshipType :owl/NamedIndividual],
   :rdfs/label "buildTool"})

(def RelationshipType-ConcludedLicense
  "A concludedLicense is the license identified by the SPDX data creator,\nbased on analyzing the license information in the software Package, File\nor Snippet and other information to arrive at a reasonably objective\nconclusion as to what license governs it.\n\nIf a concludedLicense has a NONE value (NoneLicense), this indicates that the\nSPDX data creator has looked and did not find any license information for this\nsoftware Package, File or Snippet.\n\nIf a concludedLicense has a NOASSERTION value (NoAssertionLicense), this\nindicates that one of the following applies:\n* the SPDX data creator has attempted to but cannot reach a reasonable\n  objective determination;\n* the SPDX data creator has made no attempt to determine this field; or\n* the SPDX data creator has intentionally provided no information (no\n  meaning should be implied by doing so).\n\nA written explanation of a NOASSERTION value (NoAssertionLicense) MAY be\nprovided in the licenseComment field.\n\nIf the concludedLicense for a software Package, File or Snippet is not the\nsame as its declaredLicense, a written explanation SHOULD be provided in\nthe licenseComment field.\n\nIf the declaredLicense for a software Package, File or Snippet is a choice\nof more than one license (e.g. a license expression combining two licenses\nthrough use of the `OR` operator), then the concludedLicense may either\nretain the license choice or identify which license was chosen."
  {:db/ident :spdx-core/RelationshipType-ConcludedLicense,
   :rdf/type [:spdx-core/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   "A concludedLicense is the license identified by the SPDX data creator,\nbased on analyzing the license information in the software Package, File\nor Snippet and other information to arrive at a reasonably objective\nconclusion as to what license governs it.\n\nIf a concludedLicense has a NONE value (NoneLicense), this indicates that the\nSPDX data creator has looked and did not find any license information for this\nsoftware Package, File or Snippet.\n\nIf a concludedLicense has a NOASSERTION value (NoAssertionLicense), this\nindicates that one of the following applies:\n* the SPDX data creator has attempted to but cannot reach a reasonable\n  objective determination;\n* the SPDX data creator has made no attempt to determine this field; or\n* the SPDX data creator has intentionally provided no information (no\n  meaning should be implied by doing so).\n\nA written explanation of a NOASSERTION value (NoAssertionLicense) MAY be\nprovided in the licenseComment field.\n\nIf the concludedLicense for a software Package, File or Snippet is not the\nsame as its declaredLicense, a written explanation SHOULD be provided in\nthe licenseComment field.\n\nIf the declaredLicense for a software Package, File or Snippet is a choice\nof more than one license (e.g. a license expression combining two licenses\nthrough use of the `OR` operator), then the concludedLicense may either\nretain the license choice or identify which license was chosen.",
   :rdfs/label "concludedLicense"})

(def RelationshipType-ConfigOf
  "configOf"
  {:db/ident   :spdx-core/RelationshipType-ConfigOf,
   :rdf/type   [:spdx-core/RelationshipType :owl/NamedIndividual],
   :rdfs/label "configOf"})

(def RelationshipType-Contains
  "contains"
  {:db/ident   :spdx-core/RelationshipType-Contains,
   :rdf/type   [:spdx-core/RelationshipType :owl/NamedIndividual],
   :rdfs/label "contains"})

(def RelationshipType-CoordinatedBy
  "coordinatedBy"
  {:db/ident   :spdx-core/RelationshipType-CoordinatedBy,
   :rdf/type   [:spdx-core/RelationshipType :owl/NamedIndividual],
   :rdfs/label "coordinatedBy"})

(def RelationshipType-Copy
  "copy"
  {:db/ident   :spdx-core/RelationshipType-Copy,
   :rdf/type   [:spdx-core/RelationshipType :owl/NamedIndividual],
   :rdfs/label "copy"})

(def RelationshipType-DataFile
  "dataFile"
  {:db/ident   :spdx-core/RelationshipType-DataFile,
   :rdf/type   [:spdx-core/RelationshipType :owl/NamedIndividual],
   :rdfs/label "dataFile"})

(def RelationshipType-DeclaredLicense
  "A declaredLicense is the license identified in text in the software package,\nfile or snippet as the license declared by its authors.\n\nThis field is not intended to capture license information obtained from an\nexternal source, such as a package's website. Such information can be\nincluded, as needed, in a concludedLicense field.\n\nA declaredLicense may be expressed differently in practice for different\ntypes of artifacts. For example:\n\n* for Packages:\n  * would include license info describing the license of the Package as a\n    whole, when it is found in the Package itself (e.g., LICENSE file,\n    README file, metadata in the repository, etc.)\n  * would not include any license information that is not in the Package\n    itself (e.g., license information from the project’s website or from a\n    third party repository or website)\n* for Files:\n  * would include license info found in the File itself (e.g., license\n    header or notice, comments, SPDX-License-Identifier expression)\n  * would not include license info found in a different file (e.g., LICENSE\n    file in the top directory of a repository)\n* for Snippets:\n  * would include license info found in the Snippet itself (e.g., license\n    notice, comments, SPDX-License-Identifier expression)\n  * would not include license info found elsewhere in the File or in a\n    different File (e.g., comment at top of File if it is not within the\n    Snippet, LICENSE file in the top directory of a repository)\n\nIf a declaredLicense has a NONE value (NoneLicense), this indicates that the\ncorresponding Package, File or Snippet contains no license information\nwhatsoever.\n\nIf a declaredLicense has a NOASSERTION value (NoAssertionLicense), this\nindicates that one of the following applies:\n* the SPDX data creator has attempted to but cannot reach a reasonable\n  objective determination;\n* the SPDX data creator has made no attempt to determine this field; or\n* the SPDX data creator has intentionally provided no information (no meaning\n  should be implied by doing so)."
  {:db/ident :spdx-core/RelationshipType-DeclaredLicense,
   :rdf/type [:spdx-core/RelationshipType :owl/NamedIndividual],
   :rdfs/comment
   "A declaredLicense is the license identified in text in the software package,\nfile or snippet as the license declared by its authors.\n\nThis field is not intended to capture license information obtained from an\nexternal source, such as a package's website. Such information can be\nincluded, as needed, in a concludedLicense field.\n\nA declaredLicense may be expressed differently in practice for different\ntypes of artifacts. For example:\n\n* for Packages:\n  * would include license info describing the license of the Package as a\n    whole, when it is found in the Package itself (e.g., LICENSE file,\n    README file, metadata in the repository, etc.)\n  * would not include any license information that is not in the Package\n    itself (e.g., license information from the project’s website or from a\n    third party repository or website)\n* for Files:\n  * would include license info found in the File itself (e.g., license\n    header or notice, comments, SPDX-License-Identifier expression)\n  * would not include license info found in a different file (e.g., LICENSE\n    file in the top directory of a repository)\n* for Snippets:\n  * would include license info found in the Snippet itself (e.g., license\n    notice, comments, SPDX-License-Identifier expression)\n  * would not include license info found elsewhere in the File or in a\n    different File (e.g., comment at top of File if it is not within the\n    Snippet, LICENSE file in the top directory of a repository)\n\nIf a declaredLicense has a NONE value (NoneLicense), this indicates that the\ncorresponding Package, File or Snippet contains no license information\nwhatsoever.\n\nIf a declaredLicense has a NOASSERTION value (NoAssertionLicense), this\nindicates that one of the following applies:\n* the SPDX data creator has attempted to but cannot reach a reasonable\n  objective determination;\n* the SPDX data creator has made no attempt to determine this field; or\n* the SPDX data creator has intentionally provided no information (no meaning\n  should be implied by doing so).",
   :rdfs/label "declaredLicense"})

(def RelationshipType-DependencyManifest
  "dependencyManifest"
  {:db/ident   :spdx-core/RelationshipType-DependencyManifest,
   :rdf/type   [:spdx-core/RelationshipType :owl/NamedIndividual],
   :rdfs/label "dependencyManifest"})

(def RelationshipType-DependsOn
  "dependsOn"
  {:db/ident   :spdx-core/RelationshipType-DependsOn,
   :rdf/type   [:spdx-core/RelationshipType :owl/NamedIndividual],
   :rdfs/label "dependsOn"})

(def RelationshipType-Descendant
  "descendant"
  {:db/ident   :spdx-core/RelationshipType-Descendant,
   :rdf/type   [:spdx-core/RelationshipType :owl/NamedIndividual],
   :rdfs/label "descendant"})

(def RelationshipType-Describes
  "describes"
  {:db/ident   :spdx-core/RelationshipType-Describes,
   :rdf/type   [:spdx-core/RelationshipType :owl/NamedIndividual],
   :rdfs/label "describes"})

(def RelationshipType-DevDependency
  "devDependency"
  {:db/ident   :spdx-core/RelationshipType-DevDependency,
   :rdf/type   [:spdx-core/RelationshipType :owl/NamedIndividual],
   :rdfs/label "devDependency"})

(def RelationshipType-DevTool
  "devTool"
  {:db/ident   :spdx-core/RelationshipType-DevTool,
   :rdf/type   [:spdx-core/RelationshipType :owl/NamedIndividual],
   :rdfs/label "devTool"})

(def RelationshipType-DistributionArtifact
  "distributionArtifact"
  {:db/ident   :spdx-core/RelationshipType-DistributionArtifact,
   :rdf/type   [:spdx-core/RelationshipType :owl/NamedIndividual],
   :rdfs/label "distributionArtifact"})

(def RelationshipType-Documentation
  "documentation"
  {:db/ident   :spdx-core/RelationshipType-Documentation,
   :rdf/type   [:spdx-core/RelationshipType :owl/NamedIndividual],
   :rdfs/label "documentation"})

(def RelationshipType-DoesNotAffect
  "doesNotAffect"
  {:db/ident   :spdx-core/RelationshipType-DoesNotAffect,
   :rdf/type   [:spdx-core/RelationshipType :owl/NamedIndividual],
   :rdfs/label "doesNotAffect"})

(def RelationshipType-DynamicLink
  "dynamicLink"
  {:db/ident   :spdx-core/RelationshipType-DynamicLink,
   :rdf/type   [:spdx-core/RelationshipType :owl/NamedIndividual],
   :rdfs/label "dynamicLink"})

(def RelationshipType-EvidenceFor
  "evidenceFor"
  {:db/ident   :spdx-core/RelationshipType-EvidenceFor,
   :rdf/type   [:spdx-core/RelationshipType :owl/NamedIndividual],
   :rdfs/label "evidenceFor"})

(def RelationshipType-Example
  "example"
  {:db/ident   :spdx-core/RelationshipType-Example,
   :rdf/type   [:spdx-core/RelationshipType :owl/NamedIndividual],
   :rdfs/label "example"})

(def RelationshipType-ExpandedFromArchive
  "expandedFromArchive"
  {:db/ident   :spdx-core/RelationshipType-ExpandedFromArchive,
   :rdf/type   [:spdx-core/RelationshipType :owl/NamedIndividual],
   :rdfs/label "expandedFromArchive"})

(def RelationshipType-ExploitCreatedBy
  "exploitCreatedBy"
  {:db/ident   :spdx-core/RelationshipType-ExploitCreatedBy,
   :rdf/type   [:spdx-core/RelationshipType :owl/NamedIndividual],
   :rdfs/label "exploitCreatedBy"})

(def RelationshipType-FileAdded
  "fileAdded"
  {:db/ident   :spdx-core/RelationshipType-FileAdded,
   :rdf/type   [:spdx-core/RelationshipType :owl/NamedIndividual],
   :rdfs/label "fileAdded"})

(def RelationshipType-FileDeleted
  "fileDeleted"
  {:db/ident   :spdx-core/RelationshipType-FileDeleted,
   :rdf/type   [:spdx-core/RelationshipType :owl/NamedIndividual],
   :rdfs/label "fileDeleted"})

(def RelationshipType-FileModified
  "fileModified"
  {:db/ident   :spdx-core/RelationshipType-FileModified,
   :rdf/type   [:spdx-core/RelationshipType :owl/NamedIndividual],
   :rdfs/label "fileModified"})

(def RelationshipType-FixedBy
  "fixedBy"
  {:db/ident   :spdx-core/RelationshipType-FixedBy,
   :rdf/type   [:spdx-core/RelationshipType :owl/NamedIndividual],
   :rdfs/label "fixedBy"})

(def RelationshipType-FixedIn
  "fixedIn"
  {:db/ident   :spdx-core/RelationshipType-FixedIn,
   :rdf/type   [:spdx-core/RelationshipType :owl/NamedIndividual],
   :rdfs/label "fixedIn"})

(def RelationshipType-FoundBy
  "foundBy"
  {:db/ident   :spdx-core/RelationshipType-FoundBy,
   :rdf/type   [:spdx-core/RelationshipType :owl/NamedIndividual],
   :rdfs/label "foundBy"})

(def RelationshipType-Generates
  "generates"
  {:db/ident   :spdx-core/RelationshipType-Generates,
   :rdf/type   [:spdx-core/RelationshipType :owl/NamedIndividual],
   :rdfs/label "generates"})

(def RelationshipType-HasAssessmentFor
  "hasAssessmentFor"
  {:db/ident   :spdx-core/RelationshipType-HasAssessmentFor,
   :rdf/type   [:spdx-core/RelationshipType :owl/NamedIndividual],
   :rdfs/label "hasAssessmentFor"})

(def RelationshipType-HasAssociatedVulnerability
  "hasAssociatedVulnerability"
  {:db/ident   :spdx-core/RelationshipType-HasAssociatedVulnerability,
   :rdf/type   [:spdx-core/RelationshipType :owl/NamedIndividual],
   :rdfs/label "hasAssociatedVulnerability"})

(def RelationshipType-HostOf
  "hostOf"
  {:db/ident   :spdx-core/RelationshipType-HostOf,
   :rdf/type   [:spdx-core/RelationshipType :owl/NamedIndividual],
   :rdfs/label "hostOf"})

(def RelationshipType-InputOf
  "inputOf"
  {:db/ident   :spdx-core/RelationshipType-InputOf,
   :rdf/type   [:spdx-core/RelationshipType :owl/NamedIndividual],
   :rdfs/label "inputOf"})

(def RelationshipType-InvokedBy
  "invokedBy"
  {:db/ident   :spdx-core/RelationshipType-InvokedBy,
   :rdf/type   [:spdx-core/RelationshipType :owl/NamedIndividual],
   :rdfs/label "invokedBy"})

(def RelationshipType-Metafile
  "metafile"
  {:db/ident   :spdx-core/RelationshipType-Metafile,
   :rdf/type   [:spdx-core/RelationshipType :owl/NamedIndividual],
   :rdfs/label "metafile"})

(def RelationshipType-OnBehalfOf
  "onBehalfOf"
  {:db/ident   :spdx-core/RelationshipType-OnBehalfOf,
   :rdf/type   [:spdx-core/RelationshipType :owl/NamedIndividual],
   :rdfs/label "onBehalfOf"})

(def RelationshipType-OptionalComponent
  "optionalComponent"
  {:db/ident   :spdx-core/RelationshipType-OptionalComponent,
   :rdf/type   [:spdx-core/RelationshipType :owl/NamedIndividual],
   :rdfs/label "optionalComponent"})

(def RelationshipType-OptionalDependency
  "optionalDependency"
  {:db/ident   :spdx-core/RelationshipType-OptionalDependency,
   :rdf/type   [:spdx-core/RelationshipType :owl/NamedIndividual],
   :rdfs/label "optionalDependency"})

(def RelationshipType-Other
  "other"
  {:db/ident   :spdx-core/RelationshipType-Other,
   :rdf/type   [:spdx-core/RelationshipType :owl/NamedIndividual],
   :rdfs/label "other"})

(def RelationshipType-OutputOf
  "outputOf"
  {:db/ident   :spdx-core/RelationshipType-OutputOf,
   :rdf/type   [:spdx-core/RelationshipType :owl/NamedIndividual],
   :rdfs/label "outputOf"})

(def RelationshipType-Packages
  "packages"
  {:db/ident   :spdx-core/RelationshipType-Packages,
   :rdf/type   [:spdx-core/RelationshipType :owl/NamedIndividual],
   :rdfs/label "packages"})

(def RelationshipType-Patch
  "patch"
  {:db/ident   :spdx-core/RelationshipType-Patch,
   :rdf/type   [:spdx-core/RelationshipType :owl/NamedIndividual],
   :rdfs/label "patch"})

(def RelationshipType-Prerequisite
  "prerequisite"
  {:db/ident   :spdx-core/RelationshipType-Prerequisite,
   :rdf/type   [:spdx-core/RelationshipType :owl/NamedIndividual],
   :rdfs/label "prerequisite"})

(def RelationshipType-ProvidedDependency
  "providedDependency"
  {:db/ident   :spdx-core/RelationshipType-ProvidedDependency,
   :rdf/type   [:spdx-core/RelationshipType :owl/NamedIndividual],
   :rdfs/label "providedDependency"})

(def RelationshipType-PublishedBy
  "publishedBy"
  {:db/ident   :spdx-core/RelationshipType-PublishedBy,
   :rdf/type   [:spdx-core/RelationshipType :owl/NamedIndividual],
   :rdfs/label "publishedBy"})

(def RelationshipType-ReportedBy
  "reportedBy"
  {:db/ident   :spdx-core/RelationshipType-ReportedBy,
   :rdf/type   [:spdx-core/RelationshipType :owl/NamedIndividual],
   :rdfs/label "reportedBy"})

(def RelationshipType-RepublishedBy
  "republishedBy"
  {:db/ident   :spdx-core/RelationshipType-RepublishedBy,
   :rdf/type   [:spdx-core/RelationshipType :owl/NamedIndividual],
   :rdfs/label "republishedBy"})

(def RelationshipType-RequirementFor
  "requirementFor"
  {:db/ident   :spdx-core/RelationshipType-RequirementFor,
   :rdf/type   [:spdx-core/RelationshipType :owl/NamedIndividual],
   :rdfs/label "requirementFor"})

(def RelationshipType-RuntimeDependency
  "runtimeDependency"
  {:db/ident   :spdx-core/RelationshipType-RuntimeDependency,
   :rdf/type   [:spdx-core/RelationshipType :owl/NamedIndividual],
   :rdfs/label "runtimeDependency"})

(def RelationshipType-SpecificationFor
  "specificationFor"
  {:db/ident   :spdx-core/RelationshipType-SpecificationFor,
   :rdf/type   [:spdx-core/RelationshipType :owl/NamedIndividual],
   :rdfs/label "specificationFor"})

(def RelationshipType-StaticLink
  "staticLink"
  {:db/ident   :spdx-core/RelationshipType-StaticLink,
   :rdf/type   [:spdx-core/RelationshipType :owl/NamedIndividual],
   :rdfs/label "staticLink"})

(def RelationshipType-Test
  "test"
  {:db/ident   :spdx-core/RelationshipType-Test,
   :rdf/type   [:spdx-core/RelationshipType :owl/NamedIndividual],
   :rdfs/label "test"})

(def RelationshipType-TestCase
  "testCase"
  {:db/ident   :spdx-core/RelationshipType-TestCase,
   :rdf/type   [:spdx-core/RelationshipType :owl/NamedIndividual],
   :rdfs/label "testCase"})

(def RelationshipType-TestDependency
  "testDependency"
  {:db/ident   :spdx-core/RelationshipType-TestDependency,
   :rdf/type   [:spdx-core/RelationshipType :owl/NamedIndividual],
   :rdfs/label "testDependency"})

(def RelationshipType-TestTool
  "testTool"
  {:db/ident   :spdx-core/RelationshipType-TestTool,
   :rdf/type   [:spdx-core/RelationshipType :owl/NamedIndividual],
   :rdfs/label "testTool"})

(def RelationshipType-TestedOn
  "testedOn"
  {:db/ident   :spdx-core/RelationshipType-TestedOn,
   :rdf/type   [:spdx-core/RelationshipType :owl/NamedIndividual],
   :rdfs/label "testedOn"})

(def RelationshipType-TrainedOn
  "trainedOn"
  {:db/ident   :spdx-core/RelationshipType-TrainedOn,
   :rdf/type   [:spdx-core/RelationshipType :owl/NamedIndividual],
   :rdfs/label "trainedOn"})

(def RelationshipType-UnderInvestigationFor
  "underInvestigationFor"
  {:db/ident   :spdx-core/RelationshipType-UnderInvestigationFor,
   :rdf/type   [:spdx-core/RelationshipType :owl/NamedIndividual],
   :rdfs/label "underInvestigationFor"})

(def RelationshipType-Variant
  "variant"
  {:db/ident   :spdx-core/RelationshipType-Variant,
   :rdf/type   [:spdx-core/RelationshipType :owl/NamedIndividual],
   :rdfs/label "variant"})

(def SemVer
  "A string constrained to be the SemVer 2.0.0 specification."
  {:db/ident :spdx-core/SemVer,
   :rdf/type :rdfs/Datatype,
   :rdfs/comment "A string constrained to be the SemVer 2.0.0 specification.",
   :rdfs/subClassOf :xsd/string,
   :sh/pattern
   "^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)\\.(0|[1-9]\\d*)(?:-((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$",
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
   [:spdx-core/Bundle :spdx-core/Element :spdx-core/ElementCollection],
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