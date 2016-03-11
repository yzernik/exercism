(ns robot-name)

(defn robot
  "Make a new robot"
  []
  (atom nil))

(defn make-name
  "Make a new name"
  []
  (let [chars (map char (range (int \A) (int \Z)))
        nums (range 0 10)]
    (apply str (concat
                (take 2 (repeatedly #(rand-nth chars)))
                (take 3 (repeatedly #(rand-nth nums)))))))

(defn update-name
  "Update"
  [name]
  (or name
      (make-name)))

(defn robot-name
  "Get the name of the robot"
  [robot]
  (swap! robot
         #(or % (make-name))))

(defn reset-name
  "Wipe the name from a robot"
  [robot]
  (reset! robot nil))
