(ns net.wikipunk.rdf.spdx-spec
  ^{:base       "https://spdx.org/rdf/v3/MetadataSPDX/",
    :namespaces {"dcterms"       "http://purl.org/dc/terms/",
                 "owl"           "http://www.w3.org/2002/07/owl#",
                 "rdf"           "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                 "rdfs"          "http://www.w3.org/2000/01/rdf-schema#",
                 "spdx-ai"       "https://spdx.org/rdf/v3/AI/",
                 "spdx-build"    "https://spdx.org/rdf/v3/Build/",
                 "spdx-core"     "https://spdx.org/rdf/v3/Core/",
                 "spdx-dataset"  "https://spdx.org/rdf/v3/Dataset/",
                 "spdx-expandedlicensing"
                 "https://spdx.org/rdf/v3/ExpandedLicensing/",
                 "spdx-security" "https://spdx.org/rdf/v3/Security/",
                 "spdx-simplelicensing"
                 "https://spdx.org/rdf/v3/SimpleLicensing/",
                 "spdx-software" "https://spdx.org/rdf/v3/Software/",
                 "spdx-spec"     "https://spdx.org/rdf/v3/MetadataSPDX",
                 "xsd"           "http://www.w3.org/2001/XMLSchema#"},
    :prefix     "spdx-spec",
    :source     "resources/spdx/MetadataSPDX.ttl"}
  {:dcterms/abstract
   "This is the metadata ontology for the SPDX specification.",
   :dcterms/issued #inst "2023-07-31T14:53:02.000-00:00",
   :dcterms/license {:xsd/anyURI "http://spdx.org/licenses/Community-Spec-1.0"},
   :dcterms/modified #inst "2023-07-31T14:53:02.000-00:00",
   :owl/imports #{{:xsd/anyURI "https://spdx.org/rdf/v3/Core/"}
                  {:xsd/anyURI "https://spdx.org/rdf/v3/Security/"}
                  {:xsd/anyURI "https://spdx.org/rdf/v3/Dataset/"}
                  {:xsd/anyURI "https://spdx.org/rdf/v3/AI/"}
                  {:xsd/anyURI "https://spdx.org/rdf/v3/ExpandedLicensing/"}
                  {:xsd/anyURI "https://spdx.org/rdf/v3/Software/"}
                  {:xsd/anyURI "https://spdx.org/rdf/v3/Build/"}
                  {:xsd/anyURI "https://spdx.org/rdf/v3/SimpleLicensing/"}},
   :rdf/type :owl/Ontology,
   :rdfs/label "Metadata for the SPDX specification.",
   :xsd/anyURI "https://spdx.org/rdf/v3/MetadataSPDX"})

(def SPDXSpecification
  {:db/ident :spdx-spec/SPDXSpecification,
   :dcterms/hasPart #{:spdx-core/ProfileIdentifierType-Software
                      :spdx-core/ProfileIdentifierType-Dataset
                      :spdx-core/ProfileIdentifierType-Security
                      :spdx-core/ProfileIdentifierType-Core
                      :spdx-core/ProfileIdentifierType-Build
                      :spdx-core/ProfileIdentifierType-SimpleLicensing
                      :spdx-core/ProfileIdentifierType-AI
                      :spdx-core/ProfileIdentifierType-ExpandedLicensing},
   :dcterms/issued #inst "2023-07-31T14:53:02.000-00:00",
   :dcterms/license {:xsd/anyURI "http://spdx.org/licenses/Community-Spec-1.0"},
   :dcterms/modified #inst "2023-07-31T14:53:02.000-00:00",
   :owl/versionInfo "3.0",
   :rdf/type :owl/NamedIndividual,
   :rdfs/comment
   "SPDX® is an open standard for communicating software bill of material information, including components, licenses, copyrights, and security references. SPDX reduces redundant work by providing a common format for companies and communities to share important data, thereby streamlining and improving compliance.",
   :rdfs/label "SPDX"})

(def ^{:private true} ProfileIdentifierType-AI
  {:db/ident :spdx-core/ProfileIdentifierType-AI,
   :dcterms/abstract
   "The AI profile namespace defines concepts related to AI application and model artifacts.",
   :dcterms/hasPart {:xsd/anyURI "https://spdx.org/rdf/v3/AI/"},
   :dcterms/identifier "AI",
   :dcterms/issued #inst "2023-07-31T14:53:02.000-00:00",
   :dcterms/license {:xsd/anyURI "http://spdx.org/licenses/Community-Spec-1.0"},
   :dcterms/modified #inst "2023-07-31T14:53:02.000-00:00",
   :dcterms/references #{{:xsd/anyURI "https://spdx.org/rdf/v3/Core/"}
                         {:xsd/anyURI "https://spdx.org/rdf/v3/Software/"}
                         {:xsd/anyURI
                          "https://spdx.org/rdf/v3/SimpleLicensing/"}},
   :rdf/type #{:spdx-core/ProfileIdentifierType :owl/NamedIndividual}})

(def ^{:private true} ProfileIdentifierType-Build
  {:db/ident :spdx-core/ProfileIdentifierType-Build,
   :dcterms/abstract
   "The Build namespace defines concepts related to building of artifacts.",
   :dcterms/hasPart {:xsd/anyURI "https://spdx.org/rdf/v3/Build/"},
   :dcterms/identifier "Build",
   :dcterms/issued #inst "2023-07-31T14:53:02.000-00:00",
   :dcterms/license {:xsd/anyURI "http://spdx.org/licenses/Community-Spec-1.0"},
   :dcterms/modified #inst "2023-07-31T14:53:02.000-00:00",
   :dcterms/references {:xsd/anyURI "https://spdx.org/rdf/v3/Core/"},
   :rdf/type #{:spdx-core/ProfileIdentifierType :owl/NamedIndividual},
   :rdfs/label "Build Profile"})

(def ^{:private true} ProfileIdentifierType-Core
  {:db/ident :spdx-core/ProfileIdentifierType-Core,
   :dcterms/abstract
   "The Core namespace defines foundational concepts serving as the basis for all SPDX-3.0 profiles.",
   :dcterms/hasPart {:xsd/anyURI "https://spdx.org/rdf/v3/Core/"},
   :dcterms/identifier "Core",
   :dcterms/issued #inst "2023-07-31T14:53:02.000-00:00",
   :dcterms/license {:xsd/anyURI "http://spdx.org/licenses/Community-Spec-1.0"},
   :dcterms/modified #inst "2023-07-31T14:53:02.000-00:00",
   :rdf/type #{:spdx-core/ProfileIdentifierType :owl/NamedIndividual},
   :rdfs/label "Core Profile"})

(def ^{:private true} ProfileIdentifierType-Dataset
  {:db/ident :spdx-core/ProfileIdentifierType-Dataset,
   :dcterms/abstract
   "The Dataset profile namespace defines concepts related to datasets.",
   :dcterms/hasPart {:xsd/anyURI "https://spdx.org/rdf/v3/Dataset/"},
   :dcterms/identifier "Dataset",
   :dcterms/issued #inst "2023-07-31T14:53:02.000-00:00",
   :dcterms/license {:xsd/anyURI "http://spdx.org/licenses/Community-Spec-1.0"},
   :dcterms/modified #inst "2023-07-31T14:53:02.000-00:00",
   :dcterms/references #{{:xsd/anyURI "https://spdx.org/rdf/v3/Core/"}
                         {:xsd/anyURI "https://spdx.org/rdf/v3/AI/"}
                         {:xsd/anyURI "https://spdx.org/rdf/v3/Software/"}},
   :rdf/type #{:spdx-core/ProfileIdentifierType :owl/NamedIndividual},
   :rdfs/label "Dataset Profile"})

(def ^{:private true} ProfileIdentifierType-ExpandedLicensing
  {:db/ident :spdx-core/ProfileIdentifierType-ExpandedLicensing,
   :dcterms/abstract
   "The Expanded Licensing profile This profile supports representing a fully expanded license expression in object form.",
   :dcterms/hasPart {:xsd/anyURI "https://spdx.org/rdf/v3/ExpandedLicensing/"},
   :dcterms/identifier "ExpandedLicensing",
   :dcterms/issued #inst "2023-07-31T14:53:02.000-00:00",
   :dcterms/license {:xsd/anyURI "http://spdx.org/licenses/Community-Spec-1.0"},
   :dcterms/modified #inst "2023-07-31T14:53:02.000-00:00",
   :dcterms/references #{{:xsd/anyURI "https://spdx.org/rdf/v3/Core/"}
                         {:xsd/anyURI
                          "https://spdx.org/rdf/v3/SimpleLicensing/"}},
   :rdf/type #{:spdx-core/ProfileIdentifierType :owl/NamedIndividual},
   :rdfs/label "Expanded Licensing Profile"})

(def ^{:private true} ProfileIdentifierType-Security
  {:db/ident :spdx-core/ProfileIdentifierType-Security,
   :dcterms/abstract
   "The Security Profile captures security related information.",
   :dcterms/hasPart {:xsd/anyURI "https://spdx.org/rdf/v3/Security/"},
   :dcterms/identifier "Security",
   :dcterms/issued #inst "2023-07-31T14:53:02.000-00:00",
   :dcterms/license {:xsd/anyURI "http://spdx.org/licenses/Community-Spec-1.0"},
   :dcterms/modified #inst "2023-07-31T14:53:02.000-00:00",
   :dcterms/references {:xsd/anyURI "https://spdx.org/rdf/v3/Core/"},
   :rdf/type #{:spdx-core/ProfileIdentifierType :owl/NamedIndividual},
   :rdfs/label "Security Profile"})

(def ^{:private true} ProfileIdentifierType-SimpleLicensing
  {:db/ident :spdx-core/ProfileIdentifierType-SimpleLicensing,
   :dcterms/abstract
   "The Licensing namespace defines metadata fields applicable to software licensing. It also defines the classes and properties that comprise the SPDX License Expression syntax and that relate to the SPDX License List.",
   :dcterms/hasPart {:xsd/anyURI "https://spdx.org/rdf/v3/SimpleLicensing/"},
   :dcterms/identifier "SimpleLicensing",
   :dcterms/issued #inst "2023-07-31T14:53:02.000-00:00",
   :dcterms/license {:xsd/anyURI "http://spdx.org/licenses/Community-Spec-1.0"},
   :dcterms/modified #inst "2023-07-31T14:53:02.000-00:00",
   :dcterms/references {:xsd/anyURI "https://spdx.org/rdf/v3/Core/"},
   :rdf/type #{:spdx-core/ProfileIdentifierType :owl/NamedIndividual},
   :rdfs/label "Simple Licensing Profile"})

(def ^{:private true} ProfileIdentifierType-Software
  {:db/ident :spdx-core/ProfileIdentifierType-Software,
   :dcterms/abstract
   "The Software profile namespace defines concepts related to software artifacts.",
   :dcterms/hasPart {:xsd/anyURI "https://spdx.org/rdf/v3/Software/"},
   :dcterms/identifier "Software",
   :dcterms/issued #inst "2023-07-31T14:53:02.000-00:00",
   :dcterms/license {:xsd/anyURI "http://spdx.org/licenses/Community-Spec-1.0"},
   :dcterms/modified #inst "2023-07-31T14:53:02.000-00:00",
   :dcterms/references #{{:xsd/anyURI "https://spdx.org/rdf/v3/Core/"}
                         {:xsd/anyURI
                          "https://spdx.org/rdf/v3/SimpleLicensing/"}},
   :rdf/type #{:spdx-core/ProfileIdentifierType :owl/NamedIndividual},
   :rdfs/label "Software Profile"})

(def urn:uuid:fe3743fa-60f4-5af8-96eb-b907e9cf1ed2
  {:dcterms/abstract
   "This is the metadata ontology for the SPDX specification.",
   :dcterms/issued #inst "2023-07-31T14:53:02.000-00:00",
   :dcterms/license {:xsd/anyURI "http://spdx.org/licenses/Community-Spec-1.0"},
   :dcterms/modified #inst "2023-07-31T14:53:02.000-00:00",
   :owl/imports #{{:xsd/anyURI "https://spdx.org/rdf/v3/Core/"}
                  {:xsd/anyURI "https://spdx.org/rdf/v3/Security/"}
                  {:xsd/anyURI "https://spdx.org/rdf/v3/Dataset/"}
                  {:xsd/anyURI "https://spdx.org/rdf/v3/AI/"}
                  {:xsd/anyURI "https://spdx.org/rdf/v3/ExpandedLicensing/"}
                  {:xsd/anyURI "https://spdx.org/rdf/v3/Software/"}
                  {:xsd/anyURI "https://spdx.org/rdf/v3/Build/"}
                  {:xsd/anyURI "https://spdx.org/rdf/v3/SimpleLicensing/"}},
   :rdf/type :owl/Ontology,
   :rdfs/label "Metadata for the SPDX specification.",
   :xsd/anyURI "https://spdx.org/rdf/v3/MetadataSPDX"})