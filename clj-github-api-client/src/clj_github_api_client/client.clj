(ns clj-github-api-client.client
  (:require [cheshire.core :as cheshire]
            [clj-http.client :as http]
            [clojure.spec.alpha :as s]
            [venia.core :as venia]))

(s/def ::url string?)
(s/def ::token string?)
(s/def ::query (s/map-of keyword? any?))
(s/def ::variables (s/map-of keyword? any?))
(s/def ::q (s/keys :req-un [::query]
                   :opt-un [::variables]))

(defn- query-json [q]
  (-> q
      (update :query venia/graphql-query)
      cheshire/generate-string))

(s/fdef run-query
  :args (s/cat :url ::url
               :token ::token
               :q ::q))

(defn run-query [url token q]
  (http/post url
             {:oauth-token token
              :body (query-json q)
              :content-type :json
              :accept :json
              :as :json
              :throw-exceptions? false}))
