(ns day-01.core-test
  (:require [clojure.test :refer :all]
            [day-01.core :refer :all]))

(deftest example-input-is-7
  (testing "Example input gives 7"
    (let [example-input [199 200 208 210 200 207 240 269 260 263]]

     (is (= 7 (count-increases example-input))))))

(deftest empty-list-is-0
  (testing "Empty list gives 0"
    (is (= 0 (count-increases [])))))


(deftest three-window-with-5-inputs
  (testing "Sliding window with 5 inputs"
    (is (= 5 (count-increases [607 618 618 617 647 716 769 792])))))
