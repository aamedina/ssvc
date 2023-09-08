(ns net.wikipunk.rdf.spdx-simplelicensing
  ^{:base       "https://spdx.org/rdf/v3/SimpleLicensing/",
    :namespaces {"owl"       "http://www.w3.org/2002/07/owl#",
                 "rdf"       "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                 "rdfs"      "http://www.w3.org/2000/01/rdf-schema#",
                 "sh"        "http://www.w3.org/ns/shacl#",
                 "spdx-core" "https://spdx.org/rdf/v3/Core/",
                 "spdx-simplelicensing"
                 "https://spdx.org/rdf/v3/SimpleLicensing/",
                 "vs"        "http://www.w3.org/2003/06/sw-vocab-status/ns#",
                 "xsd"       "http://www.w3.org/2001/XMLSchema#"},
    :prefix     "spdx-simplelicensing",
    :source     "resources/spdx/SimpleLicensing/SimpleLicensing.ttl"}
  {:owl/imports {:xsd/anyURI "https://spdx.org/rdf/v3/Core"},
   :rdf/type :owl/Ontology,
   :rdfs/comment
   "The Licensing namespace defines metadata fields applicable to software licensing. It also defines the classes and properties that comprise the SPDX License Expression syntax and that relate to the SPDX License List.",
   :sh/declare {:sh/namespace "https://spdx.org/rdf/v3/SimpleLicensing/",
                :sh/prefix    "spdx-simplelicensing"},
   :xsd/anyURI "https://spdx.org/rdf/v3/SimpleLicensing/"})

(def AnyLicenseInfo
  {:db/ident :spdx-simplelicensing/AnyLicenseInfo,
   :rdf/type #{:sh/NodeShape :owl/Class},
   :rdfs/comment
   "An AnyLicenseInfo is used by licensing properties of software artifacts.\nIt can be a NoneLicense, a NoAssertionLicense,\nsingle license (either on the SPDX License List or a custom-defined license);\na single license with an \"or later\" operator applied; the foregoing with\nadditional text applied; or a set of licenses combined by applying \"AND\" and\n\"OR\" operators recursively.",
   :rdfs/subClassOf :spdx-core/Element,
   :vs/term_status "Stable"})

(def LicenseExpression
  {:db/ident :spdx-simplelicensing/LicenseExpression,
   :rdf/type #{:sh/NodeShape :owl/Class},
   :rdfs/comment
   "Often a single license can be used to represent the licensing terms of a source code or binary file, but there are situations where a single license identifier is not sufficient. A common example is when software is offered under a choice of one or more licenses (e.g., GPL-2.0-only OR BSD-3-Clause). Another example is when a set of licenses is needed to represent a binary program constructed by compiling and linking two (or more) different source files each governed by different licenses (e.g., LGPL-2.1-only AND BSD-3-Clause).\n\nSPDX License Expressions provide a way for one to construct expressions that more accurately represent the licensing terms typically found in open source software source code. A license expression could be a single license identifier found on the SPDX License List; a user defined license reference denoted by the LicenseRef-idString; a license identifier combined with an SPDX exception; or some combination of license identifiers, license references and exceptions constructed using a small set of defined operators (e.g., AND, OR, WITH and +). We provide the definition of what constitutes a valid an SPDX License Expression in this section.",
   :rdfs/subClassOf :spdx-simplelicensing/AnyLicenseInfo,
   :sh/property {:sh/datatype :xsd/string,
                 :sh/maxCount 1,
                 :sh/minCount 1,
                 :sh/name     "licenseExpression",
                 :sh/path     :spdx-simplelicensing/licenseExpression},
   :vs/term_status "Stable"})

(def SimpleLicensingText
  {:db/ident :spdx-simplelicensing/SimpleLicensingText,
   :rdf/type #{:sh/NodeShape :owl/Class},
   :rdfs/comment
   "A SimpleLicensingText represents a License or Addition that is not listed on the SPDX License\nList at https://spdx.org/licenses, and is therefore defined by an SPDX data\ncreator.",
   :rdfs/subClassOf :spdx-core/Element,
   :sh/property {:sh/datatype :xsd/string,
                 :sh/maxCount 1,
                 :sh/minCount 1,
                 :sh/name     "licenseText",
                 :sh/path     :spdx-simplelicensing/licenseText},
   :vs/term_status "Stable"})

(def licenseExpression
  {:db/ident :spdx-simplelicensing/licenseExpression,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "Often a single license can be used to represent the licensing terms of a source code or binary file, but there are situations where a single license identifier is not sufficient. A common example is when software is offered under a choice of one or more licenses (e.g., GPL-2.0-only OR BSD-3-Clause). Another example is when a set of licenses is needed to represent a binary program constructed by compiling and linking two (or more) different source files each governed by different licenses (e.g., LGPL-2.1-only AND BSD-3-Clause).\n\nSPDX License Expressions provide a way for one to construct expressions that more accurately represent the licensing terms typically found in open source software source code. A license expression could be a single license identifier found on the SPDX License List; a user defined license reference denoted by the LicenseRef-idString; a license identifier combined with an SPDX exception; or some combination of license identifiers, license references and exceptions constructed using a small set of defined operators (e.g., AND, OR, WITH and +). We provide the definition of what constitutes a valid an SPDX License Expression in this section.",
   :rdfs/domain :spdx-simplelicensing/LicenseExpression,
   :rdfs/range :xsd/string,
   :vs/term_status "Stable"})

(def licenseText
  {:db/ident :spdx-simplelicensing/licenseText,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "A licenseText contains the plain text of the License or Addition,\nwithout templating or other similar markup.\n\nUsers of the licenseText for a License can apply the SPDX Matching Guidelines\nwhen comparing it to another text for matching purposes.",
   :rdfs/domain :spdx-simplelicensing/SimpleLicensingText,
   :rdfs/range :xsd/string,
   :vs/term_status "Stable"})

(def urn:uuid:9cc54a61-7118-5ce8-9ebe-9a4ec015174e
  {:owl/imports {:xsd/anyURI "https://spdx.org/rdf/v3/Core"},
   :rdf/type :owl/Ontology,
   :rdfs/comment
   "The Licensing namespace defines metadata fields applicable to software licensing. It also defines the classes and properties that comprise the SPDX License Expression syntax and that relate to the SPDX License List.",
   :sh/declare {:sh/namespace "https://spdx.org/rdf/v3/SimpleLicensing/",
                :sh/prefix    "spdx-simplelicensing"},
   :xsd/anyURI "https://spdx.org/rdf/v3/SimpleLicensing/"})