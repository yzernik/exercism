(ns rna-transcription)


(def transcriptions
  {\G \C
   \C \G
   \T \A
   \A \U})

(defn to-rna
  [dna]
  {:pre  [(every? transcriptions dna)]}
  (apply str (map transcriptions dna)))
