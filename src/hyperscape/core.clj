(ns hyperscape.core
  (:gen-class)
  (:require [cheshire.core :refer :all]))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))


(+ 8 8 6 667 8 9)

(defn getNewUrl
  [word]
  (str "https://dictionaryapi.com/api/v3/references/" "spanish" "/json/" word "?key=" "226a8d2c-2502-4efd-ac72-5a26eb317695"))

(parse-string (slurp (getNewUrl "water")))


;https://github.com/Tabwire/HyperScape-API



;https://hypers.apitab.com/search/%7Bplatform%7D/%7Bplayername%7D
