(defproject xtdb-datomic-compat "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.11.1"]
  [com.xtdb/xtdb-core "1.21.0"]]
  :profiles {:with-shim {:source-paths ["shim"]}})
