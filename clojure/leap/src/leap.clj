(ns leap)

(defn- divides? [n m]
  (zero? (rem n m)))

(defn leap-year? [n]
  (and (divides? n 4)
       (not (and (divides? n 100)
                 (not (divides? n 400))))))
