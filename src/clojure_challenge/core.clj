(ns clojure-challenge.core
 (:require [clojure-challenge.problem-1.problem-1 :as p1]))


(defn -main
 []
 (let [p1 (p1/get-all-invoice-items-by-given-conditions)]
   (println "Starting clojure challenge p1")))


