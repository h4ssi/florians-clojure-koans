(ns koans.01-equalities
  (:require [koan-engine.core :refer :all]))

(meditations
  "We shall contemplate truth by testing reality, via equality"
  (= (not false) true)

  "To understand reality, we must compare our expectations against reality"
  (= (- 3 1) (+ 1 1))

  "You can test equality of many things"
  (= (+ 3 4) 7 (+ 2 (* 5 1 1 1 1)))

  "Some things may appear different, but be the same"
  (= (= 1024/2048 1/2) (= 2 2/1))

  "You cannot generally float to heavens of integers"
  (= (not true) (= 2 2.0))

  "But a looser equality is also possible"
  (= (and true true true true true) (== 2.0 2))

  "Something is not equal to nothing"
  (= (or true 0 0 0 0 0 nil) (not (= 1 nil)))

  "Strings, and keywords, and symbols: oh my!"
  (= (= 0 1) (= "foo" :foo 'foo))

  "Make a keyword with your keyboard"
  (= :foo (keyword :foo) (keyword "foo") (keyword 'foo))

  "Symbolism is all around us"
  (= 'foo (symbol 'foo) (symbol (name :foo)) (symbol "foo"))

  "When things cannot be equal, they must be different"
  (not= :fill-in-the-blank 'fill-in-the-blank))
