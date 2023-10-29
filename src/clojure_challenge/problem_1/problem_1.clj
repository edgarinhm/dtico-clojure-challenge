(ns clojure-challenge.problem-1.problem-1)
(def invoice (clojure.edn/read-string (slurp "resources/invoice.edn")))

(defn get-all-invoice-items-by-given-conditions
  []
  (println "return invoice items by given conditions" invoice))

