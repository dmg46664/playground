(ns playground.play

  (:require [tech.v3.datatype :as dtype]
            [tech.v3.datatype.functional :as dfn]
            [tech.v3.tensor :as dtt])
  (:require [tablecloth.api :as tc])
  ) ;ns







;; Make a native-heap container of complex doubles
(def c-data
  (dtype/make-container :native-heap :complex-double
                        [[1.0 2.0]
                         [3.0 4.0]
                         [5.0 6.0]]))


(def ds
  (tc/dataset
   {:id   [0 1 2]
    :z    c-data}))   ; :z is a complex-double column


(comment

  (require '[portal.api :as p])

  (def p (p/open)) ; Open a new inspector
  (add-tap #'p/submit) ; add tap handler
  (tap> *e) 
  )
