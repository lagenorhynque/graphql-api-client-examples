(ns clj-github-api-client.core
  (:gen-class)
  (:require [clj-github-api-client.client :as client]
            [clojure.pprint :refer [pprint]]))

(def github-api-url "https://api.github.com/graphql")

(def q-find-recently-closed-issues
  #:venia{:operation #:operation{:type :query
                                 :name "FindRecentlyClosedIssues"}
          :queries [[:repository {:owner :$repository_owner
                                  :name :$repository_name}
                     [[:issues {:last :$issues_last
                                :states :$issues_states}
                       [[:edges
                         [[:node
                           [:title
                            :url
                            [:labels {:first :$labels_first}
                             [[:edges
                               [[:node
                                 [:name]]]]]]]]]]]]]]]
          :variables [#:variable{:name "repository_owner"
                                 :type :String!}
                      #:variable{:name "repository_name"
                                 :type :String!}
                      #:variable{:name "issues_last"
                                 :type :Int
                                 :default 20}
                      #:variable{:name "issues_states"
                                 :type (keyword "[IssueState!]")
                                 :default :CLOSED}
                      #:variable{:name "labels_first"
                                 :type :Int
                                 :default 5}]})

(defn -main [& args]
  (-> (client/run-query github-api-url
                        (System/getenv "OAUTH_TOKEN")
                        {:query q-find-recently-closed-issues
                         :variables {:repository_owner "octocat"
                                     :repository_name "Hello-World"}})
      :body
      pprint))
