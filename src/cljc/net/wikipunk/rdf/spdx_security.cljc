(ns net.wikipunk.rdf.spdx-security
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
   :rdfa/prefix       "spdx-security",
   :rdfa/uri          "https://spdx.org/rdf/v3/Security/"}
  (:refer-clojure :exclude [vector]))

(def CvssV2VulnAssessmentRelationship
  "A CvssV2VulnAssessmentRelationship relationship describes the determined score and vector of a vulnerability using version 2.0 of the Common Vulnerability Scoring System\n(CVSS) as defined on [https://www.first.org/cvss/v2/guide](https://www.first.org/cvss/v2/guide). It is intented to communicate the results of using a CVSS calculator.\n\n**Constraints**\n\n- The value of severity must be one of 'low', 'medium' or 'high'\n- The relationship type must be set to hasAssessmentFor.\n\n**Syntax**\n\n```json\n{\n  \"@type\": \"CvssV2VulnAssessmentRelationship\",\n  \"@id\": \"urn:spdx.dev:cvssv2-cve-2020-28498\",\n  \"relationshipType\": \"hasAssessmentFor\",\n  \"score\": 4.3,\n  \"vector\": \"(AV:N/AC:M/Au:N/C:P/I:N/A:N)\",\n  \"severity\": \"low\",\n  \"from\": \"urn:spdx.dev:vuln-cve-2020-28498\",\n  \"to\": [\"urn:product-acme-application-1.3\"],\n  \"assessedElement\": \"urn:npm-elliptic-6.5.2\",\n  \"externalReferences\": [\n    {\n      \"@type\": \"ExternalReference\",\n      \"externalReferenceType\": \"securityAdvisory\",\n      \"locator\": \"https://nvd.nist.gov/vuln/detail/CVE-2020-28498\"\n    },\n    {\n      \"@type\": \"ExternalReference\",\n      \"externalReferenceType\": \"securityAdvisory\",\n      \"locator\": \"https://snyk.io/vuln/SNYK-JS-ELLIPTIC-1064899\"\n    },\n    {\n      \"@type\": \"ExternalReference\",\n      \"externalReferenceType\": \"securityFix\",\n      \"locator\": \"https://github.com/indutny/elliptic/commit/441b742\"\n    }\n  ],\n  \"suppliedBy\": [\"urn:spdx.dev:agent-my-security-vendor\"],\n  \"publishedTime\": \"2023-05-06T10:06:13Z\"\n},\n{\n  \"@type\": \"Relationship\",\n  \"@id\": \"urn:spdx.dev:vulnAgentRel-1\",  \n  \"relationshipType\": \"publishedBy\",  \n  \"from\": \"urn:spdx.dev:cvssv2-cve-2020-28498\",\n  \"to\": [\"urn:spdx.dev:agent-snyk\"],\n  \"startTime\": \"2021-03-08T16:06:50Z\"\n}\n```"
  {:db/ident :spdx-security/CvssV2VulnAssessmentRelationship,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "A CvssV2VulnAssessmentRelationship relationship describes the determined score and vector of a vulnerability using version 2.0 of the Common Vulnerability Scoring System\n(CVSS) as defined on [https://www.first.org/cvss/v2/guide](https://www.first.org/cvss/v2/guide). It is intented to communicate the results of using a CVSS calculator.\n\n**Constraints**\n\n- The value of severity must be one of 'low', 'medium' or 'high'\n- The relationship type must be set to hasAssessmentFor.\n\n**Syntax**\n\n```json\n{\n  \"@type\": \"CvssV2VulnAssessmentRelationship\",\n  \"@id\": \"urn:spdx.dev:cvssv2-cve-2020-28498\",\n  \"relationshipType\": \"hasAssessmentFor\",\n  \"score\": 4.3,\n  \"vector\": \"(AV:N/AC:M/Au:N/C:P/I:N/A:N)\",\n  \"severity\": \"low\",\n  \"from\": \"urn:spdx.dev:vuln-cve-2020-28498\",\n  \"to\": [\"urn:product-acme-application-1.3\"],\n  \"assessedElement\": \"urn:npm-elliptic-6.5.2\",\n  \"externalReferences\": [\n    {\n      \"@type\": \"ExternalReference\",\n      \"externalReferenceType\": \"securityAdvisory\",\n      \"locator\": \"https://nvd.nist.gov/vuln/detail/CVE-2020-28498\"\n    },\n    {\n      \"@type\": \"ExternalReference\",\n      \"externalReferenceType\": \"securityAdvisory\",\n      \"locator\": \"https://snyk.io/vuln/SNYK-JS-ELLIPTIC-1064899\"\n    },\n    {\n      \"@type\": \"ExternalReference\",\n      \"externalReferenceType\": \"securityFix\",\n      \"locator\": \"https://github.com/indutny/elliptic/commit/441b742\"\n    }\n  ],\n  \"suppliedBy\": [\"urn:spdx.dev:agent-my-security-vendor\"],\n  \"publishedTime\": \"2023-05-06T10:06:13Z\"\n},\n{\n  \"@type\": \"Relationship\",\n  \"@id\": \"urn:spdx.dev:vulnAgentRel-1\",  \n  \"relationshipType\": \"publishedBy\",  \n  \"from\": \"urn:spdx.dev:cvssv2-cve-2020-28498\",\n  \"to\": [\"urn:spdx.dev:agent-snyk\"],\n  \"startTime\": \"2021-03-08T16:06:50Z\"\n}\n```",
   :rdfs/subClassOf [:spdx-security/VulnAssessmentRelationship
                     :spdx-core/Element
                     :spdx-core/Relationship],
   :sh/property [{:sh/datatype :xsd/string,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "vector",
                  :sh/path     :spdx-security/vector}
                 {:sh/datatype :xsd/string,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "severity",
                  :sh/path     :spdx-security/severity}
                 {:sh/datatype :xsd/decimal,
                  :sh/maxCount #xsd/integer 1,
                  :sh/minCount #xsd/integer 1,
                  :sh/name     "score",
                  :sh/path     :spdx-security/score}],
   :vs/term_status "Stable"})

(def CvssV3VulnAssessmentRelationship
  "A CvssV3VulnAssessmentRelationship relationship describes the determined score,\nseverity, and vector of a vulnerability using version 3.1 of the Common\nVulnerability Scoring System (CVSS) as defined on \n[https://www.first.org/cvss/v3.1/specification-document](https://www.first.org/cvss/v3.1/specification-document). It is intented to communicate the results of using a CVSS calculator.\n\n**Constraints**\n\n- The value of severity must be one of 'none', 'low', 'medium', 'high' or 'critical'.\n- Absence of the property shall be interpreted as 'none'.\n- The relationship type must be set to hasAssessmentFor.\n\n**Syntax**\n\n```json\n{\n  \"@type\": \"CvssV3VulnAssessmentRelationship\",\n  \"@id\": \"urn:spdx.dev:cvssv3-cve-2020-28498\",\n  \"relationshipType\": \"hasAssessmentFor\",\n  \"severity\": \"medium\",\n  \"score\": 6.8,\n  \"vector\": \"CVSS:3.1/AV:N/AC:H/PR:N/UI:N/S:C/C:H/I:N/A:N\",\n  \"from\": \"urn:spdx.dev:vuln-cve-2020-28498\",\n  \"to\": [\"urn:product-acme-application-1.3\"],\n  \"assessedElement\": \"urn:npm-elliptic-6.5.2\",\n  \"externalReferences\": [\n    {\n      \"@type\": \"ExternalReference\",\n      \"externalReferenceType\": \"securityAdvisory\",\n      \"locator\": \"https://nvd.nist.gov/vuln/detail/CVE-2020-28498\"\n    },\n    {\n      \"@type\": \"ExternalReference\",\n      \"externalReferenceType\": \"securityAdvisory\",\n      \"locator\": \"https://snyk.io/vuln/SNYK-JS-ELLIPTIC-1064899\"\n    },\n    {\n      \"@type\": \"ExternalReference\",\n      \"externalReferenceType\": \"securityFix\",\n      \"locator\": \"https://github.com/indutny/elliptic/commit/441b742\"\n    }\n  ],\n  \"suppliedBy\": [\"urn:spdx.dev:agent-my-security-vendor\"],\n  \"publishedTime\": \"2023-05-06T10:06:13Z\"\n},\n{\n  \"@type\": \"Relationship\",\n  \"@id\": \"urn:spdx.dev:vulnAgentRel-1\",\n  \"relationshipType\": \"publishedBy\",\n  \"from\": \"urn:spdx.dev:cvssv3-cve-2020-28498\",\n  \"to\": \"urn:spdx.dev:agent-snyk\",\n  \"startTime\": \"2021-03-08T16:06:50Z\"\n}\n```"
  {:db/ident :spdx-security/CvssV3VulnAssessmentRelationship,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "A CvssV3VulnAssessmentRelationship relationship describes the determined score,\nseverity, and vector of a vulnerability using version 3.1 of the Common\nVulnerability Scoring System (CVSS) as defined on \n[https://www.first.org/cvss/v3.1/specification-document](https://www.first.org/cvss/v3.1/specification-document). It is intented to communicate the results of using a CVSS calculator.\n\n**Constraints**\n\n- The value of severity must be one of 'none', 'low', 'medium', 'high' or 'critical'.\n- Absence of the property shall be interpreted as 'none'.\n- The relationship type must be set to hasAssessmentFor.\n\n**Syntax**\n\n```json\n{\n  \"@type\": \"CvssV3VulnAssessmentRelationship\",\n  \"@id\": \"urn:spdx.dev:cvssv3-cve-2020-28498\",\n  \"relationshipType\": \"hasAssessmentFor\",\n  \"severity\": \"medium\",\n  \"score\": 6.8,\n  \"vector\": \"CVSS:3.1/AV:N/AC:H/PR:N/UI:N/S:C/C:H/I:N/A:N\",\n  \"from\": \"urn:spdx.dev:vuln-cve-2020-28498\",\n  \"to\": [\"urn:product-acme-application-1.3\"],\n  \"assessedElement\": \"urn:npm-elliptic-6.5.2\",\n  \"externalReferences\": [\n    {\n      \"@type\": \"ExternalReference\",\n      \"externalReferenceType\": \"securityAdvisory\",\n      \"locator\": \"https://nvd.nist.gov/vuln/detail/CVE-2020-28498\"\n    },\n    {\n      \"@type\": \"ExternalReference\",\n      \"externalReferenceType\": \"securityAdvisory\",\n      \"locator\": \"https://snyk.io/vuln/SNYK-JS-ELLIPTIC-1064899\"\n    },\n    {\n      \"@type\": \"ExternalReference\",\n      \"externalReferenceType\": \"securityFix\",\n      \"locator\": \"https://github.com/indutny/elliptic/commit/441b742\"\n    }\n  ],\n  \"suppliedBy\": [\"urn:spdx.dev:agent-my-security-vendor\"],\n  \"publishedTime\": \"2023-05-06T10:06:13Z\"\n},\n{\n  \"@type\": \"Relationship\",\n  \"@id\": \"urn:spdx.dev:vulnAgentRel-1\",\n  \"relationshipType\": \"publishedBy\",\n  \"from\": \"urn:spdx.dev:cvssv3-cve-2020-28498\",\n  \"to\": \"urn:spdx.dev:agent-snyk\",\n  \"startTime\": \"2021-03-08T16:06:50Z\"\n}\n```",
   :rdfs/subClassOf [:spdx-security/VulnAssessmentRelationship
                     :spdx-core/Element
                     :spdx-core/Relationship],
   :sh/property [{:sh/datatype :xsd/string,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "vector",
                  :sh/path     :spdx-security/vector}
                 {:sh/datatype :xsd/string,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "severity",
                  :sh/path     :spdx-security/severity}
                 {:sh/datatype :xsd/decimal,
                  :sh/maxCount #xsd/integer 1,
                  :sh/minCount #xsd/integer 1,
                  :sh/name     "score",
                  :sh/path     :spdx-security/score}],
   :vs/term_status "Stable"})

(def EpssVulnAssessmentRelationship
  "An EpssVulnAssessmentRelationship relationship describes the likelihood or\nprobability that a vulnerability will be exploited in the wild using the Exploit\nPrediction Scoring System (EPSS) as defined on \n[https://www.first.org/epss/model](https://www.first.org/epss/model).\n\n**Constraints**\n\n- The relationship type must be set to hasAssessmentFor.\n\n**Syntax**\n\n```json\n{\n  \"@type\": \"EpssVulnAssessmentRelationship\",\n  \"@id\": \"urn:spdx.dev:epss-1\",\n  \"relationshipType\": \"hasAssessmentFor\",\n  \"probability\": 80,\n  \"from\": \"urn:spdx.dev:vuln-cve-2020-28498\",\n  \"to\": [\"urn:product-acme-application-1.3\"],\n  \"suppliedBy\": [\"urn:spdx.dev:agent-jane-doe\"],\n  \"publishedTime\": \"2021-03-09T11:04:53Z\"\n}\n```"
  {:db/ident :spdx-security/EpssVulnAssessmentRelationship,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "An EpssVulnAssessmentRelationship relationship describes the likelihood or\nprobability that a vulnerability will be exploited in the wild using the Exploit\nPrediction Scoring System (EPSS) as defined on \n[https://www.first.org/epss/model](https://www.first.org/epss/model).\n\n**Constraints**\n\n- The relationship type must be set to hasAssessmentFor.\n\n**Syntax**\n\n```json\n{\n  \"@type\": \"EpssVulnAssessmentRelationship\",\n  \"@id\": \"urn:spdx.dev:epss-1\",\n  \"relationshipType\": \"hasAssessmentFor\",\n  \"probability\": 80,\n  \"from\": \"urn:spdx.dev:vuln-cve-2020-28498\",\n  \"to\": [\"urn:product-acme-application-1.3\"],\n  \"suppliedBy\": [\"urn:spdx.dev:agent-jane-doe\"],\n  \"publishedTime\": \"2021-03-09T11:04:53Z\"\n}\n```",
   :rdfs/subClassOf [:spdx-security/VulnAssessmentRelationship
                     :spdx-core/Element
                     :spdx-core/Relationship],
   :sh/property [{:sh/datatype :xsd/nonNegativeInteger,
                  :sh/maxCount #xsd/integer 1,
                  :sh/minCount #xsd/integer 1,
                  :sh/name     "probability",
                  :sh/path     :spdx-security/probability}
                 {:sh/datatype :xsd/string,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "severity",
                  :sh/path     :spdx-security/severity}],
   :vs/term_status "Stable"})

(def ExploitCatalogType
  "ExploitCatalogType specifies the type of exploit catalog that a vulnerability is listed in."
  {:db/ident :spdx-security/ExploitCatalogType,
   :owl/oneOf
   [{:rdfa/uri "https://spdx.org/rdf/v3/Security/ExploitCatalogType/kev"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Security/ExploitCatalogType/other"}],
   :rdf/type :owl/Class,
   :rdfs/comment
   "ExploitCatalogType specifies the type of exploit catalog that a vulnerability is listed in.",
   :vs/term_status "Stable"})

(def ExploitCatalogVulnAssessmentRelationship
  "An ExploitCatalogVulnAssessmentRelationship describes if a vulnerability is\nlisted in any exploit catalog such as the CISA Known Exploited Vulnerabilities\nCatalog (KEV) \n[https://www.cisa.gov/known-exploited-vulnerabilities-catalog](https://www.cisa.gov/known-exploited-vulnerabilities-catalog).\n\n**Constraints**\n\n- The relationship type must be set to hasAssessmentFor.\n\n**Syntax**\n\n```json\n{\n  \"@type\": \"ExploitCatalogVulnAssessmentRelationship\",\n  \"@id\": \"urn:spdx.dev:exploit-catalog-1\",\n  \"relationshipType\": \"hasAssessmentFor\",\n  \"catalogType\": \"kev\",\n  \"locator\": \"https://www.cisa.gov/known-exploited-vulnerabilities-catalog\",\n  \"exploited\": \"true\",\n  \"from\": \"urn:spdx.dev:vuln-cve-2023-2136\",\n  \"to\": [\"urn:product-google-chrome-112.0.5615.136\"],\n  \"suppliedBy\": [\"urn:spdx.dev:agent-jane-doe\"],\n  \"publishedTime\": \"2021-03-09T11:04:53Z\"\n}\n```"
  {:db/ident :spdx-security/ExploitCatalogVulnAssessmentRelationship,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "An ExploitCatalogVulnAssessmentRelationship describes if a vulnerability is\nlisted in any exploit catalog such as the CISA Known Exploited Vulnerabilities\nCatalog (KEV) \n[https://www.cisa.gov/known-exploited-vulnerabilities-catalog](https://www.cisa.gov/known-exploited-vulnerabilities-catalog).\n\n**Constraints**\n\n- The relationship type must be set to hasAssessmentFor.\n\n**Syntax**\n\n```json\n{\n  \"@type\": \"ExploitCatalogVulnAssessmentRelationship\",\n  \"@id\": \"urn:spdx.dev:exploit-catalog-1\",\n  \"relationshipType\": \"hasAssessmentFor\",\n  \"catalogType\": \"kev\",\n  \"locator\": \"https://www.cisa.gov/known-exploited-vulnerabilities-catalog\",\n  \"exploited\": \"true\",\n  \"from\": \"urn:spdx.dev:vuln-cve-2023-2136\",\n  \"to\": [\"urn:product-google-chrome-112.0.5615.136\"],\n  \"suppliedBy\": [\"urn:spdx.dev:agent-jane-doe\"],\n  \"publishedTime\": \"2021-03-09T11:04:53Z\"\n}\n```",
   :rdfs/subClassOf [:spdx-security/VulnAssessmentRelationship
                     :spdx-core/Element
                     :spdx-core/Relationship],
   :sh/property [{:sh/datatype :xsd/anyURI,
                  :sh/maxCount #xsd/integer 1,
                  :sh/minCount #xsd/integer 1,
                  :sh/name     "locator",
                  :sh/path     :spdx-security/locator}
                 {:sh/datatype :xsd/boolean,
                  :sh/maxCount #xsd/integer 1,
                  :sh/minCount #xsd/integer 1,
                  :sh/name     "exploited",
                  :sh/path     :spdx-security/exploited}
                 {:sh/class    :spdx-security/ExploitCatalogType,
                  :sh/maxCount #xsd/integer 1,
                  :sh/minCount #xsd/integer 1,
                  :sh/name     "catalogType",
                  :sh/path     :spdx-security/catalogType}],
   :vs/term_status "Stable"})

(def SsvcDecisionType
  "SsvcDecisionType specifies the type of decision that's been made according to the Stakeholder-Specific Vulnerability Categorization (SSVC)  system [https://www.cisa.gov/stakeholder-specific-vulnerability-categorization-ssvc](https://www.cisa.gov/stakeholder-specific-vulnerability-categorization-ssvc)"
  {:db/ident :spdx-security/SsvcDecisionType,
   :owl/oneOf
   [{:rdfa/uri "https://spdx.org/rdf/v3/Security/SsvcDecisionType/attend"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Security/SsvcDecisionType/act"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Security/SsvcDecisionType/trackStar"}
    {:rdfa/uri "https://spdx.org/rdf/v3/Security/SsvcDecisionType/track"}],
   :rdf/type :owl/Class,
   :rdfs/comment
   "SsvcDecisionType specifies the type of decision that's been made according to the Stakeholder-Specific Vulnerability Categorization (SSVC)  system [https://www.cisa.gov/stakeholder-specific-vulnerability-categorization-ssvc](https://www.cisa.gov/stakeholder-specific-vulnerability-categorization-ssvc)",
   :vs/term_status "Stable"})

(def SsvcVulnAssessmentRelationship
  "An SsvcVulnAssessmentRelationship describes the decision made using the\nStakeholder-Specific Vulnerability Categorization (SSVC) decision tree as\ndefined on [https://www.cisa.gov/stakeholder-specific-vulnerability-categorization-ssvc](https://www.cisa.gov/stakeholder-specific-vulnerability-categorization-ssvc).\nIt is intended to communicate the results of using the CISA SSVC Calculator.\n\n**Constraints**\n\n- The relationship type must be set to hasAssessmentFor.\n\n**Syntax**\n\n```json\n{\n  \"@type\": \"SsvcVulnAssessmentRelationship\",\n  \"@id\": \"urn:spdx.dev:ssvc-1\",\n  \"relationshipType\": \"hasAssessmentFor\",\n  \"decisionType\": \"act\",\n  \"from\": \"urn:spdx.dev:vuln-cve-2020-28498\",\n  \"to\": [\"urn:product-acme-application-1.3\"],\n  \"assessedElement\": \"urn:npm-elliptic-6.5.2\",\n  \"suppliedBy\": [\"urn:spdx.dev:agent-jane-doe\"],\n  \"publishedTime\": \"2021-03-09T11:04:53Z\"\n}\n```"
  {:db/ident :spdx-security/SsvcVulnAssessmentRelationship,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "An SsvcVulnAssessmentRelationship describes the decision made using the\nStakeholder-Specific Vulnerability Categorization (SSVC) decision tree as\ndefined on [https://www.cisa.gov/stakeholder-specific-vulnerability-categorization-ssvc](https://www.cisa.gov/stakeholder-specific-vulnerability-categorization-ssvc).\nIt is intended to communicate the results of using the CISA SSVC Calculator.\n\n**Constraints**\n\n- The relationship type must be set to hasAssessmentFor.\n\n**Syntax**\n\n```json\n{\n  \"@type\": \"SsvcVulnAssessmentRelationship\",\n  \"@id\": \"urn:spdx.dev:ssvc-1\",\n  \"relationshipType\": \"hasAssessmentFor\",\n  \"decisionType\": \"act\",\n  \"from\": \"urn:spdx.dev:vuln-cve-2020-28498\",\n  \"to\": [\"urn:product-acme-application-1.3\"],\n  \"assessedElement\": \"urn:npm-elliptic-6.5.2\",\n  \"suppliedBy\": [\"urn:spdx.dev:agent-jane-doe\"],\n  \"publishedTime\": \"2021-03-09T11:04:53Z\"\n}\n```",
   :rdfs/subClassOf [:spdx-security/VulnAssessmentRelationship
                     :spdx-core/Element
                     :spdx-core/Relationship],
   :sh/property {:sh/class    :spdx-security/SsvcDecisionType,
                 :sh/maxCount #xsd/integer 1,
                 :sh/minCount #xsd/integer 1,
                 :sh/name     "decisionType",
                 :sh/path     :spdx-security/decisionType},
   :vs/term_status "Stable"})

(def VexAffectedVulnAssessmentRelationship
  "VexAffectedVulnAssessmentRelationship connects a vulnerability and a number\nof elements. The relationship marks these elements as products affected by the\nvulnerability. This relationship corresponds to the VEX affected status.\n\n**Constraints**\n\nWhen linking elements using a VexAffectedVulnAssessmentRelationship, the\nfollowing requirements must be observed:\n\n- Elements linked with a VulnVexAffectedAssessmentRelationship are constrained\nto the affects relationship type.\n\n**Syntax**\n\n```json\n{\n  \"@type\": \"VexAffectedVulnAssessmentRelationship\",\n  \"@id\": \"urn:spdx.dev:vex-affected-1\",\n  \"relationshipType\": \"affects\",\n  \"from\": \"urn:spdx.dev:vuln-cve-2020-28498\",\n  \"to\": [\"urn:product-acme-application-1.3\"],\n  \"assessedElement\": \"urn:npm-elliptic-6.5.2\",\n  \"actionStatement\": \"Upgrade to version 1.4 of ACME application.\",\n  \"suppliedBy\": [\"urn:spdx.dev:agent-jane-doe\"],\n  \"publishedTime\": \"2021-03-09T11:04:53Z\"\n}\n```"
  {:db/ident :spdx-security/VexAffectedVulnAssessmentRelationship,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "VexAffectedVulnAssessmentRelationship connects a vulnerability and a number\nof elements. The relationship marks these elements as products affected by the\nvulnerability. This relationship corresponds to the VEX affected status.\n\n**Constraints**\n\nWhen linking elements using a VexAffectedVulnAssessmentRelationship, the\nfollowing requirements must be observed:\n\n- Elements linked with a VulnVexAffectedAssessmentRelationship are constrained\nto the affects relationship type.\n\n**Syntax**\n\n```json\n{\n  \"@type\": \"VexAffectedVulnAssessmentRelationship\",\n  \"@id\": \"urn:spdx.dev:vex-affected-1\",\n  \"relationshipType\": \"affects\",\n  \"from\": \"urn:spdx.dev:vuln-cve-2020-28498\",\n  \"to\": [\"urn:product-acme-application-1.3\"],\n  \"assessedElement\": \"urn:npm-elliptic-6.5.2\",\n  \"actionStatement\": \"Upgrade to version 1.4 of ACME application.\",\n  \"suppliedBy\": [\"urn:spdx.dev:agent-jane-doe\"],\n  \"publishedTime\": \"2021-03-09T11:04:53Z\"\n}\n```",
   :rdfs/subClassOf [:spdx-security/VexVulnAssessmentRelationship
                     :spdx-core/Element
                     :spdx-security/VulnAssessmentRelationship
                     :spdx-core/Relationship],
   :sh/property [{:sh/datatype :spdx-core/DateTime,
                  :sh/name     "actionStatementTime",
                  :sh/path     :spdx-security/actionStatementTime}
                 {:sh/datatype :xsd/string,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "actionStatement",
                  :sh/path     :spdx-security/actionStatement}],
   :vs/term_status "Stable"})

(def VexFixedVulnAssessmentRelationship
  "VexFixedVulnAssessmentRelationship links a vulnerability to a number of elements\nrepresenting VEX products where a vulnerability has been fixed and are no longer\naffected. It represents the VEX fixed status.\n\n**Constraints**\n\nWhen linking elements using a VexFixedVulnAssessmentRelationship, the following\nrequirements must be observed:\n\n- Elements linked with a VulnVexFixedAssessmentRelationship are constrained to\nusing the fixedIn relationship type.\n- The from: end of the relationship must ve a /Security/Vulnerability classed\nelement.\n\n**Syntax**\n\n```json\n{\n  \"@type\": \"VexFixedVulnAssessmentRelationship\",\n  \"@id\": \"urn:spdx.dev:vex-fixed-in-1\",\n  \"relationshipType\": \"fixedIn\",\n  \"from\": \"urn:spdx.dev:vuln-cve-2020-28498\",\n  \"to\": [\"urn:product-acme-application-1.3\"],\n  \"assessedElement\": \"urn:npm-elliptic-6.5.4\",\n  \"suppliedBy\": [\"urn:spdx.dev:agent-jane-doe\"],\n  \"publishedTime\": \"2021-03-09T11:04:53Z\"\n}\n```"
  {:db/ident :spdx-security/VexFixedVulnAssessmentRelationship,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "VexFixedVulnAssessmentRelationship links a vulnerability to a number of elements\nrepresenting VEX products where a vulnerability has been fixed and are no longer\naffected. It represents the VEX fixed status.\n\n**Constraints**\n\nWhen linking elements using a VexFixedVulnAssessmentRelationship, the following\nrequirements must be observed:\n\n- Elements linked with a VulnVexFixedAssessmentRelationship are constrained to\nusing the fixedIn relationship type.\n- The from: end of the relationship must ve a /Security/Vulnerability classed\nelement.\n\n**Syntax**\n\n```json\n{\n  \"@type\": \"VexFixedVulnAssessmentRelationship\",\n  \"@id\": \"urn:spdx.dev:vex-fixed-in-1\",\n  \"relationshipType\": \"fixedIn\",\n  \"from\": \"urn:spdx.dev:vuln-cve-2020-28498\",\n  \"to\": [\"urn:product-acme-application-1.3\"],\n  \"assessedElement\": \"urn:npm-elliptic-6.5.4\",\n  \"suppliedBy\": [\"urn:spdx.dev:agent-jane-doe\"],\n  \"publishedTime\": \"2021-03-09T11:04:53Z\"\n}\n```",
   :rdfs/subClassOf [:spdx-security/VexVulnAssessmentRelationship
                     :spdx-core/Element
                     :spdx-security/VulnAssessmentRelationship
                     :spdx-core/Relationship],
   :vs/term_status "Stable"})

(def VexJustificationType
  "VexJustificationType specifies the type of Vulnerability Exploitability eXchange (VEX) justification."
  {:db/ident :spdx-security/VexJustificationType,
   :owl/oneOf
   [{:rdfa/uri
     "https://spdx.org/rdf/v3/Security/VexJustificationType/componentNotPresent"}
    {:rdfa/uri
     "https://spdx.org/rdf/v3/Security/VexJustificationType/vulnerableCodeCannotBeControlledByAdversary"}
    {:rdfa/uri
     "https://spdx.org/rdf/v3/Security/VexJustificationType/vulnerableCodeNotInExecutePath"}
    {:rdfa/uri
     "https://spdx.org/rdf/v3/Security/VexJustificationType/vulnerableCodeNotPresent"}
    {:rdfa/uri
     "https://spdx.org/rdf/v3/Security/VexJustificationType/inlineMitigationsAlreadyExist"}],
   :rdf/type :owl/Class,
   :rdfs/comment
   "VexJustificationType specifies the type of Vulnerability Exploitability eXchange (VEX) justification.",
   :vs/term_status "Stable"})

(def VexNotAffectedVulnAssessmentRelationship
  "VexNotAffectedVulnAssessmentRelationship connects a vulnerability and a number\nof elements designating them as products not affected by the vulnerability.\nThis relationship corresponds to the VEX not_affected status.\n\n**Constraints**\n\nWhen linking elements using a VexNotVulnAffectedAssessmentRelationship, the\nfollowing requirements must be observed:\n\n* Relating elements with a VexNotAffectedVulnAssessmentRelationship is restricted\nto the doesNotAffect relationship type.\n* The from: end of the relationship must be a /Security/Vulnerability classed\nelement.\n* Both impactStatement and justificationType properties have a cardinality of\n0..1 making them optional. Nevertheless, to produce a valid VEX not_affected\nstatement, one of them MUST be defined. This is specified in the Minimum Elements\nfor VEX.\n\n**Syntax**\n\n```json\n{\n  \"@type\": \"VexNotAffectedVulnAssessmentRelationship\",\n  \"@id\": \"urn:spdx.dev:vex-not-affected-1\",\n  \"relationshipType\": \"doesNotAffect\",\n  \"from\": \"urn:spdx.dev:vuln-cve-2020-28498\",\n  \"to\": [\"urn:product-acme-application-1.3\"],\n  \"assessedElement\": \"urn:npm-elliptic-6.5.2\",\n  \"justificationType\": \"componentNotPresent\",\n  \"impactStatement\": \"Not using this vulnerable part of this library.\",\n  \"suppliedBy\": [\"urn:spdx.dev:agent-jane-doe\"],\n  \"publishedTime\": \"2021-03-09T11:04:53Z\"\n}\n```"
  {:db/ident :spdx-security/VexNotAffectedVulnAssessmentRelationship,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "VexNotAffectedVulnAssessmentRelationship connects a vulnerability and a number\nof elements designating them as products not affected by the vulnerability.\nThis relationship corresponds to the VEX not_affected status.\n\n**Constraints**\n\nWhen linking elements using a VexNotVulnAffectedAssessmentRelationship, the\nfollowing requirements must be observed:\n\n* Relating elements with a VexNotAffectedVulnAssessmentRelationship is restricted\nto the doesNotAffect relationship type.\n* The from: end of the relationship must be a /Security/Vulnerability classed\nelement.\n* Both impactStatement and justificationType properties have a cardinality of\n0..1 making them optional. Nevertheless, to produce a valid VEX not_affected\nstatement, one of them MUST be defined. This is specified in the Minimum Elements\nfor VEX.\n\n**Syntax**\n\n```json\n{\n  \"@type\": \"VexNotAffectedVulnAssessmentRelationship\",\n  \"@id\": \"urn:spdx.dev:vex-not-affected-1\",\n  \"relationshipType\": \"doesNotAffect\",\n  \"from\": \"urn:spdx.dev:vuln-cve-2020-28498\",\n  \"to\": [\"urn:product-acme-application-1.3\"],\n  \"assessedElement\": \"urn:npm-elliptic-6.5.2\",\n  \"justificationType\": \"componentNotPresent\",\n  \"impactStatement\": \"Not using this vulnerable part of this library.\",\n  \"suppliedBy\": [\"urn:spdx.dev:agent-jane-doe\"],\n  \"publishedTime\": \"2021-03-09T11:04:53Z\"\n}\n```",
   :rdfs/subClassOf [:spdx-security/VexVulnAssessmentRelationship
                     :spdx-core/Element
                     :spdx-security/VulnAssessmentRelationship
                     :spdx-core/Relationship],
   :sh/property [{:sh/datatype :xsd/string,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "impactStatement",
                  :sh/path     :spdx-security/impactStatement}
                 {:sh/class    :spdx-security/VexJustificationType,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "justificationType",
                  :sh/path     :spdx-security/justificationType}
                 {:sh/datatype :spdx-core/DateTime,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "impactStatementTime",
                  :sh/path     :spdx-security/impactStatementTime}],
   :vs/term_status "Stable"})

(def VexUnderInvestigationVulnAssessmentRelationship
  "VexUnderInvestigationVulnAssessmentRelationship links a vulnerability to a\nnumber of products stating the vulnerability's impact on them is being\ninvestigated. It represents the VEX under_investigation status.\n\n**Constraints**\n\nWhen linking elements using a VexUnderInvestigationVulnAssessmentRelationship\nthe following requirements must be observed:\n\n- Elements linked with a VexUnderInvestigationVulnAssessmentRelationship are\nconstrained to using the underInvestigationFor relationship type.\n- The from: end of the relationship must ve a /Security/Vulnerability classed\nelement.\n\n**Syntax**\n\n```json\n{\n  \"@type\": \"VexUnderInvestigationVulnAssessmentRelationship\",\n  \"@id\": \"urn:spdx.dev:vex-underInvestigation-1\",\n  \"relationshipType\": \"underInvestigationFor\",\n  \"from\": \"urn:spdx.dev:vuln-cve-2020-28498\",\n  \"to\": [\"urn:product-acme-application-1.3\"],\n  \"assessedElement\": \"urn:npm-elliptic-6.5.2\",\n  \"suppliedBy\": [\"urn:spdx.dev:agent-jane-doe\"],\n  \"publishedTime\": \"2021-03-09T11:04:53Z\"\n}\n```"
  {:db/ident :spdx-security/VexUnderInvestigationVulnAssessmentRelationship,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "VexUnderInvestigationVulnAssessmentRelationship links a vulnerability to a\nnumber of products stating the vulnerability's impact on them is being\ninvestigated. It represents the VEX under_investigation status.\n\n**Constraints**\n\nWhen linking elements using a VexUnderInvestigationVulnAssessmentRelationship\nthe following requirements must be observed:\n\n- Elements linked with a VexUnderInvestigationVulnAssessmentRelationship are\nconstrained to using the underInvestigationFor relationship type.\n- The from: end of the relationship must ve a /Security/Vulnerability classed\nelement.\n\n**Syntax**\n\n```json\n{\n  \"@type\": \"VexUnderInvestigationVulnAssessmentRelationship\",\n  \"@id\": \"urn:spdx.dev:vex-underInvestigation-1\",\n  \"relationshipType\": \"underInvestigationFor\",\n  \"from\": \"urn:spdx.dev:vuln-cve-2020-28498\",\n  \"to\": [\"urn:product-acme-application-1.3\"],\n  \"assessedElement\": \"urn:npm-elliptic-6.5.2\",\n  \"suppliedBy\": [\"urn:spdx.dev:agent-jane-doe\"],\n  \"publishedTime\": \"2021-03-09T11:04:53Z\"\n}\n```",
   :rdfs/subClassOf [:spdx-security/VexVulnAssessmentRelationship
                     :spdx-core/Element
                     :spdx-security/VulnAssessmentRelationship
                     :spdx-core/Relationship],
   :vs/term_status "Stable"})

(def VexVulnAssessmentRelationship
  "VexVulnAssessmentRelationship is an abstract subclass that defined the common\nproperties shared by all the SPDX-VEX status relationships. \n\n**Constraints**\n\nWhen linking elements using a VexVulnAssessmentRelationship, the following\nrequirements must be observed:\n\n- The from: end must be a /Security/Vulnerability classed element\n- The to: end must point to elements representing the VEX _products_. To\nspecify a different element where the vulnerability was detected, the VEX\nrelationship can optionally specify _subcomponents_ using the assessedElement\nproperty.\n\nVEX inherits information from the document level down to its statements. When a\nstatement is missing information it can be completed by reading the equivalent \nfield from the containing document. For example, if a VEX relationship is\nmissing data in its createdBy property, tools must consider the entity\nlisted in the CreationInfo section of the document as the VEX author.\nIn the same way, when a VEX relationship does not have a created property,\nthe document's date must be considered as authoritative."
  {:db/ident :spdx-security/VexVulnAssessmentRelationship,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "VexVulnAssessmentRelationship is an abstract subclass that defined the common\nproperties shared by all the SPDX-VEX status relationships. \n\n**Constraints**\n\nWhen linking elements using a VexVulnAssessmentRelationship, the following\nrequirements must be observed:\n\n- The from: end must be a /Security/Vulnerability classed element\n- The to: end must point to elements representing the VEX _products_. To\nspecify a different element where the vulnerability was detected, the VEX\nrelationship can optionally specify _subcomponents_ using the assessedElement\nproperty.\n\nVEX inherits information from the document level down to its statements. When a\nstatement is missing information it can be completed by reading the equivalent \nfield from the containing document. For example, if a VEX relationship is\nmissing data in its createdBy property, tools must consider the entity\nlisted in the CreationInfo section of the document as the VEX author.\nIn the same way, when a VEX relationship does not have a created property,\nthe document's date must be considered as authoritative.",
   :rdfs/subClassOf [:spdx-security/VulnAssessmentRelationship
                     :spdx-core/Element
                     :spdx-core/Relationship],
   :sh/property [{:sh/datatype :xsd/string,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "statusNotes",
                  :sh/path     :spdx-security/statusNotes}
                 {:sh/datatype :xsd/string,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "vexVersion",
                  :sh/path     :spdx-security/vexVersion}],
   :vs/term_status "Stable"})

(def VulnAssessmentRelationship
  "VulnAssessmentRelationship is the ancestor class common to all vulnerability\nassessment relationships. It factors out the common properties shared by them.\nExternal property restriction on /Core/Relationship/to: minCount: 1"
  {:db/ident :spdx-security/VulnAssessmentRelationship,
   :rdf/type [:owl/Class :sh/NodeShape],
   :rdfs/comment
   "VulnAssessmentRelationship is the ancestor class common to all vulnerability\nassessment relationships. It factors out the common properties shared by them.\nExternal property restriction on /Core/Relationship/to: minCount: 1",
   :rdfs/subClassOf [:spdx-core/Relationship :spdx-core/Element],
   :sh/property [{:sh/datatype :spdx-core/DateTime,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "withdrawnTime",
                  :sh/path     :spdx-security/withdrawnTime}
                 {:sh/class    :spdx-core/Agent,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "suppliedBy",
                  :sh/path     :spdx-security/suppliedBy}
                 {:sh/class    :spdx-core/Element,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "assessedElement",
                  :sh/path     :spdx-security/assessedElement}
                 {:sh/datatype :spdx-core/DateTime,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "publishedTime",
                  :sh/path     :spdx-security/publishedTime}
                 {:sh/datatype :spdx-core/DateTime,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "modifiedTime",
                  :sh/path     :spdx-security/modifiedTime}],
   :vs/term_status "Stable"})

(def Vulnerability
  "Specifies a vulnerability and its associated information.\n\n**Syntax**\n\n```json\n{\n  \"@type\": \"Vulnerability\",\n  \"@id\": \"urn:spdx.dev:vuln-1\",\n  \"summary\": \"Use of a Broken or Risky Cryptographic Algorithm\",\n  \"description\": \"The npm package `elliptic` before version 6.5.4 are vulnerable to Cryptographic Issues via the secp256k1 implementation in elliptic/ec/key.js. There is no check to confirm that the public key point passed into the derive function actually exists on the secp256k1 curve. This results in the potential for the private key used in this implementation to be revealed after a number of ECDH operations are performed.\",      \n  \"modified\": \"2021-03-08T16:02:43Z\",\n  \"published\": \"2021-03-08T16:06:50Z\",\n  \"externalIdentifiers\": [\n    {\n      \"@type\": \"ExternalIdentifier\",\n      \"externalIdentifierType\": \"cve\",\n      \"identifier\": \"CVE-2020-2849\",\n      \"identifierLocator\": [\n        \"https://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2020-28498\",\n        \"https://www.cve.org/CVERecord?id=CVE-2020-28498\"\n      ],\n      \"issuingAuthority\": \"urn:spdx.dev:agent-cve.org\"\n    },\n    {\n      \"type\": \"ExternalIdentifier\",\n      \"externalIdentifierType\": \"securityOther\",\n      \"identifier\": \"GHSA-r9p9-mrjm-926w\",\n      \"identifierLocator\": \"https://github.com/advisories/GHSA-r9p9-mrjm-926w\"\n    },\n    {\n      \"type\": \"ExternalIdentifier\",\n      \"externalIdentifierType\": \"securityOther\",\n      \"identifier\": \"SNYK-JS-ELLIPTIC-1064899\",\n      \"identifierLocator\": \"https://security.snyk.io/vuln/SNYK-JS-ELLIPTIC-1064899\"\n    }\n  ],\n  \"externalReferences\": [\n    {\n        \"@type\": \"ExternalReference\",\n        \"externalReferenceType\": \"securityAdvisory\",\n        \"locator\": \"https://nvd.nist.gov/vuln/detail/CVE-2020-28498\"\n    },\n    {\n      \"@type\": \"ExternalReference\",\n      \"externalReferenceType\": \"securityAdvisory\",\n      \"locator\": \"https://ubuntu.com/security/CVE-2020-28498\"\n    },\n    {\n      \"@type\": \"ExternalReference\",\n      \"externalReferenceType\": \"securityOther\",\n      \"locator\": \"https://github.com/indutny/elliptic/pull/244/commits\"\n    },\n    {\n      \"@type\": \"ExternalReference\",\n      \"externalReferenceType\": \"securityOther\",\n      \"locator\": \"https://github.com/christianlundkvist/blog/blob/master/2020_05_26_secp256k1_twist_attacks/secp256k1_twist_attacks.md\"\n    }\n  ]\n},\n{\n  \"@type\": \"Relationship\",\n  \"@id\": \"urn:spdx.dev:vulnRelationship-1\",\n  \"relationshipType\": \"hasAssociatedVulnerability\",\n  \"from\": \"urn:npm-elliptic-6.5.2\",\n  \"to\": [\"urn:spdx.dev:vuln-1\"],\n  \"startTime\": \"2021-03-08T16:06:50Z\"\n},\n{\n  \"@type\": \"Relationship\",\n  \"@id\": \"urn:spdx.dev:vulnAgentRel-1\",  \n  \"relationshipType\": \"publishedBy\",  \n  \"from\": \"urn:spdx.dev:vuln-1\",\n  \"to\": [\"urn:spdx.dev:agent-snyk\"],\n  \"startTime\": \"2021-03-08T16:06:50Z\"\n}\n```"
  {:db/ident :spdx-security/Vulnerability,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "Specifies a vulnerability and its associated information.\n\n**Syntax**\n\n```json\n{\n  \"@type\": \"Vulnerability\",\n  \"@id\": \"urn:spdx.dev:vuln-1\",\n  \"summary\": \"Use of a Broken or Risky Cryptographic Algorithm\",\n  \"description\": \"The npm package `elliptic` before version 6.5.4 are vulnerable to Cryptographic Issues via the secp256k1 implementation in elliptic/ec/key.js. There is no check to confirm that the public key point passed into the derive function actually exists on the secp256k1 curve. This results in the potential for the private key used in this implementation to be revealed after a number of ECDH operations are performed.\",      \n  \"modified\": \"2021-03-08T16:02:43Z\",\n  \"published\": \"2021-03-08T16:06:50Z\",\n  \"externalIdentifiers\": [\n    {\n      \"@type\": \"ExternalIdentifier\",\n      \"externalIdentifierType\": \"cve\",\n      \"identifier\": \"CVE-2020-2849\",\n      \"identifierLocator\": [\n        \"https://cve.mitre.org/cgi-bin/cvename.cgi?name=CVE-2020-28498\",\n        \"https://www.cve.org/CVERecord?id=CVE-2020-28498\"\n      ],\n      \"issuingAuthority\": \"urn:spdx.dev:agent-cve.org\"\n    },\n    {\n      \"type\": \"ExternalIdentifier\",\n      \"externalIdentifierType\": \"securityOther\",\n      \"identifier\": \"GHSA-r9p9-mrjm-926w\",\n      \"identifierLocator\": \"https://github.com/advisories/GHSA-r9p9-mrjm-926w\"\n    },\n    {\n      \"type\": \"ExternalIdentifier\",\n      \"externalIdentifierType\": \"securityOther\",\n      \"identifier\": \"SNYK-JS-ELLIPTIC-1064899\",\n      \"identifierLocator\": \"https://security.snyk.io/vuln/SNYK-JS-ELLIPTIC-1064899\"\n    }\n  ],\n  \"externalReferences\": [\n    {\n        \"@type\": \"ExternalReference\",\n        \"externalReferenceType\": \"securityAdvisory\",\n        \"locator\": \"https://nvd.nist.gov/vuln/detail/CVE-2020-28498\"\n    },\n    {\n      \"@type\": \"ExternalReference\",\n      \"externalReferenceType\": \"securityAdvisory\",\n      \"locator\": \"https://ubuntu.com/security/CVE-2020-28498\"\n    },\n    {\n      \"@type\": \"ExternalReference\",\n      \"externalReferenceType\": \"securityOther\",\n      \"locator\": \"https://github.com/indutny/elliptic/pull/244/commits\"\n    },\n    {\n      \"@type\": \"ExternalReference\",\n      \"externalReferenceType\": \"securityOther\",\n      \"locator\": \"https://github.com/christianlundkvist/blog/blob/master/2020_05_26_secp256k1_twist_attacks/secp256k1_twist_attacks.md\"\n    }\n  ]\n},\n{\n  \"@type\": \"Relationship\",\n  \"@id\": \"urn:spdx.dev:vulnRelationship-1\",\n  \"relationshipType\": \"hasAssociatedVulnerability\",\n  \"from\": \"urn:npm-elliptic-6.5.2\",\n  \"to\": [\"urn:spdx.dev:vuln-1\"],\n  \"startTime\": \"2021-03-08T16:06:50Z\"\n},\n{\n  \"@type\": \"Relationship\",\n  \"@id\": \"urn:spdx.dev:vulnAgentRel-1\",  \n  \"relationshipType\": \"publishedBy\",  \n  \"from\": \"urn:spdx.dev:vuln-1\",\n  \"to\": [\"urn:spdx.dev:agent-snyk\"],\n  \"startTime\": \"2021-03-08T16:06:50Z\"\n}\n```",
   :rdfs/subClassOf :spdx-core/Element,
   :sh/property [{:sh/datatype :spdx-core/DateTime,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "publishedTime",
                  :sh/path     :spdx-security/publishedTime}
                 {:sh/datatype :spdx-core/DateTime,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "modifiedTime",
                  :sh/path     :spdx-security/modifiedTime}
                 {:sh/datatype :spdx-core/DateTime,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "withdrawnTime",
                  :sh/path     :spdx-security/withdrawnTime}],
   :vs/term_status "Stable"})

(def actionStatement
  "When an element is referenced with a VexAffectedVulnAssessmentRelationship,\nthe relationship MUST include one actionStatement that SHOULD describe actions\nto remediate or mitigate the vulnerability."
  {:db/ident :spdx-security/actionStatement,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "When an element is referenced with a VexAffectedVulnAssessmentRelationship,\nthe relationship MUST include one actionStatement that SHOULD describe actions\nto remediate or mitigate the vulnerability.",
   :rdfs/domain :spdx-security/VexAffectedVulnAssessmentRelationship,
   :rdfs/range :xsd/string,
   :vs/term_status "Stable"})

(def actionStatementTime
  "When a VEX statement communicates an affected status, the author MUST\ninclude an action statement with a recommended action to help mitigate the\nvulnerability's impact. The actionStatementTime property records the time\nwhen the action statement was first communicated."
  {:db/ident :spdx-security/actionStatementTime,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "When a VEX statement communicates an affected status, the author MUST\ninclude an action statement with a recommended action to help mitigate the\nvulnerability's impact. The actionStatementTime property records the time\nwhen the action statement was first communicated.",
   :rdfs/domain :spdx-security/VexAffectedVulnAssessmentRelationship,
   :rdfs/range :spdx-core/DateTime,
   :vs/term_status "Stable"})

(def assessedElement
  "Specifies subpackages, files or snippets referenced by a security assessment\nto specify the precise location where a vulnerability was found."
  {:db/ident :spdx-security/assessedElement,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Specifies subpackages, files or snippets referenced by a security assessment\nto specify the precise location where a vulnerability was found.",
   :rdfs/domain :spdx-security/VulnAssessmentRelationship,
   :rdfs/range :spdx-core/Element,
   :vs/term_status "Stable"})

(def catalogType
  "A catalogType is a mandatory value and must select one of the two entries in the `ExploitCatalogType.md` vocabulary."
  {:db/ident :spdx-security/catalogType,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A catalogType is a mandatory value and must select one of the two entries in the `ExploitCatalogType.md` vocabulary.",
   :rdfs/domain :spdx-security/ExploitCatalogVulnAssessmentRelationship,
   :rdfs/range :spdx-security/ExploitCatalogType,
   :vs/term_status "Stable"})

(def decisionType
  "A decisionType is a mandatory value and must select one of the four entries in the `SsvcDecisionType.md` vocabulary."
  {:db/ident :spdx-security/decisionType,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A decisionType is a mandatory value and must select one of the four entries in the `SsvcDecisionType.md` vocabulary.",
   :rdfs/domain :spdx-security/SsvcVulnAssessmentRelationship,
   :rdfs/range :spdx-security/SsvcDecisionType,
   :vs/term_status "Stable"})

(def exploited
  "This field is set when a CVE is listed in an exploit catalog."
  {:db/ident :spdx-security/exploited,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "This field is set when a CVE is listed in an exploit catalog.",
   :rdfs/domain :spdx-security/ExploitCatalogVulnAssessmentRelationship,
   :rdfs/range :xsd/boolean,
   :vs/term_status "Stable"})

(def impactStatement
  "When a VEX product element is related with a VexNotAffectedVulnAssessmentRelationship\nand a machine readable justification label is not provided, then an impactStatement\nthat further explains how or why the prouct(s) are not affected by the vulnerability\nmust be provided."
  {:db/ident :spdx-security/impactStatement,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "When a VEX product element is related with a VexNotAffectedVulnAssessmentRelationship\nand a machine readable justification label is not provided, then an impactStatement\nthat further explains how or why the prouct(s) are not affected by the vulnerability\nmust be provided.",
   :rdfs/domain :spdx-security/VexNotAffectedVulnAssessmentRelationship,
   :rdfs/range :xsd/string,
   :vs/term_status "Stable"})

(def impactStatementTime
  "TODO"
  {:db/ident       :spdx-security/impactStatementTime,
   :rdf/type       :owl/DatatypeProperty,
   :rdfs/comment   "TODO",
   :rdfs/domain    :spdx-security/VexNotAffectedVulnAssessmentRelationship,
   :rdfs/range     :spdx-core/DateTime,
   :vs/term_status "Stable"})

(def justificationType
  "When stating that an element is not affected by a vulnerability, the\nVexNotAffectedVulnAssessmentRelationship must include a justification from the\nmachine-readable labels catalog informing the reason the element is not impacted.\n\nimpactStatement which is a string with English prose can be used instead or as\ncomplementary to the justification label, but one of both MUST be defined."
  {:db/ident :spdx-security/justificationType,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "When stating that an element is not affected by a vulnerability, the\nVexNotAffectedVulnAssessmentRelationship must include a justification from the\nmachine-readable labels catalog informing the reason the element is not impacted.\n\nimpactStatement which is a string with English prose can be used instead or as\ncomplementary to the justification label, but one of both MUST be defined.",
   :rdfs/domain :spdx-security/VexNotAffectedVulnAssessmentRelationship,
   :rdfs/range :spdx-security/VexJustificationType,
   :vs/term_status "Stable"})

(def locator
  "A locator provides the location of an exploit catalog."
  {:db/ident       :spdx-security/locator,
   :rdf/type       :owl/DatatypeProperty,
   :rdfs/comment   "A locator provides the location of an exploit catalog.",
   :rdfs/domain    :spdx-security/ExploitCatalogVulnAssessmentRelationship,
   :rdfs/range     :xsd/anyURI,
   :vs/term_status "Stable"})

(def modifiedTime
  "Specifies a time when a vulnerability assessment was last modified."
  {:db/ident :spdx-security/modifiedTime,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Specifies a time when a vulnerability assessment was last modified.",
   :rdfs/range :spdx-core/DateTime,
   :sh/or [{:rdfs/domain [:spdx-security/Vulnerability
                          :spdx-security/VulnAssessmentRelationship]}],
   :vs/term_status "Stable"})

(def probability
  "The probability score between 0 and 1 (0 and 100%) estimating the likelihood\nthat a vulnerability will be exploited in the next 12 months."
  {:db/ident :spdx-security/probability,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "The probability score between 0 and 1 (0 and 100%) estimating the likelihood\nthat a vulnerability will be exploited in the next 12 months.",
   :rdfs/domain :spdx-security/EpssVulnAssessmentRelationship,
   :rdfs/range :xsd/decimal,
   :vs/term_status "Stable"})

(def publishedTime
  "Specifies the time when a vulnerability was first published."
  {:db/ident :spdx-security/publishedTime,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment "Specifies the time when a vulnerability was first published.",
   :rdfs/range :spdx-core/DateTime,
   :sh/or [{:rdfs/domain [:spdx-security/Vulnerability
                          :spdx-security/VulnAssessmentRelationship]}],
   :vs/term_status "Stable"})

(def score
  "The score provides information on the severity of a vulnerability per the\nCommon Vulnerability Scoring System as defined on [https://www.first.org/cvss](https://www.first.org/cvss/)."
  {:db/ident :spdx-security/score,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "The score provides information on the severity of a vulnerability per the\nCommon Vulnerability Scoring System as defined on [https://www.first.org/cvss](https://www.first.org/cvss/).",
   :rdfs/range :xsd/string,
   :sh/or [{:rdfs/domain [:spdx-security/CvssV3VulnAssessmentRelationship
                          :spdx-security/CvssV2VulnAssessmentRelationship]}],
   :vs/term_status "Stable"})

(def severity
  "The severity field provides a human readable string, a label that can be used\nas an English adjective that qualifies its numerical score."
  {:db/ident :spdx-security/severity,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "The severity field provides a human readable string, a label that can be used\nas an English adjective that qualifies its numerical score.",
   :rdfs/range :xsd/string,
   :sh/or [{:rdfs/domain [:spdx-security/EpssVulnAssessmentRelationship
                          :spdx-security/CvssV3VulnAssessmentRelationship
                          :spdx-security/CvssV2VulnAssessmentRelationship]}],
   :vs/term_status "Stable"})

(def statusNotes
  "TODO"
  {:db/ident       :spdx-security/statusNotes,
   :rdf/type       :owl/DatatypeProperty,
   :rdfs/comment   "TODO",
   :rdfs/domain    :spdx-security/VexVulnAssessmentRelationship,
   :rdfs/range     :xsd/string,
   :vs/term_status "Stable"})

(def suppliedBy
  "Identify the actual distribution source for the vulnerability assessment relationship being referenced."
  {:db/ident :spdx-security/suppliedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Identify the actual distribution source for the vulnerability assessment relationship being referenced.",
   :rdfs/domain :spdx-security/VulnAssessmentRelationship,
   :rdfs/range :spdx-core/Agent,
   :vs/term_status "Stable"})

(def vector
  "Sepcifies the vector string of a vulnerability, a string combining metrics\nfrom an assessment of its severity."
  {:db/ident :spdx-security/vector,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Sepcifies the vector string of a vulnerability, a string combining metrics\nfrom an assessment of its severity.",
   :rdfs/range :xsd/string,
   :sh/or [{:rdfs/domain [:spdx-security/CvssV3VulnAssessmentRelationship
                          :spdx-security/CvssV2VulnAssessmentRelationship]}],
   :vs/term_status "Stable"})

(def vexVersion
  "TODO"
  {:db/ident       :spdx-security/vexVersion,
   :rdf/type       :owl/DatatypeProperty,
   :rdfs/comment   "TODO",
   :rdfs/domain    :spdx-security/VexVulnAssessmentRelationship,
   :rdfs/range     :xsd/string,
   :vs/term_status "Stable"})

(def withdrawnTime
  "Specified the time and date when a vulnerability was withdrawn."
  {:db/ident :spdx-security/withdrawnTime,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Specified the time and date when a vulnerability was withdrawn.",
   :rdfs/range :spdx-core/DateTime,
   :sh/or [{:rdfs/domain [:spdx-security/Vulnerability
                          :spdx-security/VulnAssessmentRelationship]}],
   :vs/term_status "Stable"})