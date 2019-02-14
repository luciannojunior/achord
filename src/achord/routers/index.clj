(ns achord.routers.index
  (:use [compojure.core :only [defroutes GET]]))
        
(defroutes routes
  (GET "/songs" [] ())
  (GET "/artists/:slug" [] ())
  (GET "/chords" [] ()))
