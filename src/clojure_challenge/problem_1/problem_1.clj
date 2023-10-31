(ns clojure-challenge.problem-1.problem-1)

(defn filterByIva
  [iva items]
  (println "ITEMS:" items "IVA" iva)
  (filter #(and (= (get (first %) :tax/category) :iva) (= (get (first %) :tax/rate) iva)) (map #(:taxable/taxes %) items))
  )

(defn filterByRetFuente
  [retFuente items]
  (println "ITEMS:" items "RETE-FUENTE" retFuente)
  (filter #(and (= (get (first %) :retention/category) :ret_fuente) (= (get (first %) :retention/rate) retFuente)) (map #(:retentionable/retentions %) items))
  )


(defn get-all-invoice-items-by-given-conditions
  "receives an invoice as an argument and returns all items that satisfy the conditions IVA 19%
    TODO: accumulate the item in a variable validating if already exits
  "
  [invoice]
  (println "Invoice: " (get invoice :invoice/id))
  (->> (get invoice :invoice/items)
       (filterByIva 19)
       (get invoice :invoice/items)
       (filterByRetFuente 1)
    )
  )



