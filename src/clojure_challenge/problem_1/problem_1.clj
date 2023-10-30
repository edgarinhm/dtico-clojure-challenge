(ns clojure-challenge.problem-1.problem-1)

(defn isValidIVA?
  [tax]
  (= (:tax/rate? 19)
      tax))

(defn get-all-invoice-items-by-given-conditions
  "receives an invoice as an argument and returns all items that satisfy the conditions IVA 19%"
  [{id :invoice/id items :invoice/items}]
  (into {}
        (->> items
             (println))))



