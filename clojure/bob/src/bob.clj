(ns bob)

(defn- question? [prompt]
  (= \? (last prompt)))

(defn- yell? [prompt]
  (and (= prompt (clojure.string/upper-case prompt))
       (some #(Character/isLetter %) prompt)))

(defn- nothing? [prompt]
  (clojure.string/blank? prompt))

(defn response-for
  [prompt]
  (cond (nothing? prompt) "Fine. Be that way!"
        (yell? prompt) "Whoa, chill out!"
        (question? prompt) "Sure."
        :else "Whatever."))
