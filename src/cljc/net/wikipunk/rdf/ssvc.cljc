(ns net.wikipunk.rdf.ssvc
  "An ontology representing the concepts and relationships in SSVC scores"
  {:dcat/downloadURL "resources/ssvc.ttl",
   :rdf/ns-prefix-map {"d3fend"
                       "http://d3fend.mitre.org/ontologies/d3fend.owl#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "spdx" "http://spdx.org/rdf/terms#",
                       "ssvc" "https://wikipunk.net/ssvc/",
                       "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "ssvc",
   :rdfa/uri "https://wikipunk.net/ssvc/",
   :rdfs/comment
   "An ontology representing the concepts and relationships in SSVC scores",
   :rdfs/label "SSVC Ontology"}
  (:refer-clojure :exclude [key]))

(def ComplexDecisionType
  "Complex Decision Type"
  {:db/ident   :ssvc/ComplexDecisionType,
   :rdf/type   :ssvc/DecisionType,
   :rdfs/label "Complex Decision Type"})

(def ComputedScore
  "A computed SSVC score representing the path in the decision tree"
  {:db/ident :ssvc/ComputedScore,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A computed SSVC score representing the path in the decision tree",
   :rdfs/label "Computed Score"})

(def DecisionPoint
  "A node in the decision tree, including the root node, with a label and two or more options"
  {:db/ident :ssvc/DecisionPoint,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A node in the decision tree, including the root node, with a label and two or more options",
   :rdfs/label "Decision Point"})

(def DecisionTree
  "A decision tree used in computing SSVC scores for a vulnerability"
  {:db/ident :ssvc/DecisionTree,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A decision tree used in computing SSVC scores for a vulnerability",
   :rdfs/label "Decision Tree"})

(def DecisionType
  "A decision type, which can be simple, complex, or final"
  {:db/ident     :ssvc/DecisionType,
   :owl/oneOf    [:ssvc/SimpleDecisionType
                  :ssvc/ComplexDecisionType
                  :ssvc/FinalDecisionType],
   :rdf/type     :owl/Class,
   :rdfs/comment "A decision type, which can be simple, complex, or final",
   :rdfs/label   "Decision Type"})

(def FinalDecisionType
  "Final Decision Type"
  {:db/ident   :ssvc/FinalDecisionType,
   :rdf/type   :ssvc/DecisionType,
   :rdfs/label "Final Decision Type"})

(def Option
  "An option within a decision point"
  {:db/ident     :ssvc/Option,
   :rdf/type     :owl/Class,
   :rdfs/comment "An option within a decision point",
   :rdfs/label   "Option"})

(def OptionPattern
  "A pattern within an option in the decision tree"
  {:db/ident     :ssvc/OptionPattern,
   :rdf/type     :owl/Class,
   :rdfs/comment "A pattern within an option in the decision tree",
   :rdfs/label   "Option Pattern"})

(def SimpleDecisionType
  "Simple Decision Type"
  {:db/ident   :ssvc/SimpleDecisionType,
   :rdf/type   :ssvc/DecisionType,
   :rdfs/label "Simple Decision Type"})

(def color
  "An optional color to represent the final edge node or final recommended action provided by the SSVC tree"
  {:db/ident :ssvc/color,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "An optional color to represent the final edge node or final recommended action provided by the SSVC tree",
   :rdfs/label "Color",
   :rdfs/range :xsd/string})

(def computed
  "A short vector representation of an SSVC computed decision score"
  {:db/ident :ssvc/computed,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "A short vector representation of an SSVC computed decision score",
   :rdfs/domain :ssvc/ComputedScore,
   :rdfs/label "Computed",
   :rdfs/range :xsd/string})

(def decision_tree
  "The full decision tree that was used for this SSVC computed score"
  {:db/ident :ssvc/decision_tree,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "The full decision tree that was used for this SSVC computed score",
   :rdfs/domain :ssvc/ComputedScore,
   :rdfs/label "Decision Tree",
   :rdfs/range :ssvc/DecisionTree})

(def decision_tree_url
  "A URL that points to the decision tree used to make this computed decision"
  {:db/ident :ssvc/decision_tree_url,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "A URL that points to the decision tree used to make this computed decision",
   :rdfs/domain :ssvc/ComputedScore,
   :rdfs/label "Decision Tree URL",
   :rdfs/range :xsd/anyURI})

(def description
  "A description that provides full information about an option"
  {:db/ident     :ssvc/description,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment "A description that provides full information about an option",
   :rdfs/label   "Description",
   :rdfs/range   :xsd/string})

(def generator
  "Identify the software or tool that was used to generate this Computed JSON output, optionally append the version of the tool"
  {:db/ident :ssvc/generator,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Identify the software or tool that was used to generate this Computed JSON output, optionally append the version of the tool",
   :rdfs/domain :ssvc/ComputedScore,
   :rdfs/label "Generator",
   :rdfs/range :xsd/string})

(def hasChild
  "Relates a decision point to its child decision points"
  {:db/ident     :ssvc/hasChild,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment "Relates a decision point to its child decision points",
   :rdfs/domain  :ssvc/DecisionPoint,
   :rdfs/label   "Has Child",
   :rdfs/range   :ssvc/DecisionPoint})

(def hasDecisionPoint
  "Relates a decision tree to its decision points"
  {:db/ident     :ssvc/hasDecisionPoint,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment "Relates a decision tree to its decision points",
   :rdfs/domain  :ssvc/DecisionTree,
   :rdfs/label   "Has Decision Point",
   :rdfs/range   :ssvc/DecisionPoint})

(def hasDecisionType
  "Relates a decision point to its decision type"
  {:db/ident     :ssvc/hasDecisionType,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment "Relates a decision point to its decision type",
   :rdfs/domain  :ssvc/DecisionPoint,
   :rdfs/label   "Has Decision Type",
   :rdfs/range   :ssvc/DecisionType})

(def hasOption
  "Relates a decision point to its options"
  {:db/ident     :ssvc/hasOption,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment "Relates a decision point to its options",
   :rdfs/domain  :ssvc/DecisionPoint,
   :rdfs/label   "Has Option",
   :rdfs/range   :ssvc/Option})

(def hasOptionPattern
  "Relates an option to the option patterns within it"
  {:db/ident     :ssvc/hasOptionPattern,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment "Relates an option to the option patterns within it",
   :rdfs/domain  :ssvc/Option,
   :rdfs/label   "Has Option Pattern",
   :rdfs/range   :ssvc/OptionPattern})

(def hasParent
  "Relates a decision point to its parent decision point"
  {:db/ident     :ssvc/hasParent,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment "Relates a decision point to its parent decision point",
   :rdfs/domain  :ssvc/DecisionPoint,
   :rdfs/label   "Has Parent",
   :rdfs/range   :ssvc/DecisionPoint})

(def id
  "Identifier for a vulnerability (CVE, CERT/CC VU#, OSV id, Bugtraq, etc.)"
  {:db/ident :ssvc/id,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Identifier for a vulnerability (CVE, CERT/CC VU#, OSV id, Bugtraq, etc.)",
   :rdfs/domain :ssvc/ComputedScore,
   :rdfs/label "ID",
   :rdfs/range :xsd/string})

(def key
  "An optional short key that identifies a decision point or option in the SSVC score vector form"
  {:db/ident :ssvc/key,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "An optional short key that identifies a decision point or option in the SSVC score vector form",
   :rdfs/label "Key",
   :rdfs/range :xsd/string})

(def label
  "A short label that captures a short name of a decision point, option, or decision type"
  {:db/ident :ssvc/label,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "A short label that captures a short name of a decision point, option, or decision type",
   :rdfs/label "Label",
   :rdfs/range :xsd/string})

(def options
  "Relates a computed score to the options in the decision tree"
  {:db/ident     :ssvc/options,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment "Relates a computed score to the options in the decision tree",
   :rdfs/domain  :ssvc/ComputedScore,
   :rdfs/label   "Options",
   :rdfs/range   :ssvc/Option})

(def role
  "Roles defined in the SSVC spec and optional in the SSVC provision schema"
  {:db/ident :ssvc/role,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Roles defined in the SSVC spec and optional in the SSVC provision schema",
   :rdfs/domain :ssvc/ComputedScore,
   :rdfs/label "Role",
   :rdfs/range :xsd/string})

(def schema
  "A URL that points to the schema used for the decision tree to make this computed decision"
  {:db/ident :ssvc/schema,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "A URL that points to the schema used for the decision tree to make this computed decision",
   :rdfs/domain :ssvc/ComputedScore,
   :rdfs/label "Schema",
   :rdfs/range :xsd/anyURI})

(def timestamp
  "Date and time in ISO format (ISO 8601)"
  {:db/ident     :ssvc/timestamp,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment "Date and time in ISO format (ISO 8601)",
   :rdfs/domain  :ssvc/ComputedScore,
   :rdfs/label   "Timestamp",
   :rdfs/range   :xsd/dateTime})

(def version
  "Version of the SSVC that was used in this decision, in semver format"
  {:db/ident :ssvc/version,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Version of the SSVC that was used in this decision, in semver format",
   :rdfs/domain :ssvc/ComputedScore,
   :rdfs/label "Version",
   :rdfs/range :xsd/string})