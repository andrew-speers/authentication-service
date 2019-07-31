from clojure
copy project.clj .
run lein deps
copy src .

run mv "$(lein uberjar)" app.jar
cmd ["java", "-jar", "app.jar"]
