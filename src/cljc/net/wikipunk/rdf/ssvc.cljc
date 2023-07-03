(ns net.wikipunk.rdf.ssvc
  "The SSVC Ontology is a formal representation of the concepts, relationships, and structure of the Stakeholder-Specific Vulnerability Categorization (SSVC) framework. It provides a standardized model to represent decision trees, decision points, options, and computed scores for the prioritization of vulnerability remediation efforts. The ontology enables consistent communication, sharing, and analysis of SSVC scores and related information among different stakeholders, including vulnerability analysts, software developers, and security researchers."
  {:dcat/downloadURL "resources/ssvc.ttl",
   :owl/versionInfo "2.03",
   :prov/wasDerivedFrom
   ["https://github.com/CERTCC/SSVC/raw/main/data/schema/SSVC_Computed_v2.03.schema.json"
    "https://github.com/CERTCC/SSVC/raw/main/data/schema/SSVC_Provision_v2.03.schema.json"],
   :rdf/ns-prefix-map {"d3f" "http://d3fend.mitre.org/ontologies/d3fend.owl#",
                       "db" "https://wikipunk.net/db/",
                       "db.cardinality" "https://wikipunk.net/db/cardinality/",
                       "db.type" "https://wikipunk.net/db/type/",
                       "dcterms" "http://purl.org/dc/terms/",
                       "jsonschema" "https://www.w3.org/2019/wot/json-schema#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "prov" "http://www.w3.org/ns/prov#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "skos" "http://www.w3.org/2004/02/skos/core#",
                       "spdx" "http://spdx.org/rdf/terms#",
                       "ssvc" "https://wikipunk.net/ssvc/",
                       "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type [:owl/Ontology :rdfs/Resource],
   :rdfa/prefix "ssvc",
   :rdfa/uri "https://wikipunk.net/ssvc/",
   :rdfs/comment
   "The SSVC Ontology is a formal representation of the concepts, relationships, and structure of the Stakeholder-Specific Vulnerability Categorization (SSVC) framework. It provides a standardized model to represent decision trees, decision points, options, and computed scores for the prioritization of vulnerability remediation efforts. The ontology enables consistent communication, sharing, and analysis of SSVC scores and related information among different stakeholders, including vulnerability analysts, software developers, and security researchers.",
   :rdfs/label "Stakeholder-Specific Vulnerability Categorization Ontology",
   :rdfs/seeAlso
   ["https://resources.sei.cmu.edu/asset_files/WhitePaper/2021_019_001_653461.pdf"]})

(def Act
  "The vulnerability requires attention from the organization's internal, supervisory-level and leadership-level individuals. Necessary actions include requesting assistance or information about the vulnerability, as well as publishing a notification either internally and/or externally. Typically, internal groups would meet to determine the overall response and then execute agreed upon actions. CISA recommends remediating Act vulnerabilities as soon as possible."
  {:db/ident :ssvc/Act,
   :rdf/type [:ssvc/Decision :owl/Thing :rdfs/Resource],
   :rdfs/comment
   "The vulnerability requires attention from the organization's internal, supervisory-level and leadership-level individuals. Necessary actions include requesting assistance or information about the vulnerability, as well as publishing a notification either internally and/or externally. Typically, internal groups would meet to determine the overall response and then execute agreed upon actions. CISA recommends remediating Act vulnerabilities as soon as possible.",
   :rdfs/label "Act",
   :ssvc/hasColor "red"})

(def Attend
  "The vulnerability requires attention from the organization's internal, supervisory-level individuals. Necessary actions may include requesting assistance or information about the vulnerability and may involve publishing a notification, either internally and/or externally, about the vulnerability. CISA recommends remediating Attend vulnerabilities sooner than standard update timelines."
  {:db/ident :ssvc/Attend,
   :rdf/type [:ssvc/Decision :owl/Thing :rdfs/Resource],
   :rdfs/comment
   "The vulnerability requires attention from the organization's internal, supervisory-level individuals. Necessary actions may include requesting assistance or information about the vulnerability and may involve publishing a notification, either internally and/or externally, about the vulnerability. CISA recommends remediating Attend vulnerabilities sooner than standard update timelines.",
   :rdfs/label "Attend",
   :ssvc/hasColor "orange"})

(def Automatable
  "A decision point representing whether an attacker can reliably automate creating exploitation events for a given vulnerability, including reconnaissance, weaponization, delivery, and exploitation steps in the kill chain."
  {:db/ident :ssvc/Automatable,
   :rdf/type [:ssvc/DecisionPoint :owl/Thing :rdfs/Resource],
   :rdfs/comment
   "A decision point representing whether an attacker can reliably automate creating exploitation events for a given vulnerability, including reconnaissance, weaponization, delivery, and exploitation steps in the kill chain.",
   :rdfs/label "Automatable",
   :ssvc/hasOption [:ssvc/AutomatableYes :ssvc/AutomatableNo]})

(def AutomatableNo
  "Attackers cannot reliably automate steps 1-4 of the kill chain for this vulnerability."
  {:db/ident :ssvc/AutomatableNo,
   :rdf/type [:ssvc/Option :owl/Thing :rdfs/Resource],
   :rdfs/comment
   "Attackers cannot reliably automate steps 1-4 of the kill chain for this vulnerability.",
   :rdfs/label "No"})

(def AutomatableYes
  "Attackers can reliably automate steps 1-4 of the kill chain for this vulnerability."
  {:db/ident :ssvc/AutomatableYes,
   :rdf/type [:ssvc/Option :owl/Thing :rdfs/Resource],
   :rdfs/comment
   "Attackers can reliably automate steps 1-4 of the kill chain for this vulnerability.",
   :rdfs/label "Yes"})

(def Color
  "A color used to represent a decision"
  {:db/ident        :ssvc/Color,
   :rdf/type        [:owl/Class :rdfs/Class :rdfs/Resource],
   :rdfs/comment    "A color used to represent a decision",
   :rdfs/label      "Color",
   :rdfs/subClassOf [:owl/Thing :rdfs/Resource]})

(def Complex
  "A decision type with children."
  {:db/ident     :ssvc/Complex,
   :rdf/type     [:ssvc/DecisionType :owl/Thing :rdfs/Resource],
   :rdfs/comment "A decision type with children.",
   :rdfs/label   "Complex Decision Type"})

(def ComputedScore
  "A computed SSVC score representing the path in the decision tree"
  {:db/ident :ssvc/ComputedScore,
   :rdf/type [:rdfs/Class :owl/Class :rdfs/Resource],
   :rdfs/comment
   "A computed SSVC score representing the path in the decision tree",
   :rdfs/label "Computed Score",
   :rdfs/subClassOf [:owl/Thing :rdfs/Resource]})

(def Decision
  "A decision made when a vulnerability is discovered, determining the level of action required."
  {:db/ident :ssvc/Decision,
   :rdf/type [:rdfs/Class :owl/Class :rdfs/Resource],
   :rdfs/comment
   "A decision made when a vulnerability is discovered, determining the level of action required.",
   :rdfs/label "Vulnerability Decision",
   :rdfs/subClassOf [:owl/Thing :rdfs/Resource]})

(def DecisionPoint
  "A node in the decision tree, including the root node, with a label and two or more options"
  {:db/ident :ssvc/DecisionPoint,
   :rdf/type [:rdfs/Class :owl/Class :rdfs/Resource],
   :rdfs/comment
   "A node in the decision tree, including the root node, with a label and two or more options",
   :rdfs/label "Decision Point",
   :rdfs/subClassOf [:owl/Thing :rdfs/Resource]})

(def DecisionTree
  "A DecisionTree represents a structured framework used within the SSVC process for vulnerability prioritization. The tree is made up of nodes, which correspond to different decision points based on various aspects or properties relevant to assessing vulnerabilities. Branches in the tree represent the possible options for each decision point."
  {:db/ident :ssvc/DecisionTree,
   :rdf/type [:rdfs/Class :owl/Class :rdfs/Resource],
   :rdfs/comment
   "A decision tree used in computing SSVC scores for a vulnerability.",
   :rdfs/label "Decision Tree",
   :rdfs/subClassOf [:owl/Thing :rdfs/Resource],
   :skos/definition
   "A DecisionTree represents a structured framework used within the SSVC process for vulnerability prioritization. The tree is made up of nodes, which correspond to different decision points based on various aspects or properties relevant to assessing vulnerabilities. Branches in the tree represent the possible options for each decision point."})

(def DecisionType
  "A decision type, which can be simple, complex, or final"
  {:db/ident        :ssvc/DecisionType,
   :owl/oneOf       [:ssvc/Simple :ssvc/Complex :ssvc/Final],
   :rdf/type        [:rdfs/Class :owl/Class :rdfs/Resource],
   :rdfs/comment    "A decision type, which can be simple, complex, or final",
   :rdfs/label      "Decision Type",
   :rdfs/subClassOf [:owl/Thing :rdfs/Resource]})

(def Exploitation
  "A decision point representing the current state of exploitation of a vulnerability, focusing on the present situation rather than predicting future exploitation."
  {:db/ident :ssvc/Exploitation,
   :rdf/type [:ssvc/DecisionPoint :owl/Thing :rdfs/Resource],
   :rdfs/comment
   "A decision point representing the current state of exploitation of a vulnerability, focusing on the present situation rather than predicting future exploitation.",
   :rdfs/label "Exploitation",
   :ssvc/hasOption
   [:ssvc/ExploitationActive :ssvc/ExploitationPoC :ssvc/ExploitationNone]})

(def ExploitationActive
  "Shared, observable, reliable evidence that the exploit is being used in the wild by real attackers; there is credible public reporting."
  {:db/ident :ssvc/ExploitationActive,
   :rdf/type [:ssvc/Option :owl/Thing :rdfs/Resource],
   :rdfs/comment
   "Shared, observable, reliable evidence that the exploit is being used in the wild by real attackers; there is credible public reporting.",
   :rdfs/label "Active"})

(def ExploitationNone
  "There is no evidence of active exploitation and no public proof of concept (PoC) of how to exploit the vulnerability."
  {:db/ident :ssvc/ExploitationNone,
   :rdf/type [:ssvc/Option :owl/Thing :rdfs/Resource],
   :rdfs/comment
   "There is no evidence of active exploitation and no public proof of concept (PoC) of how to exploit the vulnerability.",
   :rdfs/label "None"})

(def ExploitationPoC
  "One of the following cases is true: (1) exploit code is sold or traded on underground or restricted fora; (2) a typical public PoC in places such as Metasploit or ExploitDB; or (3) the vulnerability has a well-known method of exploitation."
  {:db/ident :ssvc/ExploitationPoC,
   :rdf/type [:ssvc/Option :owl/Thing :rdfs/Resource],
   :rdfs/comment
   "One of the following cases is true: (1) exploit code is sold or traded on underground or restricted fora; (2) a typical public PoC in places such as Metasploit or ExploitDB; or (3) the vulnerability has a well-known method of exploitation.",
   :rdfs/label "PoC (Proof of Concept)"})

(def Final
  "The last node on the decision tree."
  {:db/ident   :ssvc/Final,
   :rdf/type   [:ssvc/DecisionType :owl/Thing :rdfs/Resource],
   :rdfs/label "The last node on the decision tree."})

(def Option
  "An option within a decision point"
  {:db/ident        :ssvc/Option,
   :rdf/type        [:rdfs/Class :owl/Class :rdfs/Resource],
   :rdfs/comment    "An option within a decision point",
   :rdfs/label      "Option",
   :rdfs/subClassOf [:owl/Thing :rdfs/Resource]})

(def Simple
  "A decision type that without children."
  {:db/ident     :ssvc/Simple,
   :rdf/type     [:ssvc/DecisionType :owl/Thing :rdfs/Resource],
   :rdfs/comment "A decision type that without children.",
   :rdfs/label   "Simple Decision Type"})

(def TechnicalImpact
  "A decision point representing the extent to which exploiting a vulnerability affects the control or information exposure of the software containing the vulnerability."
  {:db/ident :ssvc/TechnicalImpact,
   :rdf/type [:ssvc/DecisionPoint :owl/Thing :rdfs/Resource],
   :rdfs/comment
   "A decision point representing the extent to which exploiting a vulnerability affects the control or information exposure of the software containing the vulnerability.",
   :rdfs/label "Technical Impact",
   :ssvc/hasOption [:ssvc/TechnicalImpactTotal :ssvc/TechnicalImpactPartial]})

(def TechnicalImpactPartial
  "The exploit gives the adversary limited control over, or information exposure about, the behavior of the software that contains the vulnerability. Or the exploit gives the adversary an importantly low stochastic opportunity for total control. Denial of service is a form of limited control over the behavior of the vulnerable component."
  {:db/ident :ssvc/TechnicalImpactPartial,
   :rdf/type [:ssvc/Option :owl/Thing :rdfs/Resource],
   :rdfs/comment
   "The exploit gives the adversary limited control over, or information exposure about, the behavior of the software that contains the vulnerability. Or the exploit gives the adversary an importantly low stochastic opportunity for total control. Denial of service is a form of limited control over the behavior of the vulnerable component.",
   :rdfs/label "Partial"})

(def TechnicalImpactTotal
  "The exploit gives the adversary total control over the behavior of the software, or it gives total disclosure of all information on the system that contains the vulnerability."
  {:db/ident :ssvc/TechnicalImpactTotal,
   :rdf/type [:ssvc/Option :owl/Thing :rdfs/Resource],
   :rdfs/comment
   "The exploit gives the adversary total control over the behavior of the software, or it gives total disclosure of all information on the system that contains the vulnerability.",
   :rdfs/label "Total"})

(def Track
  "The vulnerability does not require action at this time. The organization would continue to track the vulnerability and reassess it if new information becomes available. CISA recommends remediating Track vulnerabilities within standard update guidelines."
  {:db/ident :ssvc/Track,
   :rdf/type [:ssvc/Decision :owl/Thing :rdfs/Resource],
   :rdfs/comment
   "The vulnerability does not require action at this time. The organization would continue to track the vulnerability and reassess it if new information becomes available. CISA recommends remediating Track vulnerabilities within standard update guidelines.",
   :rdfs/label "Track",
   :ssvc/hasColor "green"})

(def TrackStar
  "The vulnerability contains specific characteristics that may require closer monitoring for changes. CISA recommends remdiating Track* vulnerabilities within standard update guidelines."
  {:db/ident :ssvc/TrackStar,
   :rdf/type [:ssvc/Decision :owl/Thing :rdfs/Resource],
   :rdfs/comment
   "The vulnerability contains specific characteristics that may require closer monitoring for changes. CISA recommends remdiating Track* vulnerabilities within standard update guidelines.",
   :rdfs/label "Track*",
   :ssvc/hasColor "yellow"})

(def Utility
  "A decision point representing the usefulness of the exploit to an adversary, based on the assumption that they can exploit the vulnerability. Utility is independent from the state of Exploitation and is a combination of the value density of vulnerable components and whether potential exploitation is automatable."
  {:db/ident :ssvc/Utility,
   :rdf/type [:ssvc/DecisionPoint :owl/Thing :rdfs/Resource],
   :rdfs/comment
   "A decision point representing the usefulness of the exploit to an adversary, based on the assumption that they can exploit the vulnerability. Utility is independent from the state of Exploitation and is a combination of the value density of vulnerable components and whether potential exploitation is automatable.",
   :rdfs/label "Utility",
   :ssvc/hasOption
   [:ssvc/UtilitySuperEffective :ssvc/UtilityEfficient :ssvc/UtilityLaborious]})

(def UtilityEfficient
  "{Yes to automatable and diffuse value} OR {No to automatable and concentrated value}."
  {:db/ident :ssvc/UtilityEfficient,
   :rdf/type [:ssvc/Option :owl/Thing :rdfs/Resource],
   :rdfs/comment
   "{Yes to automatable and diffuse value} OR {No to automatable and concentrated value}.",
   :rdfs/label "Efficient"})

(def UtilityLaborious
  "No to automatable and diffuse value."
  {:db/ident     :ssvc/UtilityLaborious,
   :rdf/type     [:ssvc/Option :owl/Thing :rdfs/Resource],
   :rdfs/comment "No to automatable and diffuse value.",
   :rdfs/label   "Laborious"})

(def UtilitySuperEffective
  "Yes to automatable and concentrated value."
  {:db/ident     :ssvc/UtilitySuperEffective,
   :rdf/type     [:ssvc/Option :owl/Thing :rdfs/Resource],
   :rdfs/comment "Yes to automatable and concentrated value.",
   :rdfs/label   "Super Effective"})

(def hasChild
  "Relates a decision point to its child decision points"
  {:db/ident     :ssvc/hasChild,
   :rdf/type     [:owl/ObjectProperty :rdf/Property :rdfs/Resource],
   :rdfs/comment "Relates a decision point to its child decision points",
   :rdfs/domain  [:owl/Thing :ssvc/DecisionPoint :rdfs/Resource],
   :rdfs/label   "Has Child",
   :rdfs/range   [:owl/Thing :ssvc/DecisionPoint :rdfs/Resource]})

(def hasColor
  "An optional color to represent the final edge node or final recommended action provided by the SSVC tree"
  {:db/cardinality :db.cardinality/one,
   :db/ident :ssvc/hasColor,
   :db/valueType :db.type/string,
   :rdf/type [:rdf/Property :owl/DatatypeProperty :rdfs/Resource],
   :rdfs/comment
   "An optional color to represent the final edge node or final recommended action provided by the SSVC tree",
   :rdfs/label "Color",
   :rdfs/range [:xsd/string :ssvc/DecisionPoint :rdfs/Resource :owl/Thing]})

(def hasComputedScore
  "A short vector representation of an SSVC computed decision score"
  {:db/ident :ssvc/hasComputedScore,
   :rdf/type [:owl/DatatypeProperty :rdf/Property :rdfs/Resource],
   :rdfs/comment
   "A short vector representation of an SSVC computed decision score",
   :rdfs/domain [:ssvc/ComputedScore :rdfs/Resource :owl/Thing],
   :rdfs/label "Has Computed Score",
   :rdfs/range [:xsd/string :rdfs/Resource]})

(def hasDecision
  "Relates a vulnerability to its decision"
  {:db/ident     :ssvc/hasDecision,
   :rdf/type     [:owl/ObjectProperty :rdf/Property :rdfs/Resource],
   :rdfs/comment "Relates a vulnerability to its decision",
   :rdfs/domain  [:owl/Thing :d3f/Vulnerability :rdfs/Resource],
   :rdfs/label   "Has Vulnerability Decision",
   :rdfs/range   [:owl/Thing :ssvc/Decision :rdfs/Resource]})

(def hasDecisionPoint
  "Relates a decision tree to its decision points"
  {:db/ident     :ssvc/hasDecisionPoint,
   :rdf/type     [:owl/ObjectProperty :rdf/Property :rdfs/Resource],
   :rdfs/comment "Relates a decision tree to its decision points",
   :rdfs/domain  [:owl/Thing :ssvc/DecisionTree :rdfs/Resource],
   :rdfs/label   "Has Decision Point",
   :rdfs/range   [:owl/Thing :ssvc/DecisionPoint :rdfs/Resource]})

(def hasDecisionTree
  "The full decision tree that was used for this SSVC computed score"
  {:db/ident :ssvc/hasDecisionTree,
   :rdf/type [:owl/ObjectProperty :rdf/Property :rdfs/Resource],
   :rdfs/comment
   "The full decision tree that was used for this SSVC computed score",
   :rdfs/domain [:owl/Thing :ssvc/ComputedScore :rdfs/Resource],
   :rdfs/label "Has Decision Tree",
   :rdfs/range [:owl/Thing :ssvc/DecisionTree :rdfs/Resource]})

(def hasDecisionTreeURL
  "A URL that points to the decision tree used to make this computed decision"
  {:db/ident :ssvc/hasDecisionTreeURL,
   :rdf/type [:owl/DatatypeProperty :rdf/Property :rdfs/Resource],
   :rdfs/comment
   "A URL that points to the decision tree used to make this computed decision",
   :rdfs/domain [:ssvc/ComputedScore :rdfs/Resource :owl/Thing],
   :rdfs/label "Decision Tree URL",
   :rdfs/range [:xsd/anyURI :rdfs/Resource]})

(def hasDecisionType
  "Relates a decision point to its decision type"
  {:db/ident     :ssvc/hasDecisionType,
   :rdf/type     [:owl/ObjectProperty :rdf/Property :rdfs/Resource],
   :rdfs/comment "Relates a decision point to its decision type",
   :rdfs/domain  [:owl/Thing :ssvc/DecisionPoint :rdfs/Resource],
   :rdfs/label   "Has Decision Type",
   :rdfs/range   [:owl/Thing :ssvc/DecisionType :rdfs/Resource]})

(def hasKey
  "An optional short key that identifies a decision point or option in the SSVC score vector form"
  {:db/ident :ssvc/hasKey,
   :rdf/type [:owl/DatatypeProperty :rdf/Property :rdfs/Resource],
   :rdfs/comment
   "An optional short key that identifies a decision point or option in the SSVC score vector form",
   :rdfs/domain [:ssvc/Decision :rdfs/Resource :owl/Thing],
   :rdfs/label "Key",
   :rdfs/range [:xsd/string :rdfs/Resource]})

(def hasOption
  "Relates a decision point to its options"
  {:db/ident     :ssvc/hasOption,
   :rdf/type     [:rdf/Property :owl/ObjectProperty :rdfs/Resource],
   :rdfs/comment "Relates a decision point to its options",
   :rdfs/domain  [:owl/Thing :ssvc/DecisionPoint :rdfs/Resource],
   :rdfs/label   "Has Option",
   :rdfs/range   [:owl/Thing :ssvc/Option :rdfs/Resource]})

(def hasOptionPattern
  "Relates an option to the option patterns within it"
  {:db/ident     :ssvc/hasOptionPattern,
   :rdf/type     [:owl/ObjectProperty :rdf/Property :rdfs/Resource],
   :rdfs/comment "Relates an option to the option patterns within it",
   :rdfs/domain  [:owl/Thing :ssvc/Option :rdfs/Resource],
   :rdfs/label   "Has Option Pattern",
   :rdfs/range   [:owl/Thing :xsd/string :rdfs/Resource]})

(def hasParent
  "Relates a decision point to its parent decision point"
  {:db/ident     :ssvc/hasParent,
   :rdf/type     [:owl/ObjectProperty :rdf/Property :rdfs/Resource],
   :rdfs/comment "Relates a decision point to its parent decision point",
   :rdfs/domain  [:owl/Thing :ssvc/DecisionPoint :rdfs/Resource],
   :rdfs/label   "Has Parent",
   :rdfs/range   [:owl/Thing :ssvc/DecisionPoint :rdfs/Resource]})

(def hasRole
  "Roles defined in the SSVC spec and optional in the SSVC provision schema"
  {:db/ident :ssvc/hasRole,
   :rdf/type [:owl/DatatypeProperty :rdf/Property :rdfs/Resource],
   :rdfs/comment
   "Roles defined in the SSVC spec and optional in the SSVC provision schema",
   :rdfs/domain [:ssvc/ComputedScore :rdfs/Resource :owl/Thing],
   :rdfs/label "Has Role",
   :rdfs/range [:prov/Role :rdfs/Resource]})

(def hasSchema
  "A URL that points to the schema used for the decision tree to make this computed decision"
  {:db/ident :ssvc/hasSchema,
   :rdf/type [:owl/DatatypeProperty :rdf/Property :rdfs/Resource],
   :rdfs/comment
   "A URL that points to the schema used for the decision tree to make this computed decision",
   :rdfs/domain [:ssvc/ComputedScore :rdfs/Resource :owl/Thing],
   :rdfs/label "Has Schema",
   :rdfs/range [:xsd/anyURI :rdfs/Resource]})

(def hasTimestamp
  "Date and time in ISO format (ISO 8601)"
  {:db/ident     :ssvc/hasTimestamp,
   :rdf/type     [:owl/DatatypeProperty :rdf/Property :rdfs/Resource],
   :rdfs/comment "Date and time in ISO format (ISO 8601)",
   :rdfs/domain  [:ssvc/ComputedScore :rdfs/Resource :owl/Thing],
   :rdfs/label   "Has Timestamp",
   :rdfs/range   [:xsd/dateTime :rdfs/Resource]})

(def hasVersion
  "Version of the SSVC that was used in this decision, in semver format"
  {:db/ident :ssvc/hasVersion,
   :rdf/type [:owl/DatatypeProperty :rdf/Property :rdfs/Resource],
   :rdfs/comment
   "Version of the SSVC that was used in this decision, in semver format",
   :rdfs/domain [:ssvc/ComputedScore :rdfs/Resource :owl/Thing],
   :rdfs/label "Has Version",
   :rdfs/range [:xsd/string :rdfs/Resource]})

(def hasVulnerability
  "Identifier for a vulnerability (CVE, CERT/CC VU#, OSV id, Bugtraq, etc.)"
  {:db/ident :ssvc/hasVulnerability,
   :rdf/type [:owl/DatatypeProperty :rdf/Property :rdfs/Resource],
   :rdfs/comment
   "Identifier for a vulnerability (CVE, CERT/CC VU#, OSV id, Bugtraq, etc.)",
   :rdfs/domain [:ssvc/ComputedScore :rdfs/Resource :owl/Thing],
   :rdfs/label "ID",
   :rdfs/range [:d3f/Vulnerability :rdfs/Resource]})