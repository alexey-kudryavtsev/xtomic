(ns xtomic.core
  (:require [environ.core :as env]
            [clojure.java.io :as io]
            [xtdb.api :as xt]
            [xtdb.jdbc]
            [xtdb.jdbc.psql]
            [xtdb.rocksdb]))

(declare default-xtdb-node)

(defn restart-default-node [config]
  (alter-var-root #'default-xtdb-node
                  (fn [node]
                    (and (bound? #'default-xtdb-node) 
                         (some? node)
                         (.close node))
                    (xt/start-node config)))
  nil)

(def start-default-node restart-default-node)
