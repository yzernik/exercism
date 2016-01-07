(ns phone-number)

(def invalid "0000000000")

(defn number [input]
  (let [digits (clojure.string/replace input #"[^0-9]" "")]
    (cond
      (= 10 (count digits)) digits
      (and (= 11 (count digits)) (= \1 (first digits))) (subs digits 1)
      :else invalid)))

(defn area-code [input]
  (subs (number input) 0 3))

(defn pretty-print [input]
  (let [n (number input)]
    (format "(%s) %s-%s"
            (subs n 0 3)
            (subs n 3 6)
            (subs n 6))))
