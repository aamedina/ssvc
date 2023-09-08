(ns net.wikipunk.rdf.spdx-software
  ^{:base       "https://spdx.org/rdf/v3/Software/",
    :namespaces {"owl" "http://www.w3.org/2002/07/owl#",
                 "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                 "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                 "sh" "http://www.w3.org/ns/shacl#",
                 "spdx-core" "https://spdx.org/rdf/v3/Core/",
                 "spdx-software" "https://spdx.org/rdf/v3/Software/",
                 "vs" "http://www.w3.org/2003/06/sw-vocab-status/ns#",
                 "xsd" "http://www.w3.org/2001/XMLSchema#"},
    :prefix     "spdx-software",
    :source     "resources/spdx/Software/Software.ttl"}
  {:owl/imports {:xsd/anyURI "https://spdx.org/rdf/v3/Core/"},
   :rdf/type :owl/Ontology,
   :rdfs/comment
   "This ontology provides a vocabulary for describing software-related SPDX elements.",
   :sh/declare {:sh/namespace "https://spdx.org/rdf/v3/Software/",
                :sh/prefix    "spdx-software"},
   :xsd/anyURI "https://spdx.org/rdf/v3/Software/"})

(def DependencyConditionalityType
  {:db/ident       :spdx-software/DependencyConditionalityType,
   :rdf/type       :owl/Class,
   :rdfs/comment   "TODO",
   :sh/in          [:spdx-software/DependencyConditionalityType-Optional
                    :spdx-software/DependencyConditionalityType-Other
                    :spdx-software/DependencyConditionalityType-Prerequisite
                    :spdx-software/DependencyConditionalityType-Provided
                    :spdx-software/DependencyConditionalityType-Required],
   :vs/term_status "Stable"})

(def DependencyConditionalityType-Optional
  {:db/ident   :spdx-software/DependencyConditionalityType-Optional,
   :rdf/type   #{:spdx-software/DependencyConditionalityType
                 :owl/NamedIndividual},
   :rdfs/label "optional"})

(def DependencyConditionalityType-Other
  {:db/ident   :spdx-software/DependencyConditionalityType-Other,
   :rdf/type   #{:spdx-software/DependencyConditionalityType
                 :owl/NamedIndividual},
   :rdfs/label "other"})

(def DependencyConditionalityType-Prerequisite
  {:db/ident   :spdx-software/DependencyConditionalityType-Prerequisite,
   :rdf/type   #{:spdx-software/DependencyConditionalityType
                 :owl/NamedIndividual},
   :rdfs/label "prerequisite"})

(def DependencyConditionalityType-Provided
  {:db/ident   :spdx-software/DependencyConditionalityType-Provided,
   :rdf/type   #{:spdx-software/DependencyConditionalityType
                 :owl/NamedIndividual},
   :rdfs/label "provided"})

(def DependencyConditionalityType-Required
  {:db/ident   :spdx-software/DependencyConditionalityType-Required,
   :rdf/type   #{:spdx-software/DependencyConditionalityType
                 :owl/NamedIndividual},
   :rdfs/label "required"})

(def File
  {:db/ident :spdx-software/File,
   :rdf/type #{:sh/NodeShape :owl/Class},
   :rdfs/comment
   "Refers to any object that stores content on a computer.\nThe type of content can optionally be provided in the contentType property.\nExternal property restriction on /Core/Element/name: minCount: 1",
   :rdfs/subClassOf :spdx-software/SoftwareArtifact,
   :sh/property {:sh/datatype :spdx-core/MediaType,
                 :sh/maxCount 1,
                 :sh/name     "contentType",
                 :sh/path     :spdx-software/contentType},
   :vs/term_status "Stable"})

(def PackageClass
  {:db/ident :spdx-software/Package,
   :rdf/type #{:sh/NodeShape :owl/Class},
   :rdfs/comment
   "A package refers to any unit of content that can be associated with a distribution of software.\nTypically, a package is composed of one or more files.  \nAny of the following non-limiting examples may be (but are not required to be) represented in SPDX as a package:\n\n - a tarball, zip file or other archive\n - a directory or sub-directory\n - a separately distributed piece of software which another Package or File uses or depends upon (e.g., a Python package, a Go module, ...)\n - a container image, and/or each image layer within a container image\n - a collection of one or more sub-packages\n - a Git repository snapshot from a particular point in time\n\nNote that some of these could be represented in SPDX as a file as well.\nExternal property restriction on /Core/Element/name: minCount: 1",
   :rdfs/subClassOf :spdx-software/SoftwareArtifact,
   :sh/property #{{:sh/datatype :xsd/anyURI,
                   :sh/maxCount 1,
                   :sh/name     "homePage",
                   :sh/path     :spdx-software/homePage}
                  {:sh/datatype :xsd/string,
                   :sh/maxCount 1,
                   :sh/name     "sourceInfo",
                   :sh/path     :spdx-software/sourceInfo}
                  {:sh/datatype :xsd/anyURI,
                   :sh/maxCount 1,
                   :sh/name     "packageUrl",
                   :sh/path     :spdx-software/packageUrl}
                  {:sh/datatype :xsd/anyURI,
                   :sh/maxCount 1,
                   :sh/name     "downloadLocation",
                   :sh/path     :spdx-software/downloadLocation}
                  {:sh/datatype :xsd/string,
                   :sh/maxCount 1,
                   :sh/name     "packageVersion",
                   :sh/path     :spdx-software/packageVersion}},
   :vs/term_status "Stable"})

(def Sbom
  {:db/ident :spdx-software/Sbom,
   :rdf/type #{:sh/NodeShape :owl/Class},
   :rdfs/comment
   "A Software Bill of Materials (SBOM) is a collection of SPDX Elements describing a single package.\nThis could include details of the content and composition of the product,\nprovenance details of the product and/or\nits composition, licensing information, known quality or security issues, etc.",
   :rdfs/subClassOf :spdx-core/Bom,
   :sh/property {:sh/class :spdx-software/SbomType,
                 :sh/name  "sbomType",
                 :sh/path  :spdx-software/sbomType},
   :vs/term_status "Stable"})

(def SbomType
  {:db/ident :spdx-software/SbomType,
   :rdf/type :owl/Class,
   :rdfs/comment
   "The set of SBOM types with definitions as defined in [Types of Software Bill of Material (SBOM) Documents](https://www.cisa.gov/sites/default/files/2023-04/sbom-types-document-508c.pdf), published on April 21, 2023. \nAn SBOM type describes the most likely type of an SBOM from the producer perspective, so that consumers can draw conclusions about the data inside an SBOM.  A single SBOM can have multiple SBOM document types associated with it.",
   :sh/in [:spdx-software/SbomType-Analyzed
           :spdx-software/SbomType-Build
           :spdx-software/SbomType-Deployed
           :spdx-software/SbomType-Design
           :spdx-software/SbomType-Runtime
           :spdx-software/SbomType-Source],
   :vs/term_status "Stable"})

(def SbomType-Analyzed
  {:db/ident   :spdx-software/SbomType-Analyzed,
   :rdf/type   #{:spdx-software/SbomType :owl/NamedIndividual},
   :rdfs/label "analyzed"})

(def SbomType-Build
  {:db/ident   :spdx-software/SbomType-Build,
   :rdf/type   #{:spdx-software/SbomType :owl/NamedIndividual},
   :rdfs/label "build"})

(def SbomType-Deployed
  {:db/ident   :spdx-software/SbomType-Deployed,
   :rdf/type   #{:spdx-software/SbomType :owl/NamedIndividual},
   :rdfs/label "deployed"})

(def SbomType-Design
  {:db/ident   :spdx-software/SbomType-Design,
   :rdf/type   #{:spdx-software/SbomType :owl/NamedIndividual},
   :rdfs/label "design"})

(def SbomType-Runtime
  {:db/ident   :spdx-software/SbomType-Runtime,
   :rdf/type   #{:spdx-software/SbomType :owl/NamedIndividual},
   :rdfs/label "runtime"})

(def SbomType-Source
  {:db/ident   :spdx-software/SbomType-Source,
   :rdf/type   #{:spdx-software/SbomType :owl/NamedIndividual},
   :rdfs/label "source"})

(def Snippet
  {:db/ident :spdx-software/Snippet,
   :rdf/type #{:sh/NodeShape :owl/Class},
   :rdfs/comment
   "A Snippet describes a certain part of a file and can be used when the file is known to have some content\nthat has been included from another original source. Snippets are useful for denoting when part of a file\nmay have been originally created under another license or copied from a place with a known vulnerability.",
   :rdfs/subClassOf :spdx-software/SoftwareArtifact,
   :sh/property #{{:sh/class    :spdx-core/PositiveIntegerRange,
                   :sh/maxCount 1,
                   :sh/name     "byteRange",
                   :sh/path     :spdx-software/byteRange}
                  {:sh/class    :spdx-software/File,
                   :sh/maxCount 1,
                   :sh/minCount 1,
                   :sh/name     "snippetFromFile",
                   :sh/path     :spdx-software/snippetFromFile}
                  {:sh/class    :spdx-core/PositiveIntegerRange,
                   :sh/maxCount 1,
                   :sh/name     "lineRange",
                   :sh/path     :spdx-software/lineRange}},
   :vs/term_status "Stable"})

(def SoftwareArtifact
  {:db/ident :spdx-software/SoftwareArtifact,
   :rdf/type #{:sh/NodeShape :owl/Class},
   :rdfs/comment
   "A software artifact is a distinct article or unit related to software\nsuch as a package, a file, or a snippet.",
   :rdfs/subClassOf :spdx-core/Artifact,
   :sh/property #{{:sh/class :spdx-software/SoftwarePurpose,
                   :sh/name  "additionalPurpose",
                   :sh/path  :spdx-software/additionalPurpose}
                  {:sh/class    :spdx-software/SoftwarePurpose,
                   :sh/maxCount 1,
                   :sh/name     "primaryPurpose",
                   :sh/path     :spdx-software/primaryPurpose}
                  {:sh/datatype :xsd/string,
                   :sh/maxCount 1,
                   :sh/name     "copyrightText",
                   :sh/path     :spdx-software/copyrightText}
                  {:sh/datatype :xsd/anyURI,
                   :sh/maxCount 1,
                   :sh/name     "contentIdentifier",
                   :sh/path     :spdx-software/contentIdentifier}
                  {:sh/datatype :xsd/string,
                   :sh/maxCount 1,
                   :sh/name     "attributionText",
                   :sh/path     :spdx-software/attributionText}},
   :vs/term_status "Stable"})

(def SoftwareDependencyLinkType
  {:db/ident       :spdx-software/SoftwareDependencyLinkType,
   :rdf/type       :owl/Class,
   :rdfs/comment   "TODO",
   :sh/in          [:spdx-software/SoftwareDependencyLinkType-Dynamic
                    :spdx-software/SoftwareDependencyLinkType-Other
                    :spdx-software/SoftwareDependencyLinkType-Static
                    :spdx-software/SoftwareDependencyLinkType-Tool],
   :vs/term_status "Stable"})

(def SoftwareDependencyLinkType-Dynamic
  {:db/ident   :spdx-software/SoftwareDependencyLinkType-Dynamic,
   :rdf/type   #{:spdx-software/SoftwareDependencyLinkType
                 :owl/NamedIndividual},
   :rdfs/label "dynamic"})

(def SoftwareDependencyLinkType-Other
  {:db/ident   :spdx-software/SoftwareDependencyLinkType-Other,
   :rdf/type   #{:spdx-software/SoftwareDependencyLinkType
                 :owl/NamedIndividual},
   :rdfs/label "other"})

(def SoftwareDependencyLinkType-Static
  {:db/ident   :spdx-software/SoftwareDependencyLinkType-Static,
   :rdf/type   #{:spdx-software/SoftwareDependencyLinkType
                 :owl/NamedIndividual},
   :rdfs/label "static"})

(def SoftwareDependencyLinkType-Tool
  {:db/ident   :spdx-software/SoftwareDependencyLinkType-Tool,
   :rdf/type   #{:spdx-software/SoftwareDependencyLinkType
                 :owl/NamedIndividual},
   :rdfs/label "tool"})

(def SoftwareDependencyRelationship
  {:db/ident        :spdx-software/SoftwareDependencyRelationship,
   :rdf/type        #{:sh/NodeShape :owl/Class},
   :rdfs/comment    "TODO",
   :rdfs/subClassOf :spdx-core/LifecycleScopedRelationship,
   :sh/property     #{{:sh/class    :spdx-software/DependencyConditionalityType,
                       :sh/maxCount 1,
                       :sh/name     "conditionality",
                       :sh/path     :spdx-software/conditionality}
                      {:sh/class    :spdx-software/SoftwareDependencyLinkType,
                       :sh/maxCount 1,
                       :sh/name     "softwareLinkage",
                       :sh/path     :spdx-software/softwareLinkage}},
   :vs/term_status  "Stable"})

(def SoftwarePurpose
  {:db/ident :spdx-software/SoftwarePurpose,
   :rdf/type :owl/Class,
   :rdfs/comment
   "This field provides information about the primary purpose of an Element.\nSoftware Purpose is intrinsic to how the Element is being used rather than the content of the Element.\nThis field is a reasonable estimate of the most likely usage of the Element\nfrom the producer and consumer perspective from which both parties can draw conclusions\nabout the context in which the Element exists.",
   :sh/in [:spdx-software/SoftwarePurpose-Application
           :spdx-software/SoftwarePurpose-Archive
           :spdx-software/SoftwarePurpose-Bom
           :spdx-software/SoftwarePurpose-Configuration
           :spdx-software/SoftwarePurpose-Container
           :spdx-software/SoftwarePurpose-Data
           :spdx-software/SoftwarePurpose-Device
           :spdx-software/SoftwarePurpose-Documentation
           :spdx-software/SoftwarePurpose-Evidence
           :spdx-software/SoftwarePurpose-Executable
           :spdx-software/SoftwarePurpose-File
           :spdx-software/SoftwarePurpose-Firmware
           :spdx-software/SoftwarePurpose-Framework
           :spdx-software/SoftwarePurpose-Install
           :spdx-software/SoftwarePurpose-Library
           :spdx-software/SoftwarePurpose-Manifest
           :spdx-software/SoftwarePurpose-Model
           :spdx-software/SoftwarePurpose-Module
           :spdx-software/SoftwarePurpose-OperatingSystem
           :spdx-software/SoftwarePurpose-Other
           :spdx-software/SoftwarePurpose-Patch
           :spdx-software/SoftwarePurpose-Requirement
           :spdx-software/SoftwarePurpose-Source
           :spdx-software/SoftwarePurpose-Specification
           :spdx-software/SoftwarePurpose-Test],
   :vs/term_status "Stable"})

(def SoftwarePurpose-Application
  {:db/ident   :spdx-software/SoftwarePurpose-Application,
   :rdf/type   #{:spdx-software/SoftwarePurpose :owl/NamedIndividual},
   :rdfs/label "application"})

(def SoftwarePurpose-Archive
  {:db/ident   :spdx-software/SoftwarePurpose-Archive,
   :rdf/type   #{:spdx-software/SoftwarePurpose :owl/NamedIndividual},
   :rdfs/label "archive"})

(def SoftwarePurpose-Bom
  {:db/ident   :spdx-software/SoftwarePurpose-Bom,
   :rdf/type   #{:spdx-software/SoftwarePurpose :owl/NamedIndividual},
   :rdfs/label "bom"})

(def SoftwarePurpose-Configuration
  {:db/ident   :spdx-software/SoftwarePurpose-Configuration,
   :rdf/type   #{:spdx-software/SoftwarePurpose :owl/NamedIndividual},
   :rdfs/label "configuration"})

(def SoftwarePurpose-Container
  {:db/ident   :spdx-software/SoftwarePurpose-Container,
   :rdf/type   #{:spdx-software/SoftwarePurpose :owl/NamedIndividual},
   :rdfs/label "container"})

(def SoftwarePurpose-Data
  {:db/ident   :spdx-software/SoftwarePurpose-Data,
   :rdf/type   #{:spdx-software/SoftwarePurpose :owl/NamedIndividual},
   :rdfs/label "data"})

(def SoftwarePurpose-Device
  {:db/ident   :spdx-software/SoftwarePurpose-Device,
   :rdf/type   #{:spdx-software/SoftwarePurpose :owl/NamedIndividual},
   :rdfs/label "device"})

(def SoftwarePurpose-Documentation
  {:db/ident   :spdx-software/SoftwarePurpose-Documentation,
   :rdf/type   #{:spdx-software/SoftwarePurpose :owl/NamedIndividual},
   :rdfs/label "documentation"})

(def SoftwarePurpose-Evidence
  {:db/ident   :spdx-software/SoftwarePurpose-Evidence,
   :rdf/type   #{:spdx-software/SoftwarePurpose :owl/NamedIndividual},
   :rdfs/label "evidence"})

(def SoftwarePurpose-Executable
  {:db/ident   :spdx-software/SoftwarePurpose-Executable,
   :rdf/type   #{:spdx-software/SoftwarePurpose :owl/NamedIndividual},
   :rdfs/label "executable"})

(def SoftwarePurpose-File
  {:db/ident   :spdx-software/SoftwarePurpose-File,
   :rdf/type   #{:spdx-software/SoftwarePurpose :owl/NamedIndividual},
   :rdfs/label "file"})

(def SoftwarePurpose-Firmware
  {:db/ident   :spdx-software/SoftwarePurpose-Firmware,
   :rdf/type   #{:spdx-software/SoftwarePurpose :owl/NamedIndividual},
   :rdfs/label "firmware"})

(def SoftwarePurpose-Framework
  {:db/ident   :spdx-software/SoftwarePurpose-Framework,
   :rdf/type   #{:spdx-software/SoftwarePurpose :owl/NamedIndividual},
   :rdfs/label "framework"})

(def SoftwarePurpose-Install
  {:db/ident   :spdx-software/SoftwarePurpose-Install,
   :rdf/type   #{:spdx-software/SoftwarePurpose :owl/NamedIndividual},
   :rdfs/label "install"})

(def SoftwarePurpose-Library
  {:db/ident   :spdx-software/SoftwarePurpose-Library,
   :rdf/type   #{:spdx-software/SoftwarePurpose :owl/NamedIndividual},
   :rdfs/label "library"})

(def SoftwarePurpose-Manifest
  {:db/ident   :spdx-software/SoftwarePurpose-Manifest,
   :rdf/type   #{:spdx-software/SoftwarePurpose :owl/NamedIndividual},
   :rdfs/label "manifest"})

(def SoftwarePurpose-Model
  {:db/ident   :spdx-software/SoftwarePurpose-Model,
   :rdf/type   #{:spdx-software/SoftwarePurpose :owl/NamedIndividual},
   :rdfs/label "model"})

(def SoftwarePurpose-Module
  {:db/ident   :spdx-software/SoftwarePurpose-Module,
   :rdf/type   #{:spdx-software/SoftwarePurpose :owl/NamedIndividual},
   :rdfs/label "module"})

(def SoftwarePurpose-OperatingSystem
  {:db/ident   :spdx-software/SoftwarePurpose-OperatingSystem,
   :rdf/type   #{:spdx-software/SoftwarePurpose :owl/NamedIndividual},
   :rdfs/label "operatingSystem"})

(def SoftwarePurpose-Other
  {:db/ident   :spdx-software/SoftwarePurpose-Other,
   :rdf/type   #{:spdx-software/SoftwarePurpose :owl/NamedIndividual},
   :rdfs/label "other"})

(def SoftwarePurpose-Patch
  {:db/ident   :spdx-software/SoftwarePurpose-Patch,
   :rdf/type   #{:spdx-software/SoftwarePurpose :owl/NamedIndividual},
   :rdfs/label "patch"})

(def SoftwarePurpose-Requirement
  {:db/ident   :spdx-software/SoftwarePurpose-Requirement,
   :rdf/type   #{:spdx-software/SoftwarePurpose :owl/NamedIndividual},
   :rdfs/label "requirement"})

(def SoftwarePurpose-Source
  {:db/ident   :spdx-software/SoftwarePurpose-Source,
   :rdf/type   #{:spdx-software/SoftwarePurpose :owl/NamedIndividual},
   :rdfs/label "source"})

(def SoftwarePurpose-Specification
  {:db/ident   :spdx-software/SoftwarePurpose-Specification,
   :rdf/type   #{:spdx-software/SoftwarePurpose :owl/NamedIndividual},
   :rdfs/label "specification"})

(def SoftwarePurpose-Test
  {:db/ident   :spdx-software/SoftwarePurpose-Test,
   :rdf/type   #{:spdx-software/SoftwarePurpose :owl/NamedIndividual},
   :rdfs/label "test"})

(def additionalPurpose
  {:db/ident :spdx-software/additionalPurpose,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "Additional purpose provides information about the additional purposes of the software artifact in addition to the primaryPurpose.",
   :rdfs/domain :spdx-software/SoftwareArtifact,
   :rdfs/range :spdx-software/SoftwarePurpose,
   :vs/term_status "Stable"})

(def attributionText
  {:db/ident :spdx-software/attributionText,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "An attributionText for a software Package, File or Snippet provides a consumer\nof SPDX data with acknowledgement content, to assist redistributors of the\nPackage, File or Snippet with reproducing those acknowledgements.\n\nFor example, this field may include a statement that is required by a\nparticular license to be reproduced in end-user documentation, advertising\nmaterials, or another form.\n\nThis field may describe where, or in which contexts, the acknowledgements\nneed to be reproduced, but it is not required to do so. The SPDX data creator\nmay also explain elsewhere (such as in a licenseComment field) how they intend\nfor data in this field to be used.\n\nAn attributionText is is not meant to include the software Package, File or\nSnippet’s actual complete license text (see concludedLicense to identify the\ncorresponding license).",
   :rdfs/domain :spdx-software/SoftwareArtifact,
   :rdfs/range :xsd/string,
   :vs/term_status "Stable"})

(def byteRange
  {:db/ident :spdx-software/byteRange,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "This field defines the byte range in the original host file that the snippet information applies to.\nA range of bytes is independent of various formatting concerns, and the most accurate way \nof referring to the differences. The choice was made to start the numbering of \nthe byte range at 1 to be consistent with the W3C pointer method vocabulary.",
   :rdfs/domain :spdx-software/Snippet,
   :rdfs/range :spdx-core/PositiveIntegerRange,
   :vs/term_status "Stable"})

(def conditionality
  {:db/ident       :spdx-software/conditionality,
   :rdf/type       :owl/ObjectProperty,
   :rdfs/comment   "A conditionality is TODO",
   :rdfs/domain    :spdx-software/SoftwareDependencyRelationship,
   :rdfs/range     :spdx-software/DependencyConditionalityType,
   :vs/term_status "Stable"})

(def contentIdentifier
  {:db/ident :spdx-software/contentIdentifier,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "The contentIdentifier provides a canonical, unique, immutable artifact identifier for each software artifact. SPDX 3.0 describes software artifacts as Snippet, File, or Package Elements. The ContentIdentifier can be calculated for any software artifact and can be recorded for any of these SPDX 3.0 Elements using Omnibor, an attempt to standardize how software artifacts are identified independent of which programming language, version control system, build tool, package manager, or software distribution mechanism is in use.  \n\nThe contentIdentifier is defined as the [Git Object Identifier](https://git-scm.com/book/en/v2/Git-Internals-Git-Objects) (gitoid) of type `blob` of the software artifact. The use of a git-based version control system is not necessary to calculate a contentIdentifier for any software artifact.\n\nThe gitoid is expressed in the ContentIdentifier property by using the IANA [gitoid URI scheme](https://www.iana.org/assignments/uri-schemes/prov/gitoid).\n\n```\nScheme syntax: gitoid\":\"<git object type>\":\"<hash algorithm>\":\"<hash value>\n```\n\nThe OmniBOR ID for the OmniBOR Document associated with a software artifact should not be recorded in this field. Rather, OmniBOR IDs should be recorded in the SPDX Element's ExternalIdentifier property. See [https://omnibor.io](https://omnibor.io) for more details.",
   :rdfs/domain :spdx-software/SoftwareArtifact,
   :rdfs/range :xsd/anyURI,
   :vs/term_status "Stable"})

(def contentType
  {:db/ident :spdx-software/contentType,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "This field is a reasonable estimation of the content type of the Element, from a creator perspective.\nContent type is intrinsic to the Element, independent of how the Element is being used.",
   :rdfs/domain :spdx-software/File,
   :rdfs/range :spdx-core/MediaType,
   :vs/term_status "Stable"})

(def copyrightText
  {:db/ident :spdx-software/copyrightText,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "A copyrightText consists of the text(s) of the copyright notice(s) found\nfor a software Package, File or Snippet, if any.\n\nIf a copyrightText contains text, then it may contain any text related to\none or more copyright notices (even if not complete) for that software\nPackage, File or Snippet.\n\nIf a copyrightText has a \"NONE\" value, this indicates that the software\nPackage, File or Snippet contains no copyright notice whatsoever.\n\nIf a copyrightText has a \"NOASSERTION\" value, this indicates that one of the\nfollowing applies:\n* the SPDX data creator has attempted to but cannot reach a reasonable\n  objective determination;\n* the SPDX data creator has made no attempt to determine this field; or\n* the SPDX data creator has intentionally provided no information (no\n  meaning should be implied by doing so).",
   :rdfs/domain :spdx-software/SoftwareArtifact,
   :rdfs/range :xsd/string,
   :vs/term_status "Stable"})

(def downloadLocation
  {:db/ident :spdx-software/downloadLocation,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "DownloadLocation identifies the download Uniform Resource Identifier \nfor the package at the time that the document was created.\nWhere and how to download the exact package being referenced \nis critical for verification and tracking data.",
   :rdfs/domain :spdx-software/Package,
   :rdfs/range :xsd/anyURI,
   :vs/term_status "Stable"})

(def homePage
  {:db/ident :spdx-software/homePage,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "HomePage is a place for the SPDX document creator to record a website that serves as the package's home page.\nThis saves the recipient of the SPDX document who is looking for more info from\nhaving to search for and verify a match between the package and the associated project home page.\nThis link can also be used to reference further information about the package\nreferenced by the SPDX document creator.",
   :rdfs/domain :spdx-software/Package,
   :rdfs/range :xsd/anyURI,
   :vs/term_status "Stable"})

(def lineRange
  {:db/ident :spdx-software/lineRange,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "This field defines the line range in the original host file that the snippet information applies to.\nIf there is a disagreement between the byte range and line range, the byte range values will take precedence.\nA range of lines is a convenient reference for those files where there is a known line delimiter. \nThe choice was made to start the numbering of the lines at 1 to be consistent with the W3C pointer method vocabulary.",
   :rdfs/domain :spdx-software/Snippet,
   :rdfs/range :spdx-core/PositiveIntegerRange,
   :vs/term_status "Stable"})

(def packageUrl
  {:db/ident :spdx-software/packageUrl,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "A packageUrl (commonly pronounced and referred to as \"purl\") is an attempt to standardize package representations in order to reliably identify and locate software packages. A purl is a URL string which represents a package in a mostly universal and uniform way across programming languages, package managers, packaging conventions, tools, APIs and databases.\n\nthe purl URL string is defined by seven components:\n```\nscheme:type/namespace/name@version?qualifiers#subpath\n```\n\nThe definition for each component can be found in the [purl specification](https://github.com/package-url/purl-spec/blob/master/PURL-SPECIFICATION.rst). Components are designed such that they form a hierarchy from the most significant on the left to the least significant components on the right. \n\nParsing a purl string into its components works from left to right. Some extra type-specific normalizations are required. For more information, see [How to parse a purl string in its components](https://github.com/package-url/purl-spec/blob/master/PURL-SPECIFICATION.rst#how-to-parse-a-purl-string-in-its-components).",
   :rdfs/domain :spdx-software/Package,
   :rdfs/range :xsd/anyURI,
   :vs/term_status "Stable"})

(def packageVersion
  {:db/ident :spdx-software/packageVersion,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "A packageVersion is useful for identification purposes and for indicating later changes of the package version.",
   :rdfs/domain :spdx-software/Package,
   :rdfs/range :xsd/string,
   :vs/term_status "Stable"})

(def primaryPurpose
  {:db/ident :spdx-software/primaryPurpose,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "primaryPurpose provides information about the primary purpose of the software artifact.",
   :rdfs/domain :spdx-software/SoftwareArtifact,
   :rdfs/range :spdx-software/SoftwarePurpose,
   :vs/term_status "Stable"})

(def sbomType
  {:db/ident :spdx-software/sbomType,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "This field is a reasonable estimation of the type of SBOM created from a creator perspective.\nIt is intended to be used to give guidance on the elements that may be contained within it.\nAligning with the guidance produced in [Types of Software Bill of Material (SBOM) Documents](https://www.cisa.gov/sites/default/files/2023-04/sbom-types-document-508c.pdf).",
   :rdfs/domain :spdx-software/Sbom,
   :rdfs/range :spdx-software/SbomType,
   :vs/term_status "Stable"})

(def snippetFromFile
  {:db/ident       :spdx-software/snippetFromFile,
   :rdf/type       :owl/ObjectProperty,
   :rdfs/comment   "The field identifies the file which contains the snippet.",
   :rdfs/domain    :spdx-software/Snippet,
   :rdfs/range     :spdx-software/File,
   :vs/term_status "Stable"})

(def softwareLinkage
  {:db/ident       :spdx-software/softwareLinkage,
   :rdf/type       :owl/ObjectProperty,
   :rdfs/comment   "A softwareLinkage is TODO",
   :rdfs/domain    :spdx-software/SoftwareDependencyRelationship,
   :rdfs/range     :spdx-software/SoftwareDependencyLinkType,
   :vs/term_status "Stable"})

(def sourceInfo
  {:db/ident :spdx-software/sourceInfo,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "SourceInfo records any relevant background information or additional comments\nabout the origin of the package. For example, this field might include comments \nindicating whether the package was pulled from a source code management system \nor has been repackaged. The creator can provide additional information to describe\nany anomalies or discoveries in the determination of the origin of the package.",
   :rdfs/domain :spdx-software/Package,
   :rdfs/range :xsd/string,
   :vs/term_status "Stable"})

(def urn:uuid:dffc304c-2fb7-5c41-9ced-b505207df3ce
  {:owl/imports {:xsd/anyURI "https://spdx.org/rdf/v3/Core/"},
   :rdf/type :owl/Ontology,
   :rdfs/comment
   "This ontology provides a vocabulary for describing software-related SPDX elements.",
   :sh/declare {:sh/namespace "https://spdx.org/rdf/v3/Software/",
                :sh/prefix    "spdx-software"},
   :xsd/anyURI "https://spdx.org/rdf/v3/Software/"})