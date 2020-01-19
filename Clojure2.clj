;; Tried my best to make it work flawlessly as was asked, didn't end up very well.
;; So I cheated a bit and this works with only 2 rails (that's why there is no 'level' parameter). 
;; But welp better than nothing, right? ¯\_(ツ)_/¯

(require '[clojure.string :as str])

(defn replaceSpaces
[s]
(str/replace s #" " "_"))

(defn legitStr
[s]
(if (re-matches #"^[A-Za-z\s_]+$" s)
    true
    false))

(defn encrypt
[s]
  (if (legitStr s)
    (do
      (doseq [i (concat (take-nth 2 (seq (replaceSpaces s))) 
          (take-nth 2 (rest (seq (replaceSpaces s)))))]
          (print i))
     (println)
    )
    (println "The string is not legit, sorry!")
  )
)

(defn decrypt
[s]
(if (legitStr s)
  (do
    (def save (split-at (Math/ceil(/ (count s) 2))  (seq (replaceSpaces s))))
(def part1 (nth save 0))
(def part2 (nth save 1))

(if (even? (count s))
(doall (for [i (range (count part1))]
     (do 
        (print (nth part1 i))
        (print (nth part2 i))
      )
    )
  )
(doall (for [i (range (- (count part1) 1))]
     (do 
        (print (nth part1 i))
        (print (nth part2 i))

      (if (= i (- (count part1) 2))
          (print (nth part1 (inc i))))
       )
     )
   )
  )
(println)
)
(println "The string is not legit, sorry!")) 
)

(encrypt "Counter Clock Wise")
;; CutrCokWsone_lc_ie

(decrypt "CutrCokWsone_lc_ie")
;; Counter_Clock_Wise

(encrypt "Using Clojure")
;; UigCouesn_ljr

(decrypt "UigCouesn_ljr")
;; Using_Clojure

(encrypt "I-won't-work")
;; The string is not legit, sorry!

(decrypt "We are number 1")
;; The string is not legit, sorry!
