(ns net.wikipunk.rdf.spdx-build
  "The Build namespace defines concepts related to building of artifacts."
  {:dcat/downloadURL "resources/spdx/Build/Build.ttl",
   :owl/imports {:rdfa/uri "https://spdx.org/rdf/v3/Core"},
   :rdf/ns-prefix-map {"owl" "http://www.w3.org/2002/07/owl#",
                       "rdf" "http://www.w3.org/1999/02/22-rdf-syntax-ns#",
                       "rdfs" "http://www.w3.org/2000/01/rdf-schema#",
                       "sh" "http://www.w3.org/ns/shacl#",
                       "spdx-build" "https://spdx.org/rdf/v3/Build/",
                       "spdx-core" "https://spdx.org/rdf/v3/Core/",
                       "vs" "http://www.w3.org/2003/06/sw-vocab-status/ns#",
                       "xsd" "http://www.w3.org/2001/XMLSchema#"},
   :rdf/type :owl/Ontology,
   :rdfa/prefix "spdx-build",
   :rdfa/uri "https://spdx.org/rdf/v3/Build/",
   :rdfs/comment
   "The Build namespace defines concepts related to building of artifacts.",
   :rdfs/seeAlso {:rdfa/uri "https://slsa.dev/provenance/v0.2"},
   :sh/declare {:sh/namespace "https://spdx.org/rdf/v3/Build/",
                :sh/prefix    "spdx-build"}})

(def Build
  "A build is a representation of the process in which a piece of software or artifact is built. It encapsulates information related to a build process and\nprovides an element from which relationships can be created to describe the build's inputs, outputs, and related entities (e.g. builders, identities, etc.).\n\nDefinitions of \"BuildType\", \"ConfigSource\", \"Parameters\" and \"Environment\" follow\nthose defined in [SLSA provenance](https://slsa.dev/provenance/v0.2).\n\nExternalIdentifier of type \"urlScheme\" may be used to identify build logs. In this case, the comment of the ExternalIdentifier should be \"LogReference\".\n\nNote that buildStart and buildEnd are optional, and may be omitted to simplify creating reproducible builds."
  {:db/ident :spdx-build/Build,
   :rdf/type [:owl/Class :sh/NodeShape],
   :rdfs/comment
   "A build is a representation of the process in which a piece of software or artifact is built. It encapsulates information related to a build process and\nprovides an element from which relationships can be created to describe the build's inputs, outputs, and related entities (e.g. builders, identities, etc.).\n\nDefinitions of \"BuildType\", \"ConfigSource\", \"Parameters\" and \"Environment\" follow\nthose defined in [SLSA provenance](https://slsa.dev/provenance/v0.2).\n\nExternalIdentifier of type \"urlScheme\" may be used to identify build logs. In this case, the comment of the ExternalIdentifier should be \"LogReference\".\n\nNote that buildStart and buildEnd are optional, and may be omitted to simplify creating reproducible builds.",
   :rdfs/subClassOf :spdx-core/Element,
   :sh/property [{:sh/datatype :spdx-core/DateTime,
                  :sh/maxCount 1,
                  :sh/name     "buildStartTime",
                  :sh/path     :spdx-build/buildStartTime}
                 {:sh/class :spdx-core/DictionaryEntry,
                  :sh/name  "environment",
                  :sh/path  :spdx-build/environment}
                 {:sh/datatype :xsd/string,
                  :sh/name     "configSourceEntrypoint",
                  :sh/path     :spdx-build/configSourceEntrypoint}
                 {:sh/datatype :spdx-core/DateTime,
                  :sh/maxCount 1,
                  :sh/name     "buildEndTime",
                  :sh/path     :spdx-build/buildEndTime}
                 {:sh/datatype :xsd/anyURI,
                  :sh/name     "configSourceUri",
                  :sh/path     :spdx-build/configSourceUri}
                 {:sh/class :spdx-core/DictionaryEntry,
                  :sh/name  "parameters",
                  :sh/path  :spdx-build/parameters}
                 {:sh/class :spdx-core/Hash,
                  :sh/name  "configSourceDigest",
                  :sh/path  :spdx-build/configSourceDigest}
                 {:sh/datatype :xsd/anyURI,
                  :sh/maxCount 1,
                  :sh/minCount 1,
                  :sh/name     "buildType",
                  :sh/path     :spdx-build/buildType}
                 {:sh/datatype :xsd/string,
                  :sh/maxCount 1,
                  :sh/name     "buildId",
                  :sh/path     :spdx-build/buildId}],
   :vs/term_status "Stable"})

(def buildEndTime
  "buildEndTime describes the time at which a build stops or finishes. This value is typically recorded by the builder."
  {:db/ident :spdx-build/buildEndTime,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "buildEndTime describes the time at which a build stops or finishes. This value is typically recorded by the builder.",
   :rdfs/domain :spdx-build/Build,
   :rdfs/range :spdx-core/DateTime,
   :vs/term_status "Stable"})

(def buildId
  "A buildId is a locally unique identifier to identify a unique instance of a build. This identifier differs based on build toolchain, platform, or naming convention used by an organization or standard."
  {:db/ident :spdx-build/buildId,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "A buildId is a locally unique identifier to identify a unique instance of a build. This identifier differs based on build toolchain, platform, or naming convention used by an organization or standard.",
   :rdfs/domain :spdx-build/Build,
   :rdfs/range :xsd/string,
   :vs/term_status "Stable"})

(def buildStartTime
  "buildStartTime is the time at which a build is triggered. The builder typically records this value."
  {:db/ident :spdx-build/buildStartTime,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "buildStartTime is the time at which a build is triggered. The builder typically records this value.",
   :rdfs/domain :spdx-build/Build,
   :rdfs/range :spdx-core/DateTime,
   :vs/term_status "Stable"})

(def buildType
  "A buildType is a URI expressing the toolchain, platform, or infrastructure that the build was invoked on. For example, if the build was invoked on GitHub's CI platform using github actions, the buildType can be expressed as `https://github.com/actions`. In contrast, if the build was invoked on a local machine, the buildType can be expressed as `file://username@host/path/to/build`."
  {:db/ident :spdx-build/buildType,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "A buildType is a URI expressing the toolchain, platform, or infrastructure that the build was invoked on. For example, if the build was invoked on GitHub's CI platform using github actions, the buildType can be expressed as `https://github.com/actions`. In contrast, if the build was invoked on a local machine, the buildType can be expressed as `file://username@host/path/to/build`.",
   :rdfs/domain :spdx-build/Build,
   :rdfs/range :xsd/anyURI,
   :vs/term_status "Stable"})

(def configSourceDigest
  "configSourceDigest is the checksum of the build configuration file used by a builder to execute a build. This Property uses the Core model's [Hash](../../Core/Classes/Hash.md) class."
  {:db/ident :spdx-build/configSourceDigest,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "configSourceDigest is the checksum of the build configuration file used by a builder to execute a build. This Property uses the Core model's [Hash](../../Core/Classes/Hash.md) class.",
   :rdfs/domain :spdx-build/Build,
   :rdfs/range :spdx-core/Hash,
   :vs/term_status "Stable"})

(def configSourceEntrypoint
  "A build entrypoint is the invoked executable of a build which always runs when the build is triggered. For example, when a build is triggered by running a shell script, the entrypoint is `script.sh`. In terms of a declared build, the entrypoint is the position in a configuration file or a build declaration which is always run when the build is triggered. For example, in the following configuration file, the entrypoint of the build is `publish`.\n\n```\nname: Publish packages to PyPI\n\non:\ncreate:\ntags: \"*\"\n\njobs:\npublish:\nruns-on: ubuntu-latest\nif: startsWith(github.ref, 'refs/tags/')\nsteps:\n\n...\n```"
  {:db/ident :spdx-build/configSourceEntrypoint,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "A build entrypoint is the invoked executable of a build which always runs when the build is triggered. For example, when a build is triggered by running a shell script, the entrypoint is `script.sh`. In terms of a declared build, the entrypoint is the position in a configuration file or a build declaration which is always run when the build is triggered. For example, in the following configuration file, the entrypoint of the build is `publish`.\n\n```\nname: Publish packages to PyPI\n\non:\ncreate:\ntags: \"*\"\n\njobs:\npublish:\nruns-on: ubuntu-latest\nif: startsWith(github.ref, 'refs/tags/')\nsteps:\n\n...\n```",
   :rdfs/domain :spdx-build/Build,
   :rdfs/range :xsd/string,
   :vs/term_status "Stable"})

(def configSourceUri
  "If a build configuration exists for the toolchain or platform performing the build, the configSourceUri of a build is the URI of that build configuration. For example, a build triggered by a GitHub action is defined by a build configuration YAML file. In this case, the configSourceUri is the URL of that YAML file. \nm"
  {:db/ident :spdx-build/configSourceUri,
   :rdf/type :owl/DatatypeProperty,
   :rdfs/comment
   "If a build configuration exists for the toolchain or platform performing the build, the configSourceUri of a build is the URI of that build configuration. For example, a build triggered by a GitHub action is defined by a build configuration YAML file. In this case, the configSourceUri is the URL of that YAML file. \nm",
   :rdfs/domain :spdx-build/Build,
   :rdfs/range :xsd/anyURI,
   :vs/term_status "Stable"})

(def environment
  "environment is a map of environment variables and values that are set during a build session. This is different from the [parameters](parameters.md) property in that it describes the environment variables set before a build is invoked rather than the variables provided to the builder."
  {:db/ident :spdx-build/environment,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "environment is a map of environment variables and values that are set during a build session. This is different from the [parameters](parameters.md) property in that it describes the environment variables set before a build is invoked rather than the variables provided to the builder.",
   :rdfs/domain :spdx-build/Build,
   :rdfs/range :spdx-core/DictionaryEntry,
   :vs/term_status "Stable"})

(def parameters
  "parameters is a key-value map of all build parameters and their values that were provided to the builder for a build instance. This is different from the [environment](environment.md) property in that the keys and values are provided as command line arguments or a configuration file to the builder."
  {:db/ident :spdx-build/parameters,
   :rdf/type :owl/ObjectProperty,
   :rdfs/comment
   "parameters is a key-value map of all build parameters and their values that were provided to the builder for a build instance. This is different from the [environment](environment.md) property in that the keys and values are provided as command line arguments or a configuration file to the builder.",
   :rdfs/domain :spdx-build/Build,
   :rdfs/range :spdx-core/DictionaryEntry,
   :vs/term_status "Stable"})