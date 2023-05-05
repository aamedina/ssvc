(ns net.wikipunk.rdf.ssvc
  "The SSVC Ontology is a formal representation of the concepts, relationships, and structure of the Stakeholder-Specific Vulnerability Categorization (SSVC) framework. It provides a standardized model to represent decision trees, decision points, options, and computed scores for the prioritization of vulnerability remediation efforts. The ontology enables consistent communication, sharing, and analysis of SSVC scores and related information among different stakeholders, including vulnerability analysts, software developers, and security researchers."
  {:dcat/downloadURL "resources/ssvc.ttl",
   :prov/wasDerivedFrom
   ["https://github.com/CERTCC/SSVC/raw/main/data/schema/SSVC_Computed_v2.03.schema.json"
    "https://github.com/CERTCC/SSVC/raw/main/data/schema/SSVC_Provision_v2.03.schema.json"],
   :rdf/ns-prefix-map {"d3fend"
                       "http://d3fend.mitre.org/ontologies/d3fend.owl#",
                       "dcterms" "http://purl.org/dc/terms/",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "prov" "http://www.w3.org/ns/prov#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "spdx" "http://spdx.org/rdf/terms#",
                       "ssvc" "https://wikipunk.net/ssvc/",
                       "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "ssvc",
   :rdfa/uri "https://wikipunk.net/ssvc/",
   :rdfs/comment
   "The SSVC Ontology is a formal representation of the concepts, relationships, and structure of the Stakeholder-Specific Vulnerability Categorization (SSVC) framework. It provides a standardized model to represent decision trees, decision points, options, and computed scores for the prioritization of vulnerability remediation efforts. The ontology enables consistent communication, sharing, and analysis of SSVC scores and related information among different stakeholders, including vulnerability analysts, software developers, and security researchers.",
   :rdfs/label "Stakeholder-Specific Vulnerability Categorization Ontology",
   :rdfs/seeAlso
   ["https://resources.sei.cmu.edu/asset_files/WhitePaper/2021_019_001_653461.pdf"]}
  (:refer-clojure :exclude [key]))

(def Automatable
  "A decision point representing whether an attacker can reliably automate creating exploitation events for a given vulnerability, including reconnaissance, weaponization, delivery, and exploitation steps in the kill chain."
  {:db/ident :ssvc/Automatable,
   :rdf/type :ssvc/DecisionPoint,
   :rdfs/comment
   "A decision point representing whether an attacker can reliably automate creating exploitation events for a given vulnerability, including reconnaissance, weaponization, delivery, and exploitation steps in the kill chain.",
   :rdfs/label "Automatable",
   :ssvc/hasOption [:ssvc/AutomatableYes :ssvc/AutomatableNo]})

(def AutomatableNo
  "Attackers cannot reliably automate steps 1-4 of the kill chain for this vulnerability."
  {:db/ident :ssvc/AutomatableNo,
   :rdf/type :ssvc/Option,
   :rdfs/comment
   "Attackers cannot reliably automate steps 1-4 of the kill chain for this vulnerability.",
   :rdfs/label "No"})

(def AutomatableYes
  "Attackers can reliably automate steps 1-4 of the kill chain for this vulnerability."
  {:db/ident :ssvc/AutomatableYes,
   :rdf/type :ssvc/Option,
   :rdfs/comment
   "Attackers can reliably automate steps 1-4 of the kill chain for this vulnerability.",
   :rdfs/label "Yes"})

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
  "A ssvc:DecisionTree represents a structured framework used within the SSVC process for vulnerability prioritization. The tree is made up of nodes, which correspond to different decision points based on various aspects or properties relevant to assessing vulnerabilities. Branches in the tree represent the possible options for each decision point."
  {:db/ident :ssvc/DecisionTree,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A decision tree used in computing SSVC scores for a vulnerability.",
   :rdfs/label "Decision Tree",
   :skos/definition
   "A ssvc:DecisionTree represents a structured framework used within the SSVC process for vulnerability prioritization. The tree is made up of nodes, which correspond to different decision points based on various aspects or properties relevant to assessing vulnerabilities. Branches in the tree represent the possible options for each decision point."})

(def DecisionType
  "A decision type, which can be simple, complex, or final"
  {:db/ident     :ssvc/DecisionType,
   :owl/oneOf    [:ssvc/SimpleDecisionType
                  :ssvc/ComplexDecisionType
                  :ssvc/FinalDecisionType],
   :rdf/type     :owl/Class,
   :rdfs/comment "A decision type, which can be simple, complex, or final",
   :rdfs/label   "Decision Type"})

(def Exploitation
  "A decision point representing the current state of exploitation of a vulnerability, focusing on the present situation rather than predicting future exploitation."
  {:db/ident :ssvc/Exploitation,
   :rdf/type :ssvc/DecisionPoint,
   :rdfs/comment
   "A decision point representing the current state of exploitation of a vulnerability, focusing on the present situation rather than predicting future exploitation.",
   :rdfs/label "Exploitation",
   :ssvc/hasOption
   [:ssvc/ExploitationActive :ssvc/ExploitationPoC :ssvc/ExploitationNone]})

(def ExploitationActive
  "Shared, observable, reliable evidence that the exploit is being used in the wild by real attackers; there is credible public reporting."
  {:db/ident :ssvc/ExploitationActive,
   :rdf/type :ssvc/Option,
   :rdfs/comment
   "Shared, observable, reliable evidence that the exploit is being used in the wild by real attackers; there is credible public reporting.",
   :rdfs/label "Active"})

(def ExploitationNone
  "There is no evidence of active exploitation and no public proof of concept (PoC) of how to exploit the vulnerability."
  {:db/ident :ssvc/ExploitationNone,
   :rdf/type :ssvc/Option,
   :rdfs/comment
   "There is no evidence of active exploitation and no public proof of concept (PoC) of how to exploit the vulnerability.",
   :rdfs/label "None"})

(def ExploitationPoC
  "One of the following cases is true: (1) exploit code is sold or traded on underground or restricted fora; (2) a typical public PoC in places such as Metasploit or ExploitDB; or (3) the vulnerability has a well-known method of exploitation."
  {:db/ident :ssvc/ExploitationPoC,
   :rdf/type :ssvc/Option,
   :rdfs/comment
   "One of the following cases is true: (1) exploit code is sold or traded on underground or restricted fora; (2) a typical public PoC in places such as Metasploit or ExploitDB; or (3) the vulnerability has a well-known method of exploitation.",
   :rdfs/label "PoC (Proof of Concept)"})

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

(def SimpleDecisionType
  "Simple Decision Type"
  {:db/ident   :ssvc/SimpleDecisionType,
   :rdf/type   :ssvc/DecisionType,
   :rdfs/label "Simple Decision Type"})

(def TechnicalImpact
  "A decision point representing the extent to which exploiting a vulnerability affects the control or information exposure of the software containing the vulnerability."
  {:db/ident :ssvc/TechnicalImpact,
   :rdf/type :ssvc/DecisionPoint,
   :rdfs/comment
   "A decision point representing the extent to which exploiting a vulnerability affects the control or information exposure of the software containing the vulnerability.",
   :rdfs/label "Technical Impact",
   :ssvc/hasOption [:ssvc/TechnicalImpactTotal :ssvc/TechnicalImpactPartial]})

(def TechnicalImpactPartial
  "The exploit gives the adversary limited control over, or information exposure about, the behavior of the software that contains the vulnerability. Or the exploit gives the adversary an importantly low stochastic opportunity for total control. Denial of service is a form of limited control over the behavior of the vulnerable component."
  {:db/ident :ssvc/TechnicalImpactPartial,
   :rdf/type :ssvc/Option,
   :rdfs/comment
   "The exploit gives the adversary limited control over, or information exposure about, the behavior of the software that contains the vulnerability. Or the exploit gives the adversary an importantly low stochastic opportunity for total control. Denial of service is a form of limited control over the behavior of the vulnerable component.",
   :rdfs/label "Partial"})

(def TechnicalImpactTotal
  "The exploit gives the adversary total control over the behavior of the software, or it gives total disclosure of all information on the system that contains the vulnerability."
  {:db/ident :ssvc/TechnicalImpactTotal,
   :rdf/type :ssvc/Option,
   :rdfs/comment
   "The exploit gives the adversary total control over the behavior of the software, or it gives total disclosure of all information on the system that contains the vulnerability.",
   :rdfs/label "Total"})

(def Utility
  "A decision point representing the usefulness of the exploit to an adversary, based on the assumption that they can exploit the vulnerability. Utility is independent from the state of Exploitation and is a combination of the value density of vulnerable components and whether potential exploitation is automatable."
  {:db/ident :ssvc/Utility,
   :rdf/type :ssvc/DecisionPoint,
   :rdfs/comment
   "A decision point representing the usefulness of the exploit to an adversary, based on the assumption that they can exploit the vulnerability. Utility is independent from the state of Exploitation and is a combination of the value density of vulnerable components and whether potential exploitation is automatable.",
   :rdfs/label "Utility",
   :ssvc/hasOption
   [:ssvc/UtilitySuperEffective :ssvc/UtilityEfficient :ssvc/UtilityLaborious]})

(def UtilityEfficient
  "{Yes to automatable and diffuse value} OR {No to automatable and concentrated value}."
  {:db/ident :ssvc/UtilityEfficient,
   :rdf/type :ssvc/Option,
   :rdfs/comment
   "{Yes to automatable and diffuse value} OR {No to automatable and concentrated value}.",
   :rdfs/label "Efficient"})

(def UtilityLaborious
  "No to automatable and diffuse value."
  {:db/ident     :ssvc/UtilityLaborious,
   :rdf/type     :ssvc/Option,
   :rdfs/comment "No to automatable and diffuse value.",
   :rdfs/label   "Laborious"})

(def UtilitySuperEffective
  "Yes to automatable and concentrated value."
  {:db/ident     :ssvc/UtilitySuperEffective,
   :rdf/type     :ssvc/Option,
   :rdfs/comment "Yes to automatable and concentrated value.",
   :rdfs/label   "Super Effective"})

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
   :rdfs/range   :ssvc/xsd:string})

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