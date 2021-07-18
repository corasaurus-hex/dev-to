(ns corasaurus-hex.dev-to.posts
  (:require [babashka.fs :as fs]
            [clojure.edn :as edn]
            [clojure.java.io :as io]))

(defn bb-edn-files
  [root-path]
  (map str (fs/glob root-path "*/bb.edn")))

(defn read-edn-file
  [path]
  (with-open [in (java.io.PushbackReader. (io/reader path))]
    (->> in
         (partial edn/read {:eof ::EOF})
         repeatedly
         (take-while (partial not= ::EOF))
         first)))

(defn has-test-task?
  [bb-edn-path]
  (-> bb-edn-path
      read-edn-file
      :tasks
      (get 'test)))

(defn paths-to-posts-with-tests
  [root-path]
  (->> root-path
       bb-edn-files
       (filter has-test-task?)
       (map (comp str fs/parent))))
