(defproject clj-github-api-client "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[cheshire "5.9.0"]
                 [clj-http "3.10.0"]
                 [org.clojure/clojure "1.10.1"]
                 [vincit/venia "0.2.5"]]
  :main ^:skip-aot clj-github-api-client.core
  :profiles {:uberjar {:aot :all
                       :uberjar-name "clj-github-api-client.jar"}})
