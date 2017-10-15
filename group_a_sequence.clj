((fn [pred a_seq]
  (reduce #(merge %1 {(pred %2) (vec (conj (get %1 (pred %2)) %2))}) {} a_seq))
 #(> % 5) [1 3 6 8])

;; better solution
(merge-with concat {:a [1 2]} {:a [4]})