(ns hamming)

(defn distance [s1 s2]
  (if (= (count s1) (count s2))
    (count (filter identity (map not= s1 s2)))))
