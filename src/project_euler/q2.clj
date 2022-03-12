(ns project-euler.q2)

(defn build-next-fib
  [[a b]]
  [b (+ a b)])

(def fib-seq
  (map first (iterate build-next-fib [0 1])))

(defn sum-even-in-fib-seq
  [upperbound]
  (->> fib-seq
       (take-while #(< % upperbound))
       (filter even?)
       (apply +)))
