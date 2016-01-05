(ns point-mutations)

(defn hamming-distance [strand1 strand2]
  (if (= (count strand1) (count strand2))
    (count (filter #(not= (first %) (second %))
                   (map vector strand1 strand2)))))
