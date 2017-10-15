((fn [a_str]
  (sort (clojure.string/split #" " (clojure.string/replace a_str #".!" ""))))
 "Have a nice day.")