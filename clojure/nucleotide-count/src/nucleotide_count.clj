(ns nucleotide-count)

(def nucleotides
  #{\A \T \C \G})

(defn count [nucleotide dna]
  {:pre [(contains? nucleotides nucleotide)]}
  (clojure.core/count (filter #(= nucleotide %) dna)))

(defn nucleotide-counts [dna]
  (apply merge (map #(hash-map % (count % dna)) nucleotides)))
