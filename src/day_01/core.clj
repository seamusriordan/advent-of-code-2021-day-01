(ns day-01.core)

(defn count-increases
  [depths]
  (loop [depths depths increases 0]
    (let [current-depth (first depths)
          remaining-depths (rest depths)
          next-depth (first remaining-depths)]
      (if (empty? remaining-depths)
        increases
        (if (> next-depth current-depth)
          (recur remaining-depths (inc increases))
          (recur remaining-depths increases)))
      )
    )
  )
