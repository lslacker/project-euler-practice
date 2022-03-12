(ns project-euler.q1-test
  (:require [clojure.test :refer :all]
            [project-euler.q1 :refer :all]))

(deftest multiples-of-3-or-5-test
  (is (= 233168 (multiples-of-3-or-5 1000))))
