(ns clojure-challenge.core
 (:require [clojure-challenge.problem-1.problem-1 :as p1]))

(def invoice (clojure.edn/read-string (slurp "resources/invoice.edn")))

(defn -main
 []
 (let [p1 ( p1/get-all-invoice-items-by-given-conditions invoice)]
   (println "Starting clojure challenge p1" p1)))


