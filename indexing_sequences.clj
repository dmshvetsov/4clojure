((fn [a_seq] (map-indexed #(vector %2 %1) a_seq))
 [:a :b :c])

((fn [a_seq] (map vector a_seq (range)))
 [:a :b :c])