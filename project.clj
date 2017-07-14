(def shared
  '[[joda-time "2.8.2"]
    [org.clojure/core.incubator "0.1.3"]
    [org.clojure/tools.logging "0.3.1"]
    [org.clojure/tools.macro "0.1.2"]
    [org.clojure/data.json "0.2.6"]

    [overtone/at-at "1.2.0"]

    [twitter-api "1.8.0"]])

(defproject twitter-streaming-client/twitter-streaming-client "0.3.4-SNAPSHOT"
  :description "a clojure based client for Twitter's streaming API"
  :url "https://github.com/gmoomau/twitter-streaming-client"

  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :min-lein-version "2.0.0"
  :plugins [[lein-midje "3.1.3"]]

  :dependencies ~(conj shared '[org.clojure/clojure "1.8.0"])
  :dev-dependencies []

  :aliases {"all" ["with-profile" "dev,1.4:dev,1.5:dev,1.6:dev,1.7:dev,1.8"]}

  :profiles {:all {:dependencies ~shared}

             :dev {:resource-paths ["dev-resources"]
                   :dependencies [[midje "1.6.3"]
                                  [ch.qos.logback/logback-classic "1.0.11"]
                                  [org.slf4j/slf4j-api "1.7.5"]
                                  [org.slf4j/jcl-over-slf4j "1.7.5"]
                                  [org.slf4j/log4j-over-slf4j "1.7.5"]
                                  [org.slf4j/jul-to-slf4j "1.7.5"]]}
             :production {}

             :1.4 {:dependencies [[org.clojure/clojure "1.4.0"]]}
             :1.5 {:dependencies [[org.clojure/clojure "1.5.1"]]}
             :1.6 {:dependencies [[org.clojure/clojure "1.6.0"]]}
             :1.7 {:dependencies [[org.clojure/clojure "1.7.0"]]}
             :1.8 {:dependencies [[org.clojure/clojure "1.8.0"]]}})

