(ns net.wikipunk.rdf.spdx-spec
  "This is the metadata ontology for the SPDX specification."
  {:dcat/downloadURL "resources/spdx/MetadataSPDX.ttl",
   :dcterms/abstract
   "This is the metadata ontology for the SPDX specification.",
   :dcterms/issued #xsd/dateTime #inst "2023-07-31T14:53:02.000+00:00",
   :dcterms/license {:rdfa/uri "http://spdx.org/licenses/Community-Spec-1.0"},
   :dcterms/modified #xsd/dateTime #inst "2023-07-31T14:53:02.000+00:00",
   :owl/imports [{:rdfa/uri "https://spdx.org/rdf/v3/AI/"}
                 {:rdfa/uri "https://spdx.org/rdf/v3/Build/"}
                 {:rdfa/uri "https://spdx.org/rdf/v3/Core/"}
                 {:rdfa/uri "https://spdx.org/rdf/v3/Dataset/"}
                 {:rdfa/uri "https://spdx.org/rdf/v3/ExpandedLicensing/"}
                 {:rdfa/uri "https://spdx.org/rdf/v3/Security/"}
                 {:rdfa/uri "https://spdx.org/rdf/v3/SimpleLicensing/"}
                 {:rdfa/uri "https://spdx.org/rdf/v3/Software/"}],
   :private true,
   :rdf/ns-prefix-map
   {"dcterms"       "http://purl.org/dc/terms/",
    "owl"           "http://www.w3.org/2002/07/owl#",
    "rdf"           "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
    "rdfs"          "http://www.w3.org/2000/01/rdf-schema#",
    "spdx-ai"       "https://spdx.org/rdf/v3/AI/",
    "spdx-build"    "https://spdx.org/rdf/v3/Build/",
    "spdx-core"     "https://spdx.org/rdf/v3/Core/",
    "spdx-dataset"  "https://spdx.org/rdf/v3/Dataset/",
    "spdx-expandedlicensing" "https://spdx.org/rdf/v3/ExpandedLicensing/",
    "spdx-security" "https://spdx.org/rdf/v3/Security/",
    "spdx-simplelicensing" "https://spdx.org/rdf/v3/SimpleLicensing/",
    "spdx-software" "https://spdx.org/rdf/v3/Software/",
    "spdx-spec"     "https://spdx.org/rdf/v3/MetadataSPDX",
    "xsd"           "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "spdx-spec",
   :rdfa/uri "https://spdx.org/rdf/v3/MetadataSPDX",
   :rdfs/label "Metadata for the SPDX specification."})

(def SPDXSpecification
  "SPDX® is an open standard for communicating software bill of material information, including components, licenses, copyrights, and security references. SPDX reduces redundant work by providing a common format for companies and communities to share important data, thereby streamlining and improving compliance."
  {:db/ident :spdx-spec/SPDXSpecification,
   :dcterms/hasPart [:spdx-core/ProfileIdentifierType-SimpleLicensing
                     :spdx-core/ProfileIdentifierType-Core
                     :spdx-core/ProfileIdentifierType-Dataset
                     :spdx-core/ProfileIdentifierType-Software
                     :spdx-core/ProfileIdentifierType-Build
                     :spdx-core/ProfileIdentifierType-Security
                     :spdx-core/ProfileIdentifierType-AI
                     :spdx-core/ProfileIdentifierType-ExpandedLicensing],
   :dcterms/issued #xsd/dateTime #inst "2023-07-31T14:53:02.000+00:00",
   :dcterms/license {:rdfa/uri "http://spdx.org/licenses/Community-Spec-1.0"},
   :dcterms/modified #xsd/dateTime #inst "2023-07-31T14:53:02.000+00:00",
   :owl/versionInfo "3.0",
   :rdf/type :owl/NamedIndividual,
   :rdfs/comment
   "SPDX® is an open standard for communicating software bill of material information, including components, licenses, copyrights, and security references. SPDX reduces redundant work by providing a common format for companies and communities to share important data, thereby streamlining and improving compliance.",
   :rdfs/label "SPDX"})

(def ^{:private true} ProfileIdentifierType-AI
  "The AI profile namespace defines concepts related to AI application and model artifacts."
  {:db/ident :spdx-core/ProfileIdentifierType-AI,
   :dcterms/abstract
   "The AI profile namespace defines concepts related to AI application and model artifacts.",
   :dcterms/hasPart {:rdfa/uri "https://spdx.org/rdf/v3/AI/"},
   :dcterms/identifier "AI",
   :dcterms/issued #xsd/dateTime #inst "2023-07-31T14:53:02.000+00:00",
   :dcterms/license {:rdfa/uri "http://spdx.org/licenses/Community-Spec-1.0"},
   :dcterms/modified #xsd/dateTime #inst "2023-07-31T14:53:02.000+00:00",
   :dcterms/references [{:rdfa/uri "https://spdx.org/rdf/v3/Software/"}
                        {:rdfa/uri "https://spdx.org/rdf/v3/SimpleLicensing/"}
                        {:rdfa/uri "https://spdx.org/rdf/v3/Core/"}],
   :rdf/type [:spdx-core/ProfileIdentifierType :owl/NamedIndividual]})

(def ^{:private true} ProfileIdentifierType-Build
  "The Build namespace defines concepts related to building of artifacts."
  {:db/ident :spdx-core/ProfileIdentifierType-Build,
   :dcterms/abstract
   "The Build namespace defines concepts related to building of artifacts.",
   :dcterms/hasPart {:rdfa/uri "https://spdx.org/rdf/v3/Build/"},
   :dcterms/identifier "Build",
   :dcterms/issued #xsd/dateTime #inst "2023-07-31T14:53:02.000+00:00",
   :dcterms/license {:rdfa/uri "http://spdx.org/licenses/Community-Spec-1.0"},
   :dcterms/modified #xsd/dateTime #inst "2023-07-31T14:53:02.000+00:00",
   :dcterms/references {:rdfa/uri "https://spdx.org/rdf/v3/Core/"},
   :rdf/type [:owl/NamedIndividual :spdx-core/ProfileIdentifierType],
   :rdfs/label "Build Profile"})

(def ^{:private true} ProfileIdentifierType-Core
  "The Core namespace defines foundational concepts serving as the basis for all SPDX-3.0 profiles."
  {:db/ident :spdx-core/ProfileIdentifierType-Core,
   :dcterms/abstract
   "The Core namespace defines foundational concepts serving as the basis for all SPDX-3.0 profiles.",
   :dcterms/hasPart {:rdfa/uri "https://spdx.org/rdf/v3/Core/"},
   :dcterms/identifier "Core",
   :dcterms/issued #xsd/dateTime #inst "2023-07-31T14:53:02.000+00:00",
   :dcterms/license {:rdfa/uri "http://spdx.org/licenses/Community-Spec-1.0"},
   :dcterms/modified #xsd/dateTime #inst "2023-07-31T14:53:02.000+00:00",
   :rdf/type [:spdx-core/ProfileIdentifierType :owl/NamedIndividual],
   :rdfs/label "Core Profile"})

(def ^{:private true} ProfileIdentifierType-Dataset
  "The Dataset profile namespace defines concepts related to datasets."
  {:db/ident :spdx-core/ProfileIdentifierType-Dataset,
   :dcterms/abstract
   "The Dataset profile namespace defines concepts related to datasets.",
   :dcterms/hasPart {:rdfa/uri "https://spdx.org/rdf/v3/Dataset/"},
   :dcterms/identifier "Dataset",
   :dcterms/issued #xsd/dateTime #inst "2023-07-31T14:53:02.000+00:00",
   :dcterms/license {:rdfa/uri "http://spdx.org/licenses/Community-Spec-1.0"},
   :dcterms/modified #xsd/dateTime #inst "2023-07-31T14:53:02.000+00:00",
   :dcterms/references [{:rdfa/uri "https://spdx.org/rdf/v3/AI/"}
                        {:rdfa/uri "https://spdx.org/rdf/v3/Software/"}
                        {:rdfa/uri "https://spdx.org/rdf/v3/Core/"}],
   :rdf/type [:spdx-core/ProfileIdentifierType :owl/NamedIndividual],
   :rdfs/label "Dataset Profile"})

(def ^{:private true} ProfileIdentifierType-ExpandedLicensing
  "The Expanded Licensing profile This profile supports representing a fully expanded license expression in object form."
  {:db/ident :spdx-core/ProfileIdentifierType-ExpandedLicensing,
   :dcterms/abstract
   "The Expanded Licensing profile This profile supports representing a fully expanded license expression in object form.",
   :dcterms/hasPart {:rdfa/uri "https://spdx.org/rdf/v3/ExpandedLicensing/"},
   :dcterms/identifier "ExpandedLicensing",
   :dcterms/issued #xsd/dateTime #inst "2023-07-31T14:53:02.000+00:00",
   :dcterms/license {:rdfa/uri "http://spdx.org/licenses/Community-Spec-1.0"},
   :dcterms/modified #xsd/dateTime #inst "2023-07-31T14:53:02.000+00:00",
   :dcterms/references [{:rdfa/uri "https://spdx.org/rdf/v3/SimpleLicensing/"}
                        {:rdfa/uri "https://spdx.org/rdf/v3/Core/"}],
   :rdf/type [:spdx-core/ProfileIdentifierType :owl/NamedIndividual],
   :rdfs/label "Expanded Licensing Profile"})

(def ^{:private true} ProfileIdentifierType-Security
  "The Security Profile captures security related information."
  {:db/ident :spdx-core/ProfileIdentifierType-Security,
   :dcterms/abstract
   "The Security Profile captures security related information.",
   :dcterms/hasPart {:rdfa/uri "https://spdx.org/rdf/v3/Security/"},
   :dcterms/identifier "Security",
   :dcterms/issued #xsd/dateTime #inst "2023-07-31T14:53:02.000+00:00",
   :dcterms/license {:rdfa/uri "http://spdx.org/licenses/Community-Spec-1.0"},
   :dcterms/modified #xsd/dateTime #inst "2023-07-31T14:53:02.000+00:00",
   :dcterms/references {:rdfa/uri "https://spdx.org/rdf/v3/Core/"},
   :rdf/type [:owl/NamedIndividual :spdx-core/ProfileIdentifierType],
   :rdfs/label "Security Profile"})

(def ^{:private true} ProfileIdentifierType-SimpleLicensing
  "The Licensing namespace defines metadata fields applicable to software licensing. It also defines the classes and properties that comprise the SPDX License Expression syntax and that relate to the SPDX License List."
  {:db/ident :spdx-core/ProfileIdentifierType-SimpleLicensing,
   :dcterms/abstract
   "The Licensing namespace defines metadata fields applicable to software licensing. It also defines the classes and properties that comprise the SPDX License Expression syntax and that relate to the SPDX License List.",
   :dcterms/hasPart {:rdfa/uri "https://spdx.org/rdf/v3/SimpleLicensing/"},
   :dcterms/identifier "SimpleLicensing",
   :dcterms/issued #xsd/dateTime #inst "2023-07-31T14:53:02.000+00:00",
   :dcterms/license {:rdfa/uri "http://spdx.org/licenses/Community-Spec-1.0"},
   :dcterms/modified #xsd/dateTime #inst "2023-07-31T14:53:02.000+00:00",
   :dcterms/references {:rdfa/uri "https://spdx.org/rdf/v3/Core/"},
   :rdf/type [:owl/NamedIndividual :spdx-core/ProfileIdentifierType],
   :rdfs/label "Simple Licensing Profile"})

(def ^{:private true} ProfileIdentifierType-Software
  "The Software profile namespace defines concepts related to software artifacts."
  {:db/ident :spdx-core/ProfileIdentifierType-Software,
   :dcterms/abstract
   "The Software profile namespace defines concepts related to software artifacts.",
   :dcterms/hasPart {:rdfa/uri "https://spdx.org/rdf/v3/Software/"},
   :dcterms/identifier "Software",
   :dcterms/issued #xsd/dateTime #inst "2023-07-31T14:53:02.000+00:00",
   :dcterms/license {:rdfa/uri "http://spdx.org/licenses/Community-Spec-1.0"},
   :dcterms/modified #xsd/dateTime #inst "2023-07-31T14:53:02.000+00:00",
   :dcterms/references [{:rdfa/uri "https://spdx.org/rdf/v3/SimpleLicensing/"}
                        {:rdfa/uri "https://spdx.org/rdf/v3/Core/"}],
   :rdf/type [:spdx-core/ProfileIdentifierType :owl/NamedIndividual],
   :rdfs/label "Software Profile"})