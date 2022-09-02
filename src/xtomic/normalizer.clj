(ns xtomic.normalizer
  (:require [clojure.zip :as z]))

(defn tx-data-zipper
  [tx-data]
  (letfn [(branch? [node]
            (or (map? node)))
          (children [node])
          (make-node [node children])]
    (z/zipper
     branch?
     children
     make-node
     tx-data)))

(defn map->tuples [_]
  )

(defn normalize
  [tx-data]
  (mapcat
   (fn [v]
     (cond
       (map? v) (map->tuples v)
       (vector? v) [v]
       :else (throw (ex-info "tx-data must be a seq of maps or vectors"
                             {:value v}))))
   tx-data))
