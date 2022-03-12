(ns project-euler.q2-test
  (:require [clojure.test :refer :all]
            [project-euler.q2 :refer :all]))

(deftest sum-even-in-fib-seq-test
  (is (= 4613732 (sum-even-in-fib-seq 4000000))))
