(ns net.wikipunk.rdf.spdx-dataset
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
   :rdfa/prefix       "spdx-dataset",
   :rdfa/uri          "https://spdx.org/rdf/v3/Dataset/"})

(def ConfidentialityLevelType
  "Describes the different confidentiality levels as given by the [Traffic Light Protocol](https://en.wikipedia.org/wiki/Traffic_Light_Protocol)."
  {:db/ident :spdx-dataset/ConfidentialityLevelType,
   :owl/oneOf
   [{:rdfa/uri "https://spdx.org/rdf/v3/Dataset/ConfidentialityLevelType/Clear"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Dataset/ConfidentialityLevelType/Amber"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Dataset/ConfidentialityLevelType/Green"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Dataset/ConfidentialityLevelType/Red"}],
   :rdf/type :owl/Class,
   :rdfs/comment
   "Describes the different confidentiality levels as given by the [Traffic Light Protocol](https://en.wikipedia.org/wiki/Traffic_Light_Protocol).",
   :vs/term_status "Stable"})

(def Dataset
  "Metadata information that can be added to a dataset that may be used in a software or to train/test an AI package.\nExternal property restriction on /Core/Artifact/originatedBy: minCount: 1\nExternal property restriction on /Software/Package/downloadLocation: minCount: 1\nExternal property restriction on /Software/SoftwareArtifact/primaryPurpose: minCount: 1\nExternal property restriction on /Core/Artifact/releaseTime: minCount: 1\nExternal property restriction on /Core/Artifact/builtTime: minCount: 1"
  {:db/ident :spdx-dataset/Dataset,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "Metadata information that can be added to a dataset that may be used in a software or to train/test an AI package.\nExternal property restriction on /Core/Artifact/originatedBy: minCount: 1\nExternal property restriction on /Software/Package/downloadLocation: minCount: 1\nExternal property restriction on /Software/SoftwareArtifact/primaryPurpose: minCount: 1\nExternal property restriction on /Core/Artifact/releaseTime: minCount: 1\nExternal property restriction on /Core/Artifact/builtTime: minCount: 1",
   :rdfs/subClassOf [:spdx-software/Package
                     :spdx-software/SoftwareArtifact
                     :spdx-core/Artifact
                     :spdx-core/Element],
   :sh/property [{:sh/class    :spdx-dataset/ConfidentialityLevelType,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "confidentialityLevel",
                  :sh/path     :spdx-dataset/confidentialityLevel}
                 {:sh/datatype :xsd/nonNegativeInteger,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "datasetSize",
                  :sh/path     :spdx-dataset/datasetSize}
                 {:sh/class :spdx-core/DictionaryEntry,
                  :sh/name  "sensor",
                  :sh/path  :spdx-dataset/sensor}
                 {:sh/datatype :xsd/string,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "intendedUse",
                  :sh/path     :spdx-dataset/intendedUse}
                 {:sh/datatype :xsd/string,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "datasetUpdateMechanism",
                  :sh/path     :spdx-dataset/datasetUpdateMechanism}
                 {:sh/datatype :xsd/string,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "dataCollectionProcess",
                  :sh/path     :spdx-dataset/dataCollectionProcess}
                 {:sh/datatype :xsd/string,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "datasetNoise",
                  :sh/path     :spdx-dataset/datasetNoise}
                 {:sh/datatype :xsd/string,
                  :sh/name     "dataPreprocessing",
                  :sh/path     :spdx-dataset/dataPreprocessing}
                 {:sh/datatype :xsd/string,
                  :sh/name     "knownBias",
                  :sh/path     :spdx-dataset/knownBias}
                 {:sh/datatype :spdx-ai/PresenceType,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "sensitivePersonalInformation",
                  :sh/path     :spdx-dataset/sensitivePersonalInformation}
                 {:sh/class    :spdx-dataset/DatasetType,
                  :sh/minCount #xsd/integer 1,
                  :sh/name     "datasetType",
                  :sh/path     :spdx-dataset/datasetType}
                 {:sh/class    :spdx-dataset/DatasetAvailabilityType,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "datasetAvailability",
                  :sh/path     :spdx-dataset/datasetAvailability}
                 {:sh/datatype :xsd/string,
                  :sh/name     "anonymizationMethodUsed",
                  :sh/path     :spdx-dataset/anonymizationMethodUsed}],
   :vs/term_status "Stable"})

(def DatasetAvailabilityType
  "Describes the possible types of availability of a dataset, indicating whether the dataset can be directly downloaded, can be assembled using a script for scraping the data, is only available after a clickthrough or a registration form."
  {:db/ident :spdx-dataset/DatasetAvailabilityType,
   :owl/oneOf
   [{:rdfa/uri
     "https://spdx.org/rdf/v3/Dataset/DatasetAvailabilityType/Scraping-Script"}
    {:rdfa/uri
     "https://spdx.org/rdf/v3/Dataset/DatasetAvailabilityType/Direct-Download"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Dataset/DatasetAvailabilityType/Query"}
    {:rdfa/uri
     "https://spdx.org/rdf/v3/Dataset/DatasetAvailabilityType/Clickthrough"}
    {:rdfa/uri
     "https://spdx.org/rdf/v3/Dataset/DatasetAvailabilityType/Registration"}],
   :rdf/type :owl/Class,
   :rdfs/comment
   "Describes the possible types of availability of a dataset, indicating whether the dataset can be directly downloaded, can be assembled using a script for scraping the data, is only available after a clickthrough or a registration form.",
   :vs/term_status "Stable"})

(def DatasetType
  "Describes the different structures of data within a given dataset. A dataset can have multiple types of data, or even a single type of data but still match multiple types, for example sensor data could also be timeseries or labeled image data could also be considered categorical."
  {:db/ident :spdx-dataset/DatasetType,
   :owl/oneOf
   [{:rdfa/uri "https://spdx.org/rdf/v3/Dataset/DatasetType/syntactic"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Dataset/DatasetType/graph"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Dataset/DatasetType/timeseries"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Dataset/DatasetType/numeric"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Dataset/DatasetType/noAssertion"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Dataset/DatasetType/video"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Dataset/DatasetType/timestamp"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Dataset/DatasetType/audio"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Dataset/DatasetType/other"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Dataset/DatasetType/categorical"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Dataset/DatasetType/image"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Dataset/DatasetType/sensor"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Dataset/DatasetType/structured"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Dataset/DatasetType/text"}],
   :rdf/type :owl/Class,
   :rdfs/comment
   "Describes the different structures of data within a given dataset. A dataset can have multiple types of data, or even a single type of data but still match multiple types, for example sensor data could also be timeseries or labeled image data could also be considered categorical.",
   :vs/term_status "Stable"})

(def anonymizationMethodUsed
  "AnonymizationMethodUsed describes the methods used to anonymize the dataset (of fields in the dataset)."
  {:db/ident :spdx-dataset/anonymizationMethodUsed,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "AnonymizationMethodUsed describes the methods used to anonymize the dataset (of fields in the dataset).",
   :rdfs/domain :spdx-dataset/Dataset,
   :rdfs/range :xsd/string,
   :vs/term_status "Stable"})

(def confidentialityLevel
  "ConfidentialityLevel describes the levels of confidentiality of the data points contained in the dataset."
  {:db/ident :spdx-dataset/confidentialityLevel,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "ConfidentialityLevel describes the levels of confidentiality of the data points contained in the dataset.",
   :rdfs/domain :spdx-dataset/Dataset,
   :rdfs/range :spdx-dataset/ConfidentialityLevelType,
   :vs/term_status "Stable"})

(def dataCollectionProcess
  "DataCollectionProcess describes how a dataset was collected.\nExamples include the sources from which a dataset was scrapped or\nthe interview protocol that was used for data collection."
  {:db/ident :spdx-dataset/dataCollectionProcess,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "DataCollectionProcess describes how a dataset was collected.\nExamples include the sources from which a dataset was scrapped or\nthe interview protocol that was used for data collection.",
   :rdfs/domain :spdx-dataset/Dataset,
   :rdfs/range :xsd/string,
   :vs/term_status "Stable"})

(def dataPreprocessing
  "DataPreprocessing describes the various preprocessing steps\nthat were applied to the raw data to create the dataset."
  {:db/ident :spdx-dataset/dataPreprocessing,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "DataPreprocessing describes the various preprocessing steps\nthat were applied to the raw data to create the dataset.",
   :rdfs/domain :spdx-dataset/Dataset,
   :rdfs/range :xsd/string,
   :vs/term_status "Stable"})

(def datasetAvailability
  "Some datasets are publicly available and can be downloaded directly. Others are only accessible behind a clickthrough, or after filling a registration form. This field will describe the dataset availability from that perspective."
  {:db/ident :spdx-dataset/datasetAvailability,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Some datasets are publicly available and can be downloaded directly. Others are only accessible behind a clickthrough, or after filling a registration form. This field will describe the dataset availability from that perspective.",
   :rdfs/domain :spdx-dataset/Dataset,
   :rdfs/range :spdx-dataset/DatasetAvailabilityType,
   :vs/term_status "Stable"})

(def datasetNoise
  "DatasetNoise describes what kinds of noises a dataset might encompass.\nThe field uses free form text to specify the fields or the samples that might be noisy.\nAlternatively, it can also be used to describe various noises that could impact the whole dataset."
  {:db/ident :spdx-dataset/datasetNoise,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "DatasetNoise describes what kinds of noises a dataset might encompass.\nThe field uses free form text to specify the fields or the samples that might be noisy.\nAlternatively, it can also be used to describe various noises that could impact the whole dataset.",
   :rdfs/domain :spdx-dataset/Dataset,
   :rdfs/range :xsd/string,
   :vs/term_status "Stable"})

(def datasetSize
  "DatasetSize Captures how large a dataset is.\nThe size is to be measured in bytes."
  {:db/ident :spdx-dataset/datasetSize,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "DatasetSize Captures how large a dataset is.\nThe size is to be measured in bytes.",
   :rdfs/domain :spdx-dataset/Dataset,
   :rdfs/range :xsd/nonNegativeInteger,
   :vs/term_status "Stable"})

(def datasetType
  "Type describes the datatype contained in the dataset. For example a dataset can be an image dataset for computer vision applications, a text dataset such as the contents of a book or Wikipedia article, or sometimes a multimodal dataset that contains multiple types of data."
  {:db/ident :spdx-dataset/datasetType,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Type describes the datatype contained in the dataset. For example a dataset can be an image dataset for computer vision applications, a text dataset such as the contents of a book or Wikipedia article, or sometimes a multimodal dataset that contains multiple types of data.",
   :rdfs/domain :spdx-dataset/Dataset,
   :rdfs/range :spdx-dataset/DatasetType,
   :vs/term_status "Stable"})

(def datasetUpdateMechanism
  "DatasetUpdateMechanism describes a mechanism to update the dataset."
  {:db/ident :spdx-dataset/datasetUpdateMechanism,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "DatasetUpdateMechanism describes a mechanism to update the dataset.",
   :rdfs/domain :spdx-dataset/Dataset,
   :rdfs/range :xsd/string,
   :vs/term_status "Stable"})

(def intendedUse
  "IntendedUse describes what the given dataset should be used for.\nSome datasets are collected to be used only for particular purposes. \nFor example, medical data collected from a specific demography might only be applicable\nfor training machine learning models to make predictions for that demography.\nIn such a case, the intendedUse field would capture this information.\nSimilarly, if a dataset is collected for building a facial recognition model,\nthe intendedUse field would specify that."
  {:db/ident :spdx-dataset/intendedUse,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "IntendedUse describes what the given dataset should be used for.\nSome datasets are collected to be used only for particular purposes. \nFor example, medical data collected from a specific demography might only be applicable\nfor training machine learning models to make predictions for that demography.\nIn such a case, the intendedUse field would capture this information.\nSimilarly, if a dataset is collected for building a facial recognition model,\nthe intendedUse field would specify that.",
   :rdfs/domain :spdx-dataset/Dataset,
   :rdfs/range :xsd/string,
   :vs/term_status "Stable"})

(def knownBias
  "KnownBias is a free form text field that describes the different biases that the dataset encompasses."
  {:db/ident :spdx-dataset/knownBias,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "KnownBias is a free form text field that describes the different biases that the dataset encompasses.",
   :rdfs/domain :spdx-dataset/Dataset,
   :rdfs/range :xsd/string,
   :vs/term_status "Stable"})

(def sensitivePersonalInformation
  "SensitivePersonalInformation indicates the presence of sensitive personal data\nor information that allows drawing conclusions about a person's identity."
  {:db/ident :spdx-dataset/sensitivePersonalInformation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "SensitivePersonalInformation indicates the presence of sensitive personal data\nor information that allows drawing conclusions about a person's identity.",
   :rdfs/domain :spdx-dataset/Dataset,
   :rdfs/range :spdx-ai/PresenceType,
   :vs/term_status "Stable"})

(def sensor
  "Sensor describes a sensor that was used for collecting the data\nand its calibration value as a key-value pair."
  {:db/ident :spdx-dataset/sensor,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Sensor describes a sensor that was used for collecting the data\nand its calibration value as a key-value pair.",
   :rdfs/domain :spdx-dataset/Dataset,
   :rdfs/range :spdx-core/DictionaryEntry,
   :vs/term_status "Stable"})