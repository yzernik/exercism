(ns grade-school)

(defn add
  [db name grade]
  (update db grade #(conj (vec %) name)))

(defn grade
  [db grade]
  (db grade []))

(defn sorted
  [db]
  (->> db
       (map #(update-in % [1] sort))
       (into (sorted-map))))
