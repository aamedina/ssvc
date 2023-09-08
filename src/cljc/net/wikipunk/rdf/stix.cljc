(ns net.wikipunk.rdf.stix
  ^{:base       "http://docs.oasis-open.org/cti/ns/stix#",
    :namespaces {"stix" "http://docs.oasis-open.org/cti/ns/stix#"},
    :prefix     "stix",
    :source     "resources/tac/stix.ttl"}
  {:owl/imports
   #{{:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/course-of-action"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/report"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/threat-actor"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/mac-address"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/incident"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/software"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/vocabulary"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/file"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/opinion"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/extension-definition"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/mutex"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/windows-registry"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/process"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/common-properties"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/vulnerability"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/ipv4-address"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/infrastructure"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/data-types"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/ipv6-address"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/network-traffic"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/url"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/domain-name"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/user-account"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/language-content"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/artifact"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/autonomous-system"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/intrusion-set"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/note"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/directory"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/bundle"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/email-message"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/relationship"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/x509-certificate"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/data-marking"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/location"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/indicator"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/identity"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/campaign"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/malware"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/relationship-types"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/observed-data"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/attack-pattern"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/sighting"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/email-address"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/grouping"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/tool"}},
   :owl/versionInfo "2.1.0",
   :rdf/type :owl/Ontology,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "This ontology is the master ontology for the STIX 2.1.0. It imports all the various STIX ontologies files to create an unified ontology based on the various component ontologies that make up STIX."},
   :xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix"}
  (:refer-clojure :exclude [comment count key name type]))

(def AccountTypeOv
  {:db/ident        :stix/AccountTypeOv,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :stix/StixOpenVocabulary})

(def AlternateDataStreamType
  {:db/ident :stix/AlternateDataStreamType,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The Alternate Data Stream type represents an NTFS alternate data stream."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "Alternate Data Stream Type"},
   :rdfs/subClassOf #{:stix/StixDatatype
                      {:owl/onProperty     :stix/size,
                       :owl/someValuesFrom :xsd/nonNegativeInteger,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/hashes,
                       :owl/someValuesFrom :stix/Hashes,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/name,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}}})

(def ArchiveExt
  {:db/ident :stix/ArchiveExt,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The Archive File extension specifies a default extension for capturing properties specific to archive files. The key for this extension when used in the extensions dictionary MUST be archive-ext. Note that this predefined extension does not use the extension facility described in section 7.3."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "Archive File Extension"},
   :rdfs/subClassOf #{{:owl/onProperty     :stix/contains_refs_string,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/comment,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/contains_refs,
                       :owl/someValuesFrom :stix/StixCyberObservable,
                       :rdf/type           :owl/Restriction} :stix/File}})

(def Artifact
  {:db/ident :stix/Artifact,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The Artifact object permits capturing an array of bytes (8-bits), as a base64-encoded string, or linking to a file-like payload. One of payload_bin or url MUST be provided. It is incumbent on object creators to ensure that the URL is accessible for downstream consumers."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "Artifact"},
   :rdfs/subClassOf #{:stix/StixCyberObservable
                      {:owl/onProperty     :stix/hashes,
                       :owl/someValuesFrom :stix/Hashes,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/payload_bin,
                       :owl/someValuesFrom :xsd/base64Binary,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/encryption_algorithm,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/url,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/mime_type,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/decryption_key,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}}})

(def AttackMotivationOv
  {:db/ident        :stix/AttackMotivationOv,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :stix/StixOpenVocabulary})

(def AttackPattern
  {:db/ident :stix/AttackPattern,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Attack Patterns are a type of TTP that describe ways that adversaries attempt to compromise targets. Attack Patterns are used to help categorize attacks, generalize specific attacks to the patterns that they follow, and provide detailed information about how attacks are performed. An example of an attack pattern is \"spear phishing\": a common type of attack where an attacker sends a carefully crafted e-mail message to a party with the intent of getting them to click a link or open an attachment to deliver malware. Attack Patterns can also be more specific; spear phishing as practiced by a particular threat actor (e.g., they might generally say that the target won a contest) can also be an Attack Pattern. The Attack Pattern SDO contains textual descriptions of the pattern along with references to externally-defined taxonomies of attacks such as CAPEC [CAPEC]."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "Attack Pattern"},
   :rdfs/subClassOf #{{:owl/onProperty     :stix/description,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/name,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/aliases,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      :stix/StixDomainObject}})

(def AttackResourceLevelOv
  {:db/ident        :stix/AttackResourceLevelOv,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :stix/StixOpenVocabulary})

(def AutonomousSystem
  {:db/ident :stix/AutonomousSystem,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "This object represents the properties of an Autonomous System (AS)."},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "AutonomousSystem"},
   :rdfs/subClassOf #{:stix/StixCyberObservable
                      {:owl/onProperty     :stix/name,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/rir,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/number,
                       :owl/someValuesFrom :xsd/positiveInteger,
                       :rdf/type           :owl/Restriction}}})

(def Bundle
  {:db/ident :stix/Bundle,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "A Bundle is a collection of arbitrary STIX Objects grouped together in a single container. A Bundle does not have any semantic meaning and the objects contained within the Bundle are not considered related by virtue of being in the same Bundle. \\n\\n A STIX Bundle Object is not a STIX Object but makes use of the type and id Common Properties. A Bundle is transient, and implementations SHOULD NOT assume that other implementations will treat it as a persistent object or keep any custom properties found on the bundle itself. \\n\\n The JSON MTI serialization uses the JSON Object type [RFC8259] when representing bundle."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "STIX Bundle Object"},
   :rdfs/subClassOf #{:owl/Thing
                      {:owl/onProperty     :stix/id_string,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/type,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/id,
                       :owl/someValuesFrom :stix/identifier,
                       :rdf/type           :owl/Restriction}}})

(def Campaign
  {:db/ident :stix/Campaign,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "A Campaign is a grouping of adversarial behaviors that describes a set of malicious activities or attacks (sometimes called waves) that occur over a period of time against a specific set of targets. Campaigns usually have well defined objectives and may be part of an Intrusion Set. Campaigns are often attributed to an intrusion set and threat actors. The threat actors may reuse known infrastructure from the intrusion set or may set up new infrastructure specific for conducting that campaign. Campaigns can be characterized by their objectives and the incidents they cause, people or resources they target, and the resources (infrastructure, intelligence, Malware, Tools, etc.) they use. For example, a Campaign could be used to describe a crime syndicate's attack using a specific variant of malware and new C2 servers against the executives of ACME Bank during the summer of 2016 in order to gain secret information about an upcoming merger with another bank.ey target, and the resources (infrastructure, intelligence, Malware, Tools, etc.) they use."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "Campaign"},
   :rdfs/subClassOf #{{:owl/onProperty     :stix/objective,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/description,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/name,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/first_seen,
                       :owl/someValuesFrom :xsd/dateTime,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/last_seen,
                       :owl/someValuesFrom :xsd/dateTime,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/aliases,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      :stix/StixDomainObject}})

(def CourseOfAction
  {:db/ident :stix/CourseOfAction,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Note: The Course of Action object in STIX 2.1 is a stub. It is included to support basic use cases (such as sharing prose courses of action) but does not support the ability to represent automated courses of action or contain properties to represent metadata about courses of action. Future STIX 2 releases will expand it to include these capabilities. A Course of Action is an action taken either to prevent an attack or to respond to an attack that is in progress. It may describe technical, automatable responses (applying patches, reconfiguring firewalls) but can also describe higher level actions like employee training or policy changes. For example, a course of action to mitigate a vulnerability could describe applying the patch that fixes it. The Course of Action SDO contains a textual description of the action; a reserved action property also serves as a placeholder for future inclusion of machine automatable courses of action."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "Course Of Action"},
   :rdfs/subClassOf #{{:owl/onProperty     :stix/description,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/name,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      :stix/StixDomainObject}})

(def Dictionary
  {:db/ident :stix/Dictionary,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "A dictionary captures an arbitrary set of key/value pairs. Dictionary keys MUST be unique in each dictionary, MUST be in ASCII, and are limited to the characters a-z (lowercase ASCII), A-Z (uppercase ASCII), numerals 0-9, hyphen (-), and underscore (_). Dictionary keys MUST be no longer than 250 ASCII characters in length and SHOULD be lowercase. \\n\\n Empty dictionaries are prohibited in STIX and MUST NOT be used as a substitute for omitting the property if it is optional. If the property is required, the dictionary MUST be present and MUST have at least one key-value pair. \\n\\n dictionary values MUST be valid property base types."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "Dictionary"},
   :rdfs/subClassOf #{:stix/StixDatatype
                      {:owl/onProperty     :stix/dictionary_key,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}}})

(def Directory
  {:db/ident :stix/Directory,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "The Directory object represents the properties common to a file system directory."},
   :rdfs/label "Directory Object",
   :rdfs/subClassOf #{{:owl/onProperty     :stix/path,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/mtime,
                       :owl/someValuesFrom :xsd/dateTime,
                       :rdf/type           :owl/Restriction}
                      :stix/StixCyberObservable
                      {:owl/onProperty     :stix/contains_refs_string,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/contains_refs,
                       :owl/someValuesFrom #{:stix/Directory :stix/File},
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/ctime,
                       :owl/someValuesFrom :xsd/dateTime,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/path_enc,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/atime,
                       :owl/someValuesFrom :xsd/dateTime,
                       :rdf/type           :owl/Restriction}}})

(def DomainName
  {:db/ident :stix/DomainName,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "The Domain Name object represents the properties of a network domain name."},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "Domain Name"},
   :rdfs/subClassOf #{{:owl/onProperty     :stix/resolves_to_refs,
                       :owl/someValuesFrom #{:stix/IPv4Address :stix/DomainName
                                             :stix/IPv6Address},
                       :rdf/type           :owl/Restriction}
                      :stix/StixCyberObservable
                      {:owl/onProperty     :stix/resolves_to_refs_string,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/value,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}}})

(def EmailAddress
  {:db/ident :stix/EmailAddress,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value "The Email Address object represents a single email address."},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "Email Address Object"},
   :rdfs/subClassOf #{:stix/StixCyberObservable
                      {:owl/onProperty     :stix/display_name,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/value,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/belongs_to_ref_string,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/belongs_to_ref,
                       :owl/someValuesFrom :stix/UserAccount,
                       :rdf/type           :owl/Restriction}}})

(def EmailMessage
  {:db/ident :stix/EmailMessage,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The Email Message object represents an instance of an email message, corresponding to the internet message format described in [RFC5322] and related RFCs. Header field values that have been encoded as described in section 2 of [RFC2047] MUST be decoded before inclusion in Email Message object properties. For example, this is some text MUST be used instead of =?iso-8859-1?q?this=20is=20some=20text?=. Any characters in the encoded value which cannot be decoded into Unicode SHOULD be replaced with the 'REPLACEMENT CHARACTER' (U+FFFD). If it is necessary to capture the header value as observed, this can be achieved by referencing an Artifact object through the raw_email_ref property."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "EmailMessage"},
   :rdfs/subClassOf #{{:owl/onProperty     :stix/sender_ref_string,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/raw_email_ref_string,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/from_ref,
                       :owl/someValuesFrom :stix/EmailAddress,
                       :rdf/type           :owl/Restriction}
                      :stix/StixCyberObservable
                      {:owl/onProperty     :stix/bcc_refs,
                       :owl/someValuesFrom :stix/EmailAddress,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/body,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/to_refs_string,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/is_multipart,
                       :owl/someValuesFrom :xsd/boolean,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/body_multipart,
                       :owl/someValuesFrom :stix/EmailMimePartType,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/subject,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/sender_ref,
                       :owl/someValuesFrom :stix/EmailAddress,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/cc_refs_string,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/additional_header_fields,
                       :owl/someValuesFrom :stix/Dictionary,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/to_refs,
                       :owl/someValuesFrom :stix/EmailAddress,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/content_type,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/date,
                       :owl/someValuesFrom :xsd/dateTime,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/received_lines,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/cc_refs,
                       :owl/someValuesFrom :stix/EmailAddress,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/message_id,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/from_ref_string,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/raw_email_ref,
                       :owl/someValuesFrom :stix/Artifact,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/bcc_refs_string,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}}})

(def EmailMimePartType
  {:db/ident :stix/EmailMimePartType,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies one component of a multi-part email body. There is no property to capture the value of the \"Content-Transfer-Encoding\" header field, since the body MUST be decoded before being represented in the body property. One of body OR body_raw_ref MUST be included."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "Email MIME Component Type"},
   :rdfs/subClassOf #{{:owl/onProperty     :stix/body_raw_ref,
                       :owl/someValuesFrom #{:stix/Artifact :stix/File},
                       :rdf/type           :owl/Restriction} :stix/StixDatatype
                      {:owl/onProperty     :stix/body,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/body_raw_ref_string,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/content_disposition,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/content_type,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}}})

(def EncryptionAlgorithmEnum
  {:db/ident        :stix/EncryptionAlgorithmEnum,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :stix/StixEnumeration})

(def ExtensionDefinition
  {:db/ident :stix/ExtensionDefinition,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The STIX Extension Definition object allows producers of threat intelligence to extend existing STIX objects or to create entirely new STIX objects in a standardized way. This object contains detailed information about the extension and any additional properties and or objects that it defines. This extension mechanism MUST NOT be used to redefine existing standardized objects or properties."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "Extension Definition"},
   :rdfs/subClassOf #{{:owl/onProperty     :stix/description,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/extension_properties,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/name,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/version,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      :stix/StixMetaObject
                      {:owl/onProperty     :stix/schema,
                       :owl/someValuesFrom :xsd/anyURI,
                       :rdf/type           :owl/Restriction}}})

(def ExtensionTypeEnum
  {:db/ident        :stix/ExtensionTypeEnum,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :stix/StixEnumeration})

(def ExternalReference
  {:db/ident :stix/ExternalReference,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "External references are used to describe pointers to information represented outside of STIX. For example, a Malware object could use an external reference to indicate an ID for that malware in an external database or a report could use references to represent source material. \\n\\n The JSON MTI serialization uses the JSON Object type [RFC8259] when representing external-reference."},
   :rdfs/label "External Reference",
   :rdfs/subClassOf #{:stix/StixDatatype
                      {:owl/onProperty     :stix/description,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/hashes,
                       :owl/someValuesFrom :stix/Hashes,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/external_id,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/url,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/source_name,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}}})

(def File
  {:db/ident :stix/File,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The File object represents the properties of a file. A File object MUST contain at least one of hashes or name."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "File"},
   :rdfs/subClassOf #{{:owl/onProperty     :stix/mtime,
                       :owl/someValuesFrom :xsd/dateTime,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/name_enc,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      :stix/StixCyberObservable
                      {:owl/onProperty     :stix/content_ref,
                       :owl/someValuesFrom :stix/Artifact,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/contains_refs_string,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/parent_directory_ref,
                       :owl/someValuesFrom :stix/Directory,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/size,
                       :owl/someValuesFrom :xsd/nonNegativeInteger,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/hashes,
                       :owl/someValuesFrom :stix/Hashes,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/name,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/magic_number_hex,
                       :owl/someValuesFrom :xsd/hexBinary,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/ctime,
                       :owl/someValuesFrom :xsd/dateTime,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/content_ref_string,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/mime_type,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/contains_refs,
                       :owl/someValuesFrom :stix/StixCyberObservable,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/atime,
                       :owl/someValuesFrom :xsd/dateTime,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/parent_directory_ref_string,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}}})

(def GranularMarking
  {:db/ident :stix/GranularMarking,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The granular-marking type defines how the marking-definition object referenced by the marking_ref property or a language specified by the lang property applies to a set of content identified by the list of selectors in the selectors property."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "Granular Marking Type"},
   :rdfs/subClassOf #{{:owl/onProperty     :stix/marking_ref_string,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction} :stix/StixDatatype
                      {:owl/onProperty     :stix/selectors,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/lang,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/marking_ref,
                       :owl/someValuesFrom :stix/MarkingDefinition,
                       :rdf/type           :owl/Restriction}}})

(def Grouping
  {:db/ident :stix/Grouping,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "A Grouping object explicitly asserts that the referenced STIX Objects have a shared context, unlike a STIX Bundle (which explicitly conveys no context). A Grouping object should not be confused with an intelligence product, which should be conveyed via a STIX Report. A STIX Grouping object might represent a set of data that, in time, given sufficient analysis, would mature to convey an incident or threat report as a STIX Report object. For example, a Grouping could be used to characterize an ongoing investigation into a security event or incident. A Grouping object could also be used to assert that the referenced STIX Objects are related to an ongoing analysis process, such as when a threat analyst is collaborating with others in their trust community to examine a series of Campaigns and Indicators. The Grouping SDO contains a list of references to SDOs, SCOs, SROs, and SMOs, along with an explicit statement of the context shared by the content, a textual description, and the name of the grouping."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "Grouping"},
   :rdfs/subClassOf #{{:owl/onProperty     :stix/object_refs_string,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/description,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/name,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/context,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      :stix/StixDomainObject}})

(def GroupingContextOv
  {:db/ident        :stix/GroupingContextOv,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :stix/StixOpenVocabulary})

(def HashAlgorithmOv
  {:db/ident        :stix/HashAlgorithmOv,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :stix/StixOpenVocabulary})

(def Hashes
  {:db/ident :stix/Hashes,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Represents a cryptographic hashes, as a special set of key/value pairs."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "Hash"},
   :rdfs/subClassOf #{:stix/StixDatatype
                      {:owl/onProperty     :stix/hash_algorithm,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/hash_value,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}}})

(def HttpRequestExt
  {:db/ident :stix/HttpRequestExt,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The HTTP request extension specifies a default extension for capturing network traffic properties specific to HTTP requests. The key for this extension when used in the extensions dictionary MUST be http-request-ext. Note that this predefined extension does not use the extension facility described in section 7.3. The corresponding protocol value for this extension is http."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "HTTP Request Extension"},
   :rdfs/subClassOf #{{:owl/onProperty     :stix/request_value,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/message_body_data_ref,
                       :owl/someValuesFrom :stix/Artifact,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/message_body_length,
                       :owl/someValuesFrom :xsd/integer,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/message_body_data_ref_string,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      :stix/NetworkTraffic
                      {:owl/onProperty     :stix/request_method,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/request_version,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}}})

(def IPv4Address
  {:db/ident :stix/IPv4Address,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "The IPv4 Address object represents one or more IPv4 addresses expressed using CIDR notation."},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "IPv4 Address Object"},
   :rdfs/subClassOf #{:stix/StixCyberObservable
                      {:owl/onProperty     :stix/resolves_to_refs,
                       :owl/someValuesFrom :stix/MACAddress,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/belongs_to_refs,
                       :owl/someValuesFrom :stix/AutonomousSystem,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/resolves_to_refs_string,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/belongs_to_refs_string,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/value,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}}})

(def IPv6Address
  {:db/ident :stix/IPv6Address,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "The IPv6 Address object represents one or more IPv6 addresses expressed using CIDR notation."},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "IPv6 Address Object"},
   :rdfs/subClassOf #{:stix/StixCyberObservable
                      {:owl/onProperty     :stix/resolves_to_refs,
                       :owl/someValuesFrom :stix/MACAddress,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/belongs_to_refs,
                       :owl/someValuesFrom :stix/AutonomousSystem,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/resolves_to_refs_string,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/belongs_to_refs_string,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/value,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}}})

(def IcmpExt
  {:db/ident :stix/IcmpExt,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The ICMP extension specifies a default extension for capturing network traffic properties specific to ICMP. The key for this extension when used in the extensions dictionary MUST be icmp-ext. Note that this predefined extension does not use the extension facility described in section 7.3. The corresponding protocol value for this extension is icmp."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "ICMP Extension"},
   :rdfs/subClassOf #{:stix/NetworkTraffic
                      {:owl/onProperty     :stix/icmp_code_hex,
                       :owl/someValuesFrom :xsd/hexBinary,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/icmp_type_hex,
                       :owl/someValuesFrom :xsd/hexBinary,
                       :rdf/type           :owl/Restriction}}})

(def Identity
  {:db/ident :stix/Identity,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Identities can represent actual individuals, organizations, or groups (e.g., ACME, Inc.) as well as classes of individuals, organizations, systems or groups (e.g., the finance sector). The Identity SDO can capture basic identifying information, contact information, and the sectors that the Identity belongs to. Identity is used in STIX to represent, among other things, targets of attacks, information sources, object creators, and threat actor identities."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "Identity"},
   :rdfs/subClassOf #{{:owl/onProperty     :stix/description,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/roles,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/identity_class,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/name,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/contact_information,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/sectors,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      :stix/StixDomainObject}})

(def IdentityClassOv
  {:db/ident        :stix/IdentityClassOv,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :stix/StixOpenVocabulary})

(def ImplementationLanguageOv
  {:db/ident        :stix/ImplementationLanguageOv,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :stix/StixOpenVocabulary})

(def Incident
  {:db/ident :stix/Incident,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Note: The Incident object in STIX 2.1 is a stub. It is included to support basic use cases but does not contain properties to represent metadata about incidents. Future STIX 2 releases will expand it to include these capabilities.  It is suggested that it is used as an extension point for an Incident object defined using the extension facility described in section 7.3."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "Incident"},
   :rdfs/subClassOf #{{:owl/onProperty     :stix/description,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/name,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      :stix/StixDomainObject}})

(def Indicator
  {:db/ident :stix/Indicator,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Indicators contain a pattern that can be used to detect suspicious or malicious cyber activity. For example, an Indicator may be used to represent a set of malicious domains and use the STIX Patterning Language (see section 9) to specify these domains. The Indicator SDO contains a simple textual description, the Kill Chain Phases that it detects behavior in, a time window for when the Indicator is valid or useful, and a required pattern property to capture a structured detection pattern. Conforming STIX implementations MUST support the STIX Patterning Language as defined in section 9. Relationships from the Indicator can describe the malicious or suspicious behavior that it directly detects (Malware, Tool, and Attack Pattern). In addition, it may also imply the presence of a Campaigns, Intrusion Sets, and Threat Actors, etc."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "Indicator"},
   :rdfs/subClassOf #{{:owl/onProperty     :stix/pattern,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/description,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/pattern_version,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/name,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/pattern_type,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/valid_until,
                       :owl/someValuesFrom :xsd/dateTime,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/valid_from,
                       :owl/someValuesFrom :xsd/dateTime,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/indicator_types,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      :stix/StixDomainObject}})

(def IndicatorTypeOv
  {:db/ident        :stix/IndicatorTypeOv,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :stix/StixOpenVocabulary})

(def IndustrySectorOv
  {:db/ident        :stix/IndustrySectorOv,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :stix/StixOpenVocabulary})

(def Infrastructure
  {:db/ident :stix/Infrastructure,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The Infrastructure SDO represents a type of TTP and describes any systems, software services and any associated physical or virtual resources intended to support some purpose (e.g., C2 servers used as part of an attack, device or server that are part of defense, database servers targeted by an attack, etc.). While elements of an attack can be represented by other SDOs or SCOs, the Infrastructure SDO represents a named group of related data that constitutes the infrastructure."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "Infrastructure"},
   :rdfs/subClassOf #{{:owl/onProperty     :stix/infrastructure_types,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/description,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/name,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/first_seen,
                       :owl/someValuesFrom :xsd/dateTime,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/last_seen,
                       :owl/someValuesFrom :xsd/dateTime,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/aliases,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      :stix/StixDomainObject}})

(def InfrastructureTypeOv
  {:db/ident        :stix/InfrastructureTypeOv,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :stix/StixOpenVocabulary})

(def IntrusionSet
  {:db/ident :stix/IntrusionSet,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "An Intrusion Set is a grouped set of adversarial behaviors and resources with common properties that is believed to be orchestrated by a single organization. An Intrusion Set may capture multiple Campaigns or other activities that are all tied together by shared attributes indicating a commonly known or unknown Threat Actor. New activity can be attributed to an Intrusion Set even if the Threat Actors behind the attack are not known. Threat Actors can move from supporting one Intrusion Set to supporting another, or they may support multiple Intrusion Sets. Where a Campaign is a set of attacks over a period of time against a specific set of targets to achieve some objective, an Intrusion Set is the entire attack package and may be used over a very long period of time in multiple Campaigns to achieve potentially multiple purposes. While sometimes an Intrusion Set is not active, or changes focus, it is usually difficult to know if it has truly disappeared or ended. Analysts may have varying level of fidelity on attributing an Intrusion Set back to Threat Actors and may be able to only attribute it back to a nation state or perhaps back to an organization within that nation state."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "Intrusion Set"},
   :rdfs/subClassOf #{{:owl/onProperty     :stix/primary_motivation,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/description,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/goals,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/name,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/resource_level,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/first_seen,
                       :owl/someValuesFrom :xsd/dateTime,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/last_seen,
                       :owl/someValuesFrom :xsd/dateTime,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/aliases,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/secondary_motivations,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      :stix/StixDomainObject}})

(def KillChainPhase
  {:db/ident :stix/KillChainPhase,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The kill-chain-phase represents a phase in a kill chain, which describes the various phases an attacker may undertake in order to achieve their objectives. \\n\\n The JSON MTI serialization uses the JSON Object type [RFC8259] when representing kill-chain-phase."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "Kill Chain Phase"},
   :rdfs/subClassOf #{:stix/StixDatatype
                      {:owl/onProperty     :stix/phase_name,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/kill_chain_name,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}}})

(def LanguageContent
  {:db/ident :stix/LanguageContent,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The Language Content object represents text content for STIX Objects represented in languages other than that of the original object. Language content may be a translation of the original object by a third-party, a first-source translation by the original publisher, or additional official language content provided at the time of creation. \\n\\n Language Content contains two important sets of properties: \\n\\n The object_ref and object_modified properties specify the target object that the language content applies to. \\n\\n For example, to provide additional language content for a Campaign, the object_ref property should be set to the id of the Campaign and the object_modified property set to its modified time. Most relationships in STIX are not specific to a particular version of a STIX object, but because language content provides the translation of specific text, the object_modified property is necessary to provide that specificity. \\n\\n The content property is a dictionary which maps to properties in the target object in order to provide a translation of them."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "Language Content"},
   :rdfs/subClassOf #{{:owl/onProperty     :stix/object_ref_string,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/object_modified,
                       :owl/someValuesFrom :xsd/dateTime,
                       :rdf/type           :owl/Restriction}
                      :stix/StixMetaObject
                      {:owl/onProperty     :stix/contents,
                       :owl/someValuesFrom :stix/Dictionary,
                       :rdf/type           :owl/Restriction}}})

(def Location
  {:db/ident :stix/Location,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "A Location represents a geographic location. The location may be described as any, some or all of the following: region (e.g., North America), civic address (e.g. New York, US), latitude and longitude. \\n\\n Locations are primarily used to give context to other SDOs. For example, a Location could be used in a relationship to describe that the Bourgeois Swallow intrusion set originates from Eastern Europe. \\n\\n The Location SDO can be related to an Identity or Intrusion Set to indicate that the identity or intrusion set is located in that location. It can also be related from a malware or attack pattern to indicate that they target victims in that location. The Location object describes geographic areas, not governments, even in cases where that area might have a government. For example, a Location representing the United States describes the United States as a geographic area, not the federal government of the United States. \\n\\n At least one of the following properties/sets of properties MUST be provided: region, country, latitude and longitude. \\n\\n When a combination of properties is provided (e.g. a region and a latitude and longitude) the more precise properties are what the location describes. In other words, if a location contains both a region of northern-america and a country of us, then the location describes the United States, not all of North America. In cases where a latitude and longitude are specified without a precision, the location describes the most precise other value. \\n\\n If precision is specified, then the datum for latitude and longitude MUST be WGS 84 [WGS84]. Organizations specifying a designated location using latitude and longitude SHOULD specify the precision which is appropriate for the scope of the location being identified. The scope is defined by the boundary as outlined by the precision around the coordinates."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "Location"},
   :rdfs/subClassOf #{{:owl/onProperty     :stix/region,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/latitude,
                       :owl/someValuesFrom :xsd/float,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/description,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/country,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/precision,
                       :owl/someValuesFrom :xsd/float,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/name,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/street_address,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/city,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/longitude,
                       :owl/someValuesFrom :xsd/float,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/postal_code,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/administrative_area,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      :stix/StixDomainObject}})

(def MACAddress
  {:db/ident :stix/MACAddress,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "The MAC Address object represents a single Media Access Control (MAC) address."},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "MAC Address Object"},
   :rdfs/subClassOf #{:stix/StixCyberObservable
                      {:owl/onProperty     :stix/value,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}}})

(def Malware
  {:db/ident :stix/Malware,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Malware is a type of TTP that represents malicious code. It generally refers to a program that is inserted into a system, usually covertly. The intent is to compromise the confidentiality, integrity, or availability of the victim's data, applications, or operating system (OS) or otherwise annoy or disrupt the victim. The Malware SDO characterizes, identifies, and categorizes malware instances and families from data that may be derived from analysis. This SDO captures detailed information about how the malware works and what it does. This SDO captures contextual data relevant to sharing Malware data without requiring the full analysis provided by the Malware Analysis SDO. The Indicator SDO provides intelligence producers with the ability to define, using the STIX Pattern Grammar in a standard way to identify and detect behaviors associated with malicious activities. Although the Malware SDO provides vital intelligence on a specific instance or malware family, it does not provide a standard grammar that the Indicator SDO provides to identify those properties in security detection systems designed to process the STIX Pattern grammar. We strongly encourage the use of STIX Indicators for the detection of actual malware, due to its use of the STIX Patterning language and the clear semantics that it provides. To minimize the risk of a consumer compromising their system in parsing malware samples, producers SHOULD consider sharing defanged content (archive and password-protected samples) instead of raw, base64-encoded malware samples."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "Malware"},
   :rdfs/subClassOf #{{:owl/onProperty     :stix/operating_system_refs_string,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/sample_refs,
                       :owl/someValuesFrom :stix/File,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/capabilities,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/description,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/name,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/operating_system_refs,
                       :owl/someValuesFrom :stix/Software,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/implementation_languages,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/architecture_execution_envs,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/first_seen,
                       :owl/someValuesFrom :xsd/dateTime,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/is_family,
                       :owl/someValuesFrom :xsd/boolean,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/last_seen,
                       :owl/someValuesFrom :xsd/dateTime,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/aliases,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/sample_refs_string,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/malware_types,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      :stix/StixDomainObject}})

(def MalwareAnalysis
  {:db/ident :stix/MalwareAnalysis,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Malware Analysis captures the metadata and results of a particular static or dynamic analysis performed on a malware instance or family. One of result or analysis_sco_refs properties MUST be provided."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "Malware Analysis"},
   :rdfs/subClassOf #{{:owl/onProperty     :stix/analysis_started,
                       :owl/someValuesFrom :xsd/dateTime,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/sample_ref_string,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/analysis_engine_version,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/modules,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/host_vm_ref,
                       :owl/someValuesFrom :stix/Software,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/result_name,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/installed_software_refs,
                       :owl/someValuesFrom :stix/Software,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/version,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/operating_system_ref_string,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/host_vm_ref_string,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/submitted,
                       :owl/someValuesFrom :xsd/dateTime,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/analysis_sco_refs_string,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/operating_system_ref,
                       :owl/someValuesFrom :stix/Software,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/analysis_ended,
                       :owl/someValuesFrom :xsd/dateTime,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/analysis_definition_version,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/analysis_sco_refs,
                       :owl/someValuesFrom :stix/StixCyberObservable,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/sample_ref,
                       :owl/someValuesFrom :stix/StixCyberObservable,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/installed_software_refs_string,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/product,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/result,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/configuration_version,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      :stix/StixDomainObject}})

(def MalwareCapabilitiesOv
  {:db/ident        :stix/MalwareCapabilitiesOv,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :stix/StixOpenVocabulary})

(def MalwareResultOv
  {:db/ident        :stix/MalwareResultOv,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :stix/StixOpenVocabulary})

(def MalwareTypeOv
  {:db/ident        :stix/MalwareTypeOv,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :stix/StixOpenVocabulary})

(def MarkingDefinition
  {:db/ident :stix/MarkingDefinition,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Represents a specific marking. Data markings typically represent handling or sharing requirements for data and are applied in the object_marking_refs and granular_markings properties on Objects."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "Marking Definition"},
   :rdfs/subClassOf
   #{{:owl/onProperty     :stix/definition_type,
      :owl/someValuesFrom :xsd/string,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :stix/name,
      :owl/someValuesFrom :xsd/string,
      :rdf/type           :owl/Restriction} :stix/StixMetaObject
     {:owl/onProperty     :stix/definition,
      :owl/someValuesFrom #{:stix/TLPMarking :stix/StatementMarking},
      :rdf/type           :owl/Restriction}}})

(def Mutex
  {:db/ident :stix/Mutex,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "The Mutex object represents the properties of a mutual exclusion (mutex) object."},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "Mutex Object"},
   :rdfs/subClassOf #{:stix/StixCyberObservable
                      {:owl/onProperty     :stix/name,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}}})

(def NetworkSocketFamilyEnum
  {:db/ident        :stix/NetworkSocketFamilyEnum,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :stix/StixEnumeration})

(def NetworkSocketTypeEnum
  {:db/ident        :stix/NetworkSocketTypeEnum,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :stix/StixEnumeration})

(def NetworkTraffic
  {:db/ident :stix/NetworkTraffic,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The Network Traffic object represents arbitrary network traffic that originates from a source and is addressed to a destination. The network traffic MAY or MAY NOT constitute a valid unicast, multicast, or broadcast network connection. This MAY also include traffic that is not established, such as a SYN flood. To allow for use cases where a source or destination address may be sensitive and not suitable for sharing, such as addresses that are internal to an organization's network, the source and destination properties (src_ref and dst_ref, respectively) are defined as optional in the properties table below. However, a Network Traffic object MUST contain the protocols property and at least one of the src_ref or dst_ref properties and SHOULD contain the src_port and dst_port properties."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "Network Traffic"},
   :rdfs/subClassOf #{:stix/StixCyberObservable
                      {:owl/onProperty     :stix/dst_payload_ref_string,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/src_ref_string,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/dst_packets,
                       :owl/someValuesFrom :xsd/integer,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/start,
                       :owl/someValuesFrom :xsd/dateTime,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/encapsulates_refs,
                       :owl/someValuesFrom :stix/NetworkTraffic,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/dst_payload_ref,
                       :owl/someValuesFrom :stix/Artifact,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/end,
                       :owl/someValuesFrom :xsd/dateTime,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/protocols,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/dst_ref,
                       :owl/someValuesFrom :stix/MACAddress,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/src_packets,
                       :owl/someValuesFrom :xsd/integer,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/src_payload_ref,
                       :owl/someValuesFrom :stix/Artifact,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/dst_port,
                       :owl/someValuesFrom :xsd/integer,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/encapsulated_by_ref,
                       :owl/someValuesFrom :stix/NetworkTraffic,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/src_byte_count,
                       :owl/someValuesFrom :xsd/integer,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/ipfix,
                       :owl/someValuesFrom :stix/Dictionary,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/is_active,
                       :owl/someValuesFrom :xsd/boolean,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/src_ref,
                       :owl/someValuesFrom :stix/MACAddress,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/encapsulated_by_ref_string,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/encapsulates_refs_string,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/dst_byte_count,
                       :owl/someValuesFrom :xsd/integer,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/src_payload_ref_string,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/src_port,
                       :owl/someValuesFrom :xsd/integer,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/dst_ref_string,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}}})

(def Note
  {:db/ident :stix/Note,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "A Note is intended to convey informative text to provide further context and/or to provide additional analysis not contained in the STIX Objects, Marking Definition objects, or Language Content objects which the Note relates to. Notes can be created by anyone (not just the original object creator). For example, an analyst may add a Note to a Campaign object created by another organization indicating that they've seen posts related to that Campaign on a hacker forum. Because Notes are typically (though not always) created by human analysts and are comprised of human-oriented text, they contain an additional property to capture the analyst(s) that created the Note. This is distinct from the created_by_ref property, which is meant to capture the organization that created the object."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "Note"},
   :rdfs/subClassOf #{{:owl/onProperty     :stix/object_refs_string,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/abstract,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/content,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/authors,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      :stix/StixDomainObject}})

(def NtfsExt
  {:db/ident :stix/NtfsExt,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The NTFS file extension specifies a default extension for capturing properties specific to the storage of the file on the NTFS file system. The key for this extension when used in the extensions dictionary MUST be ntfs-ext. Note that this predefined extension does not use the extension facility described in section 7.3. An object using the NTFS File Extension MUST contain at least one property from this extension."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "NTFS File Extension"},
   :rdfs/subClassOf #{{:owl/onProperty     :stix/alternate_data_streams,
                       :owl/someValuesFrom :stix/AlternateDataStreamType,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/sid,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction} :stix/File}})

(def ObservedData
  {:db/ident :stix/ObservedData,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Observed Data conveys information about cyber security related entities such as files, systems, and networks using the STIX Cyber-observable Objects (SCOs). For example, Observed Data can capture information about an IP address, a network connection, a file, or a registry key. Observed Data is not an intelligence assertion, it is simply the raw information without any context for what it means. \\n\\n Observed Data can capture that a piece of information was seen one or more times. Meaning, it can capture both a single observation of a single entity (file, network connection) as well as the aggregation of multiple observations of an entity. When the number_observed property is 1 the Observed Data represents a single entity. When the number_observed property is greater than 1, the Observed Data represents several instances of an entity potentially collected over a period of time. If a time window is known, that can be captured using the first_observed and last_observed properties. When used to collect aggregate data, it is likely that some properties in the SCO (e.g., timestamp properties) will be omitted because they would differ for each of the individual observations. \\n\\n Observed Data may be used by itself (without relationships) to convey raw data collected from any source including analyst reports, sandboxes, and network and host-based detection tools. An intelligence producer conveying Observed Data SHOULD include as much context (e.g. SCOs) as possible that supports the use of the observed data set in systems expecting to utilize the Observed Data for improved security. This includes all SCOs that matched on an Indicator pattern and are represented in the collected observed event (or events) being conveyed in the Observed Data object. For example, a firewall could emit a single Observed Data instance containing a single Network Traffic object for each connection it sees. The firewall could also aggregate data and instead send out an Observed Data instance every ten minutes with an IP address and an appropriate number_observed value to indicate the number of times that IP address was observed in that window. A sandbox could emit an Observed Data instance containing a file hash that it discovered. \\n\\n Observed Data may also be related to other SDOs to represent raw data that is relevant to those objects. For example, the Sighting Relationship object, can relate an Indicator, Malware, or other SDO to a specific Observed Data to represent the raw information that led to the creation of the Sighting (e.g., what was actually seen that suggested that a particular instance of malware was active).\\n\\nTo support backwards compatibility, related SCOs can still be specified using the objects properties, Either the objects property or the object_refs property MUST be provided, but both MUST NOT be present at the same time."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "Observed Data"},
   :rdfs/subClassOf #{{:owl/onProperty     :stix/object_refs_string,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/last_observed,
                       :owl/someValuesFrom :xsd/dateTime,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/object_refs,
                       :owl/someValuesFrom #{:stix/StixCyberObservable
                                             :stix/StixRelationshipObject},
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/number_observed,
                       :owl/someValuesFrom :xsd/positiveInteger,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/first_observed,
                       :owl/someValuesFrom :xsd/dateTime,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/objects,
                       :owl/someValuesFrom :stix/StixCyberObservable,
                       :rdf/type           :owl/Restriction}
                      :stix/StixDomainObject}})

(def Opinion
  {:db/ident :stix/Opinion,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "An Opinion is an assessment of the correctness of the information in a STIX Object produced by a different entity. The primary property is the opinion property, which captures the level of agreement or disagreement using a fixed scale. That fixed scale also supports a numeric mapping to allow for consistent statistical operations across opinions. \\n\\n For example, an analyst from a consuming organization might say that they \"strongly disagree\" with a Campaign object and provide an explanation about why. In a more automated workflow, a SOC operator might give an Indicator \"one star\" in their TIP (expressing \"strongly disagree\") because it is considered to be a false positive within their environment. Opinions are subjective, and the specification does not address how best to interpret them. Sharing communities are encouraged to provide clear guidelines to their constituents regarding best practice for the use of Opinion objects within the community. \\n\\n Because Opinions are typically (though not always) created by human analysts and are comprised of human-oriented text, they contain an additional property to capture the analyst(s) that created the Opinion. This is distinct from the created_by_ref property, which is meant to capture the organization that created the object."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "Opinion"},
   :rdfs/subClassOf #{{:owl/onProperty     :stix/object_refs_string,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/explanation,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/authors,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      :stix/StixDomainObject}})

(def OpinionEnum
  {:db/ident        :stix/OpinionEnum,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :stix/StixEnumeration})

(def PatternTypeOv
  {:db/ident        :stix/PatternTypeOv,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :stix/StixOpenVocabulary})

(def PdfExt
  {:db/ident :stix/PdfExt,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The PDF file extension specifies a default extension for capturing properties specific to PDF files. The key for this extension when used in the extensions dictionary MUST be pdf-ext. Note that this predefined extension does not use the extension facility described in section 7.3. An object using the PDF File Extension MUST contain at least one property from this extension."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "PDF File Extension"},
   :rdfs/subClassOf #{{:owl/onProperty     :stix/is_optimized,
                       :owl/someValuesFrom :xsd/boolean,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/pdfid1,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/version,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/document_info_dict,
                       :owl/someValuesFrom :stix/Dictionary,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/pdfid0,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction} :stix/File}})

(def ProcessClass
  {:db/ident :stix/Process,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The Process object represents common properties of an instance of a computer program as executed on an operating system. A Process object MUST contain at least one property (other than type) from this object (or one of its extensions)."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "Process"},
   :rdfs/subClassOf #{:stix/StixCyberObservable
                      {:owl/onProperty     :stix/creator_user_ref,
                       :owl/someValuesFrom :stix/UserAccount,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/image_ref_string,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/command_line,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/opened_connection_refs,
                       :owl/someValuesFrom :stix/NetworkTraffic,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/opened_connection_refs_string,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/parent_ref_string,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/is_hidden,
                       :owl/someValuesFrom :xsd/boolean,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/image_ref,
                       :owl/someValuesFrom :stix/File,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/parent_ref,
                       :owl/someValuesFrom :stix/Process,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/child_refs_string,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/environment_variables,
                       :owl/someValuesFrom :stix/Dictionary,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/child_refs,
                       :owl/someValuesFrom :stix/Process,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/cwd,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/pid,
                       :owl/someValuesFrom :xsd/positiveInteger,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/creator_user_ref_string,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/created_time,
                       :owl/someValuesFrom :xsd/dateTime,
                       :rdf/type           :owl/Restriction}}})

(def ProcessorArchitectureOv
  {:db/ident        :stix/ProcessorArchitectureOv,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :stix/StixOpenVocabulary})

(def RasterImageExt
  {:db/ident :stix/RasterImageExt,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The Raster Image file extension specifies a default extension for capturing properties specific to raster image files. The key for this extension when used in the extensions dictionary MUST be raster-image-ext. Note that this predefined extension does not use the extension facility described in section 7.3. An object using the Raster Image File Extension MUST contain at least one property from this extension."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "Raster Image File Extension"},
   :rdfs/subClassOf #{{:owl/onProperty     :stix/exif_tags,
                       :owl/someValuesFrom :stix/Dictionary,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/image_height,
                       :owl/someValuesFrom :xsd/integer,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/image_width,
                       :owl/someValuesFrom :xsd/integer,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/bits_per_pixel,
                       :owl/someValuesFrom :xsd/integer,
                       :rdf/type           :owl/Restriction} :stix/File}})

(def RegionOv
  {:db/ident        :stix/RegionOv,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :stix/StixOpenVocabulary})

(def Relationship
  {:db/ident :stix/Relationship,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "The Relationship object is used to link together two SDOs or SCOs in order to describe how they are related to each other. If SDOs and SCOs are considered \"nodes\" or \"vertices\" in the graph, the Relationship Objects (SROs) represent \"edges\". \\n\\n STIX defines many relationship types to link together SDOs and SCOs. These relationships are contained in the \"Relationships\" table under each SDO and SCO definition. Relationship types defined in the specification SHOULD be used to ensure consistency. An example of a specification-defined relationship is that an indicator indicates a campaign. That relationship type is listed in the Relationships section of the Indicator SDO definition. \\n\\n STIX also allows relationships from any SDO or SCO to any SDO or SCO that have not been defined in this specification. These relationships MAY use the related-to relationship type or MAY use a user-defined relationship type. As an example, a user might want to link malware directly to a tool. They can do so using related-to to say that the Malware is related to the Tool but not describe how, or they could use delivered-by (a user-defined name they determined) to indicate more detail. \\n\\n Note that some relationships in STIX may seem like \"shortcuts\". For example, an Indicator doesn't really detect a Campaign: it detects activity (Attack Patterns, Malware, Infrastructure, etc.) that are often used by that campaign. While some analysts might want all of the source data and think that shortcuts are misleading, in many cases it's helpful to provide just the key points (shortcuts) and leave out the low-level details. In other cases, the low-level analysis may not be known or sharable, while the high-level analysis is. For these reasons, relationships that might appear to be \"shortcuts\" are not excluded from STIX."},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "Relationship"},
   :rdfs/subClassOf
   #{{:owl/onProperty     :stix/description,
      :owl/someValuesFrom :xsd/string,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :stix/relationship_type,
      :owl/someValuesFrom :xsd/string,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :stix/stop_time,
      :owl/someValuesFrom :xsd/dateTime,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :stix/target_ref,
      :owl/someValuesFrom #{:stix/StixCyberObservable :stix/StixDomainObject},
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :stix/start_time,
      :owl/someValuesFrom :xsd/dateTime,
      :rdf/type           :owl/Restriction} :stix/StixRelationshipObject
     {:owl/onProperty     :stix/source_ref_string,
      :owl/someValuesFrom :xsd/string,
      :rdf/type           :owl/Restriction}
     {:owl/onProperty     :stix/source_ref,
      :owl/someValuesFrom #{:stix/StixCyberObservable :stix/StixDomainObject},
      :rdf/type           :owl/Restriction}}})

(def Report
  {:db/ident :stix/Report,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Reports are collections of threat intelligence focused on one or more topics, such as a description of a threat actor, malware, or attack technique, including context and related details. They are used to group related threat intelligence together so that it can be published as a comprehensive cyber threat story."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "Report"},
   :rdfs/subClassOf #{{:owl/onProperty     :stix/description,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/name,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/published,
                       :owl/someValuesFrom :xsd/dateTime,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/report_types,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/object_refs,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      :stix/StixDomainObject}})

(def ReportTypeOv
  {:db/ident        :stix/ReportTypeOv,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :stix/StixOpenVocabulary})

(def Sighting
  {:db/ident :stix/Sighting,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "A Sighting denotes the belief that something in CTI (e.g., an indicator, malware, tool, threat actor, etc.) was seen. Sightings are used to track who and what are being targeted, how attacks are carried out, and to track trends in attack behavior. \\n\\n The Sighting relationship object is a special type of SRO; it is a relationship that contains extra properties not present on the Generic Relationship object. These extra properties are included to represent data specific to sighting relationships (e.g., count, representing how many times something was seen), but for other purposes a Sighting can be thought of as a Relationship with a name of \"sighting-of\". Sighting is captured as a relationship because you cannot have a sighting unless you have something that has been sighted. Sighting does not make sense without the relationship to what was sighted. \\n\\n Sighting relationships relate three aspects of the sighting: \\n\\n What was sighted, such as the Indicator, Malware, Campaign, or other SDO (sighting_of_ref). \\n\\n Who sighted it and/or where it was sighted, represented as an Identity (where_sighted_refs). \\n\\n What was actually seen on systems and networks, represented as Observed Data (observed_data_refs). \\n\\n What was sighted is required; a sighting does not make sense unless you say what you saw. Who sighted it, where it was sighted, and what was actually seen are optional. In many cases it is not necessary to provide that level of detail in order to provide value. \\n\\n Sightings are used whenever any SDO has been \"seen\". In some cases, the object creator wishes to convey very little information about the sighting; the details might be sensitive, but the fact that they saw a malware instance or threat actor could still be very useful. In other cases, providing the details may be helpful or even necessary; saying exactly which of the 1000 IP addresses in an indicator were sighted is helpful when tracking which of those IPs is still malicious. \\n\\n Sighting is distinct from Observed Data in that Sighting is an intelligence assertion (\"I saw this threat actor\") while Observed Data is simply information (\"I saw this file\"). When you combine them by including the linked Observed Data (observed_data_refs) from a Sighting, you can say \"I saw this file, and that makes me think I saw this threat actor\"."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "Sighting"},
   :rdfs/subClassOf #{{:owl/onProperty     :stix/observed_data_refs,
                       :owl/someValuesFrom :stix/ObservedData,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/observed_data_refs_string,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/where_sighted_refs,
                       :owl/someValuesFrom :stix/Location,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/count,
                       :owl/someValuesFrom :xsd/nonNegativeInteger,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/sighting_of_ref,
                       :owl/someValuesFrom :stix/StixDomainObject,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/description,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/summary,
                       :owl/someValuesFrom :xsd/boolean,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/first_seen,
                       :owl/someValuesFrom :xsd/dateTime,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/last_seen,
                       :owl/someValuesFrom :xsd/dateTime,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/sighting_of_ref_string,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/where_sighted_refs_string,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      :stix/StixRelationshipObject}})

(def SocketExt
  {:db/ident :stix/SocketExt,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The Network Socket extension specifies a default extension for capturing network traffic properties associated with network sockets. The key for this extension when used in the extensions dictionary MUST be socket-ext. Note that this predefined extension does not use the extension facility described in section 7.3."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "Network Socket Extension"},
   :rdfs/subClassOf #{{:owl/onProperty     :stix/socket_descriptor,
                       :owl/someValuesFrom :xsd/integer,
                       :rdf/type           :owl/Restriction}
                      :stix/NetworkTraffic
                      {:owl/onProperty     :stix/socket_handle,
                       :owl/someValuesFrom :xsd/integer,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/is_blocking,
                       :owl/someValuesFrom :xsd/boolean,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/is_listening,
                       :owl/someValuesFrom :xsd/boolean,
                       :rdf/type           :owl/Restriction}}})

(def Software
  {:db/ident :stix/Software,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The Software object represents high-level properties associated with software, including software products."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "Software"},
   :rdfs/subClassOf #{{:owl/onProperty     :stix/languages,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      :stix/StixCyberObservable
                      {:owl/onProperty     :stix/cpe,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/name,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/version,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/vendor,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/swid,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}}})

(def StatementMarking
  {:db/ident :stix/StatementMarking,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The Statement marking type defines the representation of a textual marking statement (e.g., copyright, terms of use, etc.) in a definition. The value of the definition_type property MUST be statement when using this marking type. Statement markings are generally not machine-readable, and this specification does not define any behavior or actions based on their values. \\n\\n Content may be marked with multiple statements of use. In other words, the same content can be marked both with a statement saying \"Copyright 2019\" and a statement saying, \"Terms of use are ...\" and both statements apply."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "Statement Marking Object Type"},
   :rdfs/subClassOf #{:stix/MarkingDefinition
                      {:owl/onProperty     :stix/statement,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}}})

(def StixCategoryObject
  {:db/ident :stix/StixCategoryObject,
   :rdf/type :owl/Class})

(def StixCyberObservable
  {:db/ident :stix/StixCyberObservable,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Objects that represent observed facts about a network or host that may be used and related to higher level intelligence to form a more complete understanding of the threat landscape."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "STIX Cyber-Observable Object"},
   :rdfs/subClassOf :stix/StixObject})

(def StixDatatype
  {:db/ident :stix/StixDatatype,
   :rdf/type :owl/Class})

(def StixDomainObject
  {:db/ident :stix/StixDomainObject,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Higher Level Intelligence Objects that represent behaviors and constructs that threat analysts would typically create or work with while understanding the threat landscape."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "STIX Domain Object"},
   :rdfs/subClassOf :stix/StixObject})

(def StixEnumeration
  {:db/ident        :stix/StixEnumeration,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :stix/StixCategoryObject})

(def StixMetaObject
  {:db/ident :stix/StixMetaObject,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "A STIX Object that provides the necessary glue and associated metadata to enrich or extend STIX Core Objects to support user and system workflows."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "STIX Meta Object"},
   :rdfs/subClassOf :stix/StixObject})

(def StixObject
  {:db/ident :stix/StixObject,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "STIX Domain Objects (SDOs) and Relationship Objects (SROs) all share a common set of properties which provide core capabilities such as versioning and data markings (representing how data can be shared and used). All STIX Cyber-observable Objects (SCOs) likewise share a common set of properties that are applicable for all SCOs. Similarly, STIX Meta Objects (SMOs) use some but not all of the common properties."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "STIX Object"},
   :rdfs/subClassOf #{{:owl/onProperty     :stix/labels,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/created,
                       :owl/someValuesFrom :xsd/dateTime,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/created_by_ref,
                       :owl/someValuesFrom :stix/Identity,
                       :rdf/type           :owl/Restriction} :owl/Thing
                      {:owl/onProperty     :stix/id_string,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/type,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/defanged,
                       :owl/someValuesFrom :xsd/boolean,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/id,
                       :owl/someValuesFrom :stix/identifier,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/modified,
                       :owl/someValuesFrom :xsd/dateTime,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/revoked,
                       :owl/someValuesFrom :xsd/boolean,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/extensions,
                       :owl/someValuesFrom :stix/Dictionary,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/object_marking_refs,
                       :owl/someValuesFrom :stix/MarkingDefinition,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/granular_markings,
                       :owl/someValuesFrom :stix/GranularMarking,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/created_by_ref_string,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/spec_version,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/lang,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/confidence,
                       :owl/someValuesFrom :xsd/nonNegativeInteger,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/external_references,
                       :owl/someValuesFrom :stix/ExternalReference,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/object_marking_refs_string,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}}})

(def StixOpenVocabulary
  {:db/ident        :stix/StixOpenVocabulary,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :stix/StixCategoryObject})

(def StixRelationshipObject
  {:db/ident :stix/StixRelationshipObject,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Objects that connect STIX Domain Objects together, STIX Cyber-observable Objects together, and connect STIX Domain Objects and STIX Cyber-observable Objects together to form a more complete understanding of the threat landscape."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "STIX Relationship Object"},
   :rdfs/subClassOf :stix/StixObject})

(def TLPMarking
  {:db/ident :stix/TLPMarking,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The TLP marking type defines how you would represent a Traffic Light Protocol (TLP) marking in a definition property. The value of the definition_type property MUST be tlp when using this marking type."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "TLP Marking Object Type"},
   :rdfs/subClassOf #{{:owl/onProperty     :stix/tlp,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      :stix/MarkingDefinition}})

(def TcpExt
  {:db/ident :stix/TcpExt,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The TCP extension specifies a default extension for capturing network traffic properties specific to TCP. The key for this extension when used in the extensions dictionary MUST be tcp-ext. Note that this predefined extension does not use the extension facility described in section 7.3. The corresponding protocol value for this extension is tcp. An object using the TCP Extension MUST contain at least one property from this extension."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "TCP Extension"},
   :rdfs/subClassOf #{{:owl/onProperty     :stix/src_flags_hex,
                       :owl/someValuesFrom :xsd/hexBinary,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/dst_flags_hex,
                       :owl/someValuesFrom :xsd/hexBinary,
                       :rdf/type           :owl/Restriction}
                      :stix/NetworkTraffic}})

(def ThreatActor
  {:db/ident :stix/ThreatActor,
   :owl/equivalentClass {:owl/intersectionOf [:stix/StixObject
                                              {:owl/hasValue {:rdf/value
                                                              "threat-actor"},
                                               :owl/onProperty :stix/type,
                                               :rdf/type :owl/Restriction}],
                         :rdf/type :owl/Class},
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Threat Actors are actual individuals, groups, or organizations believed to be operating with malicious intent. A Threat Actor is not an Intrusion Set but may support or be affiliated with various Intrusion Sets, groups, or organizations over time. \\n\\nThreat Actors leverage their resources, and possibly the resources of an Intrusion Set, to conduct attacks and run Campaigns against targets. \\n\\nThreat Actors can be characterized by their motives, capabilities, goals, sophistication level, past activities, resources they have access to, and their role in the organization."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "Threat Actor"},
   :rdfs/subClassOf #{{:owl/onProperty     :stix/primary_motivation,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/sophistication,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/description,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/goals,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/roles,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/threat_actor_types,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction} :tac/Adversary
                      {:owl/onProperty     :stix/name,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/resource_level,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/first_seen,
                       :owl/someValuesFrom :xsd/dateTime,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/last_seen,
                       :owl/someValuesFrom :xsd/dateTime,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/personal_motivations,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/aliases,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/secondary_motivations,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      :stix/StixDomainObject}})

(def ThreatActorRoleOv
  {:db/ident        :stix/ThreatActorRoleOv,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :stix/StixOpenVocabulary})

(def ThreatActorSophisticationOv
  {:db/ident        :stix/ThreatActorSophisticationOv,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :stix/StixOpenVocabulary})

(def ThreatActorTypeOv
  {:db/ident        :stix/ThreatActorTypeOv,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :stix/StixOpenVocabulary})

(def Tool
  {:db/ident :stix/Tool,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Tools are legitimate software that can be used by threat actors to perform attacks. Knowing how and when threat actors use such tools can be important for understanding how campaigns are executed. Unlike malware, these tools or software packages are often found on a system and have legitimate purposes for power users, system administrators, network administrators, or even normal users. Remote access tools (e.g., RDP) and network scanning tools (e.g., Nmap) are examples of Tools that may be used by a Threat Actor during an attack. \\n\\nThe Tool SDO characterizes the properties of these software tools and can be used as a basis for making an assertion about how a Threat Actor uses them during an attack. It contains properties to name and describe the tool, a list of Kill Chain Phases the tool can be used to carry out, and the version of the tool. \\n\\nThis SDO MUST NOT be used to characterize malware. Further, Tool MUST NOT be used to characterize tools used as part of a course of action in response to an attack."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "Tool"},
   :rdfs/subClassOf #{{:owl/onProperty     :stix/description,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/tool_types,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/name,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/aliases,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/tool_version,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      :stix/StixDomainObject}})

(def ToolTypeOv
  {:db/ident        :stix/ToolTypeOv,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :stix/StixOpenVocabulary})

(def URL
  {:db/ident :stix/URL,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "The URL object represents the properties of a uniform resource locator (URL)."},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "URL Object"},
   :rdfs/subClassOf #{:stix/StixCyberObservable
                      {:owl/onProperty     :stix/value,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}}})

(def UnixAccountExt
  {:db/ident :stix/UnixAccountExt,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The UNIX account extension specifies a default extension for capturing the additional information for an account on a UNIX system. The key for this extension when used in the extensions dictionary MUST be unix-account-ext. Note that this predefined extension does not use the extension facility described in section 7.3.\tAn object using the UNIX Account Extension MUST contain at least one property from this extension."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "UNIX Account Extension"},
   :rdfs/subClassOf #{:stix/UserAccount
                      {:owl/onProperty     :stix/home_dir,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/groups,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/shell,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/gid,
                       :owl/someValuesFrom :xsd/integer,
                       :rdf/type           :owl/Restriction}}})

(def UserAccount
  {:db/ident :stix/UserAccount,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The User Account object represents an instance of any type of user account, including but not limited to operating system, device, messaging service, and social media platform accounts. As all properties of this object are optional, at least one of the properties defined below MUST be included when using this object."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "User Account"},
   :rdfs/subClassOf #{{:owl/onProperty     :stix/account_created,
                       :owl/someValuesFrom :xsd/dateTime,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/can_escalate_privs,
                       :owl/someValuesFrom :xsd/boolean,
                       :rdf/type           :owl/Restriction}
                      :stix/StixCyberObservable
                      {:owl/onProperty     :stix/account_last_login,
                       :owl/someValuesFrom :xsd/dateTime,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/account_first_login,
                       :owl/someValuesFrom :xsd/dateTime,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/is_service_account,
                       :owl/someValuesFrom :xsd/boolean,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/account_expires,
                       :owl/someValuesFrom :xsd/dateTime,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/user_id,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/display_name,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/credential_last_changed,
                       :owl/someValuesFrom :xsd/dateTime,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/account_login,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/is_disabled,
                       :owl/someValuesFrom :xsd/boolean,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/credential,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/is_privileged,
                       :owl/someValuesFrom :xsd/boolean,
                       :rdf/type           :owl/Restriction}}})

(def Vulnerability
  {:db/ident :stix/Vulnerability,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "A Vulnerability is a weakness or defect in the requirements, designs, or implementations of the computational logic (e.g., code) found in software and some hardware components (e.g., firmware) that can be directly exploited to negatively impact the confidentiality, integrity, or availability of that system. \\n\\nCVE is a list of information security vulnerabilities and exposures that provides common names for publicly known problems [CVE]. For example, if a piece of malware exploits CVE-2015-12345, a Malware object could be linked to a Vulnerability object that references CVE-2015-12345. \\n\\nThe Vulnerability SDO is primarily used to link to external definitions of vulnerabilities or to describe 0-day vulnerabilities that do not yet have an external definition. Typically, other SDOs assert relationships to Vulnerability objects when a specific vulnerability is targeted and exploited as part of malicious cyber activity. As such, Vulnerability objects can be used as a linkage to the asset management and compliance process."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "Vulnerability"},
   :rdfs/subClassOf #{{:owl/onProperty     :stix/description,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/name,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      :stix/StixDomainObject}})

(def WindowsIntegrityLevelEnum
  {:db/ident        :stix/WindowsIntegrityLevelEnum,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :stix/StixEnumeration})

(def WindowsPeBinaryTypeOv
  {:db/ident        :stix/WindowsPeBinaryTypeOv,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :stix/StixOpenVocabulary})

(def WindowsPeOptionalHeaderType
  {:db/ident :stix/WindowsPeOptionalHeaderType,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The Windows PE Optional Header type represents the properties of the PE optional header. An object using the Windows PE Optional Header Type MUST contain at least one property from this type."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "Windows PE Optional Header Type"},
   :rdfs/subClassOf #{{:owl/onProperty     :stix/base_of_code,
                       :owl/someValuesFrom :xsd/integer,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/address_of_entry_point,
                       :owl/someValuesFrom :xsd/integer,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/loader_flags_hex,
                       :owl/someValuesFrom :xsd/hexBinary,
                       :rdf/type           :owl/Restriction} :stix/StixDatatype
                      {:owl/onProperty     :stix/size_of_stack_commit,
                       :owl/someValuesFrom :xsd/integer,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/base_of_data,
                       :owl/someValuesFrom :xsd/integer,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/major_subsystem_version,
                       :owl/someValuesFrom :xsd/integer,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/image_base,
                       :owl/someValuesFrom :xsd/integer,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/major_image_version,
                       :owl/someValuesFrom :xsd/integer,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/minor_subsystem_version,
                       :owl/someValuesFrom :xsd/integer,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/hashes,
                       :owl/someValuesFrom :stix/Hashes,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/size_of_code,
                       :owl/someValuesFrom :xsd/integer,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/magic_hex,
                       :owl/someValuesFrom :xsd/hexBinary,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/size_of_image,
                       :owl/someValuesFrom :xsd/integer,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/minor_linker_version,
                       :owl/someValuesFrom :xsd/integer,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/file_alignment,
                       :owl/someValuesFrom :xsd/integer,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/number_of_rva_and_sizes,
                       :owl/someValuesFrom :xsd/integer,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/major_os_version,
                       :owl/someValuesFrom :xsd/integer,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/dll_characteristics_hex,
                       :owl/someValuesFrom :xsd/hexBinary,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/size_of_stack_reserve,
                       :owl/someValuesFrom :xsd/integer,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/subsystem_hex,
                       :owl/someValuesFrom :xsd/hexBinary,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/minor_os_version,
                       :owl/someValuesFrom :xsd/integer,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/size_of_heap_reserve,
                       :owl/someValuesFrom :xsd/integer,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/win32_version_value_hex,
                       :owl/someValuesFrom :xsd/hexBinary,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/size_of_heap_commit,
                       :owl/someValuesFrom :xsd/integer,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/section_alignment,
                       :owl/someValuesFrom :xsd/integer,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/checksum_hex,
                       :owl/someValuesFrom :xsd/hexBinary,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/major_linker_version,
                       :owl/someValuesFrom :xsd/integer,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/size_of_initialized_data,
                       :owl/someValuesFrom :xsd/integer,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/minor_image_version,
                       :owl/someValuesFrom :xsd/integer,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/size_of_uninitialized_data,
                       :owl/someValuesFrom :xsd/integer,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/size_of_headers,
                       :owl/someValuesFrom :xsd/integer,
                       :rdf/type           :owl/Restriction}}})

(def WindowsPeSectionType
  {:db/ident :stix/WindowsPeSectionType,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The Windows PE Section type specifies metadata about a PE file section."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "Windows PE Section Type"},
   :rdfs/subClassOf #{:stix/StixDatatype
                      {:owl/onProperty     :stix/size,
                       :owl/someValuesFrom :xsd/nonNegativeInteger,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/hashes,
                       :owl/someValuesFrom :stix/Hashes,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/name,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/entropy,
                       :owl/someValuesFrom :xsd/float,
                       :rdf/type           :owl/Restriction}}})

(def WindowsPebinaryExt
  {:db/ident :stix/WindowsPebinaryExt,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The Windows PE Binary File extension specifies a default extension for capturing properties specific to Windows portable executable (PE) files. The key for this extension when used in the extensions dictionary MUST be windows-pebinary-ext. Note that this predefined extension does not use the extension facility described in section 7.3. An object using the Windows™ PE Binary File Extension MUST contain at least one property other than the required pe_type property from this extension."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "Windows PE Binary File Extension"},
   :rdfs/subClassOf #{{:owl/onProperty     :stix/size_of_optional_header,
                       :owl/someValuesFrom :xsd/nonNegativeInteger,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/pointer_to_symbol_table_hex,
                       :owl/someValuesFrom :xsd/hexBinary,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/machine_hex,
                       :owl/someValuesFrom :xsd/hexBinary,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/optional_header,
                       :owl/someValuesFrom :stix/WindowsPeOptionalHeaderType,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/sections,
                       :owl/someValuesFrom :stix/WindowsPeSectionType,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/time_date_stamp,
                       :owl/someValuesFrom :xsd/dateTime,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/number_of_sections,
                       :owl/someValuesFrom :xsd/nonNegativeInteger,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/number_of_symbols,
                       :owl/someValuesFrom :xsd/nonNegativeInteger,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/imphash,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/characteristics_hex,
                       :owl/someValuesFrom :xsd/hexBinary,
                       :rdf/type           :owl/Restriction} :stix/File}})

(def WindowsProcessExt
  {:db/ident :stix/WindowsProcessExt,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The Windows Process extension specifies a default extension for capturing properties specific to Windows processes. The key for this extension when used in the extensions dictionary MUST be windows-process-ext. Note that this predefined extension does not use the extension facility described in section 7.3. An object using the Windows Process Extension MUST contain at least one property from this extension."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "Windows Process Extension"},
   :rdfs/subClassOf #{{:owl/onProperty     :stix/startup_info,
                       :owl/someValuesFrom :stix/Dictionary,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/aslr_enabled,
                       :owl/someValuesFrom :xsd/boolean,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/window_title,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/priority,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction} :stix/Process
                      {:owl/onProperty     :stix/owner_sid,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/dep_enabled,
                       :owl/someValuesFrom :xsd/boolean,
                       :rdf/type           :owl/Restriction}}})

(def WindowsRegistryDatatypeEnum
  {:db/ident        :stix/WindowsRegistryDatatypeEnum,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :stix/StixEnumeration})

(def WindowsRegistryKey
  {:db/ident :stix/WindowsRegistryKey,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The Registry Key object represents the properties of a Windows registry key. As all properties of this object are optional, at least one of the properties defined below MUST be included when using this object."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "Windows Registry Key Object"},
   :rdfs/subClassOf #{:stix/StixCyberObservable
                      {:owl/onProperty     :stix/number_of_subkeys,
                       :owl/someValuesFrom :xsd/integer,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/values,
                       :owl/someValuesFrom :stix/WindowsRegistryValueType,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/key,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/creator_user_ref,
                       :owl/someValuesFrom :stix/UserAccount,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/modified_time,
                       :owl/someValuesFrom :xsd/dateTime,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/creator_user_ref_string,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}}})

(def WindowsRegistryValueType
  {:db/ident :stix/WindowsRegistryValueType,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The Windows Registry Value type captures the properties of a Windows Registry Key Value. As all properties of this type are optional, at least one of the properties defined below MUST be included when using this type."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "Windows Registry Value Type"},
   :rdfs/subClassOf #{:stix/StixDatatype
                      {:owl/onProperty     :stix/name,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/data,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}}})

(def WindowsServiceExt
  {:db/ident :stix/WindowsServiceExt,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The Windows Service extension specifies a default extension for capturing properties specific to Windows services. The key for this extension when used in the extensions dictionary MUST be windows-service-ext. Note that this predefined extension does not use the extension facility described in section 7.3. As all properties of this extension are optional, at least one of the properties defined below MUST be included when using this extension."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "Windows Service Extension"},
   :rdfs/subClassOf #{{:owl/onProperty     :stix/service_name,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/service_dll_refs_string,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/display_name,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction} :stix/Process
                      {:owl/onProperty     :stix/service_dll_refs,
                       :owl/someValuesFrom :stix/File,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/group_name,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/descriptions,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}}})

(def WindowsServiceStartTypeEnum
  {:db/ident        :stix/WindowsServiceStartTypeEnum,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :stix/StixEnumeration})

(def WindowsServiceStatusEnum
  {:db/ident        :stix/WindowsServiceStatusEnum,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :stix/StixEnumeration})

(def WindowsServiceTypeEnum
  {:db/ident        :stix/WindowsServiceTypeEnum,
   :rdf/type        :owl/Class,
   :rdfs/subClassOf :stix/StixEnumeration})

(def X509Certificate
  {:db/ident :stix/X509Certificate,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "The X.509 Certificate object represents the properties of an X.509 certificate, as defined by ITU recommendation X.509 [X.509]. An X.509 Certificate object MUST contain at least one object specific property (other than type) from this object."},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "X.509 Certificate Object"},
   :rdfs/subClassOf #{:stix/StixCyberObservable
                      {:owl/onProperty     :stix/subject_public_key_modulus,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/subject_public_key_exponent,
                       :owl/someValuesFrom :xsd/positiveInteger,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/hashes,
                       :owl/someValuesFrom :stix/Hashes,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/subject,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/x509_v3_extensions,
                       :owl/someValuesFrom :stix/X509v3ExtensionsType,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/serial_number,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/is_self_signed,
                       :owl/someValuesFrom :xsd/boolean,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/version,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/validity_not_after,
                       :owl/someValuesFrom :xsd/dateTime,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/validity_not_before,
                       :owl/someValuesFrom :xsd/dateTime,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/issuer,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/subject_public_key_algorithm,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/signature_algorithm,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}}})

(def X509v3ExtensionsType
  {:db/ident :stix/X509v3ExtensionsType,
   :rdf/type :owl/Class,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "The X.509 v3 Extensions type captures properties associated with X.509 v3 extensions, which serve as a mechanism for specifying additional information such as alternative subject names. An object using the X.509 v3 Extensions type MUST contain at least one property from this type. Note that the use of the term \"extensions\" in this context refers to the X.509 v3 Extensions type and is not a STIX Cyber Observables extension. Therefore, it is a type that describes X.509 extensions."},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "X.509 v3 Extensions Type"},
   :rdfs/subClassOf #{{:owl/onProperty     :stix/authority_key_identifier,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/policy_mappings,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty
                       :stix/private_key_usage_period_not_before,
                       :owl/someValuesFrom :xsd/dateTime,
                       :rdf/type :owl/Restriction} :stix/StixDatatype
                      {:owl/onProperty     :stix/inhibit_any_policy,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/key_usage,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/certificate_policies,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/basic_constraints,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/subject_key_identifier,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/crl_distribution_points,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/subject_alternative_name,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/name_constraints,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/extended_key_usage,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty :stix/private_key_usage_period_not_after,
                       :owl/someValuesFrom :xsd/dateTime,
                       :rdf/type :owl/Restriction}
                      {:owl/onProperty     :stix/policy_constraints,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/subject_directory_attributes,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}
                      {:owl/onProperty     :stix/issuer_alternative_name,
                       :owl/someValuesFrom :xsd/string,
                       :rdf/type           :owl/Restriction}}})

(def _Accidental-amov
  {:db/ident :stix/_Accidental-amov,
   :rdf/type #{:stix/AttackMotivationOv :owl/NamedIndividual}})

(def _Activist-tatov
  {:db/ident :stix/_Activist-tatov,
   :rdf/type #{:stix/ThreatActorTypeOv :owl/NamedIndividual}})

(def _Club-arlov
  {:db/ident :stix/_Club-arlov,
   :rdf/type #{:owl/NamedIndividual :stix/AttackResourceLevelOv}})

(def _Coercion-amov
  {:db/ident :stix/_Coercion-amov,
   :rdf/type #{:stix/AttackMotivationOv :owl/NamedIndividual}})

(def _Competitor-tatov
  {:db/ident :stix/_Competitor-tatov,
   :rdf/type #{:stix/ThreatActorTypeOv :owl/NamedIndividual}})

(def _Contest-arlov
  {:db/ident :stix/_Contest-arlov,
   :rdf/type #{:owl/NamedIndividual :stix/AttackResourceLevelOv}})

(def _Crime-Syndicate-tatov
  {:db/ident :stix/_Crime-Syndicate-tatov,
   :rdf/type #{:stix/ThreatActorTypeOv :owl/NamedIndividual}})

(def _Criminal-tatov
  {:db/ident :stix/_Criminal-tatov,
   :rdf/type #{:stix/ThreatActorTypeOv :owl/NamedIndividual}})

(def _Dominance-amov
  {:db/ident :stix/_Dominance-amov,
   :rdf/type #{:stix/AttackMotivationOv :owl/NamedIndividual}})

(def _Facebook-aov
  {:db/ident :stix/_Facebook-aov,
   :rdf/type #{:stix/AccountTypeOv :owl/NamedIndividual}})

(def _Government-arlov
  {:db/ident :stix/_Government-arlov,
   :rdf/type #{:owl/NamedIndividual :stix/AttackResourceLevelOv}})

(def _Hacker-tatov
  {:db/ident :stix/_Hacker-tatov,
   :rdf/type #{:stix/ThreatActorTypeOv :owl/NamedIndividual}})

(def _Ideology-amov
  {:db/ident :stix/_Ideology-amov,
   :rdf/type #{:stix/AttackMotivationOv :owl/NamedIndividual}})

(def _Individual-arlov
  {:db/ident :stix/_Individual-arlov,
   :rdf/type #{:owl/NamedIndividual :stix/AttackResourceLevelOv}})

(def _Insider-Accidental-tatov
  {:db/ident :stix/_Insider-Accidental-tatov,
   :rdf/type #{:stix/ThreatActorTypeOv :owl/NamedIndividual}})

(def _Insider-Disgruntled-tatov
  {:db/ident :stix/_Insider-Disgruntled-tatov,
   :rdf/type #{:stix/ThreatActorTypeOv :owl/NamedIndividual}})

(def _Ldap-aov
  {:db/ident :stix/_Ldap-aov,
   :rdf/type #{:stix/AccountTypeOv :owl/NamedIndividual}})

(def _Malware-analysis-gcov
  {:db/ident :stix/_Malware-analysis-gcov,
   :rdf/type #{:stix/GroupingContextOv :owl/NamedIndividual}})

(def _Nation-State-tatov
  {:db/ident :stix/_Nation-State-tatov,
   :rdf/type #{:stix/ThreatActorTypeOv :owl/NamedIndividual}})

(def _Nis-aov
  {:db/ident :stix/_Nis-aov,
   :rdf/type #{:stix/AccountTypeOv :owl/NamedIndividual}})

(def _Notoriety-amov
  {:db/ident :stix/_Notoriety-amov,
   :rdf/type #{:stix/AttackMotivationOv :owl/NamedIndividual}})

(def _Openid-aov
  {:db/ident :stix/_Openid-aov,
   :rdf/type #{:stix/AccountTypeOv :owl/NamedIndividual}})

(def _Organization-arlov
  {:db/ident :stix/_Organization-arlov,
   :rdf/type #{:owl/NamedIndividual :stix/AttackResourceLevelOv}})

(def _Organizational-gain-amov
  {:db/ident :stix/_Organizational-gain-amov,
   :rdf/type #{:stix/AttackMotivationOv :owl/NamedIndividual}})

(def _Personal-gain-amov
  {:db/ident :stix/_Personal-gain-amov,
   :rdf/type #{:stix/AttackMotivationOv :owl/NamedIndividual}})

(def _Personal-satisfaction-amov
  {:db/ident :stix/_Personal-satisfaction-amov,
   :rdf/type #{:stix/AttackMotivationOv :owl/NamedIndividual}})

(def _Radius-aov
  {:db/ident :stix/_Radius-aov,
   :rdf/type #{:stix/AccountTypeOv :owl/NamedIndividual}})

(def _Random-gcov
  {:db/ident :stix/_Random-gcov,
   :rdf/type :owl/NamedIndividual})

(def _Revenge-amov
  {:db/ident :stix/_Revenge-amov,
   :rdf/type #{:stix/AttackMotivationOv :owl/NamedIndividual}})

(def _Sensationalist-tatov
  {:db/ident :stix/_Sensationalist-tatov,
   :rdf/type #{:stix/ThreatActorTypeOv :owl/NamedIndividual}})

(def _Skype-aov
  {:db/ident :stix/_Skype-aov,
   :rdf/type #{:stix/AccountTypeOv :owl/NamedIndividual}})

(def _Spy-tatov
  {:db/ident :stix/_Spy-tatov,
   :rdf/type #{:stix/ThreatActorTypeOv :owl/NamedIndividual}})

(def _Suspicious-activity-gcov
  {:db/ident :stix/_Suspicious-activity-gcov,
   :rdf/type #{:stix/GroupingContextOv :owl/NamedIndividual}})

(def _Tacacs-aov
  {:db/ident :stix/_Tacacs-aov,
   :rdf/type #{:stix/AccountTypeOv :owl/NamedIndividual}})

(def _Team-arlov
  {:db/ident :stix/_Team-arlov,
   :rdf/type #{:owl/NamedIndividual :stix/AttackResourceLevelOv}})

(def _Terrorist-tatov
  {:db/ident :stix/_Terrorist-tatov,
   :rdf/type #{:stix/ThreatActorTypeOv :owl/NamedIndividual}})

(def _Twitter-aov
  {:db/ident :stix/_Twitter-aov,
   :rdf/type #{:stix/AccountTypeOv :owl/NamedIndividual}})

(def _Unix-aov
  {:db/ident :stix/_Unix-aov,
   :rdf/type #{:stix/AccountTypeOv :owl/NamedIndividual}})

(def _Unknown-tatov
  {:db/ident :stix/_Unknown-tatov,
   :rdf/type #{:stix/ThreatActorTypeOv :owl/NamedIndividual}})

(def _Unpredictable-amov
  {:db/ident :stix/_Unpredictable-amov,
   :rdf/type #{:stix/AttackMotivationOv :owl/NamedIndividual}})

(def _Unspecified-gcov
  {:db/ident :stix/_Unspecified-gcov,
   :rdf/type #{:stix/GroupingContextOv :owl/NamedIndividual}})

(def _Windows-domain-aov
  {:db/ident :stix/_Windows-domain-aov,
   :rdf/type #{:stix/AccountTypeOv :owl/NamedIndividual}})

(def _Windows-local-aov
  {:db/ident :stix/_Windows-local-aov,
   :rdf/type #{:stix/AccountTypeOv :owl/NamedIndividual}})

(def abstract
  {:db/ident     :stix/abstract,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en-us",
                  :rdf/value    "A brief summary of the note content."},
   :rdfs/label   {:rdf/language "en-us",
                  :rdf/value    "abstract"},
   :rdfs/range   :xsd/string})

(def account_created
  {:db/ident     :stix/account_created,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en-us",
                  :rdf/value    "Specifies when the account was created."},
   :rdfs/label   {:rdf/language "en-us",
                  :rdf/value    "account_created"},
   :rdfs/range   :xsd/dateTime})

(def account_expires
  {:db/ident     :stix/account_expires,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en-us",
                  :rdf/value "Specifies the expiration date of the account."},
   :rdfs/label   {:rdf/language "en-us",
                  :rdf/value    "account_expires"},
   :rdfs/range   :xsd/dateTime})

(def account_first_login
  {:db/ident     :stix/account_first_login,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en-us",
                  :rdf/value "Specifies when the account was first accessed."},
   :rdfs/label   {:rdf/language "en-us",
                  :rdf/value    "account_first_login"},
   :rdfs/range   :xsd/dateTime})

(def account_last_login
  {:db/ident     :stix/account_last_login,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en-us",
                  :rdf/value "Specifies when the account was last accessed."},
   :rdfs/label   {:rdf/language "en-us",
                  :rdf/value    "account_last_login"},
   :rdfs/range   :xsd/dateTime})

(def account_login
  {:db/ident :stix/account_login,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the account login string, used in cases where the user_id property specifies something other than what a user would type when they login. For example, in the case of a Unix account with user_id 0, the account_login might be \"root\"."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "account_login"},
   :rdfs/range :xsd/string})

(def account_type
  {:db/ident :stix/account_type,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the type of the account. This is an open vocabulary and values SHOULD come from the account-type-ov open vocabulary."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "account_type"},
   :rdfs/range :xsd/string})

(def additional_header_fields
  {:db/ident :stix/additional_header_fields,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies any other header fields (except for date, received_lines, content_type, from_ref, sender_ref, to_refs, cc_refs, bcc_refs, and subject) found in the email message, as a dictionary. Each key/value pair in the dictionary represents the name/value of a single header field or names/values of a header field that occurs more than once. Each dictionary key SHOULD be a case-preserved version of the header field name. The corresponding value for each dictionary key MUST always be a list of type string to support when a header field is repeated."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "additional header fields"}})

(def address_family
  {:db/ident :stix/address_family,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the address family (AF_*) that the socket is configured for. The values of this property MUST come from the network-socket-address-family-enum enumeration."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "address_family"}})

(def address_of_entry_point
  {:db/ident :stix/address_of_entry_point,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the address of the entry point relative to the image base when the executable is loaded into memory."},
   :rdfs/label "address_of_entry_point",
   :rdfs/range :xsd/integer})

(def administrative_area
  {:db/ident :stix/administrative_area,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The state, province, or other sub-national administrative area that this Location describes. This property SHOULD contain a valid ISO 3166-2 Code [ISO3166-2]."},
   :rdfs/label "administrative_area",
   :rdfs/range :xsd/string})

(def aliases
  {:db/ident :stix/aliases,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{{:rdf/language "en-us",
      :rdf/value
      "A list of other names that this Threat Actor is believed to use."}
     {:rdf/language "en-us",
      :rdf/value    "Alternative names used to identify this Infrastructure."}
     {:rdf/language "en-us",
      :rdf/value    "Alternative names used to identify this Intrusion Set."}
     {:rdf/language "en-us",
      :rdf/value    "Alternative names used to identify this Campaign."}
     {:rdf/language "en-us",
      :rdf/value    "Alternative names used to identify this Attack Pattern."}
     {:rdf/language "en-us",
      :rdf/value    "Alternative names used to identify this Tool."}
     {:rdf/language "en-us",
      :rdf/value
      "Alternative names used to identify this malware or malware family."}},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "aliases"},
   :rdfs/range :xsd/string})

(def alternate_data_streams
  {:db/ident :stix/alternate_data_streams,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies a list of NTFS alternate data streams that exist for the file."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "alternate_data_streams"},
   :rdfs/range :stix/AlternateDataStreamType})

(def analysis-of
  {:db/ident :stix/analysis-of,
   :rdf/type :owl/ObjectProperty})

(def analysis_definition_version
  {:db/ident :stix/analysis_definition_version,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{{:rdf/language "en-us",
      :rdf/value
      "The version of the analysis definitions used by the analysis tool (including AV tools)."}
     {:rdf/language "en-us",
      :rdf/value
      "Specifies the version of the analysis definitions used by the analysis tool (including AV tools)."}},
   :rdfs/label #{{:rdf/language "en-us",
                  :rdf/value    "analysis_defintion_version"}
                 "analysis_definition_version"},
   :rdfs/range :xsd/string})

(def analysis_ended
  {:db/ident     :stix/analysis_ended,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en-us",
                  :rdf/value
                  "The date and time that the malware analysis ended."},
   :rdfs/label   "analysis_ended",
   :rdfs/range   :xsd/dateTime})

(def analysis_engine_version
  {:db/ident :stix/analysis_engine_version,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{{:rdf/language "en-us",
      :rdf/value
      "Specifies the version of the analysis engine or product (including AV engines) that was used to perform the analysis."}
     {:rdf/language "en-us",
      :rdf/value
      "The version of the analysis engine or product (including AV engines) that was used to perform the analysis."}},
   :rdfs/label #{"analysis_engine_version"
                 {:rdf/language "en-us",
                  :rdf/value    "analysis_engine_version"}},
   :rdfs/range :xsd/string})

(def analysis_sco_refs
  {:db/ident :stix/analysis_sco_refs,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "This property contains the references to the STIX Cyber-observable Objects that were captured during the analysis process."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "analysis_sco_refs"},
   :rdfs/range :stix/StixCyberObservable})

(def analysis_sco_refs_string
  {:db/ident :stix/analysis_sco_refs_string,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "This property contains the references to the STIX Cyber-observable Objects that were captured during the analysis process."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "analysis_sco_refs_string"},
   :rdfs/range :xsd/string})

(def analysis_started
  {:db/ident     :stix/analysis_started,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en-us",
                  :rdf/value
                  "The date and time that the malware analysis was initiated."},
   :rdfs/label   "analysis_started",
   :rdfs/range   :xsd/dateTime})

(def architecture_execution_envs
  {:db/ident :stix/architecture_execution_envs,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The processor architectures (e.g., x86, ARM, etc.) that the malware instance or family is executable on. The values for this property SHOULD come from the processor-architecture-ov open vocabulary."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "architecture_execution_envs"}})

(def aslr_enabled
  {:db/ident :stix/aslr_enabled,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies whether Address Space Layout Randomization (ASLR) is enabled for the process."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "aslr_enabled"},
   :rdfs/range :xsd/boolean})

(def atime
  {:db/ident     :stix/atime,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment #{{:rdf/language "en-us",
                    :rdf/value
                    "Specifies the date/time the directory was last accessed."}
                   {:rdf/language "en-us",
                    :rdf/value
                    "Specifies the date/time the file was last accessed."}},
   :rdfs/label   "atime",
   :rdfs/range   :xsd/dateTime})

(def attributed-to
  {:db/ident :stix/attributed-to,
   :rdf/type :owl/ObjectProperty})

(def authored-by
  {:db/ident :stix/authored-by,
   :rdf/type :owl/ObjectProperty})

(def authority_key_identifier
  {:db/ident :stix/authority_key_identifier,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "Specifies the identifier that provides a means of identifying the public key corresponding to the private key used to sign a certificate. Also equivalent to the object ID (OID) value of 2.5.29.35."},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "authority_key_identifier"},
   :rdfs/range :xsd/string})

(def authors
  {:db/ident :stix/authors,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{{:rdf/language "en-us",
      :rdf/value
      "The name of the author(s) of this Opinion (e.g., the analyst(s) that created it)."}
     {:rdf/language "en-us",
      :rdf/value
      "The name of the author(s) of this note (e.g., the analyst(s) that created it)."}},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "authors"},
   :rdfs/range :xsd/string})

(def base_of_code
  {:db/ident :stix/base_of_code,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the address that is relative to the image base of the beginning-of-code section when it is loaded into memory."},
   :rdfs/label "base_of_code",
   :rdfs/range :xsd/integer})

(def base_of_data
  {:db/ident     :stix/base_of_data,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en-us",
                  :rdf/value    "base_of_data"},
   :rdfs/label   "base_of_data",
   :rdfs/range   :xsd/integer})

(def based-on
  {:db/ident :stix/based-on,
   :rdf/type :owl/ObjectProperty})

(def basic_constraints
  {:db/ident :stix/basic_constraints,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "Specifies a multi-valued extension which indicates whether a certificate is a CA certificate. The first (mandatory) name is CA followed by TRUE or FALSE. If CA is TRUE, then an optional pathlen name followed by a non-negative value can be included. Also equivalent to the object ID (OID) value of 2.5.29.19."},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "basic_constraints"},
   :rdfs/range :xsd/string})

(def bcc_refs
  {:db/ident :stix/bcc_refs,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the mailboxes that are \"BCC:\" recipients of the email message. As per [RFC5322], the absence of this property should not be interpreted as semantically equivalent to an absent BCC header on the message being characterized. The objects referenced in this list MUST be of type email-address."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "bcc_refs"},
   :rdfs/range :stix/EmailAddress})

(def bcc_refs_string
  {:db/ident :stix/bcc_refs_string,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the mailboxes that are \"BCC:\" recipients of the email message. As per [RFC5322], the absence of this property should not be interpreted as semantically equivalent to an absent BCC header on the message being characterized. The objects referenced in this list MUST be of type email-address."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "bcc_refs_string"},
   :rdfs/range :xsd/string})

(def beacons-to
  {:db/ident :stix/beacons-to,
   :rdf/type :owl/ObjectProperty})

(def belongs_to_ref
  {:db/ident :stix/belongs_to_ref,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "Specifies the user account that the email address belongs to, as a reference to a User Account object. The object referenced in this property MUST be of type user-account."},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "belongs_to_ref"},
   :rdfs/range :stix/UserAccount})

(def belongs_to_ref_string
  {:db/ident :stix/belongs_to_ref_string,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "Specifies the user account that the email address belongs to, as a reference to a User Account object. The object referenced in this property MUST be of type user-account."},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "belongs_to_ref_id"},
   :rdfs/range :xsd/string})

(def belongs_to_refs
  {:db/ident :stix/belongs_to_refs,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{{:rdf/language "en-US",
      :rdf/value
      "Specifies a list of references to one or more autonomous systems (AS) that the IPv4 address belongs to. The objects referenced in this list MUST be of type autonomous-system."}
     {:rdf/language "en-US",
      :rdf/value
      "Specifies a list of references to one or more autonomous systems (AS) that the IPv6 address belongs to. The objects referenced in this list MUST be of type autonomous-system."}},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "belongs_to_refs"},
   :rdfs/range :stix/AutonomousSystem})

(def belongs_to_refs_string
  {:db/ident :stix/belongs_to_refs_string,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{{:rdf/language "en-US",
      :rdf/value
      "Specifies a list of references to one or more autonomous systems (AS) that the IPv4 address belongs to. The objects referenced in this list MUST be of type autonomous-system."}
     {:rdf/language "en-US",
      :rdf/value
      "Specifies a list of references to one or more autonomous systems (AS) that the IPv6 address belongs to. The objects referenced in this list MUST be of type autonomous-system."}},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "belongs_to_refs_string"},
   :rdfs/range :xsd/string})

(def bits_per_pixel
  {:db/ident :stix/bits_per_pixel,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the sum of bits used for each color channel in the image file, and thus the total number of pixels used for expressing the color depth of the image."},
   :rdfs/label "bits_per_pixel",
   :rdfs/range :xsd/integer})

(def body
  {:db/ident   :stix/body,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "body"},
   :rdfs/range :xsd/string})

(def body_multipart
  {:db/ident :stix/body_multipart,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies a list of the MIME parts that make up the email body. This property MUST NOT be used if is_multipart is false."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "body_multipart"},
   :rdfs/range :stix/EmailMimePartType})

(def body_raw_ref
  {:db/ident :stix/body_raw_ref,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the contents of non-textual MIME parts, that is those whose content_type does not start with text/, as a reference to an Artifact object or File object. The object referenced in this property MUST be of type artifact or file. For use cases where conveying the actual data contained in the MIME part is of primary importance, artifact SHOULD be used. Otherwise, for use cases where conveying metadata about the file-like properties of the MIME part is of primary importance, file SHOULD be used."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "body_raw_ref"},
   :rdfs/range #{:stix/Artifact :stix/File}})

(def body_raw_ref_string
  {:db/ident :stix/body_raw_ref_string,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the contents of non-textual MIME parts, that is those whose content_type does not start with text/, as a reference to an Artifact object or File object. The object referenced in this property MUST be of type artifact or file. For use cases where conveying the actual data contained in the MIME part is of primary importance, artifact SHOULD be used. Otherwise, for use cases where conveying metadata about the file-like properties of the MIME part is of primary importance, file SHOULD be used."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "body_raw_ref_string"},
   :rdfs/range :xsd/string})

(def building_details
  {:db/ident :stix/building_details,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies additional details about the location within a building including things like floor, room, etc."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "building details"},
   :rdfs/range :xsd/string})

(def can_escalate_privs
  {:db/ident :stix/can_escalate_privs,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies that the account has the ability to escalate privileges (i.e., in the case of sudo on Unix or a Windows Domain Admin account)."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "can_escalate_privs"},
   :rdfs/range :xsd/boolean})

(def capabilities
  {:db/ident :stix/capabilities,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Any of the capabilities identified for the malware instance or family. The values for this property SHOULD come from the malware-capabilities-ov open vocabulary."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "capabilities"}})

(def categorizedBy
  {:db/ident :stix/categorizedBy,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "the categorized by property specifies the instance of a category"},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "categorizedBy"},
   :rdfs/range :stix/StixCategoryObject})

(def cc_refs
  {:db/ident :stix/cc_refs,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the mailboxes that are \"CC:\" recipients of the email message. The objects referenced in this list MUST be of type email-address."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "cc_refs"},
   :rdfs/range :stix/EmailAddress})

(def cc_refs_string
  {:db/ident :stix/cc_refs_string,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the mailboxes that are \"CC:\" recipients of the email message. The objects referenced in this list MUST be of type email-address."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "cc_refs_string"},
   :rdfs/range :xsd/string})

(def certificate_policies
  {:db/ident :stix/certificate_policies,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "Specifies a sequence of one or more policy information terms, each of which consists of an object identifier (OID) and optional qualifiers. Also equivalent to the object ID (OID) value of 2.5.29.32."},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "certificate_policies"},
   :rdfs/range :xsd/string})

(def characteristics_hex
  {:db/ident :stix/characteristics_hex,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value "Specifies the flags that indicate the file's characteristics."},
   :rdfs/label "characteristics_hex",
   :rdfs/range :xsd/hexBinary})

(def characterizes
  {:db/ident :stix/characterizes,
   :rdf/type :owl/ObjectProperty})

(def checksum_hex
  {:db/ident     :stix/checksum_hex,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en-us",
                  :rdf/value    "Specifies the checksum of the PE binary."},
   :rdfs/label   {:rdf/language "en-us",
                  :rdf/value    "checksum_hex"},
   :rdfs/range   :xsd/hexBinary})

(def child_refs
  {:db/ident :stix/child_refs,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the other processes that were spawned by (i.e. children of) this process, as a reference to one or more other Process objects. The objects referenced in this list MUST be of type process."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "child_refs"},
   :rdfs/range :stix/Process})

(def child_refs_string
  {:db/ident :stix/child_refs_string,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the other processes that were spawned by (i.e. children of) this process, as a reference to one or more other Process objects. The objects referenced in this list MUST be of type process."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "child_refs_string"},
   :rdfs/range :xsd/string})

(def city
  {:db/ident     :stix/city,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en-us",
                  :rdf/value    "The city that this Location describes."},
   :rdfs/label   {:rdf/language "en-us",
                  :rdf/value    "city"},
   :rdfs/range   :xsd/string})

(def command_line
  {:db/ident :stix/command_line,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the full command line used in executing the process, including the process name (which may be specified individually via the image_ref.name property) and any arguments."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "command_line"},
   :rdfs/range :xsd/string})

(def comment
  {:db/ident     :stix/comment,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en-us",
                  :rdf/value
                  "Specifies a comment included as part of the archive file."},
   :rdfs/label   "comment",
   :rdfs/range   :xsd/string})

(def communicates-with
  {:db/ident :stix/communicates-with,
   :rdf/type :owl/ObjectProperty})

(def compromises
  {:db/ident :stix/compromises,
   :rdf/type :owl/ObjectProperty})

(def confidence
  {:db/ident :stix/confidence,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The confidence property identifies the confidence that the creator has in the correctness of their data. The confidence value MUST be a number in the range of 0-100. \\n\\n Appendix A contains a table of normative mappings to other confidence scales that MUST be used when presenting the confidence value in one of those scales. \\n\\n If the confidence property is not present, then the confidence of the content is unspecified."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "confidence"},
   :rdfs/range :xsd/nonNegativeInteger})

(def configuration_version
  {:db/ident :stix/configuration_version,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The named configuration of additional product configuration parameters for this analysis run. For example, when a product is configured to do full depth analysis of Window™ PE files. This configuration may have a named version and that named version can be captured in this property. This will ensure additional runs can be configured in the same way."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "configuration_version"},
   :rdfs/range :xsd/string})

(def consists-of
  {:db/ident :stix/consists-of,
   :rdf/type :owl/ObjectProperty})

(def contact_information
  {:db/ident :stix/contact_information,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The contact information (e-mail, phone number, etc.) for this Identity. No format for this information is currently defined by this specification."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "contact_information"},
   :rdfs/range :xsd/string})

(def contains_refs
  {:db/ident :stix/contains_refs,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies a list of references to other File and/or Directory objects contained within the directory. The objects referenced in this list MUST be of type file or directory."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "contains_refs"},
   :rdfs/range #{:stix/StixCyberObservable
                 {:owl/unionOf [:stix/File :stix/Directory],
                  :rdf/type    :owl/Class}}})

(def contains_refs_string
  {:db/ident :stix/contains_refs_string,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies a list of references to other File and/or Directory objects contained within the directory. The objects referenced in this list MUST be of type file or directory."},
   :rdfs/label #{{:rdf/language "en-us",
                  :rdf/value    "contains_refs_id"}
                 {:rdf/language "en-us",
                  :rdf/value    "contains_refs_string"}},
   :rdfs/range :xsd/string})

(def content
  {:db/ident     :stix/content,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en-us",
                  :rdf/value    "The content of the note."},
   :rdfs/label   {:rdf/language "en-us",
                  :rdf/value    "content"},
   :rdfs/range   :xsd/string})

(def content_disposition
  {:db/ident :stix/content_disposition,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the value of the \"Content-Disposition\" header field of the MIME part."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "content_disposition"},
   :rdfs/range :xsd/string})

(def content_ref
  {:db/ident :stix/content_ref,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the content of the file, represented as an Artifact object. The object referenced in this property MUST be of type artifact."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "content_ref"},
   :rdfs/range :stix/Artifact})

(def content_ref_string
  {:db/ident :stix/content_ref_string,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the content of the file, represented as an Artifact object. The object referenced in this property MUST be of type artifact."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "content_ref_string"},
   :rdfs/range :xsd/string})

(def content_type
  {:db/ident   :stix/content_type,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "content_type"},
   :rdfs/range :xsd/string})

(def contents
  {:db/ident :stix/contents,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The contents property contains the actual Language Content (translation). \\n\\n The keys in the dictionary MUST be RFC 5646 language codes for which language content is being provided [RFC5646]. The values each consist of a dictionary that mirrors the properties in the target object (identified by object_ref and object_modified). For example, to provide a translation of the name property on the target object the key in the dictionary would be name. \\n\\n For each key in the nested dictionary: \\n\\n If the original property is a string, the corresponding property in the language content object MUST contain a string with the content for that property in the language of the top-level key. \\n\\n If the original property is a list, the corresponding property in the translation object must also be a list. Each item in this list recursively maps to the item at the same position in the list contained in the target object. The lists MUST have the same length. \\n\\n In the event that translations are only provided for some list items, the untranslated list items MUST be represented by an empty string (\"\"). This indicates to a consumer of the Language Content object that they should interpolate the translated list items in the Language Content object with the corresponding (untranslated) list items from the original object as indicated by the object_ref property. \\n\\n If the original property is an object (including dictionaries), the corresponding location in the translation object must also be an object. Each key/value field in this object recursively maps to the object with the same key in the original. \\n\\n The translation object MAY contain only a subset of the translatable fields of the original. Keys that point to non-translatable properties in the target or to properties that do not exist in the target object MUST be ignored."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "contents"},
   :rdfs/range :stix/Dictionary})

(def context
  {:db/ident :stix/context,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "A short descriptor of the particular context shared by the content referenced by the Grouping. The value for this property SHOULD come from the grouping-context-ov open vocabulary."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "context"}})

(def controls
  {:db/ident :stix/controls,
   :rdf/type :owl/ObjectProperty})

(def count
  {:db/ident :stix/count,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "If present, this MUST be an integer between 0 and 999,999,999 inclusive and represents the number of times the SDO referenced by the sighting_of_ref property was sighted. Observed Data has a similar property called number_observed, which refers to the number of times the data was observed. These counts refer to different concepts and are distinct. For example, a single sighting of a DDoS bot might have many millions of observations of the network traffic that it generates. Thus, the Sighting count would be 1 (the bot was observed once) but the Observed Data number_observed would be much higher. As another example, a sighting with a count of 0 can be used to express that an indicator was not seen at all."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "count"},
   :rdfs/range :xsd/nonNegativeInteger})

(def country
  {:db/ident :stix/country,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The country that this Location describes. This property SHOULD contain a valid ISO 3166-1 ALPHA-2 Code [ISO3166-1]."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "country"},
   :rdfs/range :xsd/string})

(def cpe
  {:db/ident :stix/cpe,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the Common Platform Enumeration (CPE) entry for the software, if available. The value for this property MUST be a CPE v2.3 entry from the official NVD CPE Dictionary [NVD]. While the CPE dictionary does not contain entries for all software, whenever it does contain an identifier for a given instance of software, this property SHOULD be present."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "cpe"},
   :rdfs/range :xsd/string})

(def created
  {:db/ident :stix/created,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The created property represents the time at which the object was originally created. The object creator can use the time it deems most appropriate as the time the object was created. The minimum precision MUST be milliseconds (three digits after the decimal place in seconds), but MAY be more precise. The created property MUST NOT be changed when creating a new version of the object. See section 3.6 for further definition of versioning."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "created"},
   :rdfs/range :xsd/dateTime})

(def created_by_ref
  {:db/ident :stix/created_by_ref,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The created_by_ref property specifies the id property of the identity object that describes the entity that created this object. \\n\\n If this attribute is omitted, the source of this information is undefined. This may be used by object creators who wish to remain anonymous."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "created_by_ref"},
   :rdfs/range :stix/Identity})

(def created_by_ref_string
  {:db/ident :stix/created_by_ref_string,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The created_by_ref property specifies the id property of the identity object that describes the entity that created this object. \\n\\n If this attribute is omitted, the source of this information is undefined. This may be used by object creators who wish to remain anonymous."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "created_by_ref_string"},
   :rdfs/range :xsd/string})

(def created_time
  {:db/ident     :stix/created_time,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en-us",
                  :rdf/value
                  "Specifies the date/time at which the process was created."},
   :rdfs/label   {:rdf/language "en-us",
                  :rdf/value    "created_time"},
   :rdfs/range   :xsd/dateTime})

(def creator_user_ref
  {:db/ident :stix/creator_user_ref,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{{:rdf/language "en-us",
      :rdf/value
      "Specifies the user that created the process, as a reference to a User Account object. The object referenced in this property MUST be of type user-account."}
     {:rdf/language "en-us",
      :rdf/value
      "Specifies a reference to the user account that created the registry key. The object referenced in this property MUST be of type user-account."}},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "creator_user_ref"},
   :rdfs/range :stix/UserAccount})

(def creator_user_ref_string
  {:db/ident :stix/creator_user_ref_string,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{{:rdf/language "en-us",
      :rdf/value
      "Specifies the user that created the process, as a reference to a User Account object. The object referenced in this property MUST be of type user-account."}
     {:rdf/language "en-us",
      :rdf/value
      "Specifies a reference to the user account that created the registry key. The object referenced in this property MUST be of type user-account."}},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "creator_user_ref_string"},
   :rdfs/range :xsd/string})

(def credential
  {:db/ident :stix/credential,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies a cleartext credential. This is only intended to be used in capturing metadata from malware analysis (e.g., a hard-coded domain administrator password that the malware attempts to use for lateral movement) and SHOULD NOT be used for sharing of PII."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "credential"},
   :rdfs/range :xsd/string})

(def credential_last_changed
  {:db/ident     :stix/credential_last_changed,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en-us",
                  :rdf/value
                  "Specifies when the account credential was last changed."},
   :rdfs/label   {:rdf/language "en-us",
                  :rdf/value    "credential_last_changed"},
   :rdfs/range   :xsd/dateTime})

(def crl_distribution_points
  {:db/ident :stix/crl_distribution_points,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "Specifies how CRL information is obtained. Also equivalent to the object ID (OID) value of 2.5.29.31."},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "crl_distribution_points"},
   :rdfs/range :xsd/string})

(def ctime
  {:db/ident     :stix/ctime,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment #{{:rdf/language "en-us",
                    :rdf/value
                    "Specifies the date/time the directory was created."}
                   {:rdf/language "en-us",
                    :rdf/value
                    "Specifies the date/time the file was created."}},
   :rdfs/label   "ctime",
   :rdfs/range   :xsd/dateTime})

(def cwd
  {:db/ident     :stix/cwd,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en-us",
                  :rdf/value
                  "Specifies the current working directory of the process."},
   :rdfs/label   {:rdf/language "en-us",
                  :rdf/value    "cwd"},
   :rdfs/range   :xsd/string})

(def data
  {:db/ident     :stix/data,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en-us",
                  :rdf/value
                  "Specifies the data contained in the registry value."},
   :rdfs/label   {:rdf/language "en-us",
                  :rdf/value    "data"},
   :rdfs/range   :xsd/string})

(def data_type
  {:db/ident :stix/data_type,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the registry (REG_*) data type used in the registry value.\\n\\nThe values of this property MUST come from the windows-registry-datatype-enum enumeration."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "data_type"}})

(def date
  {:db/ident     :stix/date,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en-us",
                  :rdf/value
                  "Specifies the date/time that the email message was sent."},
   :rdfs/label   {:rdf/language "en-us",
                  :rdf/value    "date"},
   :rdfs/range   :xsd/dateTime})

(def decryption_key
  {:db/ident :stix/decryption_key,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the decryption key for the encrypted binary data (either via payload_bin or url). For example, this may be useful in cases of sharing malware samples, which are often encoded in an encrypted archive. This property MUST NOT be present when the encryption_algorithm property is absent."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "decryption_key"},
   :rdfs/range :xsd/string})

(def defanged
  {:db/ident :stix/defanged,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "This property defines whether or not the data contained within the object has been defanged. The default value for this property is false. This property MUST NOT be used on any STIX Objects other than SCOs."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "defanged"},
   :rdfs/range :xsd/boolean})

(def definition
  {:db/ident :stix/definition,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies a reference to the marking-definition object that describes the marking.\\n\\nIf the lang property is not present, this property MUST be present. If the lang property is present, this property MUST NOT be present.@[en-US}"},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "definition"},
   :rdfs/range #{:stix/TLPMarking :stix/StatementMarking}})

(def definition_type
  {:db/ident     :stix/definition_type,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment "Specifies the type of Marking Definition.",
   :rdfs/label   "definition_type",
   :rdfs/range   {:owl/oneOf [{:rdf/value "statement"} {:rdf/value "tlp"}],
                  :rdf/type  :rdfs/Datatype}})

(def delivers
  {:db/ident :stix/delivers,
   :rdf/type :owl/ObjectProperty})

(def dep_enabled
  {:db/ident :stix/dep_enabled,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies whether Data Execution Prevention (DEP) is enabled for the process."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "dep_enabled"},
   :rdfs/range :xsd/boolean})

(def description
  {:db/ident :stix/description,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{{:rdf/language "en-us",
      :rdf/value
      "A description that provides more details and context about the Grouping, potentially including its purpose and its key characteristics."}
     {:rdf/language "en-us",
      :rdf/value    "A human readable description."}
     {:rdf/language "en-us",
      :rdf/value
      "A description that provides more details and context about the Sighting."}
     {:rdf/language "en-us",
      :rdf/value
      "A description that provides more details and context about the Campaign, potentially including its purpose and its key characteristics."}
     {:rdf/language "en-us",
      :rdf/value
      "A description that provides more details and context about the Report, potentially including its purpose and its key characteristics."}
     {:rdf/language "en-us",
      :rdf/value
      "A description that provides more details and context about the malware instance or family, potentially including its purpose and its key characteristics."}
     {:rdf/language "en-US",
      :rdf/value
      "A description that provides more details and context about the Relationship, potentially including its purpose and its key characteristics."}
     {:rdf/language "en-us",
      :rdf/value
      "A description that provides more details and context about the Incident, potentially including its purpose and its key characteristics."}
     {:rdf/language "en-us",
      :rdf/value
      "A description that provides more details and context about the Course of Action, potentially including its purpose and its key characteristics."}
     {:rdf/language "en-us",
      :rdf/value
      "A description that provides more details and context about the Infrastructure, potentially including its purpose, how it is being used, how it relates to other intelligence activities captured in related objects, and its key characteristics."}
     {:rdf/language "en-us",
      :rdf/value
      "A description that provides more details and context about the Indicator, potentially including its purpose and its key characteristics. Producers SHOULD provide this property to help products and analysts understand what this Indicator actually does."}
     {:rdf/language "en-us",
      :rdf/value
      "A description that provides more details and context about the Attack Pattern, potentially including its purpose and its key characteristics."}
     {:rdf/language "en-us",
      :rdf/value
      "A description that provides more details and context about the Threat Actor, potentially including its purpose and its key characteristics."}
     {:rdf/language "en-us",
      :rdf/value
      "A description that provides more details and context about the Intrusion Set, potentially including its purpose and its key characteristics."}
     {:rdf/language "en-us",
      :rdf/value
      "A description that provides more details and context about the Tool, potentially including its purpose and its key characteristics."}
     {:rdf/language "en-us",
      :rdf/value    "A textual description of the Location."}
     {:rdf/language "en-us",
      :rdf/value
      "A description that provides more details and context about the Identity, potentially including its purpose and its key characteristics."}
     {:rdf/language "en",
      :rdf/value
      "A detailed explanation of what data the extension conveys and how it is intended to be used. \\n\\n While the description property is optional this property SHOULD be populated. \\n\\n Note that the schema property is the normative definition of the extension, and this property, if present, is for documentation purposes only."}
     {:rdf/language "en-us",
      :rdf/value
      "A description that provides more details and context about the Vulnerability, potentially including its purpose and its key characteristics."}},
   :rdfs/label #{{:rdf/language "en-US",
                  :rdf/value    "description"}
                 {:rdf/language "en",
                  :rdf/value    "description"}
                 {:rdf/language "en-us",
                  :rdf/value    "description"} "description"},
   :rdfs/range :xsd/string})

(def descriptions
  {:db/ident     :stix/descriptions,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en-us",
                  :rdf/value
                  "Specifies the descriptions defined for the service."},
   :rdfs/label   {:rdf/language "en-us",
                  :rdf/value    "descriptions"},
   :rdfs/range   :xsd/string})

(def dictionary_key
  {:db/ident :stix/dictionary_key,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies a unique identifer for some item of data.  The key MUST be in ASCII, and are limited to the characters a-z (lowercase ASCII), A-Z (uppercase ASCII), numerals 0-9, hyphen (-), and underscore (_). A key identifier MUST be no longer than 250 ASCII characters in length and SHOULD be lowercase."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "dictionary_key"},
   :rdfs/range :xsd/string})

(def dictionary_value
  {:db/ident :stix/dictionary_value,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "A key value is the data that is associated with the key identified. The values MUST be valid property base types."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "dictionary_value"},
   :rdfs/range #{:xsd/anyURI :xsd/string :stix/StixObject :xsd/float
                 :xsd/integer}})

(def display_name
  {:db/ident :stix/display_name,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{{:rdf/language "en-us",
      :rdf/value
      "Specifies the display name of the service in Windows GUI controls."}
     {:rdf/language "en-US",
      :rdf/value
      "Specifies a single email display name, i.e., the name that is displayed to the human user of a mail application. This property corresponds to the display-name construction in section 3.4 of [RFC5322], for example, Jane Smith."}
     {:rdf/language "en-us",
      :rdf/value
      "Specifies the display name of the account, to be shown in user interfaces, if applicable. On Unix, this is equivalent to the GECOS field."}},
   :rdfs/label #{{:rdf/language "en-us",
                  :rdf/value    "display_name"}
                 {:rdf/language "en-US",
                  :rdf/value    "display_name"}},
   :rdfs/range :xsd/string})

(def dll_characteristics_hex
  {:db/ident     :stix/dll_characteristics_hex,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en-us",
                  :rdf/value
                  "Specifies the flags that characterize the PE binary."},
   :rdfs/label   "dll_characteristics_hex",
   :rdfs/range   :xsd/hexBinary})

(def document_info_dict
  {:db/ident :stix/document_info_dict,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies details of the PDF document information dictionary (DID), which includes properties like the document creation data and producer, as a dictionary. Each key in the dictionary SHOULD be a case-preserved version of the corresponding entry in the document information dictionary without the prepended forward slash, e.g., Title. The corresponding value for the key MUST be the value specified for the document information dictionary entry, as a string."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "document_info_dict"},
   :rdfs/range :stix/Dictionary})

(def downloads
  {:db/ident :stix/downloads,
   :rdf/type :owl/ObjectProperty})

(def drops
  {:db/ident :stix/drops,
   :rdf/type :owl/ObjectProperty})

(def dst_byte_count
  {:db/ident :stix/dst_byte_count,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the number of bytes, as a positive integer, sent from the destination to the source."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "dst_byte_count"},
   :rdfs/range :xsd/nonNegativeInteger})

(def dst_flags_hex
  {:db/ident :stix/dst_flags_hex,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the destination TCP flags, as the union of all TCP flags observed between the start of the traffic (as defined by the start property) and the end of the traffic (as defined by the end property). If the start and end times of the traffic are not specified, this property SHOULD be interpreted as the union of all TCP flags observed over the entirety of the network traffic being reported upon."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "dst_flags_hex"},
   :rdfs/range :xsd/hexBinary})

(def dst_packets
  {:db/ident :stix/dst_packets,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the number of packets, as a positive integer, sent from the destination to the source."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "dst_packets"},
   :rdfs/range :xsd/nonNegativeInteger})

(def dst_payload_ref
  {:db/ident :stix/dst_payload_ref,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the bytes sent from the destination to the source. The object referenced in this property MUST be of type artifact."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "dst_payload_ref"},
   :rdfs/range :stix/Artifact})

(def dst_payload_ref_string
  {:db/ident :stix/dst_payload_ref_string,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the bytes sent from the destination to the source. The object referenced in this property MUST be of type artifact."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "dst_payload_ref_string"},
   :rdfs/range :xsd/string})

(def dst_port
  {:db/ident :stix/dst_port,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the destination port used in the network traffic, as an integer. The port value MUST be in the range of 0 - 65535."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "dst_port"},
   :rdfs/range {:owl/onDatatype :xsd/nonNegativeInteger,
                :owl/withRestrictions [{:xsd/maxInclusive 65535M}],
                :rdf/type       :rdfs/Datatype}})

(def dst_ref
  {:db/ident :stix/dst_ref,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the destination of the network traffic, as a reference to a Cyber-observable Object. The object referenced MUST be of type ipv4-addr, ipv6-addr, mac-addr, or domain-name (for cases where the IP address for a domain name is unknown)."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "dst_ref"},
   :rdfs/range {:owl/unionOf [:stix/DomainName
                              :stix/IPv4Address
                              :stix/IPv6Address
                              :stix/MACAddress],
                :rdf/type    :owl/Class}})

(def dst_ref_string
  {:db/ident :stix/dst_ref_string,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the destination of the network traffic, as a reference to a Cyber-observable Object. The object referenced MUST be of type ipv4-addr, ipv6-addr, mac-addr, or domain-name (for cases where the IP address for a domain name is unknown)."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "dst_ref_string"},
   :rdfs/range :xsd/string})

(def dynamic-analysis-of
  {:db/ident :stix/dynamic-analysis-of,
   :rdf/type :owl/ObjectProperty})

(def encapsulated_by_ref
  {:db/ident :stix/encapsulated_by_ref,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Links to another network-traffic object which encapsulates this object. The object referenced in this property MUST be of type network-traffic."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "encapsulated_by_ref"},
   :rdfs/range :stix/NetworkTraffic})

(def encapsulated_by_ref_string
  {:db/ident :stix/encapsulated_by_ref_string,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Links to another network-traffic object which encapsulates this object. The object referenced in this property MUST be of type network-traffic."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "encapsulated_by_ref_string"},
   :rdfs/range :xsd/string})

(def encapsulates_refs
  {:db/ident :stix/encapsulates_refs,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Links to other network-traffic objects encapsulated by this network-traffic object. The objects referenced in this property MUST be of type network-traffic."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "encapsulates_refs"},
   :rdfs/range :stix/NetworkTraffic})

(def encapsulates_refs_string
  {:db/ident :stix/encapsulates_refs_string,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Links to other network-traffic objects encapsulated by this network-traffic object. The objects referenced in this property MUST be of type network-traffic."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "encapsulates_refs_string"},
   :rdfs/range :xsd/string})

(def encryption_algorithm
  {:db/ident :stix/encryption_algorithm,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "If the artifact is encrypted, specifies the type of encryption algorithm the binary data  (either via payload_bin or url) is encoded in. The value of this property MUST come from the encryption-algorithm-enum enumeration. If both mime_type and encryption_algorithm are included, this signifies that the artifact represents an encrypted archive."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "encryption algorithm"}})

(def end
  {:db/ident :stix/end,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the date/time the network traffic ended, if known. If the is_active property is true, then the end property MUST NOT be included. If this property and the start property are both defined, then this property MUST be greater than or equal to the timestamp in the start property."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "end"},
   :rdfs/range :xsd/dateTime})

(def entropy
  {:db/ident :stix/entropy,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the calculated entropy for the section, as calculated using the Shannon algorithm (https://en.wiktionary.org/wiki/Shannon_entropy). The size of each input character is defined as a byte, resulting in a possible range of 0 through 8."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "entropy"},
   :rdfs/range :xsd/float})

(def environment_variables
  {:db/ident :stix/environment_variables,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the list of environment variables associated with the process as a dictionary. Each key in the dictionary MUST be a case preserved version of the name of the environment variable, and each corresponding value MUST be the environment variable value as a string."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "environment_variables"},
   :rdfs/range :stix/Dictionary})

(def exfiltrate-to
  {:db/ident :stix/exfiltrate-to,
   :rdf/type :owl/ObjectProperty})

(def exif_tags
  {:db/ident :stix/exif_tags,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the set of EXIF tags found in the image file, as a dictionary. Each key/value pair in the dictionary represents the name/value of a single EXIF tag. Accordingly, each dictionary key MUST be a case-preserved version of the EXIF tag name, e.g., XResolution. Each dictionary value MUST be either an integer (for int* EXIF datatypes) or a string (for all other EXIF datatypes)."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "exif_tags"},
   :rdfs/range :stix/Dictionary})

(def explanation
  {:db/ident :stix/explanation,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "An explanation of why the producer has this Opinion. For example, if an Opinion of strongly-disagree is given, the explanation can contain an explanation of why the Opinion producer disagrees and what evidence they have for their disagreement."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "explanation"},
   :rdfs/range :xsd/string})

(def exploits
  {:db/ident :stix/exploits,
   :rdf/type :owl/ObjectProperty})

(def extended_key_usage
  {:db/ident :stix/extended_key_usage,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "Specifies a list of usages indicating purposes for which the certificate public key can be used for. Also equivalent to the object ID (OID) value of 2.5.29.37."},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "extended_key_usage"},
   :rdfs/range :xsd/string})

(def extension_properties
  {:db/ident :stix/extension_properties,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This property contains the list of new property names that are added to an object by an extension. \\n\\n This property MUST only be used when the extension_types property includes a value of toplevel-property-extension. In other words, when new properties are being added at the top-level of an existing object."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "extension_properties"},
   :rdfs/range :xsd/string})

(def extension_types
  {:db/ident :stix/extension_types,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "This property specifies one or more extension types contained within this extension. \\n\\n The values for this property MUST come from the extension-type-enum enumeration. \\n\\n When this property includes toplevel-property-extension then the  extension_properties property SHOULD include one or more property names."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "extension_types"}})

(def extensions
  {:db/ident :stix/extensions,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies any extensions of the object, as a dictionary. \\n\\n Dictionary keys SHOULD be the id of a STIX Extension object or the name of a predefined object extension found in this specification, depending on the type of extension being used. \\n\\n The corresponding dictionary values MUST contain the contents of the extension instance. \\n\\n Each extension dictionary MAY contain the property extension_type. The value of this property MUST come from the extension-type-enum enumeration. If the extension_type property is not present, then this is a predefined extension which does not use the extension facility described in section 7.3. When this extension facility is used the extension_type property MUST be present."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "extensions"},
   :rdfs/range :stix/Dictionary})

(def external_id
  {:db/ident     :stix/external_id,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en-us",
                  :rdf/value
                  "An identifier for the external reference content."},
   :rdfs/label   {:rdf/language "en-us",
                  :rdf/value    "external_id"},
   :rdfs/range   :xsd/string})

(def external_references
  {:db/ident :stix/external_references,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{{:rdf/language "en-us",
      :rdf/value
      "The external_references property specifies a list of external references which refers to non-STIX information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems."}
     {:rdf/language "en-us",
      :rdf/value
      "Specifies a list of external references which refers to non-STIX information. This property is used to provide one or more URLs, descriptions, or IDs to records in other systems."}},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "external_references"},
   :rdfs/range :stix/ExternalReference})

(def file_alignment
  {:db/ident :stix/file_alignment,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the factor (in bytes) that is used to align the raw data of sections in the image file."},
   :rdfs/label "file_alignment",
   :rdfs/range :xsd/integer})

(def file_header_hashes
  {:db/ident :stix/file_header_hashes,
   :rdf/type :owl/DatatypeProperty})

(def first_observed
  {:db/ident :stix/first_observed,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The beginning of the time window during which the data was seen."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "first_observed"},
   :rdfs/range :xsd/dateTime})

(def first_seen
  {:db/ident   :stix/first_seen,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/range :xsd/dateTime})

(def from_ref
  {:db/ident :stix/from_ref,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the value of the \"From:\" header of the email message. The \"From:\" field specifies the author of the message, that is, the mailbox(es) of the person or system responsible for the writing of the message. The object referenced in this property MUST be of type email-address."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "from_ref"},
   :rdfs/range :stix/EmailAddress})

(def from_ref_string
  {:db/ident :stix/from_ref_string,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the value of the \"From:\" header of the email message. The \"From:\" field specifies the author of the message, that is, the mailbox(es) of the person or system responsible for the writing of the message. The object referenced in this property MUST be of type email-address."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "from_ref_string"},
   :rdfs/range :xsd/string})

(def gid
  {:db/ident     :stix/gid,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en-us",
                  :rdf/value "Specifies the primary group ID of the account."},
   :rdfs/label   {:rdf/language "en-us",
                  :rdf/value    "gid"},
   :rdfs/range   :xsd/integer})

(def goals
  {:db/ident :stix/goals,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{{:rdf/language "en-us",
      :rdf/value
      "The high-level goals of this Threat Actor, namely, what are they trying to do. For example, they may be motivated by personal gain, but their goal is to steal credit card numbers. To do this, they may execute specific Campaigns that have detailed objectives like compromising point of sale systems at a large retailer."}
     {:rdf/language "en-us",
      :rdf/value
      "The high-level goals of this Intrusion Set, namely, what are they trying to do. For example, they may be motivated by personal gain, but their goal is to steal credit card numbers. To do this, they may execute specific Campaigns that have detailed objectives like compromising point of sale systems at a large retailer. Another example: to gain information about latest merger and IPO information from ACME Bank."}},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "goals"},
   :rdfs/range :xsd/string})

(def granular_markings
  {:db/ident :stix/granular_markings,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The granular_markings property specifies a list of granular markings applied to this object. \\n\\n In some cases, though uncommon, marking definitions themselves may be marked with sharing or handling guidance. In this case, this property MUST NOT contain any references to the same Marking Definition object (i.e., it cannot contain any circular references). \\n\\n See section 7.2 for further definition of data markings."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "granular_markings"},
   :rdfs/range :stix/GranularMarking})

(def group_name
  {:db/ident :stix/group_name,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies whether Address Space Layout Randomization (ASLR) is enabled for the process."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "group_name"},
   :rdfs/range :xsd/string})

(def groups
  {:db/ident :stix/groups,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies a list of names of groups that the account is a member of."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "groups"},
   :rdfs/range :xsd/string})

(def has
  {:db/ident :stix/has,
   :rdf/type :owl/ObjectProperty})

(def hash_algorithm
  {:db/ident :stix/hash_algorithm,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Represents the cryptographic hash algorithm used.\\n\\nThe name of the cryptographic hash algorithm used SHOULD come from one of the values defined in the hash-algorithm-ov open vocabulary."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "hash_algorithm"}})

(def hash_value
  {:db/ident     :stix/hash_value,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en-us",
                  :rdf/value    "Represents the cryptographic hash value."},
   :rdfs/label   {:rdf/language "en-us",
                  :rdf/value    "hash_value"},
   :rdfs/range   :xsd/string})

(def hashes
  {:db/ident :stix/hashes,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{{:rdf/language "en-us",
      :rdf/value
      "Specifies a dictionary of hashes for the contents of the url. This SHOULD be provided when the url property is present. \\n\\n Dictionary keys MUST come from one of the entries listed in the hash-algorithm-ov open vocabulary. \\n\\n As stated in Section 2.7, to ensure interoperability, a SHA-256 hash SHOULD be included whenever possible."}
     {:rdf/language "en-us",
      :rdf/value
      "Specifies a dictionary of hashes for the contents of the url or the payload_bin. This property MUST be present when the url property is present. Dictionary keys MUST come from the hash-algorithm-ov open vocabulary."}},
   :rdfs/label #{{:rdf/language "en-us",
                  :rdf/value    "hashes"} "hashes"},
   :rdfs/range :stix/Hashes})

(def home_dir
  {:db/ident     :stix/home_dir,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en-us",
                  :rdf/value    "Specifies the home directory of the account."},
   :rdfs/label   {:rdf/language "en-us",
                  :rdf/value    "home_dir"},
   :rdfs/range   :xsd/string})

(def host_vm_ref
  {:db/ident :stix/host_vm_ref,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "A description of the virtual machine environment used to host the guest operating system (if applicable) that was used for the dynamic analysis of the malware instance or family. If this value is not included in conjunction with the operating_system_ref property, this means that the dynamic analysis may have been performed on bare metal (i.e. without virtualization) or the information was redacted. The value of this property MUST be the identifier for a SCO software object."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "host_vm_ref"},
   :rdfs/range :stix/Software})

(def host_vm_ref_string
  {:db/ident :stix/host_vm_ref_string,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "A description of the virtual machine environment used to host the guest operating system (if applicable) that was used for the dynamic analysis of the malware instance or family. If this value is not included in conjunction with the operating_system_ref property, this means that the dynamic analysis may have been performed on bare metal (i.e. without virtualization) or the information was redacted. The value of this property MUST be the identifier for a SCO software object."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "host_vm_ref_string"},
   :rdfs/range :xsd/string})

(def hosts
  {:db/ident :stix/hosts,
   :rdf/type :owl/ObjectProperty})

(def icmp_code_hex
  {:db/ident     :stix/icmp_code_hex,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en-us",
                  :rdf/value    "Specifies the ICMP code byte."},
   :rdfs/label   {:rdf/language "en-us",
                  :rdf/value    "icmp_code_hex"},
   :rdfs/range   :xsd/hexBinary})

(def icmp_type_hex
  {:db/ident     :stix/icmp_type_hex,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en-us",
                  :rdf/value    "Specifies the ICMP type byte."},
   :rdfs/label   {:rdf/language "en-us",
                  :rdf/value    "icmp_type_hex"},
   :rdfs/range   :xsd/hexBinary})

(def id
  {:db/ident :stix/id,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "An identifier for this Bundle. The id property for the Bundle is designed to help tools that may need it for processing, however, tools are not required to store or track it. Tools that consume STIX should not rely on the ability to refer to bundles by ID."}
     {:rdf/language "en-us",
      :rdf/value
      "The id property uniquely identifies this object. For objects that support versioning, all objects with the same id are considered different versions of the same object and the version of the object is identified by its modified property."}},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "id"}
                 {:rdf/language "en-us",
                  :rdf/value    "id"}},
   :rdfs/range :stix/identifier})

(def id_string
  {:db/ident :stix/id_string,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "An identifier for this Bundle. The id property for the Bundle is designed to help tools that may need it for processing, however, tools are not required to store or track it. Tools that consume STIX should not rely on the ability to refer to bundles by ID."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "id_string"},
   :rdfs/range :xsd/string})

(def identifier
  {:db/ident :stix/identifier,
   :rdf/type #{:owl/DatatypeProperty :owl/Class},
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "An identifier uniquely identifies a STIX Object and MAY do so in a deterministic way. A deterministic identifier means that the identifier generated by more than one producer for the exact same STIX Object using the same namespace, \"ID Contributing Properties\", and UUID method will have the exact same identifier value. \\n\\n All identifiers, excluding those used in the deprecated Cyber Observable Container, MUST follow the form object-type--UUID, where object-type is the exact value (all type names are lowercase strings, by definition) from the type property of the object being identified or referenced and where the UUID MUST be an RFC 4122-compliant UUID [RFC4122]."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "identifier"},
   :rdfs/range :xsd/string,
   :rdfs/subClassOf :stix/StixDatatype})

(def identity_class
  {:db/ident :stix/identity_class,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The type of entity that this Identity describes, e.g., an individual or organization. The value for this property SHOULD come from the identity-class-ov open vocabulary."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "identity_class"}})

(def image_base
  {:db/ident :stix/image_base,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the preferred address of the first byte of the image when loaded into memory."},
   :rdfs/label "image_base",
   :rdfs/range :xsd/integer})

(def image_height
  {:db/ident :stix/image_height,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the height of the image in the image file, in pixels."},
   :rdfs/label "image_height",
   :rdfs/range :xsd/integer})

(def image_ref
  {:db/ident :stix/image_ref,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the executable binary that was executed as the process image, as a reference to a File object. The object referenced in this property MUST be of type file."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "image_ref"},
   :rdfs/range :stix/File})

(def image_ref_string
  {:db/ident :stix/image_ref_string,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the executable binary that was executed as the process image, as a reference to a File object. The object referenced in this property MUST be of type file."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "image_ref_string"},
   :rdfs/range :xsd/string})

(def image_width
  {:db/ident :stix/image_width,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the width of the image in the image file, in pixels."},
   :rdfs/label "image_width",
   :rdfs/range :xsd/integer})

(def impersonates
  {:db/ident :stix/impersonates,
   :rdf/type :owl/ObjectProperty})

(def imphash
  {:db/ident :stix/imphash,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the special import hash, or 'imphash', calculated for the PE Binary based on its imported libraries and functions. For more information on the imphash algorithm, see the original article by Mandiant/FireEye [FireEye 2014]."},
   :rdfs/label "imphash",
   :rdfs/range :xsd/string})

(def implementation_languages
  {:db/ident :stix/implementation_languages,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The programming language(s) used to implement the malware instance or family. The values for this property SHOULD come from the implementation-language-ov open vocabulary."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "implementation_languages"}})

(def indicates
  {:db/ident :stix/indicates,
   :rdf/type :owl/ObjectProperty})

(def indicator_types
  {:db/ident :stix/indicator_types,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "A set of categorizations for this indicator. The values for this property SHOULD come from the indicator-type-ov open vocabulary."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "indicator types"}})

(def infrastructure_types
  {:db/ident :stix/infrastructure_types,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The type of infrastructure being described. The values for this property SHOULD come from the infrastructure-type-ov open vocabulary."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "infrastructure_types"}})

(def inhibit_any_policy
  {:db/ident :stix/inhibit_any_policy,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "Specifies the number of additional certificates that may appear in the path before anyPolicy is no longer permitted. Also equivalent to the object ID (OID) value of 2.5.29.54."},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "inhibit_any_policy"},
   :rdfs/range :xsd/string})

(def installed_software_refs
  {:db/ident :stix/installed_software_refs,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Any non-standard software installed on the operating system (specified through the operating-system value) used for the dynamic analysis of the malware instance or family. The value of this property MUST be the identifier for a SCO software object."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "installed_software_refs"},
   :rdfs/range :stix/Software})

(def installed_software_refs_string
  {:db/ident :stix/installed_software_refs_string,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Any non-standard software installed on the operating system (specified through the operating-system value) used for the dynamic analysis of the malware instance or family. The value of this property MUST be the identifier for a SCO software object."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "installed_software_refs_string"},
   :rdfs/range :xsd/string})

(def integrity_level
  {:db/ident :stix/integrity_level,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the Windows integrity level, or trustworthiness, of the process. The values of this property MUST come from the windows-integrity-level-enum enumeration."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "integrity_level"}})

(def investigates
  {:db/ident   :stix/investigates,
   :rdf/type   :owl/ObjectProperty,
   :rdfs/range :stix/Indicator})

(def ipfix
  {:db/ident :stix/ipfix,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies any IP Flow Information Export [IPFIX] data for the traffic, as a dictionary. Each key/value pair in the dictionary represents the name/value of a single IPFIX element. Accordingly, each dictionary key SHOULD be a case-preserved version of the IPFIX element name, e.g., octetDeltaCount. Each dictionary value MUST be either an integer or a string, as well as a valid IPFIX property."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "ipfix"},
   :rdfs/range :stix/Dictionary})

(def is_active
  {:db/ident :stix/is_active,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Indicates whether the network traffic is still ongoing. If the end property is provided, this property MUST be false."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "is_active"},
   :rdfs/range :xsd/boolean})

(def is_blocking
  {:db/ident     :stix/is_blocking,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en-us",
                  :rdf/value
                  "Specifies whether the socket is in blocking mode."},
   :rdfs/label   {:rdf/language "en-us",
                  :rdf/value    "is_blocking"},
   :rdfs/range   :xsd/boolean})

(def is_disabled
  {:db/ident     :stix/is_disabled,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en-us",
                  :rdf/value    "Specifies if the account is disabled."},
   :rdfs/label   {:rdf/language "en-us",
                  :rdf/value    "is_disabled"},
   :rdfs/range   :xsd/boolean})

(def is_family
  {:db/ident :stix/is_family,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies whether the object represents a malware family (if true) or a malware instance (if false)."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "is_family"},
   :rdfs/range :xsd/boolean})

(def is_hidden
  {:db/ident     :stix/is_hidden,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en-us",
                  :rdf/value    "Specifies whether the process is hidden."},
   :rdfs/label   {:rdf/language "en-us",
                  :rdf/value    "is_hidden"},
   :rdfs/range   :xsd/boolean})

(def is_listening
  {:db/ident     :stix/is_listening,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en-us",
                  :rdf/value
                  "Specifies whether the socket is in listening mode."},
   :rdfs/label   {:rdf/language "en-us",
                  :rdf/value    "is_listening"},
   :rdfs/range   :xsd/boolean})

(def is_multipart
  {:db/ident :stix/is_multipart,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Indicates whether the email body contains multiple MIME parts."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "is_multipart"},
   :rdfs/range :xsd/boolean})

(def is_optimized
  {:db/ident     :stix/is_optimized,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en-us",
                  :rdf/value
                  "Specifies whether the PDF file has been optimized."},
   :rdfs/label   "is_optimized",
   :rdfs/range   :xsd/boolean})

(def is_privileged
  {:db/ident :stix/is_privileged,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies that the account has elevated privileges (i.e., in the case of root on Unix or the Windows Administrator account)."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "is_privileged"},
   :rdfs/range :xsd/boolean})

(def is_self_signed
  {:db/ident :stix/is_self_signed,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "Specifies whether the certificate is self-signed, i.e., whether it is signed by the same entity whose identity it certifies."},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "is_self_signed"},
   :rdfs/range :xsd/boolean})

(def is_service_account
  {:db/ident :stix/is_service_account,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Indicates that the account is associated with a network service or system process (daemon), not a specific individual."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "is_service_account"},
   :rdfs/range :xsd/boolean})

(def issuer
  {:db/ident :stix/issuer,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "Specifies the name of the Certificate Authority that issued the certificate."},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "issuer"},
   :rdfs/range :xsd/string})

(def issuer_alternative_name
  {:db/ident :stix/issuer_alternative_name,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "Specifies the additional identities to be bound to the issuer of the certificate. Also equivalent to the object ID (OID) value of 2.5.29.18."},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "issuer_alternative_name"},
   :rdfs/range :xsd/string})

(def key
  {:db/ident :stix/key,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the full registry key including the hive. The value of the key, including the hive portion, SHOULD be case-preserved. The hive portion of the key MUST be fully expanded and not truncated; e.g., HKEY_LOCAL_MACHINE must be used instead of HKLM."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "key"},
   :rdfs/range :xsd/string})

(def key_usage
  {:db/ident :stix/key_usage,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "Specifies a multi-valued extension consisting of a list of names of the permitted key usages. Also equivalent to the object ID (OID) value of 2.5.29.15."},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "key_usage"},
   :rdfs/range :xsd/string})

(def kill_chain_name
  {:db/ident :stix/kill_chain_name,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The name of the kill chain. The value of this property SHOULD be all lowercase and SHOULD use hyphens instead of spaces or underscores as word separators."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "kill_chain_name"},
   :rdfs/range :xsd/string})

(def kill_chain_phases
  {:db/ident :stix/kill_chain_phases,
   :rdf/type :owl/DatatypeProperty})

(def labels
  {:db/ident :stix/labels,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The labels property specifies a set of terms used to describe this object. The terms are user-defined or trust-group defined and their meaning is outside the scope of this specification and MAY be ignored. \\n\\n Where an object has a specific property defined in the specification for characterizing subtypes of that object, the labels property MUST NOT be used for that purpose. \\n\\n For example, the Malware SDO has a property malware_types that contains a list of Malware subtypes (dropper, RAT, etc.). In this example, the labels property cannot be used to describe these Malware subtypes."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "labels"},
   :rdfs/range :xsd/string})

(def lang
  {:db/ident :stix/lang,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The lang property identifies the language of the text content in this object. When present, it MUST be a language code conformant to [RFC5646]. If the property is not present, then the language of the content is en (English). \\n\\n This property SHOULD be present if the object type contains translatable text properties (e.g. name, description). \\n\\n The language of individual fields in this object MAY be overridden by the lang property in granular markings (see section 7.2.3)."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "lang"},
   :rdfs/range :xsd/string})

(def languages
  {:db/ident :stix/languages,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the languages supported by the software. The value of each list member MUST be a language code conformant to [RFC5646]."},
   :rdfs/label "languages",
   :rdfs/range :xsd/string})

(def last_observed
  {:db/ident :stix/last_observed,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The end of the time window during which the data was seen. This MUST be greater than or equal to the timestamp in the first_observed property."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "last_observed"},
   :rdfs/range :xsd/dateTime})

(def last_seen
  {:db/ident   :stix/last_seen,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/range :xsd/dateTime})

(def latitude
  {:db/ident :stix/latitude,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The latitude of the Location in decimal degrees. Positive numbers describe latitudes north of the equator, and negative numbers describe latitudes south of the equator. The value of this property MUST be between -90.0 and 90.0, inclusive. If the longitude property is present, this property MUST be present."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "latitude"},
   :rdfs/range :xsd/float})

(def loader_flags_hex
  {:db/ident     :stix/loader_flags_hex,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en-us",
                  :rdf/value    "Specifies the reserved loader flags."},
   :rdfs/label   "loader_flags_hex",
   :rdfs/range   :xsd/hexBinary})

(def located-at
  {:db/ident :stix/located-at,
   :rdf/type :owl/ObjectProperty})

(def longitude
  {:db/ident :stix/longitude,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The longitude of the Location in decimal degrees. Positive numbers describe longitudes east of the prime meridian and negative numbers describe longitudes west of the prime meridian. The value of this property MUST be between -180.0 and 180.0, inclusive. If the latitude property is present, this property MUST be present."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "longitude"},
   :rdfs/range :xsd/float})

(def machine_hex
  {:db/ident     :stix/machine_hex,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en-us",
                  :rdf/value    "Specifies the type of target machine."},
   :rdfs/label   "machine_hex",
   :rdfs/range   :xsd/hexBinary})

(def magic_hex
  {:db/ident :stix/magic_hex,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the hex value that indicates the type of the PE binary."},
   :rdfs/label "magic_hex",
   :rdfs/range :xsd/hexBinary})

(def magic_number_hex
  {:db/ident :stix/magic_number_hex,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the hexadecimal constant (\"magic number\") associated with a specific file format that corresponds to the file, if applicable."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "magic_number_hex"},
   :rdfs/range :xsd/hexBinary})

(def major_image_version
  {:db/ident     :stix/major_image_version,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en-us",
                  :rdf/value
                  "Specifies the major version number of the image."},
   :rdfs/label   "major_image_version",
   :rdfs/range   :xsd/integer})

(def major_linker_version
  {:db/ident     :stix/major_linker_version,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en-us",
                  :rdf/value    "Specifies the linker major version number."},
   :rdfs/label   "major_linker_version",
   :rdfs/range   :xsd/integer})

(def major_os_version
  {:db/ident :stix/major_os_version,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the major version number of the required operating system."},
   :rdfs/label "major_os_version",
   :rdfs/range :xsd/integer})

(def major_subsystem_version
  {:db/ident     :stix/major_subsystem_version,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en-us",
                  :rdf/value
                  "Specifies the major version number of the subsystem."},
   :rdfs/label   "major_subsystem_version",
   :rdfs/range   :xsd/integer})

(def malware_types
  {:db/ident :stix/malware_types,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "A set of categorizations for the malware being described. The values for this property SHOULD come from the malware-type-ov open vocabulary."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "malware_types"}})

(def marking_ref
  {:db/ident :stix/marking_ref,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies a reference to the marking-definition object that describes the marking.\\n\\nIf the lang property is not present, this property MUST be present. If the lang property is present, this property MUST NOT be present.@[en-US}"},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "marking_ref"},
   :rdfs/range :stix/MarkingDefinition})

(def marking_ref_string
  {:db/ident :stix/marking_ref_string,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies an identifier to the marking-definition object that describes the marking.\\n\\nIf the lang property is not present, this property MUST be present. If the lang property is present, this property MUST NOT be present."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "marking_ref_string"},
   :rdfs/range :xsd/string})

(def message_body_data_ref
  {:db/ident :stix/message_body_data_ref,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the data contained in the HTTP message body, if included. The object referenced in this property MUST be of type artifact."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "message_body_data_ref"},
   :rdfs/range :stix/Artifact})

(def message_body_data_ref_string
  {:db/ident :stix/message_body_data_ref_string,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the data contained in the HTTP message body, if included. The object referenced in this property MUST be of type artifact."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "message_body_data_ref_string"},
   :rdfs/range :xsd/string})

(def message_body_length
  {:db/ident :stix/message_body_length,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the length of the HTTP message body, if included, in bytes."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "message_body_length"},
   :rdfs/range :xsd/integer})

(def message_id
  {:db/ident     :stix/message_id,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en-us",
                  :rdf/value
                  "Specifies the Message-ID field of the email message."},
   :rdfs/label   {:rdf/language "en-us",
                  :rdf/value    "message_id"},
   :rdfs/range   :xsd/string})

(def mime_type
  {:db/ident :stix/mime_type,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{{:rdf/language "en-us",
      :rdf/value
      "Specifies the MIME type name specified for the file, e.g., application/msword. Whenever feasible, this value SHOULD be one of the values defined in the Template column in the IANA media type registry [Media Types].Maintaining a comprehensive universal catalog of all extant file types is obviously not possible. When specifying a MIME Type not included in the IANA registry, implementers should use their best judgement so as to facilitate interoperability."}
     {:rdf/language "en-us",
      :rdf/value
      "Whenever feasible, this value SHOULD be one of the values defined in the Template column in the IANA media type registry [Media Types]. Maintaining a comprehensive universal catalog of all extant file types is obviously not possible. When specifying a MIME Type not included in the IANA registry, implementers should use their best judgement so as to facilitate interoperability."}},
   :rdfs/label #{{:rdf/language "en-us",
                  :rdf/value    "mime_type"} "mime_type"},
   :rdfs/range :xsd/string})

(def minor_image_version
  {:db/ident     :stix/minor_image_version,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en-us",
                  :rdf/value
                  "Specifies the minor version number of the image."},
   :rdfs/label   "minor_image_version",
   :rdfs/range   :xsd/integer})

(def minor_linker_version
  {:db/ident     :stix/minor_linker_version,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en-us",
                  :rdf/value    "Specifies the linker minor version number."},
   :rdfs/label   "minor_linker_version",
   :rdfs/range   :xsd/integer})

(def minor_os_version
  {:db/ident :stix/minor_os_version,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the minor version number of the required operating system."},
   :rdfs/label "minor_os_version",
   :rdfs/range :xsd/integer})

(def minor_subsystem_version
  {:db/ident     :stix/minor_subsystem_version,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en-us",
                  :rdf/value
                  "Specifies the minor version number of the subsystem."},
   :rdfs/label   "minor_subsystem_version",
   :rdfs/range   :xsd/integer})

(def mitigates
  {:db/ident   :stix/mitigates,
   :rdf/type   :owl/ObjectProperty,
   :rdfs/range #{:stix/AttackPattern :stix/Indicator :stix/Vulnerability
                 :stix/Malware :stix/Tool}})

(def modified
  {:db/ident :stix/modified,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The modified property is only used by STIX Objects that support versioning and represents the time that this particular version of the object was last modified. \\n\\n The object creator can use the time it deems most appropriate as the time this version of the object was modified. The minimum precision MUST be milliseconds (three digits after the decimal place in seconds), but MAY be more precise. \\n\\n If the created property is defined, then the value of the modified property for a given object version MUST be later than or equal to the value of the created property. \\n\\n Object creators MUST set the modified property when creating a new version of an object if the created property was set. \\n\\n See section 3.6 for further definition of versioning."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "modified"},
   :rdfs/range :xsd/dateTime})

(def modified_time
  {:db/ident :stix/modified_time,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the last date/time that the registry key was modified."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "modified_time"},
   :rdfs/range :xsd/dateTime})

(def modules
  {:db/ident :stix/modules,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The specific analysis modules that were used and configured in the product during this analysis run. For example, configuring a product to support analysis of Dridex."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "modules"},
   :rdfs/range :xsd/string})

(def mtime
  {:db/ident :stix/mtime,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{{:rdf/language "en-us",
      :rdf/value
      "Specifies the date/time the file was last written to/modified."}
     {:rdf/language "en-us",
      :rdf/value
      "Specifies the date/time the directory was last written to/modified."}},
   :rdfs/label "mtime",
   :rdfs/range :xsd/dateTime})

(def name
  {:db/ident :stix/name,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{{:rdf/language "en-us",
      :rdf/value    "A name used to identify the Vulnerability."}
     {:rdf/language "en-us",
      :rdf/value
      "The name of this Identity. When referring to a specific entity (e.g., an individual or organization), this property SHOULD contain the canonical name of the specific entity."}
     {:rdf/language "en-us",
      :rdf/value    "A name used to identify the Course of Action."}
     {:rdf/language "en-us",
      :rdf/value    "A name used to identify this Intrusion Set."}
     {:rdf/language "en-us",
      :rdf/value    "A name used to identify the Report."}
     {:rdf/language "en-us",
      :rdf/value    "A name used to identify the Marking Definition."}
     {:rdf/language "en-US",
      :rdf/value    "Specifies the name of the AS."}
     {:rdf/language "en-us",
      :rdf/value
      "Specifies the name of the registry value. For specifying the default value in a registry key, an empty string MUST be used."}
     {:rdf/language "en-us",
      :rdf/value    "Specifies the name used to identity the entity."}
     {:rdf/language "en-us",
      :rdf/value    "A name used to identify the Campaign."}
     {:rdf/language "en-us",
      :rdf/value    "A name used to identify the Grouping."}
     {:rdf/language "en-us",
      :rdf/value    "A name used to identify the Incident."}
     {:rdf/language "en-us",
      :rdf/value    "A name used to identify the Location."}
     {:rdf/language "en-us",
      :rdf/value
      "A name used to identify the Indicator. Producers SHOULD provide this property to help products and analysts understand what this Indicator actually does."}
     {:rdf/language "en-us",
      :rdf/value
      "A name used to identify the malware instance or family, as specified by the producer of the SDO. For a malware family the name MUST be defined. If a name for a malware instance is not available, the SHA-256 hash value or sample's filename MAY be used instead."}
     {:rdf/language "en-us",
      :rdf/value    "A name used to identify the Attack Pattern."}
     {:rdf/language "en-us",
      :rdf/value
      "A name used to identify this Threat Actor or Threat Actor group."}
     {:rdf/language "en-us",
      :rdf/value
      "A name or characterizing text used to identify the Infrastructure."}
     {:rdf/language "en-us",
      :rdf/value    "Specifies the name of the mutex object."}
     {:rdf/language "en-us",
      :rdf/value    "Specifies the name of the software."}
     {:rdf/language "en-us",
      :rdf/value    "The name used to identify the Tool."}},
   :rdfs/label #{{:rdf/language "en-US",
                  :rdf/value    "name"} "name"
                 {:rdf/language "en-us",
                  :rdf/value    "name"}},
   :rdfs/range :xsd/string})

(def name_constraints
  {:db/ident :stix/name_constraints,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "Specifies a namespace within which all subject names in subsequent certificates in a certification path MUST be located. Also equivalent to the object ID (OID) value of 2.5.29.30."},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "name_constraints"},
   :rdfs/range :xsd/string})

(def name_enc
  {:db/ident :stix/name_enc,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the observed encoding for the name of the file. This value MUST be specified using the corresponding name from the 2013-12-20 revision of the IANA character set registry [Character Sets]. If the value from the Preferred MIME Name column for a character set is defined, this value MUST be used; if it is not defined, then the value from the Name column in the registry MUST be used instead. This property allows for the capture of the original text encoding for the file name, which may be forensically relevant; for example, a file on an NTFS volume whose name was created using the windows-1251 encoding, commonly used for languages based on Cyrillic script."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "name_enc"},
   :rdfs/range :xsd/string})

(def network_details
  {:db/ident :stix/network_details,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies additional details about this network location including things like wiring closet, rack number, rack location, and VLANs."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "network details"},
   :rdfs/range :xsd/string})

(def number
  {:db/ident :stix/number,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "Specifies the number assigned to the AS. Such assignments are typically performed by a Regional Internet Registry (RIR)."},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "number"},
   :rdfs/range :xsd/positiveInteger})

(def number_observed
  {:db/ident :stix/number_observed,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The number of times that each Cyber-observable object represented in the objects or object_ref property was seen. If present, this MUST be an integer between 1 and 999,999,999 inclusive. If the number_observed property is greater than 1, the data contained in the objects or object_refs property was seen multiple times. In these cases, object creators MAY omit properties of the SCO (such as timestamps) that are specific to a single instance of that observed data."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "number_observed"},
   :rdfs/range :xsd/positiveInteger})

(def number_of_rva_and_sizes
  {:db/ident :stix/number_of_rva_and_sizes,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the number of data-directory entries in the remainder of the optional header."},
   :rdfs/label "number_of_rva_and_sizes",
   :rdfs/range :xsd/string})

(def number_of_sections
  {:db/ident :stix/number_of_sections,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the number of sections in the PE binary, as a non-negative integer."},
   :rdfs/label "number_of_sections",
   :rdfs/range :xsd/nonNegativeInteger})

(def number_of_subkeys
  {:db/ident :stix/number_of_subkeys,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the number of subkeys contained under the registry key."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "number_of_subkeys"},
   :rdfs/range :xsd/nonNegativeInteger})

(def number_of_symbols
  {:db/ident :stix/number_of_symbols,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the number of entries in the symbol table of the PE binary, as a non-negative integer."},
   :rdfs/label "number_of_symbols",
   :rdfs/range :xsd/nonNegativeInteger})

(def object_marking_refs
  {:db/ident :stix/object_marking_refs,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The object_marking_refs property specifies a list of id properties of marking-definition objects that apply to this object. \\n\\n In some cases, though uncommon, marking definitions themselves may be marked with sharing or handling guidance. In this case, this property MUST NOT contain any references to the same Marking Definition object (i.e., it cannot contain any circular references). \\n\\n See section 7.2 for further definition of data markings."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "object_marking_refs"},
   :rdfs/range :stix/MarkingDefinition})

(def object_marking_refs_string
  {:db/ident :stix/object_marking_refs_string,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The object_marking_refs_string property specifies a list of id properties of marking-definition objects that apply to this object. \\n\\n In some cases, though uncommon, marking definitions themselves may be marked with sharing or handling guidance. In this case, this property MUST NOT contain any references to the same Marking Definition object (i.e., it cannot contain any circular references). \\n\\n See section 7.2 for further definition of data markings."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "object_marking_refs_string"},
   :rdfs/range :xsd/string})

(def object_modified
  {:db/ident :stix/object_modified,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The object_modified property identifies the modified time of the object that this Language Content applies to. It MUST be an exact match for the modified time of the STIX Object being referenced."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "object_modified"},
   :rdfs/range :xsd/dateTime})

(def object_ref
  {:db/ident :stix/object_ref,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The object_ref property identifies the id of the object that this Language Content applies to. It MUST be the identifier for a STIX Object."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "object_ref"},
   :rdfs/range :stix/StixObject})

(def object_ref_string
  {:db/ident :stix/object_ref_string,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The object_ref property identifies the id of the object that this Language Content applies to. It MUST be the identifier for a STIX Object."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "object_ref_string"},
   :rdfs/range :xsd/string})

(def object_refs
  {:db/ident :stix/object_refs,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{{:rdf/language "en-us",
      :rdf/value    "The STIX Objects that the note is being applied to."}
     {:rdf/language "en-us",
      :rdf/value
      "Specifies the STIX Objects that are referred to by this Grouping."}
     {:rdf/language "en-us",
      :rdf/value
      "A list of SCOs and SROs representing the observation. The object_refs MUST contain at least one SCO reference if defined. The object_refs MAY include multiple SCOs and their corresponding SROs, if those SCOs are related as part of a single observation. For example, a Network Traffic object and two IPv4 Address objects related via the src_ref and dst_ref properties can be contained in the same Observed Data because they are all related and used to characterize that single entity. This property MUST NOT be present if objects is provided."}
     {:rdf/language "en-us",
      :rdf/value    "The STIX Objects that the Opinion is being applied to."}
     {:rdf/language "en-us",
      :rdf/value
      "Specifies the STIX Objects that are referred to by this Report."}},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "object_refs"},
   :rdfs/range #{:stix/StixCyberObservable :stix/StixObject
                 :stix/StixRelationshipObject}})

(def object_refs_string
  {:db/ident :stix/object_refs_string,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{{:rdf/language "en-us",
      :rdf/value    "The STIX Objects that the note is being applied to."}
     {:rdf/language "en-us",
      :rdf/value
      "Specifies the STIX Objects that are referred to by this Grouping."}
     {:rdf/language "en-us",
      :rdf/value
      "A list of SCOs and SROs representing the observation. The object_refs MUST contain at least one SCO reference if defined. The object_refs MAY include multiple SCOs and their corresponding SROs, if those SCOs are related as part of a single observation. For example, a Network Traffic object and two IPv4 Address objects related via the src_ref and dst_ref properties can be contained in the same Observed Data because they are all related and used to characterize that single entity. This property MUST NOT be present if objects is provided."}
     {:rdf/language "en-us",
      :rdf/value    "The STIX Objects that the Opinion is being applied to."}
     {:rdf/language "en-us",
      :rdf/value
      "Specifies the STIX Objects that are referred to by this Report."}},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "object_refs_string"},
   :rdfs/range :xsd/string})

(def objective
  {:db/ident :stix/objective,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the Campaign's primary goal, objective, desired outcome, or intended effect — what the Threat Actor or Intrusion Set hopes to accomplish with this Campaign."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "objective"},
   :rdfs/range :xsd/string})

(def objects
  {:db/ident :stix/objects,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "Specifies a set of one or more STIX Objects. Objects in this list MUST be a STIX Object."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "objects"},
   :rdfs/range :stix/StixObject})

(def observed_data_refs
  {:db/ident :stix/observed_data_refs,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "A list of ID references to the Observed Data objects that contain the raw cyber data for this Sighting. For example, a Sighting of an Indicator with an IP address could include the Observed Data for the network connection that the Indicator was used to detect. This property MUST reference only Observed Data SDOs."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "observed_data_refs"},
   :rdfs/range :stix/ObservedData})

(def observed_data_refs_string
  {:db/ident :stix/observed_data_refs_string,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "A list of ID references to the Observed Data objects that contain the raw cyber data for this Sighting. For example, a Sighting of an Indicator with an IP address could include the Observed Data for the network connection that the Indicator was used to detect. This property MUST reference only Observed Data SDOs."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "observed_data_refs_string"},
   :rdfs/range :xsd/string})

(def opened_connection_refs
  {:db/ident :stix/opened_connection_refs,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the list of network connections opened by the process, as a reference to one or more Network Traffic objects. The objects referenced in this list MUST be of type network-traffic."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "opened_connection_refs"},
   :rdfs/range :stix/NetworkTraffic})

(def opened_connection_refs_string
  {:db/ident :stix/opened_connection_refs_string,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the list of network connections opened by the process, as a reference to one or more Network Traffic objects. The objects referenced in this list MUST be of type network-traffic."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "opened_connection_refs_string"},
   :rdfs/range :xsd/string})

(def operating_system_ref
  {:db/ident :stix/operating_system_ref,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The operating system used for the dynamic analysis of the malware instance or family. This applies to virtualized operating systems as well as those running on bare metal. The value of this property MUST be the identifier for a SCO software object."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "operating_system_ref"},
   :rdfs/range :stix/Software})

(def operating_system_ref_string
  {:db/ident :stix/operating_system_ref_string,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{{:rdf/language "en-us",
      :rdf/value
      "The operating systems that the malware family or malware instance is executable on. This applies to virtualized operating systems as well as those running on bare metal. The value of this property MUST be the identifier for a SCO software object."}
     {:rdf/language "en-us",
      :rdf/value
      "The operating system used for the dynamic analysis of the malware instance or family. This applies to virtualized operating systems as well as those running on bare metal. The value of this property MUST be the identifier for a SCO software object."}},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "operating_system_ref_string"},
   :rdfs/range :xsd/string})

(def operating_system_refs
  {:db/ident :stix/operating_system_refs,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The operating systems that the malware family or malware instance is executable on. This applies to virtualized operating systems as well as those running on bare metal. The value of this property MUST be the identifier for a SCO software object."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "operating_system_ref"},
   :rdfs/range :stix/Software})

(def operating_system_refs_string
  {:db/ident :stix/operating_system_refs_string,
   :rdf/type :owl/DatatypeProperty})

(def opinion
  {:db/ident :stix/opinion,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The opinion that the producer has about all of the STIX Object(s) listed in the object_refs property. The values of this property MUST come from the opinion-enum enumeration."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "opinion"}})

(def optional_header
  {:db/ident :stix/optional_header,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the PE optional header of the PE binary. When used, at least one property from the windows-pe-optional-header-type MUST be included."},
   :rdfs/label "optional_header",
   :rdfs/range :stix/WindowsPeOptionalHeaderType})

(def options
  {:db/ident :stix/options,
   :rdf/type :owl/DatatypeProperty})

(def originates-from
  {:db/ident :stix/originates-from,
   :rdf/type :owl/ObjectProperty})

(def owner_sid
  {:db/ident :stix/owner_sid,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the Security ID (SID) value of the owner of the process."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "owner_sid"},
   :rdfs/range :xsd/string})

(def owns
  {:db/ident :stix/owns,
   :rdf/type :owl/ObjectProperty})

(def parent_directory_ref
  {:db/ident :stix/parent_directory_ref,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the parent directory of the file, as a reference to a Directory object. The object referenced in this property MUST be of type directory."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "parent_directory_ref"},
   :rdfs/range :stix/Directory})

(def parent_directory_ref_string
  {:db/ident :stix/parent_directory_ref_string,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the parent directory of the file, as a reference to a Directory object. The object referenced in this property MUST be of type directory."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "parent_directory_ref_string"},
   :rdfs/range :xsd/string})

(def parent_ref
  {:db/ident :stix/parent_ref,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the other process that spawned (i.e. is the parent of) this one, as a reference to a Process object. The object referenced in this property MUST be of type process."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "parent_ref"},
   :rdfs/range :stix/Process})

(def parent_ref_string
  {:db/ident :stix/parent_ref_string,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the other process that spawned (i.e. is the parent of) this one, as a reference to a Process object. The object referenced in this property MUST be of type process."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "parent_ref_string"},
   :rdfs/range :xsd/string})

(def path
  {:db/ident :stix/path,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "Specifies the path, as originally observed, to the directory on the file system."},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "path"},
   :rdfs/range :xsd/string})

(def path_enc
  {:db/ident :stix/path_enc,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "Specifies the observed encoding for the path. The value MUST be specified if the path is stored in a non-Unicode encoding. This value MUST be specified using the corresponding name from the 2013-12-20 revision of the IANA character set registry [Character Sets]. If the preferred MIME name for a character set is defined, this value MUST be used; if it is not defined, then the Name value from the registry MUST be used instead."},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "path_enc"},
   :rdfs/range :xsd/string})

(def pattern
  {:db/ident :stix/pattern,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The detection pattern for this Indicator MAY be expressed as a STIX Pattern as specified in section 9 or another appropriate language such as SNORT, YARA, etc."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "pattern"},
   :rdfs/range :xsd/string})

(def pattern_type
  {:db/ident :stix/pattern_type,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The pattern language used in this indicator. The value for this property SHOULD come from the pattern-type-ov open vocabulary. The value of this property MUST match the type of pattern data included in the pattern property."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "pattern_type"}})

(def pattern_version
  {:db/ident :stix/pattern_version,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The version of the pattern language that is used for the data in the pattern property which MUST match the type of pattern data included in the pattern property. For patterns that do not have a formal specification, the build or code version that the pattern is known to work with SHOULD be used. For the STIX Pattern language, the default value is determined by the specification version of the object. For other languages, the default value SHOULD be the latest version of the patterning language at the time of this object's creation."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "pattern_version"},
   :rdfs/range :xsd/string})

(def payload_bin
  {:db/ident :stix/payload_bin,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the binary data contained in the artifact as a base64-encoded string. This property MUST NOT be present if url is provided."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "payload_bin"},
   :rdfs/range :xsd/base64Binary})

(def pdfid0
  {:db/ident :stix/pdfid0,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value "Specifies the first file identifier found for the PDF file."},
   :rdfs/label "pdfid0",
   :rdfs/range :xsd/string})

(def pdfid1
  {:db/ident :stix/pdfid1,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value "Specifies the second file identifier found for the PDF file."},
   :rdfs/label "pdfid1",
   :rdfs/range :xsd/string})

(def pe_type
  {:db/ident :stix/pe_type,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the type of the PE binary. This is an open vocabulary and values SHOULD come from the windows-pebinary-type-ov open vocabulary."},
   :rdfs/label "pe_type"})

(def personal_motivations
  {:db/ident :stix/personal_motivations,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The personal reasons, motivations, or purposes of the Threat Actor regardless of organizational goals. Personal motivation, which is independent of the organization's goals, describes what impels an individual to carry out an attack. Personal motivation may align with the organization's motivation—as is common with activists—but more often it supports personal goals. For example, an individual analyst may join a Data Miner corporation because his or her skills may align with the corporation's objectives. But the analyst most likely performs his or her daily work toward those objectives for personal reward in the form of a paycheck. The motivation of personal reward may be even stronger for Threat Actors who commit illegal acts, as it is more difficult for someone to cross that line purely for altruistic reasons. The position in the list has no significance. The values for this property SHOULD come from the attack-motivation-ov open vocabulary."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "personal_motivations"}})

(def phase_name
  {:db/ident :stix/phase_name,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The name of the phase in the kill chain. The value of this property SHOULD be all lowercase and SHOULD use hyphens instead of spaces or underscores as word separators."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "phase_name"},
   :rdfs/range :xsd/string})

(def pid
  {:db/ident     :stix/pid,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en-us",
                  :rdf/value
                  "Specifies the Process ID, or PID, of the process."},
   :rdfs/label   {:rdf/language "en-us",
                  :rdf/value    "pid"},
   :rdfs/range   :xsd/positiveInteger})

(def pointer_to_symbol_table_hex
  {:db/ident     :stix/pointer_to_symbol_table_hex,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en-us",
                  :rdf/value
                  "Specifies the file offset of the COFF symbol table."},
   :rdfs/label   "pointer_to_symbol_table_hex",
   :rdfs/range   :xsd/hexBinary})

(def policy_constraints
  {:db/ident :stix/policy_constraints,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "Specifies any constraints on path validation for certificates issued to CAs. Also equivalent to the object ID (OID) value of 2.5.29.36."},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "policy_constraints"},
   :rdfs/range :xsd/string})

(def policy_mappings
  {:db/ident :stix/policy_mappings,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "Specifies one or more pairs of OIDs; each pair includes an issuerDomainPolicy and a subjectDomainPolicy. The pairing indicates whether the issuing CA considers its issuerDomainPolicy equivalent to the subject CA's subjectDomainPolicy. Also equivalent to the object ID (OID) value of 2.5.29.33."},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "policy_mappings"},
   :rdfs/range :xsd/string})

(def postal_code
  {:db/ident     :stix/postal_code,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en-us",
                  :rdf/value    "The postal code for this Location."},
   :rdfs/label   "postal_code",
   :rdfs/range   :xsd/string})

(def precision
  {:db/ident :stix/precision,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Defines the precision of the coordinates specified by the latitude and longitude properties. This is measured in meters. The actual Location may be anywhere up to precision meters from the defined point. If this property is not present, then the precision is unspecified. If this property is present, the latitude and longitude properties MUST be present."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "precision"},
   :rdfs/range :xsd/float})

(def primary_motivation
  {:db/ident :stix/primary_motivation,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{{:rdf/language "en-us",
      :rdf/value
      "The primary reason, motivation, or purpose behind this Threat Actor. The motivation is why the Threat Actor wishes to achieve the goal (what they are trying to achieve). For example, a Threat Actor with a goal to disrupt the finance sector in a country might be motivated by ideological hatred of capitalism. The value for this property SHOULD come from the attack-motivation-ov open vocabulary."}
     {:rdf/language "en-us",
      :rdf/value
      "The time that this Intrusion Set was first seen. A summary property of data from sightings and other data that may or may not be available in STIX. If new sightings are received that are earlier than the first seen timestamp, the object may be updated to account for the new data."}},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "primary_motivation"}})

(def priority
  {:db/ident :stix/priority,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the current priority class of the process in Windows. This value SHOULD be a string that ends in _CLASS."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "priority"},
   :rdfs/range :xsd/string})

(def private_key_usage_period_not_after
  {:db/ident :stix/private_key_usage_period_not_after,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "Specifies the date on which the validity period ends for the private key, if it is different from the validity period of the certificate."},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "private_key_usage_period_not_after"},
   :rdfs/range :xsd/dateTime})

(def private_key_usage_period_not_before
  {:db/ident :stix/private_key_usage_period_not_before,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "Specifies the date on which the validity period begins for the private key, if it is different from the validity period of the certificate."},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "private_key_usage_period_not_before"},
   :rdfs/range :xsd/dateTime})

(def product
  {:db/ident :stix/product,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The name of the analysis engine or product that was used. Product names SHOULD be all lowercase with words separated by a dash \"-\". For cases where the name of a product cannot be specified, a value of \"anonymized\" MUST be used."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "product"},
   :rdfs/range :xsd/string})

(def protocols
  {:db/ident :stix/protocols,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the protocols observed in the network traffic, along with their corresponding state. Protocols MUST be listed in low to high order, from outer to inner in terms of packet encapsulation. That is, the protocols in the outer level of the packet, such as IP, MUST be listed first. The protocol names SHOULD come from the service names defined in the Service Name column of the IANA Service Name and Port Number Registry [Port Numbers]. In cases where there is variance in the name of a network protocol not included in the IANA Registry, content producers should exercise their best judgement, and it is recommended that lowercase names be used for consistency with the IANA registry. If the protocol extension is present, the corresponding protocol value for that extension SHOULD be listed in this property. Example: ipv4, tcp, http"},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "protocols"},
   :rdfs/range :xsd/string})

(def published
  {:db/ident :stix/published,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The date that this Report object was officially published by the creator of this report. The publication date (public release, legal release, etc.) may be different than the date the report was created or shared internally (the date in the created property)."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "published"},
   :rdfs/range :xsd/dateTime})

(def raw_email_ref
  {:db/ident :stix/raw_email_ref,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the raw binary contents of the email message, including both the headers and body, as a reference to an Artifact object. The object referenced in this property MUST be of type artifact."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "raw_email_ref"},
   :rdfs/range :stix/Artifact})

(def raw_email_ref_string
  {:db/ident :stix/raw_email_ref_string,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the raw binary contents of the email message, including both the headers and body, as a reference to an Artifact object. The object referenced in this property MUST be of type artifact."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "raw_email_ref_string"},
   :rdfs/range :xsd/string})

(def received_lines
  {:db/ident :stix/received_lines,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies one or more \"Received\" header fields that may be included in the email headers. List values MUST appear in the same order as present in the email message."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "received_lines"},
   :rdfs/range :xsd/string})

(def region
  {:db/ident :stix/region,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The region that this Location describes. The value for this property SHOULD come from the region-ov open vocabulary."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "region"}})

(def relationship_type
  {:db/ident :stix/relationship_type,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "The name used to identify the type of Relationship. This value SHOULD be an exact value listed in the relationships for the source and target SDO, but MAY be any string. The value of this property MUST be in ASCII and is limited to characters a-z (lowercase ASCII), 0-9, and hyphen (-)."},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "relationship_type"},
   :rdfs/range :xsd/string})

(def remediates
  {:db/ident   :stix/remediates,
   :rdf/type   :owl/ObjectProperty,
   :rdfs/range #{:stix/Vulnerability :stix/Malware}})

(def report_types
  {:db/ident :stix/report_types,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The primary type(s) of content found in this report. The values for this property SHOULD come from the report-type-ov open vocabulary."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "report_types"}})

(def request_header
  {:db/ident :stix/request_header,
   :rdf/type :owl/DatatypeProperty})

(def request_method
  {:db/ident :stix/request_method,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the HTTP method portion of the HTTP request line, as a lowercase string."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "request_method"},
   :rdfs/range :xsd/string})

(def request_value
  {:db/ident :stix/request_value,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the value (typically a resource path) portion of the HTTP request line."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "request_value"},
   :rdfs/range :xsd/string})

(def request_version
  {:db/ident :stix/request_version,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the HTTP version portion of the HTTP request line, as a lowercase string."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "request_version"},
   :rdfs/range :xsd/string})

(def resolves_to_refs
  {:db/ident :stix/resolves_to_refs,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   #{{:rdf/language "en-US",
      :rdf/value
      "Specifies a list of references to one or more Layer 2 Media Access Control (MAC) addresses that the IPv4 address resolves to. The objects referenced in this list MUST be of type mac-addr."}
     {:rdf/language "en-US",
      :rdf/value
      "Specifies a list of references to one or more Layer 2 Media Access Control (MAC) addresses that the IPv6 address resolves to. The objects referenced in this list MUST be of type mac-addr."}
     {:rdf/language "en-US",
      :rdf/value
      "Specifies a list of references to one or more IP addresses or domain names that the domain name resolves to. The objects referenced in this list MUST be of type ipv4-addr or ipv6-addr or domain-name (for cases such as CNAME records)."}},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "resolved_to_refs"},
   :rdfs/range
   #{:stix/MACAddress
     {:owl/unionOf [:stix/DomainName :stix/IPv4Address :stix/IPv6Address],
      :rdf/type    :owl/Class}}})

(def resolves_to_refs_string
  {:db/ident :stix/resolves_to_refs_string,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{{:rdf/language "en-US",
      :rdf/value
      "Specifies a list of references to one or more Layer 2 Media Access Control (MAC) addresses that the IPv4 address resolves to. The objects referenced in this list MUST be of type mac-addr."}
     {:rdf/language "en-US",
      :rdf/value
      "Specifies a list of references to one or more Layer 2 Media Access Control (MAC) addresses that the IPv6 address resolves to. The objects referenced in this list MUST be of type mac-addr."}
     {:rdf/language "en-US",
      :rdf/value
      "Specifies a list of references to one or more IP addresses or domain names that the domain name resolves to. The objects referenced in this list MUST be of type ipv4-addr or ipv6-addr or domain-name (for cases such as CNAME records)."}},
   :rdfs/label #{{:rdf/language "en-US",
                  :rdf/value    "resolved_to_refs_string"}
                 {:rdf/language "en-US",
                  :rdf/value    "resolved_to_refs_id"}},
   :rdfs/range :xsd/string})

(def resource_level
  {:db/ident :stix/resource_level,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{{:rdf/language "en-us",
      :rdf/value
      "This property specifies the organizational level at which this Intrusion Set typically works, which in turn determines the resources available to this Intrusion Set for use in an attack. The value for this property SHOULD come from the attack-resource-level-ov  open vocabulary."}
     {:rdf/language "en-us",
      :rdf/value
      "The organizational level at which this Threat Actor typically works, which in turn determines the resources available to this Threat Actor for use in an attack. This attribute is linked to the sophistication property — a specific resource level implies that the Threat Actor has access to at least a specific sophistication level. The value for this property SHOULD come from the attack-resource-level-ov open vocabulary."}},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "resource_level"}})

(def result
  {:db/ident :stix/result,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The classification result as determined by the scanner or tool analysis process. The value for this property SHOULD come from the malware-result-ov open vocabulary."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "result"},
   :rdfs/range :stix/MalwareResultOv})

(def result_name
  {:db/ident :stix/result_name,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The classification result or name assigned to the malware instance by the scanner tool."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "result_name"},
   :rdfs/range :xsd/string})

(def revoked
  {:db/ident :stix/revoked,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The revoked property is only used by STIX Objects that support versioning and indicates whether the object has been revoked. \\n\\n Revoked objects are no longer considered valid by the object creator. Revoking an object is permanent; future versions of the object with this id MUST NOT be created. \\n\\n The default value of this property is false. \\n\\n See section 3.6 for further definition of versioning."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "revoked"},
   :rdfs/range :xsd/boolean})

(def rir
  {:db/ident :stix/rir,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "Specifies the name of the Regional Internet Registry (RIR) that assigned the number to the AS."},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "rir"},
   :rdfs/range :xsd/string})

(def roles
  {:db/ident :stix/roles,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{{:rdf/language "en-us",
      :rdf/value
      "The list of roles that this Identity performs (e.g., CEO, Domain Administrators, Doctors, Hospital, or Retailer). No open vocabulary is yet defined for this property."}
     {:rdf/language "en-us",
      :rdf/value
      "A list of roles the Threat Actor plays. The values for this property SHOULD come from the threat-actor-role-ov open vocabulary."}},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "roles"},
   :rdfs/range :xsd/string})

(def sample_ref
  {:db/ident :stix/sample_ref,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "This property contains the reference to the SCO file, network traffic or artifact object that this malware analysis was performed against. Caution should be observed when creating an SRO between Malware and Malware Analysis objects when the Malware sample_refs property does not contain the SCO that is included in the Malware Analysis sample_ref property. Note, this property can also contain a reference to an SCO which is not associated with Malware (i.e., some SCO which was scanned and found to be benign.)"},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "sample_ref"},
   :rdfs/range :stix/StixCyberObservable})

(def sample_ref_string
  {:db/ident :stix/sample_ref_string,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "This property contains the reference to the SCO file, network traffic or artifact object that this malware analysis was performed against. Caution should be observed when creating an SRO between Malware and Malware Analysis objects when the Malware sample_refs property does not contain the SCO that is included in the Malware Analysis sample_ref property. Note, this property can also contain a reference to an SCO which is not associated with Malware (i.e., some SCO which was scanned and found to be benign.)"},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "sample_ref_string"},
   :rdfs/range :xsd/string})

(def sample_refs
  {:db/ident :stix/sample_refs,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The sample_refs property specifies a list of identifiers of the SCO file or artifact objects associated with this malware instance(s) or family. If is_family is false, then all samples listed in sample_refs MUST refer to the same binary data."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "sample_refs"},
   :rdfs/range {:owl/unionOf [:stix/Artifact :stix/File],
                :rdf/type    :owl/Class}})

(def sample_refs_string
  {:db/ident :stix/sample_refs_string,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The sample_refs property specifies a list of identifiers of the SCO file or artifact objects associated with this malware instance(s) or family. If is_family is false, then all samples listed in sample_refs MUST refer to the same binary data."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "sample_refs_string"},
   :rdfs/range :xsd/string})

(def schema
  {:db/ident :stix/schema,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en",
    :rdf/value
    "The normative definition of the extension, either as a URL or as plain text explaining the definition. \\n\\n A URL SHOULD point to a JSON schema or a location that contains information about the schema. \\n\\n NOTE: It is recommended that an external reference be provided to the comprehensive documentation of the extension-definition."},
   :rdfs/label {:rdf/language "en",
                :rdf/value    "schema"},
   :rdfs/range :xsd/string})

(def secondary_motivations
  {:db/ident :stix/secondary_motivations,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{{:rdf/language "en-us",
      :rdf/value
      "This property specifies the secondary reasons, motivations, or purposes behind this Threat Actor. These motivations can exist as an equal or near-equal cause to the primary motivation. However, it does not replace or necessarily magnify the primary motivation, but it might indicate additional context. The position in the list has no significance. The value for this property SHOULD come from the attack-motivation-ov open vocabulary."}
     {:rdf/language "en-us",
      :rdf/value
      "The time that this Intrusion Set was first seen. A summary property of data from sightings and other data that may or may not be available in STIX. If new sightings are received that are earlier than the first seen timestamp, the object may be updated to account for the new data."}},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "secondary_motivations"}})

(def section_alignment
  {:db/ident :stix/section_alignment,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the alignment (in bytes) of PE sections when they are loaded into memory."},
   :rdfs/label "section_alignment",
   :rdfs/range :xsd/integer})

(def sections
  {:db/ident     :stix/sections,
   :rdf/type     :owl/ObjectProperty,
   :rdfs/comment {:rdf/language "en-us",
                  :rdf/value
                  "Specifies metadata about the sections in the PE file."},
   :rdfs/label   "sections",
   :rdfs/range   :stix/WindowsPeOptionalHeaderType})

(def sectors
  {:db/ident :stix/sectors,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The list of industry sectors that this Identity belongs to. The values for this property SHOULD come from the industry-sector-ov open vocabulary."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "sectors"}})

(def selectors
  {:db/ident :stix/selectors,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies a list of selectors for content contained within the Object in which this property appears.\\n\\nThe marking-definition referenced in the marking_ref property is applied to the content selected by the selectors in this list.\\n\\nThe [RFC5646] language code specified by the lang property is applied to the content selected by the selectors in this list."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "selectors"},
   :rdfs/range :xsd/string})

(def sender_ref
  {:db/ident :stix/sender_ref,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the value of the \"Sender\" field of the email message. The \"Sender:\" field specifies the mailbox of the agent responsible for the actual transmission of the message. The object referenced in this property MUST be of type email-address."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "sender_ref"},
   :rdfs/range :stix/EmailAddress})

(def sender_ref_string
  {:db/ident :stix/sender_ref_string,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the value of the \"Sender\" field of the email message. The \"Sender:\" field specifies the mailbox of the agent responsible for the actual transmission of the message. The object referenced in this property MUST be of type email-address."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "sender_ref_string"},
   :rdfs/range :xsd/string})

(def serial_number
  {:db/ident :stix/serial_number,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "Specifies the unique identifier for the certificate, as issued by a specific Certificate Authority."},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "serial_number"},
   :rdfs/range :xsd/string})

(def service_dll_refs
  {:db/ident :stix/service_dll_refs,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the DLLs loaded by the service, as a reference to one or more File objects. The objects referenced in this property MUST be of type file."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "service_dll_refs"},
   :rdfs/range :stix/File})

(def service_dll_refs_string
  {:db/ident :stix/service_dll_refs_string,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the DLLs loaded by the service, as a reference to one or more File objects. The objects referenced in this property MUST be of type file."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "service_dll_refs_string"},
   :rdfs/range :xsd/string})

(def service_name
  {:db/ident     :stix/service_name,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en-us",
                  :rdf/value    "Specifies the name of the service."},
   :rdfs/label   {:rdf/language "en-us",
                  :rdf/value    "service_name"},
   :rdfs/range   :xsd/string})

(def service_status
  {:db/ident :stix/service_status,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the current status of the service. The values of this property MUST come from the windows-service-status-enum enumeration."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "service_status"}})

(def service_type
  {:db/ident :stix/service_type,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the type of the service. The values of this property MUST come from the windows-service-type-enum enumeration."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "service_type"}})

(def shell
  {:db/ident     :stix/shell,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en-us",
                  :rdf/value    "Specifies the account's command shell."},
   :rdfs/label   {:rdf/language "en-us",
                  :rdf/value    "shell"},
   :rdfs/range   :xsd/string})

(def sid
  {:db/ident :stix/sid,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value "Specifies the security ID (SID) value assigned to the file."},
   :rdfs/label "sid",
   :rdfs/range :xsd/string})

(def sighting_of_ref
  {:db/ident :stix/sighting_of_ref,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "An ID reference to the SDO that was sighted (e.g., Indicator or Malware). For example, if this is a Sighting of an Indicator, that Indicator's ID would be the value of this property. This property MUST reference only an SDO."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "sighting_of_ref"},
   :rdfs/range :stix/StixDomainObject})

(def sighting_of_ref_string
  {:db/ident :stix/sighting_of_ref_string,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "An ID reference to the SDO that was sighted (e.g., Indicator or Malware). For example, if this is a Sighting of an Indicator, that Indicator's ID would be the value of this property. This property MUST reference only an SDO."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "sighting_of_ref_string"},
   :rdfs/range :xsd/string})

(def signature_algorithm
  {:db/ident :stix/signature_algorithm,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "Specifies the name of the algorithm used to sign the certificate."},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "signature_algorithm"},
   :rdfs/range :xsd/string})

(def size
  {:db/ident   :stix/size,
   :rdf/type   :owl/DatatypeProperty,
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "size"},
   :rdfs/range :xsd/nonNegativeInteger})

(def size_of_code
  {:db/ident :stix/size_of_code,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the size of the code (text) section. If there are multiple such sections, this refers to the sum of the sizes of each section. The value of this property MUST NOT be negative."},
   :rdfs/label "size_of_code",
   :rdfs/range :xsd/nonNegativeInteger})

(def size_of_headers
  {:db/ident :stix/size_of_headers,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the combined size of the MS-DOS, PE header, and section headers, rounded up to a multiple of the value specified in the file_alignment header. The value of this property MUST NOT be negative.."},
   :rdfs/label "size_of_headers",
   :rdfs/range :xsd/nonNegativeInteger})

(def size_of_heap_commit
  {:db/ident :stix/size_of_heap_commit,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the size of the local heap space to commit, in bytes. The value of this property MUST NOT be negative."},
   :rdfs/label "size_of_heap_commit",
   :rdfs/range :xsd/nonNegativeInteger})

(def size_of_heap_reserve
  {:db/ident :stix/size_of_heap_reserve,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the size of the local heap space to reserve, in bytes. The value of this property MUST NOT be negative."},
   :rdfs/label "size_of_heap_reserve",
   :rdfs/range :xsd/nonNegativeInteger})

(def size_of_image
  {:db/ident :stix/size_of_image,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the size of the image in bytes, including all headers, as the image is loaded in memory. The value of this property MUST NOT be negative."},
   :rdfs/label "size_of_image",
   :rdfs/range :xsd/nonNegativeInteger})

(def size_of_initialized_data
  {:db/ident :stix/size_of_initialized_data,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the size of the initialized data section. If there are multiple such sections, this refers to the sum of the sizes of each section. The value of this property MUST NOT be negative."},
   :rdfs/label "size_of_initialized_data",
   :rdfs/range :xsd/nonNegativeInteger})

(def size_of_optional_header
  {:db/ident :stix/size_of_optional_header,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the size of the optional header of the PE binary. The value of this property MUST NOT be negative."},
   :rdfs/label "size_of_optional_header",
   :rdfs/range :xsd/nonNegativeInteger})

(def size_of_stack_commit
  {:db/ident :stix/size_of_stack_commit,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the size of the stack to commit, in bytes. The value of this property MUST NOT be negative."},
   :rdfs/label "size_of_stack_commit",
   :rdfs/range :xsd/nonNegativeInteger})

(def size_of_stack_reserve
  {:db/ident :stix/size_of_stack_reserve,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the size of the stack to reserve, in bytes. The value of this property MUST NOT be negative."},
   :rdfs/label "size_of_stack_reserve",
   :rdfs/range :xsd/nonNegativeInteger})

(def size_of_uninitialized_data
  {:db/ident :stix/size_of_uninitialized_data,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the size of the uninitialized data section. If there are multiple such sections, this refers to the sum of the sizes of each section. The value of this property MUST NOT be negative."},
   :rdfs/label "size_of_uninitialized_data",
   :rdfs/range :xsd/nonNegativeInteger})

(def socket_descriptor
  {:db/ident :stix/socket_descriptor,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the socket file descriptor value associated with the socket, as a non-negative integer."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "socket_descriptor"},
   :rdfs/range :xsd/integer})

(def socket_handle
  {:db/ident :stix/socket_handle,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the handle or inode value associated with the socket."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "socket_handle"},
   :rdfs/range :xsd/integer})

(def socket_type
  {:db/ident :stix/socket_type,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the type of the socket. The values of this property MUST come from the network-socket-type-enum enumeration."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "socket_type"}})

(def sophistication
  {:db/ident :stix/sophistication,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The skill, specific knowledge, special training, or expertise a Threat Actor must have to perform the attack. The value for this property SHOULD come from the threat-actor-sophistication-ov open vocabulary."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "sophistication"}})

(def source_name
  {:db/ident :stix/source_name,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The name of the source that the external-reference is defined within (system, registry, organization, etc.)."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "source_name"},
   :rdfs/range :xsd/string})

(def source_ref
  {:db/ident :stix/source_ref,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "The id of the source (from) object. The value MUST be an ID reference to an SDO or SCO (i.e., it cannot point to an SRO, Bundle, Language Content, or Marking Definition)."},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "source_ref"},
   :rdfs/range #{:stix/StixCyberObservable :stix/StixDomainObject}})

(def source_ref_string
  {:db/ident :stix/source_ref_string,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "The id of the source (from) object. The value MUST be an ID reference to an SDO or SCO (i.e., it cannot point to an SRO, Bundle, Language Content, or Marking Definition)."},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "source_ref_string"},
   :rdfs/range :xsd/string})

(def spec_version
  {:db/ident :stix/spec_version,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The version of the STIX specification used to represent this object. \\n\\n The value of this property MUST be 2.1 for STIX Objects defined according to this specification. \\n\\n If objects are found where this property is not present, the implicit value for all STIX Objects other than SCOs is 2.0. Since SCOs are now top-level objects in STIX 2.1, the default value for SCOs is 2.1."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "spec_version"},
   :rdfs/range :xsd/string})

(def src_byte_count
  {:db/ident :stix/src_byte_count,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the number of bytes, as a positive integer, sent from the source to the destination."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "src_type_count"},
   :rdfs/range :xsd/nonNegativeInteger})

(def src_flags_hex
  {:db/ident :stix/src_flags_hex,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the source TCP flags, as the union of all TCP flags observed between the start of the traffic (as defined by the start property) and the end of the traffic (as defined by the end property). If the start and end times of the traffic are not specified, this property SHOULD be interpreted as the union of all TCP flags observed over the entirety of the network traffic being reported upon."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "src_flags_hex"},
   :rdfs/range :xsd/hexBinary})

(def src_packets
  {:db/ident :stix/src_packets,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the number of packets, as a positive integer, sent from the source to the destination."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "src_packets"},
   :rdfs/range :xsd/nonNegativeInteger})

(def src_payload_ref
  {:db/ident :stix/src_payload_ref,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the bytes sent from the source to the destination. The object referenced in this property MUST be of type artifact."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "src_payload_ref"},
   :rdfs/range :stix/Artifact})

(def src_payload_ref_string
  {:db/ident :stix/src_payload_ref_string,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the bytes sent from the source to the destination. The object referenced in this property MUST be of type artifact."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "src_payload_ref_string"},
   :rdfs/range :xsd/string})

(def src_port
  {:db/ident :stix/src_port,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the source port used in the network traffic, as an integer. The port value MUST be in the range of 0 - 65535."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "src port"},
   :rdfs/range {:owl/onDatatype :xsd/nonNegativeInteger,
                :owl/withRestrictions [{:xsd/maxInclusive 65535M}],
                :rdf/type       :rdfs/Datatype}})

(def src_ref
  {:db/ident :stix/src_ref,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the source of the network traffic, as a reference to a Cyber-observable Object. The object referenced MUST be of type ipv4-addr, ipv6-addr, mac-addr, or domain-name (for cases where the IP address for a domain name is unknown)."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "src_ref"},
   :rdfs/range {:owl/unionOf [:stix/DomainName
                              :stix/IPv4Address
                              :stix/IPv6Address
                              :stix/MACAddress],
                :rdf/type    :owl/Class}})

(def src_ref_string
  {:db/ident :stix/src_ref_string,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the source of the network traffic, as a reference to a Cyber-observable Object. The object referenced MUST be of type ipv4-addr, ipv6-addr, mac-addr, or domain-name (for cases where the IP address for a domain name is unknown)."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "src_ref_string"},
   :rdfs/range :xsd/string})

(def start
  {:db/ident :stix/start,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the date/time the network traffic was initiated, if known."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "start"},
   :rdfs/range :xsd/dateTime})

(def start_time
  {:db/ident :stix/start_time,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "This optional timestamp represents the earliest time at which the Relationship between the objects exists. If this property is a future timestamp, at the time the start_time property is defined, then this represents an estimate by the producer of the intelligence of the earliest time at which relationship will be asserted to be true. If it is not specified, then the earliest time at which the relationship between the objects exists is not defined."},
   :rdfs/label "start_time",
   :rdfs/range :xsd/dateTime})

(def start_type
  {:db/ident :stix/start_type,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the start options defined for the service. The values of this property MUST come from the windows-service-start-type-enum enumeration."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "start_type"}})

(def startup_info
  {:db/ident :stix/startup_info,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the STARTUP_INFO struct used by the process, as a dictionary. Each name/value pair in the struct MUST be represented as a key/value pair in the dictionary, where each key MUST be a case-preserved version of the original name. For example, given a name of \"lpDesktop\" the corresponding key would be lpDesktop."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "startup_info"},
   :rdfs/range :stix/Dictionary})

(def statement
  {:db/ident :stix/statement,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "A Statement (e.g., copyright, terms of use) applied to the content marked by this marking definition."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "statement"},
   :rdfs/range :xsd/string})

(def static-analysis-of
  {:db/ident :stix/static-analysis-of,
   :rdf/type :owl/ObjectProperty})

(def stop_time
  {:db/ident :stix/stop_time,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The latest time at which the Relationship between the objects exists. If this property is a future timestamp, at the time the stop_time property is defined, then this represents an estimate by the producer of the intelligence of the latest time at which relationship will be asserted to be true. If start_time and stop_time are both defined, then stop_time MUST be later than the start_time value. If stop_time is not specified, then the latest time at which the relationship between the objects exists is either not known, not disclosed, or has no defined stop time."},
   :rdfs/label "stop_time",
   :rdfs/range :xsd/dateTime})

(def street_address
  {:db/ident :stix/street_address,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The street address that this Location describes. This property includes all aspects or parts of the street address. For example, some addresses may have multiple lines including a mailstop or apartment number."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "street_address"},
   :rdfs/range :xsd/string})

(def subject
  {:db/ident :stix/subject,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{{:rdf/language "en-us",
      :rdf/value    "Specifies the subject of the email message."}
     {:rdf/language "en-US",
      :rdf/value
      "Specifies the name of the entity associated with the public key stored in the subject public key field of the certificate."}},
   :rdfs/label #{{:rdf/language "en-US",
                  :rdf/value    "subject"}
                 {:rdf/language "en-us",
                  :rdf/value    "subject"}},
   :rdfs/range :xsd/string})

(def subject_alternative_name
  {:db/ident :stix/subject_alternative_name,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "Specifies the additional identities to be bound to the subject of the certificate. Also equivalent to the object ID (OID) value of 2.5.29.17."},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "subject_alternative_name"},
   :rdfs/range :xsd/string})

(def subject_directory_attributes
  {:db/ident :stix/subject_directory_attributes,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "Specifies the identification attributes (e.g., nationality) of the subject. Also equivalent to the object ID (OID) value of 2.5.29.9."},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "subject_directory_attributes"},
   :rdfs/range :xsd/string})

(def subject_key_identifier
  {:db/ident :stix/subject_key_identifier,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "Specifies the identifier that provides a means of identifying certificates that contain a particular public key. Also equivalent to the object ID (OID) value of 2.5.29.14."},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "subject_key_identifier"},
   :rdfs/range :xsd/string})

(def subject_public_key_algorithm
  {:db/ident :stix/subject_public_key_algorithm,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "Specifies the name of the algorithm with which to encrypt data being sent to the subject."},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "subject_public_key_algorithm"},
   :rdfs/range :xsd/string})

(def subject_public_key_exponent
  {:db/ident :stix/subject_public_key_exponent,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "Specifies the exponent portion of the subject's public RSA key, as an integer."},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "subject_public_key_exponent"},
   :rdfs/range :xsd/positiveInteger})

(def subject_public_key_modulus
  {:db/ident :stix/subject_public_key_modulus,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "Specifies the modulus portion of the subject's public RSA key."},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "subject_public_key_modulus"},
   :rdfs/range :xsd/string})

(def submitted
  {:db/ident :stix/submitted,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The date and time that the malware was first submitted for scanning or analysis. This value will stay constant while the scanned date can change. For example, when Malware was submitted to a virus analysis tool."},
   :rdfs/label "submitted",
   :rdfs/range :xsd/dateTime})

(def subsystem_hex
  {:db/ident :stix/subsystem_hex,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the subsystem (e.g., GUI, device driver, etc.) that is required to run this image."},
   :rdfs/label "subsystem_hex",
   :rdfs/range :xsd/hexBinary})

(def summary
  {:db/ident :stix/summary,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The summary property indicates whether the Sighting should be considered summary data. Summary data is an aggregation of previous Sightings reports and should not be considered primary source data. Default value is false."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "summary"},
   :rdfs/range :xsd/boolean})

(def swid
  {:db/ident :stix/swid,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the Software Identification (SWID) Tags [SWID] entry for the software, if available. The tag attribute, tagId, a globally unique identifier, SHOULD be used as a proxy identifier of the tagged product."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "swid"},
   :rdfs/range :xsd/string})

(def target_ref
  {:db/ident :stix/target_ref,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "The id of the target (to) object. The value MUST be an ID reference to an SDO or SCO (i.e., it cannot point to an SRO, Bundle, Language Content, or Marking Definition)."},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "target_ref"},
   :rdfs/range #{:stix/StixCyberObservable :stix/StixDomainObject}})

(def target_ref_id
  {:db/ident :stix/target_ref_id,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "The id of the target (to) object. The value MUST be an ID reference to an SDO or SCO (i.e., it cannot point to an SRO, Bundle, Language Content, or Marking Definition)."},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "target_ref_id"},
   :rdfs/range :xsd/string})

(def targets
  {:db/ident :stix/targets,
   :rdf/type :owl/ObjectProperty})

(def threat_actor_types
  {:db/ident :stix/threat_actor_types,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The type(s) of this threat actor. The values for this property SHOULD come from the threat-actor-type-ov open vocabulary."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "threat_actor_types"}})

(def time_date_stamp
  {:db/ident :stix/time_date_stamp,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the time when the PE binary was created. The timestamp value MUST be precise to the second."},
   :rdfs/label "time_date_stamp",
   :rdfs/range :xsd/dateTime})

(def tlp
  {:db/ident :stix/tlp,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The TLP level [TLP] of the content marked by this marking definition."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "tlp"},
   :rdfs/range {:owl/oneOf [{:rdf/value "amber"}
                            {:rdf/value "green"}
                            {:rdf/value "red"}
                            {:rdf/value "white"}],
                :rdf/type  :rdfs/Datatype}})

(def to_refs
  {:db/ident :stix/to_refs,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the mailboxes that are \"To:\" recipients of the email message. The objects referenced in this list MUST be of type email-address."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "to_refs"},
   :rdfs/range :stix/EmailAddress})

(def to_refs_string
  {:db/ident :stix/to_refs_string,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the mailboxes that are \"To:\" recipients of the email message. The objects referenced in this list MUST be of type email-address."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "to_refs_string"},
   :rdfs/range :xsd/string})

(def tool_types
  {:db/ident :stix/tool_types,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The kind(s) of tool(s) being described. The values for this property SHOULD come from the tool-type-ov open vocabulary."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "tool_types"}})

(def tool_version
  {:db/ident     :stix/tool_version,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en-us",
                  :rdf/value
                  "The version identifier associated with the Tool."},
   :rdfs/label   {:rdf/language "en-us",
                  :rdf/value    "tool_version"},
   :rdfs/range   :xsd/string})

(def type
  {:db/ident :stix/type,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "The type property identifies the type of object. The value of this property MUST be bundle."}
     {:rdf/language "en-us",
      :rdf/value
      "The type property identifies the type of STIX Object. The value of the type property MUST be the name of one of the types of STIX Objects defined in sections 4, 5, 6, and 7 (e.g., indicator) or the name of a Custom Object as defined by section 11.2."}},
   :rdfs/label #{{:rdf/language "en",
                  :rdf/value    "type"}
                 {:rdf/language "en-us",
                  :rdf/value    "type"}},
   :rdfs/range :xsd/string})

(def url
  {:db/ident :stix/url,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{{:rdf/language "en-us",
      :rdf/value
      "The value of this property MUST be a valid URL that resolves to the unencoded content. This property MUST NOT be present if payload_bin is provided."}
     {:rdf/language "en-us",
      :rdf/value    "A URL reference to an external resource [RFC3986]."}},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "url"},
   :rdfs/range :xsd/string})

(def user_id
  {:db/ident :stix/user_id,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the identifier of the account. The format of the identifier depends on the system the user account is maintained in, and may be a numeric ID, a GUID, an account name, an email address, etc. The user_id property should be populated with whatever field is the unique identifier for the system the account is a member of. For example, on UNIX systems it would be populated with the UID."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "user_id"},
   :rdfs/range :xsd/string})

(def uses
  {:db/ident :stix/uses,
   :rdf/type :owl/ObjectProperty})

(def valid_from
  {:db/ident :stix/valid_from,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The time from which this Indicator is considered a valid indicator of the behaviors it is related or represents."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "valid_from"},
   :rdfs/range :xsd/dateTime})

(def valid_until
  {:db/ident :stix/valid_until,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "The time at which this Indicator should no longer be considered a valid indicator of the behaviors it is related to or represents. If the valid_until property is omitted, then there is no constraint on the latest time for which the Indicator is valid. This MUST be greater than the timestamp in the valid_from property."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "valid_until"},
   :rdfs/range :xsd/dateTime})

(def validity_not_after
  {:db/ident :stix/validity_not_after,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "Specifies the date on which the certificate validity period ends."},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "validity_not_after"},
   :rdfs/range :xsd/dateTime})

(def validity_not_before
  {:db/ident :stix/validity_not_before,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "Specifies the date on which the certificate validity period begins."},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "validity_not_before"},
   :rdfs/range :xsd/dateTime})

(def value
  {:db/ident :stix/value,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{{:rdf/language "en-us",
      :rdf/value
      "Specifies the value of the URL. The value of this property MUST conform to [RFC3986], more specifically section 1.1.3 with reference to the definition for \"Uniform Resource Locator\"."}
     {:rdf/language "en-us",
      :rdf/value
      "Specifies the values of one or more IPv4 addresses expressed using CIDR notation. If a given IPv4 Address object represents a single IPv4 address, the CIDR /32 suffix MAY be omitted. Example: 10.2.4.5/24"}
     {:rdf/language "en-us",
      :rdf/value
      "Specifies the value of the email address. This MUST NOT include the display name. This property corresponds to the addr-spec construction in section 3.4 of [RFC5322], for example, jane.smith@example.com."}
     {:rdf/language "en-us",
      :rdf/value
      "Specifies the value of the domain name. The value of this property MUST conform to [RFC1034], and each domain and sub-domain contained within the domain name MUST conform to [RFC5890]."}
     {:rdf/language "en-us",
      :rdf/value
      "Specifies the values of one or more IPv6 addresses expressed using CIDR notation. If a given IPv6 Address object represents a single IPv6 address, the CIDR /128 suffix MAY be omitted."}
     {:rdf/language "en-us",
      :rdf/value
      "Specifies the value of a single MAC address. The MAC address value MUST be represented as a single colon-delimited, lowercase MAC-48 address, which MUST include leading zeros for each octet. Example: 00:00:ab:cd:ef:01"}},
   :rdfs/label #{{:rdf/language "en-US",
                  :rdf/value    "value"} "value"
                 {:rdf/language "en-us",
                  :rdf/value    "value"}},
   :rdfs/range :xsd/string})

(def values
  {:db/ident :stix/values,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "Specifies the number of subkeys contained under the registry key."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "values"},
   :rdfs/range :stix/WindowsRegistryValueType})

(def variant-of
  {:db/ident :stix/variant-of,
   :rdf/type :owl/ObjectProperty})

(def vendor
  {:db/ident     :stix/vendor,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en-us",
                  :rdf/value
                  "Specifies the name of the vendor of the software."},
   :rdfs/label   "vendor",
   :rdfs/range   :xsd/string})

(def version
  {:db/ident :stix/version,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   #{{:rdf/language "en",
      :rdf/value
      "The version of this extension. Producers of STIX extensions are encouraged to follow standard semantic versioning procedures where the version number follows the pattern, MAJOR.MINOR.PATCH. This will allow consumers to distinguish between the three different levels of compatibility typically identified by such versioning strings. \\n\\n As with all STIX Objects, changing a STIX extension definition could involve STIX versioning. See section 3.6.2 for more information on versioning an object versus creating a new one."}
     {:rdf/language "en-us",
      :rdf/value    "Specifies the version of the encoded certificate."}
     {:rdf/language "en-us",
      :rdf/value    "Specifies the version of the software."}
     {:rdf/language "en-us",
      :rdf/value
      "The version of the analysis product that was used to perform the analysis."}
     {:rdf/language "en-us",
      :rdf/value
      "Specifies the decimal version number of the string from the PDF header that specifies the version of the PDF specification to which the PDF file conforms. E.g., 1.4."}},
   :rdfs/label #{{:rdf/language "en-us",
                  :rdf/value    "version"}
                 {:rdf/language "en",
                  :rdf/value    "version"} "version"},
   :rdfs/range :xsd/string})

(def where_sighted_refs
  {:db/ident :stix/where_sighted_refs,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "A list of ID references to the Identity or Location objects describing the entities or types of entities that saw the sighting. Omitting the where_sighted_refs property does not imply that the sighting was seen by the object creator. To indicate that the sighting was seen by the object creator, an Identity representing the object creator should be listed in where_sighted_refs. This property MUST reference only Identity or Location SDOs."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "where_sighted_refs"},
   :rdfs/range {:owl/unionOf [:stix/Identity :stix/Location],
                :rdf/type    :owl/Class}})

(def where_sighted_refs_string
  {:db/ident :stix/where_sighted_refs_string,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "A list of ID references to the Identity or Location objects describing the entities or types of entities that saw the sighting. Omitting the where_sighted_refs_string property does not imply that the sighting was seen by the object creator. To indicate that the sighting was seen by the object creator, an Identity representing the object creator should be listed in where_sighted_refs_string. This property MUST reference only Identity or Location SDOs."},
   :rdfs/label {:rdf/language "en-us",
                :rdf/value    "where_sighted_refs_string"},
   :rdfs/range :xsd/string})

(def win32_version_value_hex
  {:db/ident     :stix/win32_version_value_hex,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en-us",
                  :rdf/value    "Specifies the reserved win32 version value."},
   :rdfs/label   "win32_version_value_hex",
   :rdfs/range   :xsd/hexBinary})

(def window_title
  {:db/ident     :stix/window_title,
   :rdf/type     :owl/DatatypeProperty,
   :rdfs/comment {:rdf/language "en-us",
                  :rdf/value
                  "Specifies the title of the main window of the process."},
   :rdfs/label   {:rdf/language "en-us",
                  :rdf/value    "window_title"},
   :rdfs/range   :xsd/string})

(def x509_v3_extensions
  {:db/ident :stix/x509_v3_extensions,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   {:rdf/language "en-US",
    :rdf/value
    "Specifies any standard X.509 v3 extensions that may be used in the certificate."},
   :rdfs/label {:rdf/language "en-US",
                :rdf/value    "x509_v3_extensions"},
   :rdfs/range :stix/X509v3ExtensionsType})

(def urn:uuid:3079286a-7a29-5bff-b7d0-d60e6aef6075
  {:rdf/type :swrl/Variable,
   :xsd/anyURI
   "http://docs.oasis-open.org/cti/ns/stix/threat-actor#typestring"})

(def urn:uuid:8df6bc25-3cd1-5abf-a354-a5caef25d4d4
  {:rdf/type   :swrl/Variable,
   :xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/threat-actor#ta"})

(def urn:uuid:2ed1dd87-c299-5731-a828-449c997c4878
  {:rdf/type   :swrl/Variable,
   :xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/grouping#g"})

(def urn:uuid:f5bd056c-58f4-5079-b312-ef82a560327a
  {:rdf/type :swrl/Variable,
   :xsd/anyURI
   "http://docs.oasis-open.org/cti/ns/stix/intrusion-set#motivation"})

(def urn:uuid:9b822c84-1f49-5057-86cc-12c318df86b0
  {:rdf/type   :swrl/Variable,
   :xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/user-account#type"})

(def urn:uuid:0372b6d1-6de7-524f-b2ff-d9d3c9d71155
  {:rdf/type   :swrl/Variable,
   :xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/user-account#acct"})

(def urn:uuid:1164428e-934b-5bef-9ccc-9b707b98640b
  {:rdf/type :swrl/Variable,
   :xsd/anyURI
   "http://docs.oasis-open.org/cti/ns/stix/intrusion-set#resourcestring"})

(def urn:uuid:4f4a192f-3e9a-5f0b-b293-8b5f721ee99c
  {:rdf/type   :swrl/Variable,
   :xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/intrusion-set#iset"})

(def urn:uuid:d4a94b8c-f51a-5787-a1b7-a9c8f741d669
  {:rdf/type :owl/AnnotationProperty,
   :xsd/anyURI
   "http://swrl.stanford.edu/ontologies/3.3/swrla.owl#isRuleEnabled"})

(def urn:uuid:23e53954-a118-50ea-aaa5-333bda58a7fb
  {:rdf/type   :swrl/Variable,
   :xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/grouping#typestring"})

(def urn:uuid:03e31da6-b727-594a-a9f0-42f4224048cd
  {:owl/imports
   #{{:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/course-of-action"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/report"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/threat-actor"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/mac-address"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/incident"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/software"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/vocabulary"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/file"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/opinion"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/extension-definition"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/mutex"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/windows-registry"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/process"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/common-properties"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/vulnerability"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/ipv4-address"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/infrastructure"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/data-types"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/ipv6-address"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/network-traffic"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/url"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/domain-name"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/user-account"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/language-content"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/artifact"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/autonomous-system"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/intrusion-set"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/note"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/directory"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/bundle"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/email-message"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/relationship"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/x509-certificate"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/data-marking"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/location"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/indicator"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/identity"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/campaign"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/malware"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/relationship-types"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/observed-data"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/attack-pattern"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/sighting"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/email-address"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/grouping"}
     {:xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix/tool"}},
   :owl/versionInfo "2.1.0",
   :rdf/type :owl/Ontology,
   :rdfs/comment
   {:rdf/language "en-us",
    :rdf/value
    "This ontology is the master ontology for the STIX 2.1.0. It imports all the various STIX ontologies files to create an unified ontology based on the various component ontologies that make up STIX."},
   :xsd/anyURI "http://docs.oasis-open.org/cti/ns/stix"})

(def urn:uuid:bfedc735-a340-5b85-9f7e-fe37dcd0f772
  {:rdf/type :swrl/Variable,
   :xsd/anyURI
   "http://docs.oasis-open.org/cti/ns/stix/threat-actor#resourcestring"})