((defn max_div [a b]
  (let [div_seq (range 1 (inc (min a b)))]
    (apply max (filter
          #(= (mod a %) (mod b %) 0)
          div_seq)))) 4 2)

(range 1 (inc (min 4 2)))

(apply max (filter
      #(= (mod 2 %) (mod 4 %) 0)
      '(1 2)))

(max 1 2)