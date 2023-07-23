(ns net.wikipunk.rdf.tal
  "Intel authored the conceptual notions captured in this ontological representation. Intel retains the copyright on the original work, which was published in open format in the 2007 time frame. Tim Casey and Intel Corporation were the orignal sources that inspired the members of the OASIS TAC-TC  to capture and  expand it in a formal ontology langauge, W3C's Ontology Web Language (OWL). https://pdfs.semanticscholar.org/391e/70510353ba762fa1580a6d9c002eefd2d86b.pdf https://www.intel.com/content/dam/www/public/us/en/documents/white-papers/understanding-cyberthreat-motivations-to-improve-defense-paper.pdf"
  {:dcat/downloadURL "resources/tac-ontology/threat-agent-lib/ta-library.owl",
   :owl/imports {:rdfa/uri "http://docs.oasis-open.org/tac/ns/tac"},
   :rdf/ns-prefix-map {"owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "swrla"
                       "http://swrl.stanford.edu/ontologies/3.3/swrla.owl#",
                       "tac" "http://docs.oasis-open.org/tac/ns/tac#",
                       "tal" "http://www.intel.com/ns/ta-library#",
                       "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "tal",
   :rdfa/uri "http://www.intel.com/ns/ta-library",
   :rdfs/comment
   "Intel authored the conceptual notions captured in this ontological representation. Intel retains the copyright on the original work, which was published in open format in the 2007 time frame. Tim Casey and Intel Corporation were the orignal sources that inspired the members of the OASIS TAC-TC  to capture and  expand it in a formal ontology langauge, W3C's Ontology Web Language (OWL). https://pdfs.semanticscholar.org/391e/70510353ba762fa1580a6d9c002eefd2d86b.pdf https://www.intel.com/content/dam/www/public/us/en/documents/white-papers/understanding-cyberthreat-motivations-to-improve-defense-paper.pdf"})

(def Access
  {:db/ident        :tal/Access,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :tal/DefiningAttribute})

(def Accidental
  {:db/ident :tal/Accidental,
   :rdf/type [:tal/Motivation :owl/NamedIndividual :tal/DefiningAttribute]})

(def AdeptSkills
  {:db/ident :tal/AdeptSkills,
   :rdf/type [:tal/Skills :owl/NamedIndividual :tal/DefiningAttribute]})

(def AllDontCareObjective
  {:db/ident :tal/AllDontCareObjective,
   :rdf/type [:tal/Objective :owl/NamedIndividual :tal/DefiningAttribute]})

(def Anarchist
  {:db/ident        :tal/Anarchist,
   :owl/equivalentClass {:owl/intersectionOf
                         [:stix/ThreatActor
                          {:owl/hasValue   :tal/ClubResources,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/DamageOutcome,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/DestroyObjective,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/ExternalAccess,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/MajorExtraLegalLimits,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/NoSkills,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/OvertVisibility,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}],
                         :rdf/type :owl/Class},
   :rdf/type        :owl/Class,
   :rdfs/subClassOf [:tal/HostileThreatActor
                     {:owl/onProperty     :tal/hasSubordinateMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasCoMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasMotivationAttribute,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasDefiningMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasLimitsAttribute,
                      :owl/someValuesFrom :tal/Limits,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasObjectiveAttribute,
                      :owl/someValuesFrom :tal/Objective,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasVisibilityAttribute,
                      :owl/someValuesFrom :tal/Visibility,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasBindingMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     :tal/ThreatActor
                     {:owl/onProperty     :tal/hasAccessAttribute,
                      :owl/someValuesFrom :tal/Access,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasSkillsAttribute,
                      :owl/someValuesFrom :tal/Skills,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasOutcomeAttribute,
                      :owl/someValuesFrom :tal/Outcome,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasResourcesAttribute,
                      :owl/someValuesFrom :tal/Resources,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasPersonalMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}]})

(def AnyObjective
  {:db/ident :tal/AnyObjective,
   :rdf/type [:tal/Objective :owl/NamedIndividual :tal/DefiningAttribute]})

(def AnyVisibility
  {:db/ident :tal/AnyVisibility,
   :rdf/type [:tal/Visibility :owl/NamedIndividual :tal/DefiningAttribute]})

(def AquisitionOutcome
  {:db/ident :tal/AquisitionOutcome,
   :rdf/type [:tal/Outcome :owl/NamedIndividual :tal/DefiningAttribute]})

(def BusinessAdvantageOutcome
  {:db/ident :tal/BusinessAdvantageOutcome,
   :rdf/type [:tal/Outcome :owl/NamedIndividual :tal/DefiningAttribute]})

(def CivilActivist
  {:db/ident        :tal/CivilActivist,
   :owl/equivalentClass {:owl/intersectionOf
                         [:stix/ThreatActor
                          {:owl/hasValue   :tal/AdeptSkills,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/CopyObjective,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/CovertVisibility,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/EmbarrassmentOutcome,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/ExternalAccess,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/MinorExtraLegalLimits,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/OrganizationalResources,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}],
                         :rdf/type :owl/Class},
   :rdf/type        :owl/Class,
   :rdfs/subClassOf [:tal/HostileThreatActor
                     {:owl/onProperty     :tal/hasSubordinateMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasCoMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasMotivationAttribute,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasDefiningMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasLimitsAttribute,
                      :owl/someValuesFrom :tal/Limits,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasObjectiveAttribute,
                      :owl/someValuesFrom :tal/Objective,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasVisibilityAttribute,
                      :owl/someValuesFrom :tal/Visibility,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasBindingMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     :tal/ThreatActor
                     {:owl/onProperty     :tal/hasAccessAttribute,
                      :owl/someValuesFrom :tal/Access,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasSkillsAttribute,
                      :owl/someValuesFrom :tal/Skills,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasOutcomeAttribute,
                      :owl/someValuesFrom :tal/Outcome,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasResourcesAttribute,
                      :owl/someValuesFrom :tal/Resources,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasPersonalMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}]})

(def ClandestineVisibility
  {:db/ident :tal/ClandestineVisibility,
   :rdf/type [:tal/Visibility :owl/NamedIndividual :tal/DefiningAttribute]})

(def ClubResources
  {:db/ident :tal/ClubResources,
   :rdf/type [:tal/Resources :owl/NamedIndividual :tal/DefiningAttribute]})

(def CodeOfConductLimits
  {:db/ident :tal/CodeOfConductLimits,
   :rdf/type [:tal/Limits :owl/NamedIndividual :tal/DefiningAttribute]})

(def Coercion
  {:db/ident :tal/Coercion,
   :rdf/type [:tal/Motivation :owl/NamedIndividual :tal/DefiningAttribute]})

(def Competitor
  {:db/ident        :tal/Competitor,
   :owl/equivalentClass {:owl/intersectionOf
                         [:stix/ThreatActor
                          {:owl/unionOf [{:owl/hasValue
                                          :tal/BusinessAdvantageOutcome,
                                          :owl/onProperty :tac/categorizedBy,
                                          :rdf/type :owl/Restriction}
                                         {:owl/hasValue
                                          :tal/TechnologyAdvantageOutcome,
                                          :owl/onProperty :tac/categorizedBy,
                                          :rdf/type :owl/Restriction}],
                           :rdf/type    :owl/Class}
                          {:owl/hasValue   :tal/AdeptSkills,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/ClandestineVisibility,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/CopyObjective,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/ExternalAccess,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/MinorExtraLegalLimits,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}],
                         :rdf/type :owl/Class},
   :rdf/type        :owl/Class,
   :rdfs/subClassOf [:tal/HostileThreatActor
                     {:owl/onProperty     :tal/hasSubordinateMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasCoMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasMotivationAttribute,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasDefiningMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasLimitsAttribute,
                      :owl/someValuesFrom :tal/Limits,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasObjectiveAttribute,
                      :owl/someValuesFrom :tal/Objective,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasVisibilityAttribute,
                      :owl/someValuesFrom :tal/Visibility,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasBindingMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     :tal/ThreatActor
                     {:owl/onProperty     :tal/hasAccessAttribute,
                      :owl/someValuesFrom :tal/Access,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasSkillsAttribute,
                      :owl/someValuesFrom :tal/Skills,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasOutcomeAttribute,
                      :owl/someValuesFrom :tal/Outcome,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasResourcesAttribute,
                      :owl/someValuesFrom :tal/Resources,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasPersonalMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}]})

(def ContestResources
  {:db/ident :tal/ContestResources,
   :rdf/type [:tal/Resources :owl/NamedIndividual :tal/DefiningAttribute]})

(def CopyObjective
  {:db/ident :tal/CopyObjective,
   :rdf/type [:tal/Objective :owl/NamedIndividual :tal/DefiningAttribute]})

(def CorruptGovernmentOfficial
  {:db/ident        :tal/CorruptGovernmentOfficial,
   :owl/equivalentClass {:owl/intersectionOf
                         [:stix/ThreatActor
                          {:owl/unionOf [{:owl/hasValue
                                          :tal/BusinessAdvantageOutcome,
                                          :owl/onProperty :tac/categorizedBy,
                                          :rdf/type :owl/Restriction}
                                         {:owl/hasValue
                                          :tal/TechnologyAdvantageOutcome,
                                          :owl/onProperty :tac/categorizedBy,
                                          :rdf/type :owl/Restriction}],
                           :rdf/type    :owl/Class}
                          {:owl/hasValue   :tal/AdeptSkills,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/DenyObjective,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/ExternalAccess,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/GovernmentResources,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/MinorExtraLegalLimits,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/OvertVisibility,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}],
                         :rdf/type :owl/Class},
   :rdf/type        :owl/Class,
   :rdfs/subClassOf [:tal/HostileThreatActor
                     {:owl/onProperty     :tal/hasSubordinateMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasCoMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasMotivationAttribute,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasDefiningMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasLimitsAttribute,
                      :owl/someValuesFrom :tal/Limits,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasObjectiveAttribute,
                      :owl/someValuesFrom :tal/Objective,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasVisibilityAttribute,
                      :owl/someValuesFrom :tal/Visibility,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasBindingMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     :tal/ThreatActor
                     {:owl/onProperty     :tal/hasAccessAttribute,
                      :owl/someValuesFrom :tal/Access,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasSkillsAttribute,
                      :owl/someValuesFrom :tal/Skills,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasOutcomeAttribute,
                      :owl/someValuesFrom :tal/Outcome,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasResourcesAttribute,
                      :owl/someValuesFrom :tal/Resources,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasPersonalMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}]})

(def CovertVisibility
  {:db/ident :tal/CovertVisibility,
   :rdf/type [:tal/Visibility :owl/NamedIndividual :tal/DefiningAttribute]})

(def DamageObjective
  {:db/ident :tal/DamageObjective,
   :rdf/type [:tal/Objective :owl/NamedIndividual :tal/DefiningAttribute]})

(def DamageOutcome
  {:db/ident :tal/DamageOutcome,
   :rdf/type [:tal/Outcome :owl/NamedIndividual :tal/DefiningAttribute]})

(def DataMiner
  {:db/ident        :tal/DataMiner,
   :owl/equivalentClass {:owl/intersectionOf
                         [:stix/ThreatActor
                          {:owl/unionOf [{:owl/hasValue
                                          :tal/BusinessAdvantageOutcome,
                                          :owl/onProperty :tac/categorizedBy,
                                          :rdf/type :owl/Restriction}
                                         {:owl/hasValue
                                          :tal/TechnologyAdvantageOutcome,
                                          :owl/onProperty :tac/categorizedBy,
                                          :rdf/type :owl/Restriction}],
                           :rdf/type    :owl/Class}
                          {:owl/hasValue   :tal/AdeptSkills,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/ClandestineVisibility,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/CopyObjective,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/ExternalAccess,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/MinorExtraLegalLimits,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/TeamResources,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}],
                         :rdf/type :owl/Class},
   :rdf/type        :owl/Class,
   :rdfs/subClassOf [:tal/HostileThreatActor
                     {:owl/onProperty     :tal/hasSubordinateMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasCoMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasMotivationAttribute,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasDefiningMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasLimitsAttribute,
                      :owl/someValuesFrom :tal/Limits,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasObjectiveAttribute,
                      :owl/someValuesFrom :tal/Objective,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasVisibilityAttribute,
                      :owl/someValuesFrom :tal/Visibility,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasBindingMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     :tal/ThreatActor
                     {:owl/onProperty     :tal/hasAccessAttribute,
                      :owl/someValuesFrom :tal/Access,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasSkillsAttribute,
                      :owl/someValuesFrom :tal/Skills,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasOutcomeAttribute,
                      :owl/someValuesFrom :tal/Outcome,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasResourcesAttribute,
                      :owl/someValuesFrom :tal/Resources,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasPersonalMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}]})

(def DefiningAttribute
  {:db/ident :tal/DefiningAttribute,
   :rdf/type :owl/Class})

(def DenyObjective
  {:db/ident :tal/DenyObjective,
   :rdf/type [:tal/Objective :owl/NamedIndividual :tal/DefiningAttribute]})

(def DestroyObjective
  {:db/ident :tal/DestroyObjective,
   :rdf/type [:tal/Objective :owl/NamedIndividual :tal/DefiningAttribute]})

(def DisgruntledEmployee
  {:db/ident        :tal/DisgruntledEmployee,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf [:tal/HostileThreatActor
                     {:owl/onProperty     :tal/hasSubordinateMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasCoMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasMotivationAttribute,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasDefiningMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasLimitsAttribute,
                      :owl/someValuesFrom :tal/Limits,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasObjectiveAttribute,
                      :owl/someValuesFrom :tal/Objective,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasVisibilityAttribute,
                      :owl/someValuesFrom :tal/Visibility,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasBindingMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     :tal/ThreatActor
                     {:owl/onProperty     :tal/hasAccessAttribute,
                      :owl/someValuesFrom :tal/Access,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasSkillsAttribute,
                      :owl/someValuesFrom :tal/Skills,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasOutcomeAttribute,
                      :owl/someValuesFrom :tal/Outcome,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasResourcesAttribute,
                      :owl/someValuesFrom :tal/Resources,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasPersonalMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}]})

(def Disgruntlement
  {:db/ident :tal/Disgruntlement,
   :rdf/type [:tal/Motivation :owl/NamedIndividual :tal/DefiningAttribute]})

(def Dominance
  {:db/ident :tal/Dominance,
   :rdf/type [:tal/Motivation :owl/NamedIndividual :tal/DefiningAttribute]})

(def EmbarrassmentOutcome
  {:db/ident :tal/EmbarrassmentOutcome,
   :rdf/type [:tal/Outcome :owl/NamedIndividual :tal/DefiningAttribute]})

(def ExternalAccess
  {:db/ident :tal/ExternalAccess,
   :rdf/type [:tal/Access :owl/NamedIndividual :tal/DefiningAttribute]})

(def GovernmentCyberWarrior
  {:db/ident        :tal/GovernmentCyberWarrior,
   :owl/equivalentClass {:owl/intersectionOf
                         [:stix/ThreatActor
                          {:owl/unionOf [{:owl/hasValue   :tal/CopyObjective,
                                          :owl/onProperty :tac/categorizedBy,
                                          :rdf/type       :owl/Restriction}
                                         {:owl/hasValue   :tal/DenyObjective,
                                          :owl/onProperty :tac/categorizedBy,
                                          :rdf/type       :owl/Restriction}
                                         {:owl/hasValue   :tal/DestroyObjective,
                                          :owl/onProperty :tac/categorizedBy,
                                          :rdf/type       :owl/Restriction}],
                           :rdf/type    :owl/Class}
                          {:owl/unionOf [{:owl/hasValue   :tal/DamageOutcome,
                                          :owl/onProperty :tac/categorizedBy,
                                          :rdf/type       :owl/Restriction}
                                         {:owl/hasValue
                                          :tal/EmbarrassmentOutcome,
                                          :owl/onProperty :tac/categorizedBy,
                                          :rdf/type :owl/Restriction}],
                           :rdf/type    :owl/Class}
                          {:owl/hasValue   :tal/AdeptSkills,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/AnyVisibility,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/ExternalAccess,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/GovernmentResources,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/MajorExtraLegalLimits,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}],
                         :rdf/type :owl/Class},
   :rdf/type        :owl/Class,
   :rdfs/subClassOf [:tal/HostileThreatActor
                     {:owl/onProperty     :tal/hasSubordinateMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasCoMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasMotivationAttribute,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasDefiningMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasLimitsAttribute,
                      :owl/someValuesFrom :tal/Limits,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasObjectiveAttribute,
                      :owl/someValuesFrom :tal/Objective,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasVisibilityAttribute,
                      :owl/someValuesFrom :tal/Visibility,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasBindingMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     :tal/ThreatActor
                     {:owl/onProperty     :tal/hasAccessAttribute,
                      :owl/someValuesFrom :tal/Access,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasSkillsAttribute,
                      :owl/someValuesFrom :tal/Skills,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasOutcomeAttribute,
                      :owl/someValuesFrom :tal/Outcome,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasResourcesAttribute,
                      :owl/someValuesFrom :tal/Resources,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasPersonalMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}]})

(def GovernmentResources
  {:db/ident :tal/GovernmentResources,
   :rdf/type [:tal/Resources :owl/NamedIndividual :tal/DefiningAttribute]})

(def GovernmentSpy
  {:db/ident        :tal/GovernmentSpy,
   :owl/equivalentClass {:owl/intersectionOf
                         [:stix/ThreatActor
                          {:owl/unionOf [{:owl/hasValue
                                          :tal/BusinessAdvantageOutcome,
                                          :owl/onProperty :tac/categorizedBy,
                                          :rdf/type :owl/Restriction}
                                         {:owl/hasValue
                                          :tal/TechnologyAdvantageOutcome,
                                          :owl/onProperty :tac/categorizedBy,
                                          :rdf/type :owl/Restriction}],
                           :rdf/type    :owl/Class}
                          {:owl/hasValue   :tal/AdeptSkills,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/ClandestineVisibility,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/CopyObjective,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/GovernmentResources,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/InternalAccess,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/MajorExtraLegalLimits,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}],
                         :rdf/type :owl/Class},
   :rdf/type        :owl/Class,
   :rdfs/subClassOf [:tal/HostileThreatActor
                     {:owl/onProperty     :tal/hasSubordinateMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasCoMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasMotivationAttribute,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasDefiningMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasLimitsAttribute,
                      :owl/someValuesFrom :tal/Limits,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasObjectiveAttribute,
                      :owl/someValuesFrom :tal/Objective,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasVisibilityAttribute,
                      :owl/someValuesFrom :tal/Visibility,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasBindingMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     :tal/ThreatActor
                     {:owl/onProperty     :tal/hasAccessAttribute,
                      :owl/someValuesFrom :tal/Access,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasSkillsAttribute,
                      :owl/someValuesFrom :tal/Skills,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasOutcomeAttribute,
                      :owl/someValuesFrom :tal/Outcome,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasResourcesAttribute,
                      :owl/someValuesFrom :tal/Resources,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasPersonalMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}]})

(def HostileThreatActor
  {:db/ident        :tal/HostileThreatActor,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf [:tal/ThreatActor
                     {:owl/onProperty     :tal/hasSubordinateMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasCoMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasMotivationAttribute,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasDefiningMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasLimitsAttribute,
                      :owl/someValuesFrom :tal/Limits,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasObjectiveAttribute,
                      :owl/someValuesFrom :tal/Objective,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasVisibilityAttribute,
                      :owl/someValuesFrom :tal/Visibility,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasBindingMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasAccessAttribute,
                      :owl/someValuesFrom :tal/Access,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasSkillsAttribute,
                      :owl/someValuesFrom :tal/Skills,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasOutcomeAttribute,
                      :owl/someValuesFrom :tal/Outcome,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasResourcesAttribute,
                      :owl/someValuesFrom :tal/Resources,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasPersonalMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}]})

(def Ideology
  {:db/ident :tal/Ideology,
   :rdf/type [:tal/Motivation :owl/NamedIndividual :tal/DefiningAttribute]})

(def IndividualResources
  {:db/ident :tal/IndividualResources,
   :rdf/type [:tal/Resources :owl/NamedIndividual :tal/DefiningAttribute]})

(def InformationPartner
  {:db/ident        :tal/InformationPartner,
   :owl/equivalentClass {:owl/intersectionOf
                         [:stix/ThreatActor
                          {:owl/hasValue   :tal/AdeptSkills,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/AllDontCareObjective,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/CovertVisibility,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/DamageOutcome,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/EmbarrassmentOutcome,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/IndividualResources,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/InternalAccess,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/LegalLimits,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}],
                         :rdf/type :owl/Class},
   :rdf/type        :owl/Class,
   :rdfs/subClassOf [:tal/NonHostileThreatActor
                     {:owl/onProperty     :tal/hasSubordinateMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasCoMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasMotivationAttribute,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasDefiningMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasLimitsAttribute,
                      :owl/someValuesFrom :tal/Limits,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasObjectiveAttribute,
                      :owl/someValuesFrom :tal/Objective,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasVisibilityAttribute,
                      :owl/someValuesFrom :tal/Visibility,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasBindingMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     :tal/ThreatActor
                     {:owl/onProperty     :tal/hasAccessAttribute,
                      :owl/someValuesFrom :tal/Access,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasSkillsAttribute,
                      :owl/someValuesFrom :tal/Skills,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasOutcomeAttribute,
                      :owl/someValuesFrom :tal/Outcome,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasResourcesAttribute,
                      :owl/someValuesFrom :tal/Resources,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasPersonalMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}]})

(def InternalAccess
  {:db/ident :tal/InternalAccess,
   :rdf/type [:tal/Access :owl/NamedIndividual :tal/DefiningAttribute]})

(def InternalSpy
  {:db/ident        :tal/InternalSpy,
   :owl/equivalentClass {:owl/intersectionOf
                         [:stix/ThreatActor
                          {:owl/hasValue   :tal/AdeptSkills,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/AquisitionOutcome,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/ClandestineVisibility,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/CopyObjective,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/InternalAccess,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/MinorExtraLegalLimits,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/OrganizationalResources,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/TechnologyAdvantageOutcome,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}],
                         :rdf/type :owl/Class},
   :rdf/type        :owl/Class,
   :rdfs/subClassOf [:tal/HostileThreatActor
                     {:owl/onProperty     :tal/hasSubordinateMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasCoMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasMotivationAttribute,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasDefiningMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasLimitsAttribute,
                      :owl/someValuesFrom :tal/Limits,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasObjectiveAttribute,
                      :owl/someValuesFrom :tal/Objective,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasVisibilityAttribute,
                      :owl/someValuesFrom :tal/Visibility,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasBindingMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     :tal/ThreatActor
                     {:owl/onProperty     :tal/hasAccessAttribute,
                      :owl/someValuesFrom :tal/Access,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasSkillsAttribute,
                      :owl/someValuesFrom :tal/Skills,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasOutcomeAttribute,
                      :owl/someValuesFrom :tal/Outcome,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasResourcesAttribute,
                      :owl/someValuesFrom :tal/Resources,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasPersonalMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}]})

(def IrrationalIndividual
  {:db/ident        :tal/IrrationalIndividual,
   :owl/equivalentClass {:owl/intersectionOf
                         [:stix/ThreatActor
                          {:owl/hasValue   :tal/AllDontCareObjective,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/DamageOutcome,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/EmbarrassmentOutcome,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/ExternalAccess,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/IndividualResources,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/MajorExtraLegalLimits,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/MultipleDontCareVisibility,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/NoSkills,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}],
                         :rdf/type :owl/Class},
   :rdf/type        :owl/Class,
   :rdfs/subClassOf [:tal/HostileThreatActor
                     {:owl/onProperty     :tal/hasSubordinateMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasCoMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasMotivationAttribute,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasDefiningMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasLimitsAttribute,
                      :owl/someValuesFrom :tal/Limits,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasObjectiveAttribute,
                      :owl/someValuesFrom :tal/Objective,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasVisibilityAttribute,
                      :owl/someValuesFrom :tal/Visibility,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasBindingMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     :tal/ThreatActor
                     {:owl/onProperty     :tal/hasAccessAttribute,
                      :owl/someValuesFrom :tal/Access,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasSkillsAttribute,
                      :owl/someValuesFrom :tal/Skills,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasOutcomeAttribute,
                      :owl/someValuesFrom :tal/Outcome,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasResourcesAttribute,
                      :owl/someValuesFrom :tal/Resources,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasPersonalMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}]})

(def LegalAdversary
  {:db/ident        :tal/LegalAdversary,
   :owl/equivalentClass {:owl/intersectionOf
                         [:stix/ThreatActor
                          {:owl/unionOf [{:owl/hasValue   :tal/CopyObjective,
                                          :owl/onProperty :tac/categorizedBy,
                                          :rdf/type       :owl/Restriction}
                                         {:owl/hasValue   :tal/TakeObjective,
                                          :owl/onProperty :tac/categorizedBy,
                                          :rdf/type       :owl/Restriction}],
                           :rdf/type    :owl/Class}
                          {:owl/hasValue   :tal/AdeptSkills,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/BusinessAdvantageOutcome,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/EmbarrassmentOutcome,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/ExternalAccess,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/LegalLimits,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/OrganizationalResources,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/OvertVisibility,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}],
                         :rdf/type :owl/Class},
   :rdf/type        :owl/Class,
   :rdfs/subClassOf [:tal/HostileThreatActor
                     {:owl/onProperty     :tal/hasSubordinateMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasCoMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasMotivationAttribute,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasDefiningMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasLimitsAttribute,
                      :owl/someValuesFrom :tal/Limits,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasObjectiveAttribute,
                      :owl/someValuesFrom :tal/Objective,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasVisibilityAttribute,
                      :owl/someValuesFrom :tal/Visibility,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasBindingMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     :tal/ThreatActor
                     {:owl/onProperty     :tal/hasAccessAttribute,
                      :owl/someValuesFrom :tal/Access,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasSkillsAttribute,
                      :owl/someValuesFrom :tal/Skills,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasOutcomeAttribute,
                      :owl/someValuesFrom :tal/Outcome,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasResourcesAttribute,
                      :owl/someValuesFrom :tal/Resources,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasPersonalMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}]})

(def LegalLimits
  {:db/ident :tal/LegalLimits,
   :rdf/type [:tal/Limits :owl/NamedIndividual :tal/DefiningAttribute]})

(def Limits
  {:db/ident        :tal/Limits,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :tal/DefiningAttribute})

(def MajorExtraLegalLimits
  {:db/ident :tal/MajorExtraLegalLimits,
   :rdf/type [:tal/Limits :owl/NamedIndividual :tal/DefiningAttribute]})

(def MinimalSkills
  {:db/ident :tal/MinimalSkills,
   :rdf/type [:tal/Skills :owl/NamedIndividual :tal/DefiningAttribute]})

(def MinorExtraLegalLimits
  {:db/ident :tal/MinorExtraLegalLimits,
   :rdf/type [:tal/Limits :owl/NamedIndividual :tal/DefiningAttribute]})

(def Mobster
  {:db/ident        :tal/Mobster,
   :owl/equivalentClass {:owl/intersectionOf
                         [:stix/ThreatActor
                          {:owl/hasValue   :tal/AdeptSkills,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/AquisitionOutcome,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/CovertVisibility,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/ExternalAccess,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/MajorExtraLegalLimits,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/OrganizationalResources,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/TakeObjective,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}],
                         :rdf/type :owl/Class},
   :rdf/type        :owl/Class,
   :rdfs/subClassOf [:tal/HostileThreatActor
                     {:owl/onProperty     :tal/hasSubordinateMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasCoMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasMotivationAttribute,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasDefiningMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasLimitsAttribute,
                      :owl/someValuesFrom :tal/Limits,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasObjectiveAttribute,
                      :owl/someValuesFrom :tal/Objective,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasVisibilityAttribute,
                      :owl/someValuesFrom :tal/Visibility,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasBindingMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     :tal/ThreatActor
                     {:owl/onProperty     :tal/hasAccessAttribute,
                      :owl/someValuesFrom :tal/Access,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasSkillsAttribute,
                      :owl/someValuesFrom :tal/Skills,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasOutcomeAttribute,
                      :owl/someValuesFrom :tal/Outcome,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasResourcesAttribute,
                      :owl/someValuesFrom :tal/Resources,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasPersonalMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}]})

(def Motivation
  {:db/ident        :tal/Motivation,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :tal/DefiningAttribute})

(def MultipleDontCareVisibility
  {:db/ident :tal/MultipleDontCareVisibility,
   :rdf/type [:tal/Visibility :owl/NamedIndividual :tal/DefiningAttribute]})

(def NoSkills
  {:db/ident :tal/NoSkills,
   :rdf/type [:tal/Skills :owl/NamedIndividual :tal/DefiningAttribute]})

(def NonHostileThreatActor
  {:db/ident        :tal/NonHostileThreatActor,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf [:tal/ThreatActor
                     {:owl/onProperty     :tal/hasSubordinateMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasCoMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasMotivationAttribute,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasDefiningMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasLimitsAttribute,
                      :owl/someValuesFrom :tal/Limits,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasObjectiveAttribute,
                      :owl/someValuesFrom :tal/Objective,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasVisibilityAttribute,
                      :owl/someValuesFrom :tal/Visibility,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasBindingMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasAccessAttribute,
                      :owl/someValuesFrom :tal/Access,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasSkillsAttribute,
                      :owl/someValuesFrom :tal/Skills,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasOutcomeAttribute,
                      :owl/someValuesFrom :tal/Outcome,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasResourcesAttribute,
                      :owl/someValuesFrom :tal/Resources,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasPersonalMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}]})

(def Notoriety
  {:db/ident :tal/Notoriety,
   :rdf/type [:tal/Motivation :owl/NamedIndividual :tal/DefiningAttribute]})

(def Objective
  {:db/ident        :tal/Objective,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :tal/DefiningAttribute})

(def OperationalSkills
  {:db/ident :tal/OperationalSkills,
   :rdf/type [:tal/Skills :owl/NamedIndividual :tal/DefiningAttribute]})

(def OrganizationalGain
  {:db/ident :tal/OrganizationalGain,
   :rdf/type [:tal/Motivation :owl/NamedIndividual :tal/DefiningAttribute]})

(def OrganizationalResources
  {:db/ident :tal/OrganizationalResources,
   :rdf/type [:tal/Resources :owl/NamedIndividual :tal/DefiningAttribute]})

(def Outcome
  {:db/ident        :tal/Outcome,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :tal/DefiningAttribute})

(def OvertVisibility
  {:db/ident :tal/OvertVisibility,
   :rdf/type [:tal/Visibility :owl/NamedIndividual :tal/DefiningAttribute]})

(def PersonalFinancialGain
  {:db/ident :tal/PersonalFinancialGain,
   :rdf/type [:tal/Motivation :owl/NamedIndividual :tal/DefiningAttribute]})

(def PersonalStatisfaction
  {:db/ident :tal/PersonalStatisfaction,
   :rdf/type [:tal/Motivation :owl/NamedIndividual :tal/DefiningAttribute]})

(def RadicalActivist
  {:db/ident        :tal/RadicalActivist,
   :owl/equivalentClass {:owl/intersectionOf
                         [:stix/ThreatActor
                          {:owl/hasValue   :tal/AdeptSkills,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/AllDontCareObjective,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/DamageOutcome,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/EmbarrassmentOutcome,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/ExternalAccess,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/MinorExtraLegalLimits,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/OrganizationalResources,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/OvertVisibility,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}],
                         :rdf/type :owl/Class},
   :rdf/type        :owl/Class,
   :rdfs/subClassOf [:tal/HostileThreatActor
                     {:owl/onProperty     :tal/hasSubordinateMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasCoMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasMotivationAttribute,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasDefiningMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasLimitsAttribute,
                      :owl/someValuesFrom :tal/Limits,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasObjectiveAttribute,
                      :owl/someValuesFrom :tal/Objective,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasVisibilityAttribute,
                      :owl/someValuesFrom :tal/Visibility,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasBindingMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     :tal/ThreatActor
                     {:owl/onProperty     :tal/hasAccessAttribute,
                      :owl/someValuesFrom :tal/Access,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasSkillsAttribute,
                      :owl/someValuesFrom :tal/Skills,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasOutcomeAttribute,
                      :owl/someValuesFrom :tal/Outcome,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasResourcesAttribute,
                      :owl/someValuesFrom :tal/Resources,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasPersonalMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}]})

(def RecklessEmployee
  {:db/ident        :tal/RecklessEmployee,
   :owl/equivalentClass {:owl/intersectionOf
                         [:stix/ThreatActor
                          {:owl/hasValue   :tal/AdeptSkills,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/AllDontCareObjective,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/CovertVisibility,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/DamageOutcome,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/EmbarrassmentOutcome,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/IndividualResources,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/InternalAccess,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/LegalLimits,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}],
                         :rdf/type :owl/Class},
   :rdf/type        :owl/Class,
   :rdfs/subClassOf [:tal/NonHostileThreatActor
                     {:owl/onProperty     :tal/hasSubordinateMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasCoMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasMotivationAttribute,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasDefiningMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasLimitsAttribute,
                      :owl/someValuesFrom :tal/Limits,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasObjectiveAttribute,
                      :owl/someValuesFrom :tal/Objective,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasVisibilityAttribute,
                      :owl/someValuesFrom :tal/Visibility,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasBindingMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     :tal/ThreatActor
                     {:owl/onProperty     :tal/hasAccessAttribute,
                      :owl/someValuesFrom :tal/Access,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasSkillsAttribute,
                      :owl/someValuesFrom :tal/Skills,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasOutcomeAttribute,
                      :owl/someValuesFrom :tal/Outcome,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasResourcesAttribute,
                      :owl/someValuesFrom :tal/Resources,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasPersonalMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}]})

(def Resources
  {:db/ident        :tal/Resources,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :tal/DefiningAttribute})

(def Sensationalist
  {:db/ident        :tal/Sensationalist,
   :owl/equivalentClass {:owl/intersectionOf
                         [:stix/ThreatActor
                          {:owl/hasValue   :tal/AllDontCareObjective,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/ClubResources,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/DamageOutcome,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/EmbarrassmentOutcome,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/ExternalAccess,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/MinimalSkills,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/MinorExtraLegalLimits,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/OvertVisibility,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}],
                         :rdf/type :owl/Class},
   :rdf/type        :owl/Class,
   :rdfs/subClassOf [:tal/HostileThreatActor
                     {:owl/onProperty     :tal/hasSubordinateMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasCoMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasMotivationAttribute,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasDefiningMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasLimitsAttribute,
                      :owl/someValuesFrom :tal/Limits,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasObjectiveAttribute,
                      :owl/someValuesFrom :tal/Objective,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasVisibilityAttribute,
                      :owl/someValuesFrom :tal/Visibility,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasBindingMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     :tal/ThreatActor
                     {:owl/onProperty     :tal/hasAccessAttribute,
                      :owl/someValuesFrom :tal/Access,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasSkillsAttribute,
                      :owl/someValuesFrom :tal/Skills,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasOutcomeAttribute,
                      :owl/someValuesFrom :tal/Outcome,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasResourcesAttribute,
                      :owl/someValuesFrom :tal/Resources,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasPersonalMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}]})

(def Skills
  {:db/ident        :tal/Skills,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :tal/DefiningAttribute})

(def TakeObjective
  {:db/ident :tal/TakeObjective,
   :rdf/type [:tal/Objective :owl/NamedIndividual :tal/DefiningAttribute]})

(def TeamResources
  {:db/ident :tal/TeamResources,
   :rdf/type [:tal/Resources :owl/NamedIndividual :tal/DefiningAttribute]})

(def TechnologyAdvantageOutcome
  {:db/ident :tal/TechnologyAdvantageOutcome,
   :rdf/type [:tal/Outcome :owl/NamedIndividual :tal/DefiningAttribute]})

(def Terrorist
  {:db/ident        :tal/Terrorist,
   :owl/equivalentClass {:owl/intersectionOf
                         [:stix/ThreatActor
                          {:owl/unionOf [{:owl/hasValue   :tal/DamageObjective,
                                          :owl/onProperty :tac/categorizedBy,
                                          :rdf/type       :owl/Restriction}
                                         {:owl/hasValue   :tal/DestroyObjective,
                                          :owl/onProperty :tac/categorizedBy,
                                          :rdf/type       :owl/Restriction}],
                           :rdf/type    :owl/Class}
                          {:owl/hasValue   :tal/AdeptSkills,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/CovertVisibility,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/DamageOutcome,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/ExternalAccess,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/MajorExtraLegalLimits,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/OrganizationalResources,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/TakeObjective,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}],
                         :rdf/type :owl/Class},
   :rdf/type        :owl/Class,
   :rdfs/subClassOf [:tal/HostileThreatActor
                     {:owl/onProperty     :tal/hasSubordinateMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasCoMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasMotivationAttribute,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasDefiningMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasLimitsAttribute,
                      :owl/someValuesFrom :tal/Limits,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasObjectiveAttribute,
                      :owl/someValuesFrom :tal/Objective,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasVisibilityAttribute,
                      :owl/someValuesFrom :tal/Visibility,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasBindingMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     :tal/ThreatActor
                     {:owl/onProperty     :tal/hasAccessAttribute,
                      :owl/someValuesFrom :tal/Access,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasSkillsAttribute,
                      :owl/someValuesFrom :tal/Skills,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasOutcomeAttribute,
                      :owl/someValuesFrom :tal/Outcome,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasResourcesAttribute,
                      :owl/someValuesFrom :tal/Resources,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasPersonalMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}]})

(def TheftOutcome
  {:db/ident :tal/TheftOutcome,
   :rdf/type [:tal/Outcome :owl/NamedIndividual :tal/DefiningAttribute]})

(def Thief
  {:db/ident        :tal/Thief,
   :owl/equivalentClass {:owl/intersectionOf
                         [:stix/ThreatActor
                          {:owl/hasValue   :tal/AquisitionOutcome,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/ClandestineVisibility,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/IndividualResources,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/InternalAccess,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/MinorExtraLegalLimits,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/OperationalSkills,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/TakeObjective,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}],
                         :rdf/type :owl/Class},
   :rdf/type        :owl/Class,
   :rdfs/subClassOf [:tal/HostileThreatActor
                     {:owl/onProperty     :tal/hasSubordinateMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasCoMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasMotivationAttribute,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasDefiningMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasLimitsAttribute,
                      :owl/someValuesFrom :tal/Limits,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasObjectiveAttribute,
                      :owl/someValuesFrom :tal/Objective,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasVisibilityAttribute,
                      :owl/someValuesFrom :tal/Visibility,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasBindingMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     :tal/ThreatActor
                     {:owl/onProperty     :tal/hasAccessAttribute,
                      :owl/someValuesFrom :tal/Access,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasSkillsAttribute,
                      :owl/someValuesFrom :tal/Skills,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasOutcomeAttribute,
                      :owl/someValuesFrom :tal/Outcome,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasResourcesAttribute,
                      :owl/someValuesFrom :tal/Resources,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasPersonalMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}]})

(def ThreatActor
  {:db/ident        :tal/ThreatActor,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf [{:owl/onProperty     :tal/hasBindingMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasCoMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasVisibilityAttribute,
                      :owl/someValuesFrom :tal/Visibility,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasOutcomeAttribute,
                      :owl/someValuesFrom :tal/Outcome,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasAccessAttribute,
                      :owl/someValuesFrom :tal/Access,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasResourcesAttribute,
                      :owl/someValuesFrom :tal/Resources,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasPersonalMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasMotivationAttribute,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasSubordinateMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasSkillsAttribute,
                      :owl/someValuesFrom :tal/Skills,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasObjectiveAttribute,
                      :owl/someValuesFrom :tal/Objective,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasDefiningMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasLimitsAttribute,
                      :owl/someValuesFrom :tal/Limits,
                      :rdf/type           :owl/Restriction}]})

(def Unpredictable
  {:db/ident :tal/Unpredictable,
   :rdf/type [:tal/Motivation :owl/NamedIndividual :tal/DefiningAttribute]})

(def UntrainedEmployee
  {:db/ident        :tal/UntrainedEmployee,
   :owl/equivalentClass {:owl/intersectionOf
                         [:stix/ThreatActor
                          {:owl/hasValue   :tal/AllDontCareObjective,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/CodeOfConductLimits,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/DamageOutcome,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/EmbarrassmentOutcome,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/IndividualResources,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/InternalAccess,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/MinimalSkills,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/OvertVisibility,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}],
                         :rdf/type :owl/Class},
   :rdf/type        :owl/Class,
   :rdfs/subClassOf [:tal/NonHostileThreatActor
                     {:owl/onProperty     :tal/hasSubordinateMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasCoMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasMotivationAttribute,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasDefiningMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasLimitsAttribute,
                      :owl/someValuesFrom :tal/Limits,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasObjectiveAttribute,
                      :owl/someValuesFrom :tal/Objective,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasVisibilityAttribute,
                      :owl/someValuesFrom :tal/Visibility,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasBindingMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     :tal/ThreatActor
                     {:owl/onProperty     :tal/hasAccessAttribute,
                      :owl/someValuesFrom :tal/Access,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasSkillsAttribute,
                      :owl/someValuesFrom :tal/Skills,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasOutcomeAttribute,
                      :owl/someValuesFrom :tal/Outcome,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasResourcesAttribute,
                      :owl/someValuesFrom :tal/Resources,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasPersonalMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}]})

(def Vandal
  {:db/ident        :tal/Vandal,
   :owl/equivalentClass {:owl/intersectionOf
                         [:stix/ThreatActor
                          {:owl/hasValue   :tal/AllDontCareObjective,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/ContestResources,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/CovertVisibility,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/DamageOutcome,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/ExternalAccess,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/MinorExtraLegalLimits,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/OperationalSkills,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}],
                         :rdf/type :owl/Class},
   :rdf/type        :owl/Class,
   :rdfs/subClassOf [:tal/HostileThreatActor
                     {:owl/onProperty     :tal/hasSubordinateMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasCoMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasMotivationAttribute,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasDefiningMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasLimitsAttribute,
                      :owl/someValuesFrom :tal/Limits,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasObjectiveAttribute,
                      :owl/someValuesFrom :tal/Objective,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasVisibilityAttribute,
                      :owl/someValuesFrom :tal/Visibility,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasBindingMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     :tal/ThreatActor
                     {:owl/onProperty     :tal/hasAccessAttribute,
                      :owl/someValuesFrom :tal/Access,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasSkillsAttribute,
                      :owl/someValuesFrom :tal/Skills,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasOutcomeAttribute,
                      :owl/someValuesFrom :tal/Outcome,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasResourcesAttribute,
                      :owl/someValuesFrom :tal/Resources,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasPersonalMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}]})

(def Vendor
  {:db/ident        :tal/Vendor,
   :owl/equivalentClass {:owl/intersectionOf
                         [:stix/ThreatActor
                          {:owl/unionOf [{:owl/hasValue
                                          :tal/BusinessAdvantageOutcome,
                                          :owl/onProperty :tac/categorizedBy,
                                          :rdf/type :owl/Restriction}
                                         {:owl/hasValue
                                          :tal/TechnologyAdvantageOutcome,
                                          :owl/onProperty :tac/categorizedBy,
                                          :rdf/type :owl/Restriction}],
                           :rdf/type    :owl/Class}
                          {:owl/hasValue   :tal/ClandestineVisibility,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/CopyObjective,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/InternalAccess,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/LegalLimits,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/OperationalSkills,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}
                          {:owl/hasValue   :tal/TeamResources,
                           :owl/onProperty :tac/categorizedBy,
                           :rdf/type       :owl/Restriction}],
                         :rdf/type :owl/Class},
   :rdf/type        :owl/Class,
   :rdfs/subClassOf [:tal/HostileThreatActor
                     {:owl/onProperty     :tal/hasSubordinateMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasCoMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasMotivationAttribute,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasDefiningMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasLimitsAttribute,
                      :owl/someValuesFrom :tal/Limits,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasObjectiveAttribute,
                      :owl/someValuesFrom :tal/Objective,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasVisibilityAttribute,
                      :owl/someValuesFrom :tal/Visibility,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasBindingMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}
                     :tal/ThreatActor
                     {:owl/onProperty     :tal/hasAccessAttribute,
                      :owl/someValuesFrom :tal/Access,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasSkillsAttribute,
                      :owl/someValuesFrom :tal/Skills,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasOutcomeAttribute,
                      :owl/someValuesFrom :tal/Outcome,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasResourcesAttribute,
                      :owl/someValuesFrom :tal/Resources,
                      :rdf/type           :owl/Restriction}
                     {:owl/onProperty     :tal/hasPersonalMotivation,
                      :owl/someValuesFrom :tal/Motivation,
                      :rdf/type           :owl/Restriction}]})

(def Visibility
  {:db/ident        :tal/Visibility,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :tal/DefiningAttribute})

(def hasAccessAttribute
  {:db/ident :tal/hasAccessAttribute,
   :rdf/type :owl/ObjectProperty,
   :rdfs/subPropertyOf :tal/hasDefiningAttribute})

(def hasBindingMotivation
  {:db/ident           :tal/hasBindingMotivation,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/range         :tal/Motivation,
   :rdfs/subPropertyOf [:tal/hasMotivationAttribute :tal/hasDefiningAttribute]})

(def hasCoMotivation
  {:db/ident           :tal/hasCoMotivation,
   :rdf/type           :owl/ObjectProperty,
   :rdfs/range         :tal/Motivation,
   :rdfs/subPropertyOf [:tal/hasMotivationAttribute :tal/hasDefiningAttribute]})

(def hasDefiningAttribute
  {:db/ident   :tal/hasDefiningAttribute,
   :rdf/type   :owl/ObjectProperty,
   :rdfs/range :tal/DefiningAttribute})

(def hasDefiningMotivation
  {:db/ident :tal/hasDefiningMotivation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/subPropertyOf [:tal/hasMotivationAttribute :tal/hasDefiningAttribute]})

(def hasLimitsAttribute
  {:db/ident :tal/hasLimitsAttribute,
   :rdf/type :owl/ObjectProperty,
   :rdfs/subPropertyOf :tal/hasDefiningAttribute})

(def hasMotivationAttribute
  {:db/ident :tal/hasMotivationAttribute,
   :rdf/type :owl/ObjectProperty,
   :rdfs/subPropertyOf :tal/hasDefiningAttribute})

(def hasObjectiveAttribute
  {:db/ident :tal/hasObjectiveAttribute,
   :rdf/type :owl/ObjectProperty,
   :rdfs/subPropertyOf :tal/hasDefiningAttribute})

(def hasOutcomeAttribute
  {:db/ident :tal/hasOutcomeAttribute,
   :rdf/type :owl/ObjectProperty,
   :rdfs/subPropertyOf :tal/hasDefiningAttribute})

(def hasPersonalMotivation
  {:db/ident :tal/hasPersonalMotivation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/subPropertyOf [:tal/hasMotivationAttribute :tal/hasDefiningAttribute]})

(def hasResourcesAttribute
  {:db/ident :tal/hasResourcesAttribute,
   :rdf/type :owl/ObjectProperty,
   :rdfs/subPropertyOf :tal/hasDefiningAttribute})

(def hasSkillsAttribute
  {:db/ident :tal/hasSkillsAttribute,
   :rdf/type :owl/ObjectProperty,
   :rdfs/subPropertyOf :tal/hasDefiningAttribute})

(def hasSubordinateMotivation
  {:db/ident :tal/hasSubordinateMotivation,
   :rdf/type :owl/ObjectProperty,
   :rdfs/subPropertyOf [:tal/hasMotivationAttribute :tal/hasDefiningAttribute]})

(def hasVisibilityAttribute
  {:db/ident :tal/hasVisibilityAttribute,
   :rdf/type :owl/ObjectProperty,
   :rdfs/subPropertyOf :tal/hasDefiningAttribute})