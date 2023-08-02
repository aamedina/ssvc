(ns net.wikipunk.rdf.openvex
  "OpenVEX is a data model for exchanging vulnerability information between software supply chain participants."
  {:dcat/downloadURL "resources/vex/openvex.ttl",
   :owl/imports [{:rdfa/uri "https://spdx.org/rdf/v3/Software/"}
                 {:rdfa/uri "https://spdx.org/rdf/v3/Security/"}
                 {:rdfa/uri "https://spdx.org/rdf/v3/Core/"}],
   :owl/versionIRI {:rdfa/uri "https://openvex.dev/ns/v1"},
   :owl/versionInfo "0.0.2",
   :rdf/ns-prefix-map {"dcterms" "http://purl.org/dc/terms/",
                       "openvex" "https://openvex.dev/ns/v1#",
                       "owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "spdx-core" "https://spdx.org/rdf/v3/Core/",
                       "spdx-security" "https://spdx.org/rdf/v3/Security/",
                       "spdx-software" "https://spdx.org/rdf/v3/Software/",
                       "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "openvex",
   :rdfa/uri "https://openvex.dev/ns/v1#",
   :rdfs/comment
   "OpenVEX is a data model for exchanging vulnerability information between software supply chain participants.",
   :rdfs/label "OpenVEX"})

(def Document
  "A data structure that groups together one or more VEX statements. A document MUST define a timestamp to express when it was issued."
  {:db/ident :openvex/Document,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A data structure that groups together one or more VEX statements. A document MUST define a timestamp to express when it was issued.",
   :rdfs/label "Document"})

(def Justification
  "When assessing risk, consumers of a `not_affected` software product can know why the vulnerability is not affected by reading the justification label associated with the VEX statement. These labels are predefined and machine-readable to enable automated uses such as deployment policies."
  {:db/ident :openvex/Justification,
   :owl/oneOf
   [:openvex/Justification-ComponentNotPresent
    :openvex/Justification-VulnerableCodeCannotBeControlledByAdversary
    :openvex/Justification-VulnerableCodeNotInExecutePath
    :openvex/Justification-VulnerableCodeNotPresent
    :openvex/Justification-InlineMitigationsAlreadyExist],
   :rdf/type :owl/Class,
   :rdfs/comment
   "When assessing risk, consumers of a `not_affected` software product can know why the vulnerability is not affected by reading the justification label associated with the VEX statement. These labels are predefined and machine-readable to enable automated uses such as deployment policies.",
   :rdfs/label "Justification"})

(def Justification-ComponentNotPresent
  "The product is not affected by the vulnerability because the component is not included. The status justification may be used to preemptively inform product users who are seeking to understand a vulnerability that is widespread, receiving a lot of attention, or is in similar products."
  {:db/ident :openvex/Justification-ComponentNotPresent,
   :owl/sameAs :spdx-security/VexJustificationType-ComponentNotPresent,
   :rdf/type [:openvex/Justification :owl/NamedIndividual],
   :rdfs/comment
   "The product is not affected by the vulnerability because the component is not included. The status justification may be used to preemptively inform product users who are seeking to understand a vulnerability that is widespread, receiving a lot of attention, or is in similar products.",
   :rdfs/label "component_not_present"})

(def Justification-InlineMitigationsAlreadyExist
  "The product includes built-in protections or features that prevent exploitation of the vulnerability. These built-in protections cannot be subverted by the attacker and cannot be configured or disabled by the user. These mitigations completely prevent exploitation based on known attack vectors. This justification could be difficult to prove conclusively. History is littered with examples of mitigation bypasses, typically involving minor modifications of existing exploit code."
  {:db/ident :openvex/Justification-InlineMitigationsAlreadyExist,
   :owl/sameAs
   :spdx-security/VexJustificationType-InlineMitigationsAlreadyExist,
   :rdf/type [:openvex/Justification :owl/NamedIndividual],
   :rdfs/comment
   "The product includes built-in protections or features that prevent exploitation of the vulnerability. These built-in protections cannot be subverted by the attacker and cannot be configured or disabled by the user. These mitigations completely prevent exploitation based on known attack vectors. This justification could be difficult to prove conclusively. History is littered with examples of mitigation bypasses, typically involving minor modifications of existing exploit code.",
   :rdfs/label "inline_mitigations_already_exist"})

(def Justification-VulnerableCodeCannotBeControlledByAdversary
  "The vulnerable code cannot be controlled by an attacker to exploit the vulnerability. This justification could  be difficult to prove conclusively."
  {:db/ident :openvex/Justification-VulnerableCodeCannotBeControlledByAdversary,
   :owl/sameAs
   :spdx-security/VexJustificationType-VulnerableCodeCannotBeControlledByAdversary,
   :rdf/type [:openvex/Justification :owl/NamedIndividual],
   :rdfs/comment
   "The vulnerable code cannot be controlled by an attacker to exploit the vulnerability. This justification could  be difficult to prove conclusively.",
   :rdfs/label "vulnerable_code_cannot_be_controlled_by_adversary"})

(def Justification-VulnerableCodeNotInExecutePath
  "The vulnerable code (likely in `subcomponents`) can not be executed as it is used by the product. Typically, this case occurs when the product includes the vulnerable `subcomponent` but does not call or use the vulnerable code."
  {:db/ident :openvex/Justification-VulnerableCodeNotInExecutePath,
   :owl/sameAs
   :spdx-security/VexJustificationType-VulnerableCodeNotInExecutePath,
   :rdf/type [:openvex/Justification :owl/NamedIndividual],
   :rdfs/comment
   "The vulnerable code (likely in `subcomponents`) can not be executed as it is used by the product. Typically, this case occurs when the product includes the vulnerable `subcomponent` but does not call or use the vulnerable code.",
   :rdfs/label "vulnerable_code_not_in_execute_path"})

(def Justification-VulnerableCodeNotPresent
  "The vulnerable component is included in artifact, but the vulnerable code is not present. Typically, this case occurs when source code is configured or built in a way that excluded the vulnerable code."
  {:db/ident :openvex/Justification-VulnerableCodeNotPresent,
   :owl/sameAs :spdx-security/VexJustificationType-VulnerableCodeNotPresent,
   :rdf/type [:openvex/Justification :owl/NamedIndividual],
   :rdfs/comment
   "The vulnerable component is included in artifact, but the vulnerable code is not present. Typically, this case occurs when source code is configured or built in a way that excluded the vulnerable code.",
   :rdfs/label "vulnerable_code_not_present"})

(def Product
  "A logical unit representing a piece of software. The concept is intentionally broad to allow for a wide variety of use cases but generally speaking, anything that can be described in a Software Bill of Materials (SBOM) can be thought of as a product."
  {:db/ident :openvex/Product,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A logical unit representing a piece of software. The concept is intentionally broad to allow for a wide variety of use cases but generally speaking, anything that can be described in a Software Bill of Materials (SBOM) can be thought of as a product.",
   :rdfs/label "Product",
   :rdfs/subClassOf :spdx-software/SoftwareArtifact})

(def Statement
  "An assertion made by the document's author about the impact a vulnerability has on one or more software products."
  {:db/ident :openvex/Statement,
   :rdf/type :owl/Class,
   :rdfs/comment
   "An assertion made by the document's author about the impact a vulnerability has on one or more software products.",
   :rdfs/label "Statement"})

(def Status
  "The known relationship a vulnerability has to a software product. The status expresses if the product is impacted by the vulnerability or not, if the authors are investigating it, or if it has already been fixed."
  {:db/ident :openvex/Status,
   :owl/oneOf [:openvex/Status-NotAffected
               :openvex/Status-UnderInvestigation
               :openvex/Status-Fixed
               :openvex/Status-Affected],
   :rdf/type :owl/Class,
   :rdfs/comment
   "The known relationship a vulnerability has to a software product. The status expresses if the product is impacted by the vulnerability or not, if the authors are investigating it, or if it has already been fixed.",
   :rdfs/label "Status",
   :rdfs/subClassOf :spdx-security/VexVulnAssessmentRelationship})

(def Status-Affected
  "Actions are recommended to remediate or address this vulnerability."
  {:db/ident :openvex/Status-Affected,
   :rdf/type [:openvex/Status
              :owl/NamedIndividual
              :owl/Class
              :spdx-security/VexVulnAssessmentRelationship],
   :rdfs/comment
   "Actions are recommended to remediate or address this vulnerability.",
   :rdfs/label "affected",
   :rdfs/subClassOf :spdx-security/VexAffectedVulnAssessmentRelationship})

(def Status-Fixed
  "These product versions contain a fix for the vulnerability."
  {:db/ident :openvex/Status-Fixed,
   :rdf/type [:openvex/Status
              :owl/NamedIndividual
              :owl/Class
              :spdx-security/VexVulnAssessmentRelationship],
   :rdfs/comment "These product versions contain a fix for the vulnerability.",
   :rdfs/label "fixed",
   :rdfs/subClassOf :spdx-security/VexFixedVulnAssessmentRelationship})

(def Status-NotAffected
  "No remediation is required regarding this vulnerability. A `not_affected` status required the addition of a `justification` to the statement."
  {:db/ident :openvex/Status-NotAffected,
   :rdf/type [:openvex/Status
              :owl/NamedIndividual
              :owl/Class
              :spdx-security/VexVulnAssessmentRelationship],
   :rdfs/comment
   "No remediation is required regarding this vulnerability. A `not_affected` status required the addition of a `justification` to the statement.",
   :rdfs/label "not_affected",
   :rdfs/subClassOf :spdx-security/VexNotAffectedVulnAssessmentRelationship})

(def Status-UnderInvestigation
  "It is not yet known whether these product versions are affected by the vulnerability. Updates should be provided in further VEX documents as knowledge evolves."
  {:db/ident :openvex/Status-UnderInvestigation,
   :rdf/type [:openvex/Status
              :owl/NamedIndividual
              :owl/Class
              :spdx-security/VexVulnAssessmentRelationship],
   :rdfs/comment
   "It is not yet known whether these product versions are affected by the vulnerability. Updates should be provided in further VEX documents as knowledge evolves.",
   :rdfs/label "under_investigation",
   :rdfs/subClassOf
   :spdx-security/VexUnderInvestigationVulnAssessmentRelationship})

(def Vulnerability
  "A cataloged defect in a software product. Documents SHOULD use global, well-known identifying schemas. For internal identifying schemes, the only requirement for a vulnerability to be listed in a VEX document is that it needs to have an ID string to address it. Public identifiers (such as CVE IDs) are the most common case, but private internal identifiers can be used if they are understood by all participants of the supply chain where the VEX metadata is expected to flow."
  {:db/ident :openvex/Vulnerability,
   :rdf/type :owl/Class,
   :rdfs/comment
   "A cataloged defect in a software product. Documents SHOULD use global, well-known identifying schemas. For internal identifying schemes, the only requirement for a vulnerability to be listed in a VEX document is that it needs to have an ID string to address it. Public identifiers (such as CVE IDs) are the most common case, but private internal identifiers can be used if they are understood by all participants of the supply chain where the VEX metadata is expected to flow.",
   :rdfs/label "Vulnerability",
   :rdfs/subClassOf :spdx-core/ExternalIdentifier})

(def author
  "Author is the identifier for the author of the VEX statement. This field should ideally be a machine readable identifier such as an IRI, email address, etc. `author` MUST be an individual or organization. `author` identity SHOULD be cryptographically associated with the signature of the VEX document or other exchange mechanism."
  {:db/ident :openvex/author,
   :owl/equivalentProperty :dcterms/creator,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Author is the identifier for the author of the VEX statement. This field should ideally be a machine readable identifier such as an IRI, email address, etc. `author` MUST be an individual or organization. `author` identity SHOULD be cryptographically associated with the signature of the VEX document or other exchange mechanism.",
   :rdfs/domain :openvex/Document,
   :rdfs/label "author"})

(def justification
  "For statements conveying a `not_affected` status, a VEX statement MUST include either a status justification or an impact_statement informing why the product is not affected by the vulnerability. Justifications are fixed labels defined by VEX."
  {:db/ident :openvex/justification,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "For statements conveying a `not_affected` status, a VEX statement MUST include either a status justification or an impact_statement informing why the product is not affected by the vulnerability. Justifications are fixed labels defined by VEX.",
   :rdfs/domain :openvex/Statement,
   :rdfs/label "justification",
   :rdfs/range :openvex/Justification})

(def lastUpdated
  "Timestamp when the statement was last updated."
  {:db/ident               :openvex/lastUpdated,
   :owl/equivalentProperty :dcterms/modified,
   :rdf/type               :owl/DatatypeProperty,
   :rdfs/comment           "Timestamp when the statement was last updated.",
   :rdfs/domain            :openvex/Statement,
   :rdfs/label             "last_updated",
   :rdfs/range             :xsd/dateTime})

(def product
  "Product identifiers that the statement applies to. Any software identifier can be used and SHOULD be traceable to a described item in an SBOM. The use of [Package URLs](https://github.com/package-url/purl-spec) (purls) is recommended. While a product identifier is required to have a complete statement, this field is optional as it can cascade down from the encapsulating document."
  {:db/ident :openvex/product,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Product identifiers that the statement applies to. Any software identifier can be used and SHOULD be traceable to a described item in an SBOM. The use of [Package URLs](https://github.com/package-url/purl-spec) (purls) is recommended. While a product identifier is required to have a complete statement, this field is optional as it can cascade down from the encapsulating document.",
   :rdfs/domain :openvex/Statement,
   :rdfs/label "product",
   :rdfs/range :openvex/Product})

(def role
  "Role describes the role of the document author."
  {:db/ident     :openvex/role,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment "Role describes the role of the document author.",
   :rdfs/domain  :openvex/Document,
   :rdfs/label   "role",
   :rdfs/range   :xsd/string})

(def statement
  "Relates a Document to one or more Statements."
  {:db/ident     :openvex/statement,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment "Relates a Document to one or more Statements.",
   :rdfs/domain  :openvex/Document,
   :rdfs/label   "statement",
   :rdfs/range   :openvex/Statement})

(def status
  "A VEX statement MUST provide the status of the vulnerabilities with respect to the products and components listed in the statement. `status` MUST be one of the labels defined by VEX."
  {:db/ident :openvex/status,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A VEX statement MUST provide the status of the vulnerabilities with respect to the products and components listed in the statement. `status` MUST be one of the labels defined by VEX.",
   :rdfs/domain :openvex/Statement,
   :rdfs/label "status",
   :rdfs/range :openvex/Status})

(def subcomponent
  "Identifiers of components where the vulnerability originates. While the statement asserts about the impact on the software product, listing `subcomponents` let scanners find identifiers to match their findings."
  {:db/ident :openvex/subcomponent,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Identifiers of components where the vulnerability originates. While the statement asserts about the impact on the software product, listing `subcomponents` let scanners find identifiers to match their findings.",
   :rdfs/domain :openvex/Statement,
   :rdfs/label "subcomponent",
   :rdfs/range :openvex/Product})

(def supplier
  "Supplier of the product or subcomponent."
  {:db/ident     :openvex/supplier,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment "Supplier of the product or subcomponent.",
   :rdfs/domain  :openvex/Statement,
   :rdfs/label   "supplier",
   :rdfs/range   :xsd/string})

(def timestamp
  "For documents, timestamp defines the time at which the document was issued. For Statements, timestamp is the time at which the information expressed in the Statement was known to be true. Cascades down from the document."
  {:db/ident :openvex/timestamp,
   :owl/equivalentProperty :dcterms/issued,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "For documents, timestamp defines the time at which the document was issued. For Statements, timestamp is the time at which the information expressed in the Statement was known to be true. Cascades down from the document.",
   :rdfs/domain {:owl/unionOf [:openvex/Document :openvex/Statement]},
   :rdfs/label "timestamp",
   :rdfs/range :xsd/dateTime})

(def tooling
  "Tooling expresses how the VEX document and contained VEX statements were generated. It may specify tools or automated processes used in the document or statement generation."
  {:db/ident :openvex/tooling,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Tooling expresses how the VEX document and contained VEX statements were generated. It may specify tools or automated processes used in the document or statement generation.",
   :rdfs/domain :openvex/Document,
   :rdfs/label "tooling",
   :rdfs/range :xsd/string})

(def version
  "Version is the document version. It must be incremented when any content within the VEX document changes, including any VEX statements included within the VEX document."
  {:db/ident :openvex/version,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Version is the document version. It must be incremented when any content within the VEX document changes, including any VEX statements included within the VEX document.",
   :rdfs/domain {:owl/unionOf [:openvex/Document :openvex/Statement]},
   :rdfs/label "version",
   :rdfs/range :xsd/nonNegativeInteger})

(def vulnDescription
  "Optional free-form text describing the vulnerability."
  {:db/ident     :openvex/vulnDescription,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment "Optional free-form text describing the vulnerability.",
   :rdfs/domain  :openvex/Statement,
   :rdfs/label   "vuln_description",
   :rdfs/range   :xsd/string})

(def vulnerability
  "Vulnerability SHOULD use existing and well known identifiers. For example: [CVE](https://cve.mitre.org/), [OSV](https://osv.dev/), [GHSA](https://github.com/advisories), a supplier's vulnerability tracking system such as [RHSA](https://access.redhat.com/security/security-updates/#/) or a propietary system. It is expected that vulnerability identification systems are external to and maintained separately from VEX.<br>`vulnerability` MAY be an IRI and MAY be arbitrary, created by the VEX document `author`. "
  {:db/ident :openvex/vulnerability,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Vulnerability SHOULD use existing and well known identifiers. For example: [CVE](https://cve.mitre.org/), [OSV](https://osv.dev/), [GHSA](https://github.com/advisories), a supplier's vulnerability tracking system such as [RHSA](https://access.redhat.com/security/security-updates/#/) or a propietary system. It is expected that vulnerability identification systems are external to and maintained separately from VEX.<br>`vulnerability` MAY be an IRI and MAY be arbitrary, created by the VEX document `author`. ",
   :rdfs/domain :openvex/Statement,
   :rdfs/label "vulnerability",
   :rdfs/range :openvex/Vulnerability})