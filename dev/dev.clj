(ns dev
  "Tools for interactive development with the REPL. This file should
  not be included in a production build of the application.
  Call `(reset)` to reload modified code and (re)start the system.
  The system under development is `system`, referred from
  `com.stuartsierra.component.repl/system`.
  See also https://github.com/stuartsierra/component.repl"
  (:require
   [clj-http.client :as http]
   [clojure.data.csv :as csv]
   [clojure.datafy :refer [datafy]]
   [clojure.edn :as edn]
   [clojure.java.io :as io]
   [clojure.java.javadoc :refer [javadoc]]
   [clojure.pprint :refer [pprint pp]]
   [clojure.reflect :refer [reflect]]
   [clojure.repl :refer [apropos dir find-doc pst source]]
   [clojure.set :as set]
   [clojure.string :as str]
   [clojure.tools.namespace.repl :refer [refresh refresh-all clear]]
   [com.stuartsierra.component :as com]
   [com.stuartsierra.component.repl :refer [reset set-init start stop system]]
   [com.walmartlabs.schematic :as sc]
   [net.wikipunk.boot]
   [net.wikipunk.ext]
   [net.wikipunk.mop :as mop]
   [net.wikipunk.rdf :as rdf :refer [doc]]
   [zprint.core :as zprint]
   [net.wikipunk.ssvc.boot :as boot]
   [net.wikipunk.ssvc :as ssvc]
   [net.wikipunk.datomic.boot :as db]
   [datomic.client.api :as d]
   [xtdb.api :as xt]))

(set-init
  (fn [_]
    (if-let [r (io/resource "system.edn")]
      (-> (slurp r)
          (edn/read-string)
          (sc/assemble-system))
      (throw (ex-info "system.edn is not on classpath" {})))))

(defmacro inspect
  "Evaluate forms in an implicit do and inspect the value of the last
  expression using Reveal."
  [& body]
  `(do (@user/reveal (do ~@body))
       true))

(comment
  (def boot-db (db/test-bootstrap (:db system)))
  (let [result (d/q '[:find (pull ?property [:db/ident]) (pull ?value [:db/ident])
                      :in $ ?class
                      :where
                      [?class :rdfs/subClassOf ?restriction]
                      [?restriction :owl/onProperty ?property]
                      [?restriction :owl/hasValue ?value]]
                    boot-db :tal/Vendor)]
    (reduce (fn [m [property value]]
              (update m (:db/ident property) (fnil conj #{}) (:db/ident value)))
            {} result)))
