(ns bob)

(defn- asked? [prompt]
  (= \? (last prompt)))

(defn- yelled? [prompt]
  (and (not-any? #(Character/isLowerCase %) prompt)
       (some #(Character/isLetter %) prompt)))

(defn- said-nothing? [prompt]
  (clojure.string/blank? prompt))

(defn response-for [prompt]
  (cond (said-nothing? prompt) "Fine. Be that way!"
        (yelled? prompt) "Whoa, chill out!"
        (asked? prompt) "Sure."
        :else "Whatever."))
