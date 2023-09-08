(ns net.wikipunk.rdf.spdx-dataset
  ^{:base       "https://spdx.org/rdf/v3/Dataset/",
    :namespaces {"owl" "http://www.w3.org/2002/07/owl#",
                 "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                 "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                 "sh" "http://www.w3.org/ns/shacl#",
                 "spdx-ai" "https://spdx.org/rdf/v3/AI/",
                 "spdx-core" "https://spdx.org/rdf/v3/Core/",
                 "spdx-dataset" "https://spdx.org/rdf/v3/Dataset/",
                 "spdx-software" "https://spdx.org/rdf/v3/Software/",
                 "vs" "http://www.w3.org/2003/06/sw-vocab-status/ns#",
                 "xsd" "http://www.w3.org/2001/XMLSchema#"},
    :prefix     "spdx-dataset",
    :source     "resources/spdx/Dataset/Dataset.ttl"}
  {:owl/imports #{{:xsd/anyURI "https://spdx.org/rdf/v3/Core/"}
                  {:xsd/anyURI "https://spdx.org/rdf/v3/AI/"}
                  {:xsd/anyURI "https://spdx.org/rdf/v3/Software/"}},
   :rdf/type :owl/Ontology,
   :rdfs/comment
   "This ontology describes the metadata that can be added to a dataset that may be used in a software or to train/test an AI package.",
   :sh/declare {:sh/namespace "https://spdx.org/rdf/v3/Dataset/",
                :sh/prefix    "spdx-dataset"},
   :xsd/anyURI "https://spdx.org/rdf/v3/Dataset/"})

(def ConfidentialityLevelType
  {:db/ident :spdx-dataset/ConfidentialityLevelType,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Describes the different confidentiality levels as given by the [Traffic Light Protocol](https://en.wikipedia.org/wiki/Traffic_Light_Protocol).",
   :sh/in #{:spdx-dataset/ConfidentialityLevelType-Red
            :spdx-dataset/ConfidentialityLevelType-Green
            :spdx-dataset/ConfidentialityLevelType-Amber
            :spdx-dataset/ConfidentialityLevelType-Clear},
   :vs/term_status "Stable"})

(def ConfidentialityLevelType-Amber
  {:db/ident   :spdx-dataset/ConfidentialityLevelType-Amber,
   :rdf/type   #{:owl/NamedIndividual :spdx-dataset/ConfidentialityLevelType},
   :rdfs/label "amber"})

(def ConfidentialityLevelType-Clear
  {:db/ident   :spdx-dataset/ConfidentialityLevelType-Clear,
   :rdf/type   #{:owl/NamedIndividual :spdx-dataset/ConfidentialityLevelType},
   :rdfs/label "clear"})

(def ConfidentialityLevelType-Green
  {:db/ident   :spdx-dataset/ConfidentialityLevelType-Green,
   :rdf/type   #{:owl/NamedIndividual :spdx-dataset/ConfidentialityLevelType},
   :rdfs/label "green"})

(def ConfidentialityLevelType-Red
  {:db/ident   :spdx-dataset/ConfidentialityLevelType-Red,
   :rdf/type   #{:owl/NamedIndividual :spdx-dataset/ConfidentialityLevelType},
   :rdfs/label "red"})

(def Dataset
  {:db/ident :spdx-dataset/Dataset,
   :rdf/type #{:sh/NodeShape :owl/Class},
   :rdfs/comment
   "Metadata information that can be added to a dataset that may be used in a software or to train/test an AI package.\nExternal property restriction on /Core/Artifact/originatedBy: minCount: 1\nExternal property restriction on /Software/Package/downloadLocation: minCount: 1\nExternal property restriction on /Software/SoftwareArtifact/primaryPurpose: minCount: 1\nExternal property restriction on /Core/Artifact/releaseTime: minCount: 1\nExternal property restriction on /Core/Artifact/builtTime: minCount: 1",
   :rdfs/subClassOf :spdx-software/Package,
   :sh/property #{{:sh/class    :spdx-dataset/ConfidentialityLevelType,
                   :sh/maxCount 1,
                   :sh/name     "confidentialityLevel",
                   :sh/path     :spdx-dataset/confidentialityLevel}
                  {:sh/datatype :xsd/string,
                   :sh/name     "knownBias",
                   :sh/path     :spdx-dataset/knownBias}
                  {:sh/datatype :xsd/string,
                   :sh/name     "anonymizationMethodUsed",
                   :sh/path     :spdx-dataset/anonymizationMethodUsed}
                  {:sh/datatype :spdx-core/PresenceType,
                   :sh/maxCount 1,
                   :sh/name     "sensitivePersonalInformation",
                   :sh/path     :spdx-dataset/sensitivePersonalInformation}
                  {:sh/datatype :xsd/nonNegativeInteger,
                   :sh/maxCount 1,
                   :sh/name     "datasetSize",
                   :sh/path     :spdx-dataset/datasetSize}
                  {:sh/class    :spdx-dataset/DatasetType,
                   :sh/minCount 1,
                   :sh/name     "datasetType",
                   :sh/path     :spdx-dataset/datasetType}
                  {:sh/datatype :xsd/string,
                   :sh/maxCount 1,
                   :sh/name     "intendedUse",
                   :sh/path     :spdx-dataset/intendedUse}
                  {:sh/class :spdx-core/DictionaryEntry,
                   :sh/name  "sensor",
                   :sh/path  :spdx-dataset/sensor}
                  {:sh/datatype :xsd/string,
                   :sh/maxCount 1,
                   :sh/name     "datasetNoise",
                   :sh/path     :spdx-dataset/datasetNoise}
                  {:sh/class    :spdx-dataset/DatasetAvailabilityType,
                   :sh/maxCount 1,
                   :sh/name     "datasetAvailability",
                   :sh/path     :spdx-dataset/datasetAvailability}
                  {:sh/datatype :xsd/string,
                   :sh/maxCount 1,
                   :sh/name     "datasetUpdateMechanism",
                   :sh/path     :spdx-dataset/datasetUpdateMechanism}
                  {:sh/datatype :xsd/string,
                   :sh/name     "dataPreprocessing",
                   :sh/path     :spdx-dataset/dataPreprocessing}
                  {:sh/datatype :xsd/string,
                   :sh/maxCount 1,
                   :sh/name     "dataCollectionProcess",
                   :sh/path     :spdx-dataset/dataCollectionProcess}},
   :vs/term_status "Stable"})

(def DatasetAvailabilityType
  {:db/ident :spdx-dataset/DatasetAvailabilityType,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Describes the possible types of availability of a dataset, indicating whether the dataset can be directly downloaded, can be assembled using a script for scraping the data, is only available after a clickthrough or a registration form.",
   :sh/in #{:spdx-dataset/DatasetAvailabilityType-Scraping-Script
            :spdx-dataset/DatasetAvailabilityType-Registration
            :spdx-dataset/DatasetAvailabilityType-Direct-Download
            :spdx-dataset/DatasetAvailabilityType-Clickthrough
            :spdx-dataset/DatasetAvailabilityType-Query},
   :vs/term_status "Stable"})

(def DatasetAvailabilityType-Clickthrough
  {:db/ident   :spdx-dataset/DatasetAvailabilityType-Clickthrough,
   :rdf/type   #{:spdx-dataset/DatasetAvailabilityType :owl/NamedIndividual},
   :rdfs/label "clickthrough"})

(def DatasetAvailabilityType-Direct-Download
  {:db/ident   :spdx-dataset/DatasetAvailabilityType-Direct-Download,
   :rdf/type   #{:spdx-dataset/DatasetAvailabilityType :owl/NamedIndividual},
   :rdfs/label "direct-download"})

(def DatasetAvailabilityType-Query
  {:db/ident   :spdx-dataset/DatasetAvailabilityType-Query,
   :rdf/type   #{:spdx-dataset/DatasetAvailabilityType :owl/NamedIndividual},
   :rdfs/label "query"})

(def DatasetAvailabilityType-Registration
  {:db/ident   :spdx-dataset/DatasetAvailabilityType-Registration,
   :rdf/type   #{:spdx-dataset/DatasetAvailabilityType :owl/NamedIndividual},
   :rdfs/label "registration"})

(def DatasetAvailabilityType-Scraping-Script
  {:db/ident   :spdx-dataset/DatasetAvailabilityType-Scraping-Script,
   :rdf/type   #{:spdx-dataset/DatasetAvailabilityType :owl/NamedIndividual},
   :rdfs/label "scraping-script"})

(def DatasetType
  {:db/ident :spdx-dataset/DatasetType,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Describes the different structures of data within a given dataset. A dataset can have multiple types of data, or even a single type of data but still match multiple types, for example sensor data could also be timeseries or labeled image data could also be considered categorical.",
   :sh/in #{:spdx-dataset/DatasetType-Syntactic :spdx-dataset/DatasetType-Image
            :spdx-dataset/DatasetType-Graph :spdx-dataset/DatasetType-Other
            :spdx-dataset/DatasetType-Audio :spdx-dataset/DatasetType-Timeseries
            :spdx-dataset/DatasetType-Text :spdx-dataset/DatasetType-Numeric
            :spdx-dataset/DatasetType-Video :spdx-dataset/DatasetType-Sensor
            :spdx-dataset/DatasetType-Timestamp
            :spdx-dataset/DatasetType-Categorical
            :spdx-dataset/DatasetType-NoAssertion
            :spdx-dataset/DatasetType-Structured},
   :vs/term_status "Stable"})

(def DatasetType-Audio
  {:db/ident   :spdx-dataset/DatasetType-Audio,
   :rdf/type   #{:spdx-dataset/DatasetType :owl/NamedIndividual},
   :rdfs/label "audio"})

(def DatasetType-Categorical
  {:db/ident   :spdx-dataset/DatasetType-Categorical,
   :rdf/type   #{:spdx-dataset/DatasetType :owl/NamedIndividual},
   :rdfs/label "categorical"})

(def DatasetType-Graph
  {:db/ident   :spdx-dataset/DatasetType-Graph,
   :rdf/type   #{:spdx-dataset/DatasetType :owl/NamedIndividual},
   :rdfs/label "graph"})

(def DatasetType-Image
  {:db/ident   :spdx-dataset/DatasetType-Image,
   :rdf/type   #{:spdx-dataset/DatasetType :owl/NamedIndividual},
   :rdfs/label "image"})

(def DatasetType-NoAssertion
  {:db/ident   :spdx-dataset/DatasetType-NoAssertion,
   :rdf/type   #{:spdx-dataset/DatasetType :owl/NamedIndividual},
   :rdfs/label "noAssertion"})

(def DatasetType-Numeric
  {:db/ident   :spdx-dataset/DatasetType-Numeric,
   :rdf/type   #{:spdx-dataset/DatasetType :owl/NamedIndividual},
   :rdfs/label "numeric"})

(def DatasetType-Other
  {:db/ident   :spdx-dataset/DatasetType-Other,
   :rdf/type   #{:spdx-dataset/DatasetType :owl/NamedIndividual},
   :rdfs/label "other"})

(def DatasetType-Sensor
  {:db/ident   :spdx-dataset/DatasetType-Sensor,
   :rdf/type   #{:spdx-dataset/DatasetType :owl/NamedIndividual},
   :rdfs/label "sensor"})

(def DatasetType-Structured
  {:db/ident   :spdx-dataset/DatasetType-Structured,
   :rdf/type   #{:spdx-dataset/DatasetType :owl/NamedIndividual},
   :rdfs/label "structured"})

(def DatasetType-Syntactic
  {:db/ident   :spdx-dataset/DatasetType-Syntactic,
   :rdf/type   #{:spdx-dataset/DatasetType :owl/NamedIndividual},
   :rdfs/label "syntactic"})

(def DatasetType-Text
  {:db/ident   :spdx-dataset/DatasetType-Text,
   :rdf/type   #{:spdx-dataset/DatasetType :owl/NamedIndividual},
   :rdfs/label "text"})

(def DatasetType-Timeseries
  {:db/ident   :spdx-dataset/DatasetType-Timeseries,
   :rdf/type   #{:spdx-dataset/DatasetType :owl/NamedIndividual},
   :rdfs/label "timeseries"})

(def DatasetType-Timestamp
  {:db/ident   :spdx-dataset/DatasetType-Timestamp,
   :rdf/type   #{:spdx-dataset/DatasetType :owl/NamedIndividual},
   :rdfs/label "timestamp"})

(def DatasetType-Video
  {:db/ident   :spdx-dataset/DatasetType-Video,
   :rdf/type   #{:spdx-dataset/DatasetType :owl/NamedIndividual},
   :rdfs/label "video"})

(def anonymizationMethodUsed
  {:db/ident :spdx-dataset/anonymizationMethodUsed,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "AnonymizationMethodUsed describes the methods used to anonymize the dataset (of fields in the dataset).",
   :rdfs/domain :spdx-dataset/Dataset,
   :rdfs/range :xsd/string,
   :vs/term_status "Stable"})

(def confidentialityLevel
  {:db/ident :spdx-dataset/confidentialityLevel,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "ConfidentialityLevel describes the levels of confidentiality of the data points contained in the dataset.",
   :rdfs/domain :spdx-dataset/Dataset,
   :rdfs/range :spdx-dataset/ConfidentialityLevelType,
   :vs/term_status "Stable"})

(def dataCollectionProcess
  {:db/ident :spdx-dataset/dataCollectionProcess,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "DataCollectionProcess describes how a dataset was collected.\nExamples include the sources from which a dataset was scrapped or\nthe interview protocol that was used for data collection.",
   :rdfs/domain :spdx-dataset/Dataset,
   :rdfs/range :xsd/string,
   :vs/term_status "Stable"})

(def dataPreprocessing
  {:db/ident :spdx-dataset/dataPreprocessing,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "DataPreprocessing describes the various preprocessing steps\nthat were applied to the raw data to create the dataset.",
   :rdfs/domain :spdx-dataset/Dataset,
   :rdfs/range :xsd/string,
   :vs/term_status "Stable"})

(def datasetAvailability
  {:db/ident :spdx-dataset/datasetAvailability,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Some datasets are publicly available and can be downloaded directly. Others are only accessible behind a clickthrough, or after filling a registration form. This field will describe the dataset availability from that perspective.",
   :rdfs/domain :spdx-dataset/Dataset,
   :rdfs/range :spdx-dataset/DatasetAvailabilityType,
   :vs/term_status "Stable"})

(def datasetNoise
  {:db/ident :spdx-dataset/datasetNoise,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "DatasetNoise describes what kinds of noises a dataset might encompass.\nThe field uses free form text to specify the fields or the samples that might be noisy.\nAlternatively, it can also be used to describe various noises that could impact the whole dataset.",
   :rdfs/domain :spdx-dataset/Dataset,
   :rdfs/range :xsd/string,
   :vs/term_status "Stable"})

(def datasetSize
  {:db/ident :spdx-dataset/datasetSize,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "DatasetSize Captures how large a dataset is.\nThe size is to be measured in bytes.",
   :rdfs/domain :spdx-dataset/Dataset,
   :rdfs/range :xsd/nonNegativeInteger,
   :vs/term_status "Stable"})

(def datasetType
  {:db/ident :spdx-dataset/datasetType,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Type describes the datatype contained in the dataset. For example a dataset can be an image dataset for computer vision applications, a text dataset such as the contents of a book or Wikipedia article, or sometimes a multimodal dataset that contains multiple types of data.",
   :rdfs/domain :spdx-dataset/Dataset,
   :rdfs/range :spdx-dataset/DatasetType,
   :vs/term_status "Stable"})

(def datasetUpdateMechanism
  {:db/ident :spdx-dataset/datasetUpdateMechanism,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "DatasetUpdateMechanism describes a mechanism to update the dataset.",
   :rdfs/domain :spdx-dataset/Dataset,
   :rdfs/range :xsd/string,
   :vs/term_status "Stable"})

(def intendedUse
  {:db/ident :spdx-dataset/intendedUse,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "IntendedUse describes what the given dataset should be used for.\nSome datasets are collected to be used only for particular purposes. \nFor example, medical data collected from a specific demography might only be applicable\nfor training machine learning models to make predictions for that demography.\nIn such a case, the intendedUse field would capture this information.\nSimilarly, if a dataset is collected for building a facial recognition model,\nthe intendedUse field would specify that.",
   :rdfs/domain :spdx-dataset/Dataset,
   :rdfs/range :xsd/string,
   :vs/term_status "Stable"})

(def knownBias
  {:db/ident :spdx-dataset/knownBias,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "KnownBias is a free form text field that describes the different biases that the dataset encompasses.",
   :rdfs/domain :spdx-dataset/Dataset,
   :rdfs/range :xsd/string,
   :vs/term_status "Stable"})

(def sensitivePersonalInformation
  {:db/ident :spdx-dataset/sensitivePersonalInformation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "SensitivePersonalInformation indicates the presence of sensitive personal data\nor information that allows drawing conclusions about a person's identity.",
   :rdfs/domain :spdx-dataset/Dataset,
   :rdfs/range :spdx-core/PresenceType,
   :vs/term_status "Stable"})

(def sensor
  {:db/ident :spdx-dataset/sensor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Sensor describes a sensor that was used for collecting the data\nand its calibration value as a key-value pair.",
   :rdfs/domain :spdx-dataset/Dataset,
   :rdfs/range :spdx-core/DictionaryEntry,
   :vs/term_status "Stable"})

(def urn:uuid:939144d7-fc59-5080-91ef-114526de6602
  {:owl/imports #{{:xsd/anyURI "https://spdx.org/rdf/v3/Core/"}
                  {:xsd/anyURI "https://spdx.org/rdf/v3/AI/"}
                  {:xsd/anyURI "https://spdx.org/rdf/v3/Software/"}},
   :rdf/type :owl/Ontology,
   :rdfs/comment
   "This ontology describes the metadata that can be added to a dataset that may be used in a software or to train/test an AI package.",
   :sh/declare {:sh/namespace "https://spdx.org/rdf/v3/Dataset/",
                :sh/prefix    "spdx-dataset"},
   :xsd/anyURI "https://spdx.org/rdf/v3/Dataset/"})