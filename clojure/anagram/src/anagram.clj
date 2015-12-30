(ns anagram)

(defn- anagram? [word1 word2]
  (let [lower1 (clojure.string/lower-case word1)
        lower2 (clojure.string/lower-case word2)
        same-word (= lower1 lower2)
        same-anagram (= (sort lower1) (sort lower2))]
    (and same-anagram (not same-word))))

(defn anagrams-for [word candidates]
  (filter #(anagram? word %) candidates))
