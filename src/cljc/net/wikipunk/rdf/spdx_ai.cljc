(ns net.wikipunk.rdf.spdx-ai
  ^{:base       "https://spdx.org/rdf/v3/AI/",
    :namespaces {"owl" "http://www.w3.org/2002/07/owl#",
                 "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                 "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                 "sh" "http://www.w3.org/ns/shacl#",
                 "spdx-ai" "https://spdx.org/rdf/v3/AI/",
                 "spdx-core" "https://spdx.org/rdf/v3/Core/",
                 "spdx-simplelicensing"
                 "https://spdx.org/rdf/v3/SimpleLicensing/",
                 "spdx-software" "https://spdx.org/rdf/v3/Software/",
                 "vs" "http://www.w3.org/2003/06/sw-vocab-status/ns#",
                 "xsd" "http://www.w3.org/2001/XMLSchema#"},
    :prefix     "spdx-ai",
    :source     "resources/spdx/AI/AI.ttl"}
  {:owl/imports #{{:xsd/anyURI "https://spdx.org/rdf/v3/Core/"}
                  {:xsd/anyURI "https://spdx.org/rdf/v3/Software/"}
                  {:xsd/anyURI "https://spdx.org/rdf/v3/SimpleLicensing/"}},
   :rdf/type :owl/Ontology,
   :rdfs/comment
   "The AI profile namespace defines concepts related to AI application and model artifacts.",
   :sh/declare {:sh/namespace "https://spdx.org/rdf/v3/AI/",
                :sh/prefix    "spdx-ai"},
   :xsd/anyURI "https://spdx.org/rdf/v3/AI/"})

(def AIPackage
  {:db/ident :spdx-ai/AIPackage,
   :rdf/type #{:sh/NodeShape :owl/Class},
   :rdfs/comment
   "Metadata information that can be added to a package to describe an AI application or trained AI model.\nExternal property restriction on /Core/Artifact/suppliedBy: minCount: 1\nExternal property restriction on /Software/Package/downloadLocation: minCount: 1\nExternal property restriction on /Software/Package/packageVersion: minCount: 1\nExternal property restriction on /Software/SoftwareArtifact/primaryPurpose: minCount: 1\nExternal property restriction on /Core/Artifact/releaseTime: minCount: 1",
   :rdfs/subClassOf :spdx-software/Package,
   :sh/property #{{:sh/datatype :xsd/string,
                   :sh/maxCount 1,
                   :sh/name     "informationAboutTraining",
                   :sh/path     :spdx-ai/informationAboutTraining}
                  {:sh/datatype :xsd/string,
                   :sh/name     "modelExplainability",
                   :sh/path     :spdx-ai/modelExplainability}
                  {:sh/class    :spdx-ai/SafetyRiskAssessmentType,
                   :sh/maxCount 1,
                   :sh/name     "safetyRiskAssessment",
                   :sh/path     :spdx-ai/safetyRiskAssessment}
                  {:sh/class :spdx-core/DictionaryEntry,
                   :sh/name  "hyperparameter",
                   :sh/path  :spdx-ai/hyperparameter}
                  {:sh/class :spdx-core/DictionaryEntry,
                   :sh/name  "metric",
                   :sh/path  :spdx-ai/metric}
                  {:sh/class    :spdx-core/PresenceType,
                   :sh/maxCount 1,
                   :sh/name     "sensitivePersonalInformation",
                   :sh/path     :spdx-ai/sensitivePersonalInformation}
                  {:sh/datatype :xsd/string,
                   :sh/maxCount 1,
                   :sh/name     "informationAboutApplication",
                   :sh/path     :spdx-ai/informationAboutApplication}
                  {:sh/class :spdx-core/DictionaryEntry,
                   :sh/name  "metricDecisionThreshold",
                   :sh/path  :spdx-ai/metricDecisionThreshold}
                  {:sh/datatype :xsd/string,
                   :sh/name     "domain",
                   :sh/path     :spdx-ai/domain}
                  {:sh/class    :spdx-core/PresenceType,
                   :sh/maxCount 1,
                   :sh/name     "autonomyType",
                   :sh/path     :spdx-ai/autonomyType}
                  {:sh/datatype :xsd/string,
                   :sh/name     "modelDataPreprocessing",
                   :sh/path     :spdx-ai/modelDataPreprocessing}
                  {:sh/datatype :xsd/string,
                   :sh/name     "standardCompliance",
                   :sh/path     :spdx-ai/standardCompliance}
                  {:sh/datatype :xsd/string,
                   :sh/name     "typeOfModel",
                   :sh/path     :spdx-ai/typeOfModel}
                  {:sh/datatype :xsd/string,
                   :sh/maxCount 1,
                   :sh/name     "energyConsumption",
                   :sh/path     :spdx-ai/energyConsumption}
                  {:sh/datatype :xsd/string,
                   :sh/maxCount 1,
                   :sh/name     "limitation",
                   :sh/path     :spdx-ai/limitation}},
   :vs/term_status "Stable"})

(def SafetyRiskAssessmentType
  {:db/ident :spdx-ai/SafetyRiskAssessmentType,
   :rdf/type :owl/Class,
   :rdfs/comment
   "Lists the different safety risk type values that can be used to describe the safety risk of AI software\naccording to [Article 20 of Regulation 765/2008/EC](https://ec.europa.eu/docsroom/documents/17107/attachments/1/translations/en/renditions/pdf).",
   :sh/in #{:spdx-ai/SafetyRiskAssessmentType-Serious
            :spdx-ai/SafetyRiskAssessmentType-Low
            :spdx-ai/SafetyRiskAssessmentType-Medium
            :spdx-ai/SafetyRiskAssessmentType-High},
   :vs/term_status "Stable"})

(def SafetyRiskAssessmentType-High
  {:db/ident   :spdx-ai/SafetyRiskAssessmentType-High,
   :rdf/type   #{:spdx-ai/SafetyRiskAssessmentType :owl/NamedIndividual},
   :rdfs/label "high"})

(def SafetyRiskAssessmentType-Low
  {:db/ident   :spdx-ai/SafetyRiskAssessmentType-Low,
   :rdf/type   #{:spdx-ai/SafetyRiskAssessmentType :owl/NamedIndividual},
   :rdfs/label "low"})

(def SafetyRiskAssessmentType-Medium
  {:db/ident   :spdx-ai/SafetyRiskAssessmentType-Medium,
   :rdf/type   #{:spdx-ai/SafetyRiskAssessmentType :owl/NamedIndividual},
   :rdfs/label "medium"})

(def SafetyRiskAssessmentType-Serious
  {:db/ident   :spdx-ai/SafetyRiskAssessmentType-Serious,
   :rdf/type   #{:spdx-ai/SafetyRiskAssessmentType :owl/NamedIndividual},
   :rdfs/label "serious"})

(def autonomyType
  {:db/ident :spdx-ai/autonomyType,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "AutonomyType indicates if a human is involved in any of the decisions of the AI software\nor if that software is fully automatic.",
   :rdfs/domain :spdx-ai/AIPackage,
   :rdfs/range :spdx-core/PresenceType,
   :vs/term_status "Stable"})

(def domain
  {:db/ident :spdx-ai/domain,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Domain describes the domain in which the AI model contained in the AI software\ncan be expected to operate successfully. Examples include computer vision, natural language etc.",
   :rdfs/domain :spdx-ai/AIPackage,
   :rdfs/range :xsd/string,
   :vs/term_status "Stable"})

(def energyConsumption
  {:db/ident :spdx-ai/energyConsumption,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "EnergyConsumption captures the amount of energy needed to train and operate the AI model. \nThis value is also known as training energy consumption or inference energy consumption.",
   :rdfs/domain :spdx-ai/AIPackage,
   :rdfs/range :xsd/string,
   :vs/term_status "Stable"})

(def hyperparameter
  {:db/ident :spdx-ai/hyperparameter,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "This field records a hyperparameter value.\nHyperparameters are parameters of the machine learning model that are used to control the learning process,\nfor example the optimization and learning rate used during the training of the model.",
   :rdfs/domain :spdx-ai/AIPackage,
   :rdfs/range :spdx-core/DictionaryEntry,
   :vs/term_status "Stable"})

(def informationAboutApplication
  {:db/ident :spdx-ai/informationAboutApplication,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "InformationAboutApplication describes any relevant information in free form text about \nhow the AI model is used inside the software, as well as any relevant pre-processing steps, third party APIs etc.",
   :rdfs/domain :spdx-ai/AIPackage,
   :rdfs/range :xsd/string,
   :vs/term_status "Stable"})

(def informationAboutTraining
  {:db/ident :spdx-ai/informationAboutTraining,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "InformationAboutTraining describes the specific steps involved in the training of the AI model.\nFor example, it can be specified whether supervised fine-tuning \nor active learning is used as part of training the model.",
   :rdfs/domain :spdx-ai/AIPackage,
   :rdfs/range :xsd/string,
   :vs/term_status "Stable"})

(def limitation
  {:db/ident :spdx-ai/limitation,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Limitation captures a limitation of the AI Package (or of the AI models present in the AI package),\nexpressed as free form text. Note that this is not guaranteed to be exhaustive.\nFor instance, a limitation might be that the AI package cannot be used on datasets from a certain demography.",
   :rdfs/domain :spdx-ai/AIPackage,
   :rdfs/range :xsd/string,
   :vs/term_status "Stable"})

(def metric
  {:db/ident :spdx-ai/metric,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Metric records the measurement with which the AI model was evaluated. \nThis makes statements about the prediction quality including uncertainty,\naccuracy, characteristics of the tested population, quality, fairness, explainability, robustness etc.",
   :rdfs/domain :spdx-ai/AIPackage,
   :rdfs/range :spdx-core/DictionaryEntry,
   :vs/term_status "Stable"})

(def metricDecisionThreshold
  {:db/ident :spdx-ai/metricDecisionThreshold,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Each metric might be computed based on a decision threshold. \nFor instance, precision or recall is typically computed by checking\nif the probability of the outcome is larger than 0.5.\nEach decision threshold should match with a metric field defined in the AI Package.",
   :rdfs/domain :spdx-ai/AIPackage,
   :rdfs/range :spdx-core/DictionaryEntry,
   :vs/term_status "Stable"})

(def modelDataPreprocessing
  {:db/ident :spdx-ai/modelDataPreprocessing,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "ModelDataPreprocessing is a free form text that describes the preprocessing steps\napplied to the training data before training of the model(s) contained in the AI software.",
   :rdfs/domain :spdx-ai/AIPackage,
   :rdfs/range :xsd/string,
   :vs/term_status "Stable"})

(def modelExplainability
  {:db/ident :spdx-ai/modelExplainability,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "ModelExplainability is a free form text that lists the different explainability mechanisms\n(such as SHAP, or other model specific explainability mechanisms) that can be used to explain the model.",
   :rdfs/domain :spdx-ai/AIPackage,
   :rdfs/range :xsd/string,
   :vs/term_status "Stable"})

(def safetyRiskAssessment
  {:db/ident :spdx-ai/safetyRiskAssessment,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "SafetyRiskAssessment categorizes the safety risk impact of the AI software\nin accordance with Article 20 of [EC Regulation No 765/2008](https://ec.europa.eu/docsroom/documents/17107/attachments/1/translations/en/renditions/pdf).",
   :rdfs/domain :spdx-ai/AIPackage,
   :rdfs/range :spdx-ai/SafetyRiskAssessmentType,
   :vs/term_status "Stable"})

(def sensitivePersonalInformation
  {:db/ident :spdx-ai/sensitivePersonalInformation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "SensitivePersonalInformation notes if sensitive personal information\nis used in the training or inference of the AI models.\nThis might include biometric data, addresses or other data that can be used to infer a person's identity.",
   :rdfs/domain :spdx-ai/AIPackage,
   :rdfs/range :spdx-core/PresenceType,
   :vs/term_status "Stable"})

(def standardCompliance
  {:db/ident :spdx-ai/standardCompliance,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "StandardCompliance captures a standard that the AI software complies with. \nThis includes both published and unpublished standards, for example ISO, IEEE, ETSI etc. \nThe standard could (but not necessarily have to) be used to satisfy a legal or regulatory requirement.",
   :rdfs/domain :spdx-ai/AIPackage,
   :rdfs/range :xsd/string,
   :vs/term_status "Stable"})

(def typeOfModel
  {:db/ident :spdx-ai/typeOfModel,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "TypeOfModel records the type of the AI model(s) used in the software. \nFor instance, if it is a supervised model, unsupervised model, reinforcement learning model or a combination of those.",
   :rdfs/domain :spdx-ai/AIPackage,
   :rdfs/range :xsd/string,
   :vs/term_status "Stable"})

(def urn:uuid:21ebaf18-b756-5483-b93a-e1974cb8b967
  {:owl/imports #{{:xsd/anyURI "https://spdx.org/rdf/v3/Core/"}
                  {:xsd/anyURI "https://spdx.org/rdf/v3/Software/"}
                  {:xsd/anyURI "https://spdx.org/rdf/v3/SimpleLicensing/"}},
   :rdf/type :owl/Ontology,
   :rdfs/comment
   "The AI profile namespace defines concepts related to AI application and model artifacts.",
   :sh/declare {:sh/namespace "https://spdx.org/rdf/v3/AI/",
                :sh/prefix    "spdx-ai"},
   :xsd/anyURI "https://spdx.org/rdf/v3/AI/"})