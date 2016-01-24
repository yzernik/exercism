(ns beer-song)

(defn- next-n [n]
  (mod (dec n) 100))

(defn- bottles [n]
  (cond (= 0 n) "no more bottles"
        (= 1 n) "1 bottle"
        :else (str n " bottles")))

(defn- action [n]
  (cond (= 0 n) "Go to the store and buy some more"
        (= 1 n) "Take it down and pass it around"
        :else "Take one down and pass it around"))

(defn verse [n]
  (format "%s of beer on the wall, %s of beer.\n%s, %s of beer on the wall.\n"
          (clojure.string/capitalize (bottles n))
          (bottles n)
          (action n)
          (bottles (next-n n))))

(defn sing
  ([n m] (->> (range n (dec m) -1)
              (map verse)
              (clojure.string/join "\n")))
  ([n] (sing n 0)))
