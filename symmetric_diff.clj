((fn [a b]
   (clojure.set/union
    (clojure.set/difference a b)
    (clojure.set/difference b a))) #{1 2 3 4 5 6} #{1 3 5 7})

(clojure.set/difference #{1 2 3 4 5 6} #{1 3 5 7})

(clojure.set/difference #{1 3 5 7} #{1 2 3 4 5 6})

(apply disj #{1 3 5 7} #{1 2 3 4 5 6})

(remove #{1 3 5 7} #{1 2 3 4 5 6})
(remove #{1 2 3 4 5 6} #{1 3 5 7})
(mapcat remove [#{1 3 5 7} #{1 2 3 4 5 6}] [#{1 2 3 4 5 6} #{1 3 5 7}])