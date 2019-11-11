(require '[clojure.string :as string])

(defn average [collec] 
  (float (/ (reduce + collec) (count collec))))

(def students {"Inese" 10 "Vasja" 8 "Petja" 4 "Natasha" 7
"Anja" 10 "Lauris" 6 "Sandra" 8 "Krišjanis" 9})
 
(defn vidAtz [students] 
      (average (for [[a b] (filter (fn [[c d]] (string/ends-with? c "a")) students)] b)))

(vidAtz students)
;correct 7.4

(def students2 {"Inesa" 10 "Vasja" 5 "Petja" 4 "Natasha" 7
"Anja" 10 "Baiba" 6 "Krišjanis" 9})

(vidAtz students2)
;correct 7.0
