(ns net.wikipunk.rdf.tac
  ^{:base       "http://docs.oasis-open.org/tac/ns/tac#",
    :namespaces {"owl"  "http://www.w3.org/2002/07/owl#",
                 "rdf"  "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                 "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                 "stix" "http://docs.oasis-open.org/cti/ns/stix#",
                 "tac"  "http://docs.oasis-open.org/tac/ns/tac#",
                 "xsd"  "http://www.w3.org/2001/XMLSchema#"},
    :prefix     "tac",
    :source     "resources/tac/tac.owl"}
  {:owl/imports {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix"},
   :rdf/type :owl/Ontology,
   :rdfs/comment
   "Concepts that have been developed and approved at a committee level by the OASIS Threat Actor Context Technical Committee are called TAC TC concepts. TAC TC concepts are incorporated as import statements into the main tac.owl file and thus are part of the core ontology.",
   :xsd/anyURI "http://docs.oasis-open.org/tac/ns/tac"})

(def Adversary
  {:db/ident :tac/Adversary,
   :rdf/type :owl/Class,
   :rdfs/comment
   "There has been some ambiguity with respect to the differentiation of stix:IntrusionSet and stix:ThreatActor. They are different, and the tac:Adversary class is intended to clarify the differences."})

(def categorizedBy
  {:db/ident :tac/categorizedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/subPropertyOf :tac/topTacObjectProperty})

(def hasAdversary
  {:db/ident           :tac/hasAdversary,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/range         :tac/Adversary,
   :rdfs/subPropertyOf :tac/topTacObjectProperty})

(def hasAttackPattern
  {:db/ident           :tac/hasAttackPattern,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/range         :stix/AttackPattern,
   :rdfs/subPropertyOf :tac/topTacObjectProperty})

(def hasCampaign
  {:db/ident           :tac/hasCampaign,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/range         :stix/Campaign,
   :rdfs/subPropertyOf :tac/topTacObjectProperty})

(def hasContributor
  {:db/ident           :tac/hasContributor,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/range         :stix/Identity,
   :rdfs/subPropertyOf :tac/topTacObjectProperty})

(def hasIntrusionSet
  {:db/ident           :tac/hasIntrusionSet,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/range         :stix/IntrusionSet,
   :rdfs/subPropertyOf :tac/hasAdversary})

(def hasOriginator
  {:db/ident           :tac/hasOriginator,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/range         :stix/Identity,
   :rdfs/subPropertyOf :tac/topTacObjectProperty})

(def hasThreatActor
  {:db/ident           :tac/hasThreatActor,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/range         :stix/ThreatActor,
   :rdfs/subPropertyOf :tac/hasAdversary})

(def hasThreatEvent
  {:db/ident :tac/hasThreatEvent,
   :rdf/type :owl/ObjectProperty})

(def hasThreatEventPattern
  {:db/ident :tac/hasThreatEventPattern,
   :rdf/type :owl/ObjectProperty})

(def hasThreatScenario
  {:db/ident :tac/hasThreatScenario,
   :rdf/type :owl/ObjectProperty})

(def topTacObjectProperty
  {:db/ident :tac/topTacObjectProperty,
   :rdf/type :owl/ObjectProperty})

(def ^{:private true} ThreatActor
  {:db/ident        :stix/ThreatActor,
   :rdf/type        :rdfs/Class,
   :rdfs/subClassOf :tac/Adversary})

(def urn:uuid:738e7e4a-cc2e-5ced-81ed-00cfe4851600
  {:owl/imports {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix"},
   :rdf/type :owl/Ontology,
   :rdfs/comment
   "Concepts that have been developed and approved at a committee level by the OASIS Threat Actor Context Technical Committee are called TAC TC concepts. TAC TC concepts are incorporated as import statements into the main tac.owl file and thus are part of the core ontology.",
   :xsd/anyURI "http://docs.oasis-open.org/tac/ns/tac"})