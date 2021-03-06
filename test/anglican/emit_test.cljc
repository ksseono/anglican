(ns anglican.emit-test
  (:require [clojure.test :refer [deftest testing is]]
            [anglican.importance :as importance]
            [anglican.runtime :refer [sample*]])
  (:use [anglican.trap :only [value-cont]]
        [anglican.emit :only [query-fn fm-fn fm
                              $comp $repeatedly $partial
                              $map $reduce $filter
                              conditional query]]))

(deftest test-query
  (testing "query"
    (is (= (second (query-fn 'x 'y 'z)) 'x)
        "query with explicit name")
    (is (= (second (next (query-fn 'x '(foo x)))) 'x)
        "query with generated name")
    (is (= (second (next (query-fn 'x '[x]))) 'x)
        "backward compatible query with generated name")))

(deftest test-fm
  (testing "fm"
    (is (= (second (fm-fn 'x '[y] 'z)) 'x)
        "fm with explicit name")
    (is (= (second (next (fm-fn '[x] '(foo x)))) '[x])
        "fm with generated name")))

(deftest test-higher-order-functions
  (testing "map in CPS"
    (is (= (trampoline
             ($map value-cont nil (fm [lst] (first lst))
                   '((1) (2) (3))))
           '(1 2 3))
        "map on a single list")
    (is (= (trampoline
             ($map value-cont nil (fm [x y] (+ x y))
                   '( 1 2 3) '(4 5 6)))
           '(5 7 9))
        "map on two lists")
    (is (= (trampoline
              ($map value-cont nil (fm [x] (number? x))
                    '(1 2 nil 3)))
              '(true true false true))
           "map on a single list with nils")
    (is (= (trampoline
             ($map value-cont nil (fm [x y] (or x y))
                   '(1 nil 3) '(4 5 nil)))
           '(1 5 3))
        "map on two lists with nils"))

  (testing "reduce in CPS"
    (is (= (trampoline
             ($reduce value-cont nil (fm [x y] (+ x y))
                      '(1 2 3)))
           6)
        "reduce without default")
    (is (= (trampoline
             ($reduce value-cont nil (fm [x y] (conj x y))
                      nil
                      '(1 2 3)))
           '(3 2 1))
        "reduce with default"))

  (testing "filter in CPS"
    (is (= (trampoline
             ($filter value-cont nil (fm [x] (odd? x))
                      '(1 2 3)))
           '(1 3))
        "filter"))

  (testing "repeatedly in CPS"
    (is (= (trampoline
             ($repeatedly value-cont nil 3 (fm [] 1)))
           '(1 1 1))))

  (testing "comp in CPS"
    (is (= (trampoline
             (($comp value-cont nil)) value-cont nil 1)
           1)
        "argumentless comp")
    (is (= (trampoline
             ((($comp value-cont nil (fm [x y] (+ x y))))
              value-cont nil 1 2))
           3)
        "single-argument comp")
    (is (= (trampoline
             ((($comp value-cont nil 
                      (fm [x] (odd? x))
                      (fm [& terms] (apply + terms))))
              value-cont nil 1 1 1))
           true)
        "multi-argument comp"))

  (testing "partial in CPS"
    (is (= (trampoline
             ((($partial value-cont nil
                         (fm [x y] (+ x y))
                         1))
              value-cont nil 2))
           3)
        "partially applied +")))

(deftest test-conditional
  (let [q (query [v] v)
        c (conditional q :importance)]
    (is (sample* (c true))
        (str "sampling from a conditional distribution should return"
             "the result value"))))
