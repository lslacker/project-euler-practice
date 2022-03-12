(ns project-euler.q1)

(defn div3 [x] (zero? (mod x 3)))
(defn div5 [x] (zero? (mod x 5)))

(defn multiples-of-3-or-5
  [number]
  (->> (take number (range))
     (filter #(or (div3 %) (div5 %)))
     (apply +)))
