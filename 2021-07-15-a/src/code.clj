(ns code)

(defn get-env-var
  [var-name]
  (System/getenv var-name))
