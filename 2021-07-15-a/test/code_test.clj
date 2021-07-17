(ns code-test
  (:require [code :refer [get-env-var]]
            [clojure.test :refer [deftest is]]))

(deftest test-get-env-var
  (is (= "BAR" (get-env-var "FOO"))))
