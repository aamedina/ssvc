(ns net.wikipunk.rdf.spdx-expandedlicensing
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
   :rdfa/prefix       "spdx-expandedlicensing",
   :rdfa/uri          "https://spdx.org/rdf/v3/ExpandedLicensing/"})

(def ConjunctiveLicenseSet
  "A ConjunctiveLicenseSet indicates that _each_ of its subsidiary\nAnyLicenseInfos apply. In other words, a ConjunctiveLicenseSet of two or\nmore licenses represents a licensing situation where _all_ of the specified\nlicenses are to be complied with. It is represented in the SPDX License\nExpression Syntax by the `AND` operator.\n\nIt is syntactically correct to specify a ConjunctiveLicenseSet where the\nsubsidiary AnyLicenseInfos may be \"incompatible\" according to a particular\ninterpretation of the corresponding Licenses. The SPDX License Expression\nSyntax does not take into account interpretation of license texts, which is\nleft to the consumer of SPDX data to determine for themselves."
  {:db/ident :spdx-expandedlicensing/ConjunctiveLicenseSet,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "A ConjunctiveLicenseSet indicates that _each_ of its subsidiary\nAnyLicenseInfos apply. In other words, a ConjunctiveLicenseSet of two or\nmore licenses represents a licensing situation where _all_ of the specified\nlicenses are to be complied with. It is represented in the SPDX License\nExpression Syntax by the `AND` operator.\n\nIt is syntactically correct to specify a ConjunctiveLicenseSet where the\nsubsidiary AnyLicenseInfos may be \"incompatible\" according to a particular\ninterpretation of the corresponding Licenses. The SPDX License Expression\nSyntax does not take into account interpretation of license texts, which is\nleft to the consumer of SPDX data to determine for themselves.",
   :rdfs/subClassOf [:spdx-simplelicensing/AnyLicenseInfo :spdx-core/Element],
   :sh/property {:sh/class    :spdx-simplelicensing/AnyLicenseInfo,
                 :sh/minCount #xsd/integer 2,
                 :sh/name     "member",
                 :sh/path     :spdx-expandedlicensing/member},
   :vs/term_status "Stable"})

(def CustomLicense
  "A CustomLicense represents a License that is not listed on the SPDX License\nList at https://spdx.org/licenses, and is therefore defined by an SPDX data\ncreator."
  {:db/ident :spdx-expandedlicensing/CustomLicense,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "A CustomLicense represents a License that is not listed on the SPDX License\nList at https://spdx.org/licenses, and is therefore defined by an SPDX data\ncreator.",
   :rdfs/subClassOf [:spdx-expandedlicensing/License
                     :spdx-expandedlicensing/ExtendableLicense
                     :spdx-simplelicensing/AnyLicenseInfo
                     :spdx-core/Element],
   :vs/term_status "Stable"})

(def CustomLicenseAddition
  "A CustomLicenseAddition represents an addition to a License that is not listed\non the SPDX Exceptions List at https://spdx.org/licenses/exceptions-index.html,\nand is therefore defined by an SPDX data creator.\n\nIt is intended to represent additional language which is meant to be added to\na License, but which is not itself a standalone License."
  {:db/ident :spdx-expandedlicensing/CustomLicenseAddition,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "A CustomLicenseAddition represents an addition to a License that is not listed\non the SPDX Exceptions List at https://spdx.org/licenses/exceptions-index.html,\nand is therefore defined by an SPDX data creator.\n\nIt is intended to represent additional language which is meant to be added to\na License, but which is not itself a standalone License.",
   :rdfs/subClassOf [:spdx-expandedlicensing/LicenseAddition
                     :spdx-core/Element],
   :vs/term_status "Stable"})

(def DisjunctiveLicenseSet
  "A DisjunctiveLicenseSet indicates that _only one_ of its subsidiary\nAnyLicenseInfos is required to apply. In other words, a\nDisjunctiveLicenseSet of two or more licenses represents a licensing\nsituation where _only one_ of the specified licenses are to be complied with.\nA consumer of SPDX data would typically understand this to permit the recipient\nof the licensed content to choose which of the corresponding license they\nwould prefer to use. It is represented in the SPDX License Expression Syntax\nby the `OR` operator."
  {:db/ident :spdx-expandedlicensing/DisjunctiveLicenseSet,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "A DisjunctiveLicenseSet indicates that _only one_ of its subsidiary\nAnyLicenseInfos is required to apply. In other words, a\nDisjunctiveLicenseSet of two or more licenses represents a licensing\nsituation where _only one_ of the specified licenses are to be complied with.\nA consumer of SPDX data would typically understand this to permit the recipient\nof the licensed content to choose which of the corresponding license they\nwould prefer to use. It is represented in the SPDX License Expression Syntax\nby the `OR` operator.",
   :rdfs/subClassOf [:spdx-simplelicensing/AnyLicenseInfo :spdx-core/Element],
   :sh/property {:sh/class    :spdx-simplelicensing/AnyLicenseInfo,
                 :sh/minCount #xsd/integer 2,
                 :sh/name     "member",
                 :sh/path     :spdx-expandedlicensing/member},
   :vs/term_status "Stable"})

(def ExtendableLicense
  "The WithAdditionOperator can have a License or an OrLaterOperator as the license property value.  This class is used for the value."
  {:db/ident :spdx-expandedlicensing/ExtendableLicense,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "The WithAdditionOperator can have a License or an OrLaterOperator as the license property value.  This class is used for the value.",
   :rdfs/subClassOf [:spdx-simplelicensing/AnyLicenseInfo :spdx-core/Element],
   :vs/term_status "Stable"})

(def License
  "A License represents a license text, whether listed on the SPDX License List\n(ListedLicense) or defined by an SPDX data creator (CustomLicense)."
  {:db/ident :spdx-expandedlicensing/License,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "A License represents a license text, whether listed on the SPDX License List\n(ListedLicense) or defined by an SPDX data creator (CustomLicense).",
   :rdfs/subClassOf [:spdx-expandedlicensing/ExtendableLicense
                     :spdx-simplelicensing/AnyLicenseInfo
                     :spdx-core/Element],
   :sh/property [{:sh/datatype :xsd/string,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "obsoletedBy",
                  :sh/path     :spdx-expandedlicensing/obsoletedBy}
                 {:sh/datatype :xsd/string,
                  :sh/maxCount #xsd/integer 1,
                  :sh/minCount #xsd/integer 1,
                  :sh/name     "/SimpleLicensing/licenseText",
                  :sh/path     :spdx-simplelicensing/licenseText}
                 {:sh/datatype :xsd/boolean,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "isOsiApproved",
                  :sh/path     :spdx-expandedlicensing/isOsiApproved}
                 {:sh/datatype :xsd/boolean,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "isDeprecatedLicenseId",
                  :sh/path     :spdx-expandedlicensing/isDeprecatedLicenseId}
                 {:sh/datatype :xsd/boolean,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "isFsfLibre",
                  :sh/path     :spdx-expandedlicensing/isFsfLibre}
                 {:sh/datatype :xsd/string,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "standardLicenseHeader",
                  :sh/path     :spdx-expandedlicensing/standardLicenseHeader}
                 {:sh/datatype :xsd/string,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name "standardLicenseTemplate",
                  :sh/path :spdx-expandedlicensing/standardLicenseTemplate}],
   :vs/term_status "Stable"})

(def LicenseAddition
  "A LicenseAddition represents text which is intended to be added to a License\nas additional text, but which is not itself intended to be a standalone\nLicense.\n\nIt may be an exception which is listed on the SPDX Exceptions List\n(ListedLicenseException), or may be any other additional text (as an exception\nor otherwise) which is defined by an SPDX data creator (CustomLicenseAddition)."
  {:db/ident :spdx-expandedlicensing/LicenseAddition,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "A LicenseAddition represents text which is intended to be added to a License\nas additional text, but which is not itself intended to be a standalone\nLicense.\n\nIt may be an exception which is listed on the SPDX Exceptions List\n(ListedLicenseException), or may be any other additional text (as an exception\nor otherwise) which is defined by an SPDX data creator (CustomLicenseAddition).",
   :rdfs/subClassOf :spdx-core/Element,
   :sh/property [{:sh/datatype :xsd/boolean,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "isDeprecatedAdditionId",
                  :sh/path     :spdx-expandedlicensing/isDeprecatedAdditionId}
                 {:sh/datatype :xsd/string,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "standardAdditionTemplate",
                  :sh/path     :spdx-expandedlicensing/standardAdditionTemplate}
                 {:sh/datatype :xsd/string,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "obsoletedBy",
                  :sh/path     :spdx-expandedlicensing/obsoletedBy}
                 {:sh/datatype :xsd/string,
                  :sh/maxCount #xsd/integer 1,
                  :sh/minCount #xsd/integer 1,
                  :sh/name     "additionText",
                  :sh/path     :spdx-expandedlicensing/additionText}],
   :vs/term_status "Stable"})

(def ListedLicense
  "A ListedLicense represents a License that is listed on the SPDX License List\nat https://spdx.org/licenses."
  {:db/ident :spdx-expandedlicensing/ListedLicense,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "A ListedLicense represents a License that is listed on the SPDX License List\nat https://spdx.org/licenses.",
   :rdfs/subClassOf [:spdx-expandedlicensing/License
                     :spdx-expandedlicensing/ExtendableLicense
                     :spdx-simplelicensing/AnyLicenseInfo
                     :spdx-core/Element],
   :sh/property [{:sh/datatype :xsd/string,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "listVersionAdded",
                  :sh/path     :spdx-expandedlicensing/listVersionAdded}
                 {:sh/datatype :xsd/string,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "deprecatedVersion",
                  :sh/path     :spdx-expandedlicensing/deprecatedVersion}],
   :vs/term_status "Stable"})

(def ListedLicenseException
  "A ListedLicenseException represents an exception to a License (in other words,\nan exception to a license condition or an additional permission beyond those\ngranted in a License) which is listed on the SPDX Exceptions List at\nhttps://spdx.org/licenses/exceptions-index.html."
  {:db/ident :spdx-expandedlicensing/ListedLicenseException,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "A ListedLicenseException represents an exception to a License (in other words,\nan exception to a license condition or an additional permission beyond those\ngranted in a License) which is listed on the SPDX Exceptions List at\nhttps://spdx.org/licenses/exceptions-index.html.",
   :rdfs/subClassOf [:spdx-expandedlicensing/LicenseAddition
                     :spdx-core/Element],
   :sh/property [{:sh/datatype :xsd/string,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "deprecatedVersion",
                  :sh/path     :spdx-expandedlicensing/deprecatedVersion}
                 {:sh/datatype :xsd/string,
                  :sh/maxCount #xsd/integer 1,
                  :sh/name     "listVersionAdded",
                  :sh/path     :spdx-expandedlicensing/listVersionAdded}],
   :vs/term_status "Stable"})

(def OrLaterOperator
  "An OrLaterOperator indicates that this portion of the AnyLicenseInfo\nrepresents either (1) the specified version of the corresponding License, or\n(2) any later version of that License. It is represented in the SPDX License\nExpression Syntax by the `+` operator.\n\nIt is context-dependent, and unspecified by SPDX, as to what constitutes a\n\"later version\" of any particular License. Some Licenses may not be versioned,\nor may not have clearly-defined ordering for versions. The consumer of SPDX\ndata will need to determine for themselves what meaning to attribute to a\n\"later version\" operator for a particular License."
  {:db/ident :spdx-expandedlicensing/OrLaterOperator,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "An OrLaterOperator indicates that this portion of the AnyLicenseInfo\nrepresents either (1) the specified version of the corresponding License, or\n(2) any later version of that License. It is represented in the SPDX License\nExpression Syntax by the `+` operator.\n\nIt is context-dependent, and unspecified by SPDX, as to what constitutes a\n\"later version\" of any particular License. Some Licenses may not be versioned,\nor may not have clearly-defined ordering for versions. The consumer of SPDX\ndata will need to determine for themselves what meaning to attribute to a\n\"later version\" operator for a particular License.",
   :rdfs/subClassOf [:spdx-expandedlicensing/ExtendableLicense
                     :spdx-simplelicensing/AnyLicenseInfo
                     :spdx-core/Element],
   :sh/property {:sh/class    :spdx-expandedlicensing/License,
                 :sh/maxCount #xsd/integer 1,
                 :sh/minCount #xsd/integer 1,
                 :sh/name     "subjectLicense",
                 :sh/path     :spdx-expandedlicensing/subjectLicense},
   :vs/term_status "Stable"})

(def WithAdditionOperator
  "A WithAdditionOperator indicates that the designated License is subject to the\ndesignated LicenseAddition, which might be a license exception on the SPDX\nExceptions List (ListedLicenseException) or may be other additional text\n(CustomLicenseAddition). It is represented in the SPDX License Expression\nSyntax by the `WITH` operator."
  {:db/ident :spdx-expandedlicensing/WithAdditionOperator,
   :rdf/type [:sh/NodeShape :owl/Class],
   :rdfs/comment
   "A WithAdditionOperator indicates that the designated License is subject to the\ndesignated LicenseAddition, which might be a license exception on the SPDX\nExceptions List (ListedLicenseException) or may be other additional text\n(CustomLicenseAddition). It is represented in the SPDX License Expression\nSyntax by the `WITH` operator.",
   :rdfs/subClassOf [:spdx-simplelicensing/AnyLicenseInfo :spdx-core/Element],
   :sh/property [{:sh/class    :spdx-expandedlicensing/ExtendableLicense,
                  :sh/maxCount #xsd/integer 1,
                  :sh/minCount #xsd/integer 1,
                  :sh/name     "subjectLicense",
                  :sh/path     :spdx-expandedlicensing/subjectLicense}
                 {:sh/class    :spdx-expandedlicensing/LicenseAddition,
                  :sh/maxCount #xsd/integer 1,
                  :sh/minCount #xsd/integer 1,
                  :sh/name     "subjectAddition",
                  :sh/path     :spdx-expandedlicensing/subjectAddition}],
   :vs/term_status "Stable"})

(def additionComment
  "An additionComment for a LicenseAddition describes general factual information\nabout the LicenseAddition. It should not contain information (or links to\ninformation) that includes any kind of interpretation about the meaning or\neffect of the License, even if written by the license addition's author.\n\nExamples of information for an additionComment may include the following:\n\n* If the LicenseAddition's identifier is deprecated, it may briefly explain the\n  reason for deprecation.\n* It may include the date of release, if identified, for LicenseAdditions with\n  multiple versions.\n* It may include links to other official language translations for the\n  LicenseAddition.\n* It may include a reference to the License(s) with which this LicenseAddition\n  is typically used."
  {:db/ident :spdx-expandedlicensing/additionComment,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "An additionComment for a LicenseAddition describes general factual information\nabout the LicenseAddition. It should not contain information (or links to\ninformation) that includes any kind of interpretation about the meaning or\neffect of the License, even if written by the license addition's author.\n\nExamples of information for an additionComment may include the following:\n\n* If the LicenseAddition's identifier is deprecated, it may briefly explain the\n  reason for deprecation.\n* It may include the date of release, if identified, for LicenseAdditions with\n  multiple versions.\n* It may include links to other official language translations for the\n  LicenseAddition.\n* It may include a reference to the License(s) with which this LicenseAddition\n  is typically used.",
   :rdfs/range :xsd/string,
   :vs/term_status "Stable"})

(def additionId
  "An additionId contains a human-readable, short-form identifier for a\nLicenseAddition. It may only include letters, numbers, period (\".\") and\nhyphen (\"-\") characters.\n\nFor a ListedLicenseException, the licenseId will be as specified on the\n[SPDX Exceptions List](https://spdx.org/licenses/exceptions-index.html) for the\nparticular exception.\n\nFor a CustomLicenseAddition, the short-form identifier must begin with the\nprefix `AdditionRef-` and must be unique within the applicable SPDX namespace.\nThe short-form identifier may be preceded by an SPDX namespace or a\nfully-qualified URI prefix."
  {:db/ident :spdx-expandedlicensing/additionId,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "An additionId contains a human-readable, short-form identifier for a\nLicenseAddition. It may only include letters, numbers, period (\".\") and\nhyphen (\"-\") characters.\n\nFor a ListedLicenseException, the licenseId will be as specified on the\n[SPDX Exceptions List](https://spdx.org/licenses/exceptions-index.html) for the\nparticular exception.\n\nFor a CustomLicenseAddition, the short-form identifier must begin with the\nprefix `AdditionRef-` and must be unique within the applicable SPDX namespace.\nThe short-form identifier may be preceded by an SPDX namespace or a\nfully-qualified URI prefix.",
   :rdfs/range :xsd/string,
   :vs/term_status "Stable"})

(def additionName
  "An additionName contains the full name of a LicenseAddition, preferably using\nthe title found in the applicable license addition text or file, or as\notherwise specified by the LicenseAddition's author or steward.\n\nWhen no such title is specified, using a name from another well-known source or list\nof licenses additions (such as OSI or Fedora) is suggested.\n\nIf no official or common name is known, any name may be used to aid in\ndistinguishing the LicenseAddition from other LicenseAdditions."
  {:db/ident :spdx-expandedlicensing/additionName,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "An additionName contains the full name of a LicenseAddition, preferably using\nthe title found in the applicable license addition text or file, or as\notherwise specified by the LicenseAddition's author or steward.\n\nWhen no such title is specified, using a name from another well-known source or list\nof licenses additions (such as OSI or Fedora) is suggested.\n\nIf no official or common name is known, any name may be used to aid in\ndistinguishing the LicenseAddition from other LicenseAdditions.",
   :rdfs/range :xsd/string,
   :vs/term_status "Stable"})

(def additionText
  "An additionText contains the plain text of the LicenseAddition, without\ntemplating or other similar markup.\n\nUsers of the additionText for a License can apply the SPDX Matching Guidelines\nwhen comparing it to another text for matching purposes."
  {:db/ident :spdx-expandedlicensing/additionText,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "An additionText contains the plain text of the LicenseAddition, without\ntemplating or other similar markup.\n\nUsers of the additionText for a License can apply the SPDX Matching Guidelines\nwhen comparing it to another text for matching purposes.",
   :rdfs/domain :spdx-expandedlicensing/LicenseAddition,
   :rdfs/range :xsd/string,
   :vs/term_status "Stable"})

(def deprecatedVersion
  "A deprecatedVersion for a ListedLicense or ListedLicenseException on the SPDX\nLicense List specifies which version release of the License List was the first\none in which it was marked as deprecated."
  {:db/ident :spdx-expandedlicensing/deprecatedVersion,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "A deprecatedVersion for a ListedLicense or ListedLicenseException on the SPDX\nLicense List specifies which version release of the License List was the first\none in which it was marked as deprecated.",
   :rdfs/range :xsd/string,
   :sh/or [{:rdfs/domain [:spdx-expandedlicensing/ListedLicenseException
                          :spdx-expandedlicensing/ListedLicense]}],
   :vs/term_status "Stable"})

(def isDeprecatedAdditionId
  "The isDeprecatedAdditionId property specifies whether an identifier for a\nLicenseAddition has been marked as deprecated. If the property is not defined,\nthen it is presumed to be false (i.e., not deprecated).\n\nIf the LicenseAddition is included on the SPDX Exceptions List, then\nthe `deprecatedVersion` property indicates on which version release of the\nExceptions List it was first marked as deprecated.\n\n\"Deprecated\" in this context refers to deprecating the use of the\n_identifier_, not the underlying license addition. In other words, even if a\nLicenseAddition's author or steward has stated that a particular\nLicenseAddition generally should not be used, that would _not_ mean that the\nLicenseAddition's identifier is \"deprecated.\" Rather, a LicenseAddition\noperator is typically marked as \"deprecated\" when it is determined that use of\nanother identifier is preferable."
  {:db/ident :spdx-expandedlicensing/isDeprecatedAdditionId,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "The isDeprecatedAdditionId property specifies whether an identifier for a\nLicenseAddition has been marked as deprecated. If the property is not defined,\nthen it is presumed to be false (i.e., not deprecated).\n\nIf the LicenseAddition is included on the SPDX Exceptions List, then\nthe `deprecatedVersion` property indicates on which version release of the\nExceptions List it was first marked as deprecated.\n\n\"Deprecated\" in this context refers to deprecating the use of the\n_identifier_, not the underlying license addition. In other words, even if a\nLicenseAddition's author or steward has stated that a particular\nLicenseAddition generally should not be used, that would _not_ mean that the\nLicenseAddition's identifier is \"deprecated.\" Rather, a LicenseAddition\noperator is typically marked as \"deprecated\" when it is determined that use of\nanother identifier is preferable.",
   :rdfs/domain :spdx-expandedlicensing/LicenseAddition,
   :rdfs/range :xsd/boolean,
   :vs/term_status "Stable"})

(def isDeprecatedLicenseId
  "The isDeprecatedLicenseId property specifies whether an identifier for a\nLicense or LicenseAddition has been marked as deprecated. If the property\nis not defined, then it is presumed to be false (i.e., not deprecated).\n\nIf the License or LicenseAddition is included on the SPDX License List, then\nthe `deprecatedVersion` property indicates on which version release of the\nLicense List it was first marked as deprecated.\n\n\"Deprecated\" in this context refers to deprecating the use of the\n_identifier_, not the underlying license. In other words, even if a License's\nauthor or steward has stated that a particular License generally should not be\nused, that would _not_ mean that the License's identifier is \"deprecated.\"\nRather, a License or LicenseAddition operator is typically marked as\n\"deprecated\" when it is determined that use of another identifier is\npreferable."
  {:db/ident :spdx-expandedlicensing/isDeprecatedLicenseId,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "The isDeprecatedLicenseId property specifies whether an identifier for a\nLicense or LicenseAddition has been marked as deprecated. If the property\nis not defined, then it is presumed to be false (i.e., not deprecated).\n\nIf the License or LicenseAddition is included on the SPDX License List, then\nthe `deprecatedVersion` property indicates on which version release of the\nLicense List it was first marked as deprecated.\n\n\"Deprecated\" in this context refers to deprecating the use of the\n_identifier_, not the underlying license. In other words, even if a License's\nauthor or steward has stated that a particular License generally should not be\nused, that would _not_ mean that the License's identifier is \"deprecated.\"\nRather, a License or LicenseAddition operator is typically marked as\n\"deprecated\" when it is determined that use of another identifier is\npreferable.",
   :rdfs/domain :spdx-expandedlicensing/License,
   :rdfs/range :xsd/boolean,
   :vs/term_status "Stable"})

(def isFsfLibre
  "isFsfLibre specifies whether the [Free Software Foundation FSF](https://fsf.org)\nhas listed this License as \"free\" in their commentary on licenses, located at\nthe time of this writing at https://www.gnu.org/licenses/license-list.en.html.\n\nA value of \"true\" indicates that the FSF has listed this License as _free_.\n\nA value of \"false\" indicates that the FSF has listed this License as _not free_.\n\nIf the isFsfLibre field is not specified, the SPDX data creator makes no\nassertions about whether the License is listed in the FSF's commentary."
  {:db/ident :spdx-expandedlicensing/isFsfLibre,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "isFsfLibre specifies whether the [Free Software Foundation FSF](https://fsf.org)\nhas listed this License as \"free\" in their commentary on licenses, located at\nthe time of this writing at https://www.gnu.org/licenses/license-list.en.html.\n\nA value of \"true\" indicates that the FSF has listed this License as _free_.\n\nA value of \"false\" indicates that the FSF has listed this License as _not free_.\n\nIf the isFsfLibre field is not specified, the SPDX data creator makes no\nassertions about whether the License is listed in the FSF's commentary.",
   :rdfs/domain :spdx-expandedlicensing/License,
   :rdfs/range :xsd/boolean,
   :vs/term_status "Stable"})

(def isOsiApproved
  "isOsiApproved specifies whether the [Open Source Initiative (OSI)](https://opensource.org)\nhas listed this License as \"approved\" in their list of OSI Approved Licenses,\nlocated at the time of this writing at https://opensource.org/licenses/.\n\nA value of \"true\" indicates that the OSI has listed this License as approved.\n\nA value of \"false\" indicates that the OSI has not listed this License as\napproved.\n\nIf the isOsiApproved field is not specified, the SPDX data creator makes no\nassertions about whether the License is approved by the OSI."
  {:db/ident :spdx-expandedlicensing/isOsiApproved,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "isOsiApproved specifies whether the [Open Source Initiative (OSI)](https://opensource.org)\nhas listed this License as \"approved\" in their list of OSI Approved Licenses,\nlocated at the time of this writing at https://opensource.org/licenses/.\n\nA value of \"true\" indicates that the OSI has listed this License as approved.\n\nA value of \"false\" indicates that the OSI has not listed this License as\napproved.\n\nIf the isOsiApproved field is not specified, the SPDX data creator makes no\nassertions about whether the License is approved by the OSI.",
   :rdfs/domain :spdx-expandedlicensing/License,
   :rdfs/range :xsd/boolean,
   :vs/term_status "Stable"})

(def licenseComment
  "A licenseComment describes general factual information about the License. It\nshould not contain information (or links to information) that includes any kind\nof interpretation about the meaning or effect of the License, even if written\nby the license's author.\n\nExamples of information for a licenseComment may include the following:\n\n* If the License's identifier is deprecated, it may briefly explain the reason\n  for deprecation.\n* It may include the date of release, if identified, for Licenses with multiple\n  versions.\n* It may include links to other official language translations for the License.\n* For LicenseAdditions, it may include a reference to the License(s) with\n  which this additional text is typically used."
  {:db/ident :spdx-expandedlicensing/licenseComment,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "A licenseComment describes general factual information about the License. It\nshould not contain information (or links to information) that includes any kind\nof interpretation about the meaning or effect of the License, even if written\nby the license's author.\n\nExamples of information for a licenseComment may include the following:\n\n* If the License's identifier is deprecated, it may briefly explain the reason\n  for deprecation.\n* It may include the date of release, if identified, for Licenses with multiple\n  versions.\n* It may include links to other official language translations for the License.\n* For LicenseAdditions, it may include a reference to the License(s) with\n  which this additional text is typically used.",
   :rdfs/range :xsd/string,
   :vs/term_status "Stable"})

(def licenseId
  "A licenseId contains a human-readable, short-form license identifier for a\nLicense. It may only include letters, numbers, period (\".\") and hyphen (\"-\")\ncharacters.\n\nFor a ListedLicense, the licenseId will be as specified on the\n[SPDX License List](https://spdx.org/licenses) for the particular license.\n\nFor a CustomLicense, the short-form license identifier must begin with the\nprefix `LicenseRef-` and must be unique within the applicable SPDX namespace.\nThe short-form license ID may be preceded by an SPDX namespace or a\nfully-qualified URI prefix."
  {:db/ident :spdx-expandedlicensing/licenseId,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "A licenseId contains a human-readable, short-form license identifier for a\nLicense. It may only include letters, numbers, period (\".\") and hyphen (\"-\")\ncharacters.\n\nFor a ListedLicense, the licenseId will be as specified on the\n[SPDX License List](https://spdx.org/licenses) for the particular license.\n\nFor a CustomLicense, the short-form license identifier must begin with the\nprefix `LicenseRef-` and must be unique within the applicable SPDX namespace.\nThe short-form license ID may be preceded by an SPDX namespace or a\nfully-qualified URI prefix.",
   :rdfs/range :xsd/string,
   :vs/term_status "Stable"})

(def licenseName
  "A licenseName contains the full name of a License, preferably using the title found\nin the applicable license text or file, or as otherwise specified by the\nLicense's author or steward.\n\nWhen no such title is specified, using a name from another well-known source or list\nof licenses (such as OSI or Fedora) is suggested.\n\nIf no official or common name is known, any name may be used to aid in\ndistinguishing the License from other Licenses."
  {:db/ident :spdx-expandedlicensing/licenseName,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "A licenseName contains the full name of a License, preferably using the title found\nin the applicable license text or file, or as otherwise specified by the\nLicense's author or steward.\n\nWhen no such title is specified, using a name from another well-known source or list\nof licenses (such as OSI or Fedora) is suggested.\n\nIf no official or common name is known, any name may be used to aid in\ndistinguishing the License from other Licenses.",
   :rdfs/range :xsd/string,
   :vs/term_status "Stable"})

(def listVersionAdded
  "A listVersionAdded for a ListedLicense or ListedLicenseException on the SPDX\nLicense List specifies which version release of the License List was the first\none in which it was included."
  {:db/ident :spdx-expandedlicensing/listVersionAdded,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "A listVersionAdded for a ListedLicense or ListedLicenseException on the SPDX\nLicense List specifies which version release of the License List was the first\none in which it was included.",
   :rdfs/range :xsd/string,
   :sh/or [{:rdfs/domain [:spdx-expandedlicensing/ListedLicenseException
                          :spdx-expandedlicensing/ListedLicense]}],
   :vs/term_status "Stable"})

(def member
  "A member is a license expression participating in a conjunctive (of type\nConjunctiveLicenseSet) or a disjunctive (of type DisjunctiveLicenseSet)\nlicense set."
  {:db/ident :spdx-expandedlicensing/member,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A member is a license expression participating in a conjunctive (of type\nConjunctiveLicenseSet) or a disjunctive (of type DisjunctiveLicenseSet)\nlicense set.",
   :rdfs/range :spdx-simplelicensing/AnyLicenseInfo,
   :sh/or [{:rdfs/domain [:spdx-expandedlicensing/DisjunctiveLicenseSet
                          :spdx-expandedlicensing/ConjunctiveLicenseSet]}],
   :vs/term_status "Stable"})

(def obsoletedBy
  "An obsoletedBy value for a deprecated License or LicenseAddition specifies\nthe licenseId of the replacement License or LicenseAddition that is preferred\nto be used in its place. It should use the same format as specified for a\nlicenseId.\n\nThe License's or LicenseAddition's comment value may include more information\nabout the reason why the licenseId specified in the obsoletedBy value is\npreferred."
  {:db/ident :spdx-expandedlicensing/obsoletedBy,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "An obsoletedBy value for a deprecated License or LicenseAddition specifies\nthe licenseId of the replacement License or LicenseAddition that is preferred\nto be used in its place. It should use the same format as specified for a\nlicenseId.\n\nThe License's or LicenseAddition's comment value may include more information\nabout the reason why the licenseId specified in the obsoletedBy value is\npreferred.",
   :rdfs/range :xsd/string,
   :sh/or [{:rdfs/domain [:spdx-expandedlicensing/LicenseAddition
                          :spdx-expandedlicensing/License]}],
   :vs/term_status "Stable"})

(def seeAlso
  "A seeAlso defines a cross-reference with a URL where the License or\nLicenseAddition can be found in use by one or a few projects.\n\nIf applicable, it should include a URL where the license text is posted by\nthe license steward, particularly if the license steward has made available a\n\"canonical\" primary URL for the license text.\n\nIf the license is OSI approved, a seeAlso should be included with the URL for\nthe license's listing on the OSI website.\n\nThe seeAlso URL may refer to a previously-available URL for the License or\nLicenseAddition which is no longer active.\n\nWhere applicable, the seeAlso URL should include the license text in its\nnative language. seeAlso URLs to English or other translations may be included\nwhere multiple, equivalent official translations exist."
  {:db/ident :spdx-expandedlicensing/seeAlso,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "A seeAlso defines a cross-reference with a URL where the License or\nLicenseAddition can be found in use by one or a few projects.\n\nIf applicable, it should include a URL where the license text is posted by\nthe license steward, particularly if the license steward has made available a\n\"canonical\" primary URL for the license text.\n\nIf the license is OSI approved, a seeAlso should be included with the URL for\nthe license's listing on the OSI website.\n\nThe seeAlso URL may refer to a previously-available URL for the License or\nLicenseAddition which is no longer active.\n\nWhere applicable, the seeAlso URL should include the license text in its\nnative language. seeAlso URLs to English or other translations may be included\nwhere multiple, equivalent official translations exist.",
   :rdfs/range :xsd/anyURI,
   :vs/term_status "Stable"})

(def standardAdditionTemplate
  "A standardAdditionTemplate contains a license addition template which describes\nsections of the LicenseAddition text which can be varied. See the Legacy Text\nTemplate format section of the SPDX specification for format information."
  {:db/ident :spdx-expandedlicensing/standardAdditionTemplate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "A standardAdditionTemplate contains a license addition template which describes\nsections of the LicenseAddition text which can be varied. See the Legacy Text\nTemplate format section of the SPDX specification for format information.",
   :rdfs/domain :spdx-expandedlicensing/LicenseAddition,
   :rdfs/range :xsd/string,
   :vs/term_status "Stable"})

(def standardLicenseHeader
  "A standardLicenseHeader contains the plain text of the License author's\npreferred wording to be used, typically in a source code file's header\ncomments or similar location, to indicate that the file is subject to\nthe specified License."
  {:db/ident :spdx-expandedlicensing/standardLicenseHeader,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "A standardLicenseHeader contains the plain text of the License author's\npreferred wording to be used, typically in a source code file's header\ncomments or similar location, to indicate that the file is subject to\nthe specified License.",
   :rdfs/domain :spdx-expandedlicensing/License,
   :rdfs/range :xsd/string,
   :vs/term_status "Stable"})

(def standardLicenseTemplate
  "A standardLicenseTemplate contains a license template which describes\nsections of the License text which can be varied. See the Legacy Text Template\nformat section of the SPDX specification for format information."
  {:db/ident :spdx-expandedlicensing/standardLicenseTemplate,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "A standardLicenseTemplate contains a license template which describes\nsections of the License text which can be varied. See the Legacy Text Template\nformat section of the SPDX specification for format information.",
   :rdfs/domain :spdx-expandedlicensing/License,
   :rdfs/range :xsd/string,
   :vs/term_status "Stable"})

(def subjectAddition
  "A subjectAddition is a LicenseAddition which is subject to a 'with additional\ntext' effect (WithAdditionOperator)."
  {:db/ident :spdx-expandedlicensing/subjectAddition,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A subjectAddition is a LicenseAddition which is subject to a 'with additional\ntext' effect (WithAdditionOperator).",
   :rdfs/domain :spdx-expandedlicensing/WithAdditionOperator,
   :rdfs/range :spdx-expandedlicensing/LicenseAddition,
   :vs/term_status "Stable"})

(def subjectLicense
  "A subjectLicense is a License which is subject to either an 'or later' effect\n(OrLaterOperator) or a 'with additional text' effect (WithAdditionOperator)."
  {:db/ident :spdx-expandedlicensing/subjectLicense,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "A subjectLicense is a License which is subject to either an 'or later' effect\n(OrLaterOperator) or a 'with additional text' effect (WithAdditionOperator).",
   :rdfs/range :spdx-expandedlicensing/License,
   :sh/or [{:rdfs/domain [:spdx-expandedlicensing/WithAdditionOperator
                          :spdx-expandedlicensing/OrLaterOperator]}],
   :vs/term_status "Stable"})