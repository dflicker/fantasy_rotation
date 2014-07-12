(defproject fantasy_rotation "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [ring "1.3.0"]
                 [compojure "1.1.8"]
                 [korma "0.3.2"]
                 [hiccup "1.0.5"]]
  :main ^:skip-aot fantasy-rotation.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
