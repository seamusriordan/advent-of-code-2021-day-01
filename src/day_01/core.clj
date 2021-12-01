(ns day-01.core
  (:require [clojure.java.io :as io]
            [clojure.string :as str]))

(defn three-window
  [depths]
  (apply + (take 3 depths))
  )

(defn count-increases
  [depths]
  (loop [depths depths increases 0]
    (let [current-depth (three-window depths)
          remaining-depths (rest depths)
          next-depth (three-window remaining-depths)]
      (if (empty? remaining-depths)
        increases
        (if (> next-depth current-depth)
          (recur remaining-depths (inc increases))
          (recur remaining-depths increases)))
      )
    )
  )

(defn -main
  [& _]
  (let [input-strings (str/split-lines (slurp (io/resource "input.txt")))
        input-data (map #(Integer/parseInt %) input-strings)]
    (println (count-increases input-data))))
