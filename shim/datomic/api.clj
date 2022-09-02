(ns datomic.api
  (:require [xtomic.api]))

(doseq [[sym v] (ns-publics 'xtomic.normalizer)]
  (intern *ns* sym v))