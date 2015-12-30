(ns anagram)

(defn- canonicalize [word]
  (sort (clojure.string/lower-case word)))

(defn- same-anagram? [w1 w2]
  (= (canonicalize w1)
     (canonicalize w2)))

(defn- same-word? [w1 w2]
  (= (clojure.string/lower-case w1)
     (clojure.string/lower-case w2)))

(defn- valid-anagram? [w1 w2]
  (and (not (same-word? w1 w2))
       (same-anagram? w1 w2)))

(defn anagrams-for [word candidates]
  (filter #(valid-anagram? word %) candidates))
