(ns http-server.core
  (:require [org.httpkit.server :refer [run-server]]
            [compojure.core :refer :all])
  )
(defroutes app
  (GET "/login/request_token" [] "Step 1")
  (POST "/login/access_token/:token?:verifier" [token verifier] "Step 3")
  )
(defn -main [& args]
  (run-server app {:port 8080})
  (println "Server started on port 8080")
  )
