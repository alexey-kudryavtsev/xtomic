(defproject xtomic "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [com.xtdb/xtdb-core "1.21.0"]]
  :repositories [["github" {:url "https://maven.pkg.github.com/alexey-kudryavtsev/xtomic"
                            :username :env/github_actor
                            :password :env/github_token}]]
  :profiles {:with-shim {:source-paths ["shim"]}})
