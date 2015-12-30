(ns word-count)

(defn word-count [phrase]
  (frequencies (.split (.toLowerCase phrase) "\\W+")))
