# rb-github-api-client

A [GitHub GraphQL API](https://docs.github.com/en/graphql) client example implemented in Ruby using [graphql-client](https://github.com/github/graphql-client).

## Prerequisites

- [Ruby](https://www.ruby-lang.org/ja/)

- [Bundler](https://bundler.io)

## Usage

```sh
$ bundle install
$ export OAUTH_TOKEN="<GitHub personal access token>"
$ bundle exec ruby main.rb
{"data"=>
  {"repository"=>
    {"issues"=>
      {"edges"=>
        [{"node"=>
           {"title"=>"test123",
            "url"=>"https://github.com/octocat/Hello-World/issues/416",
            "labels"=>{"edges"=>[]}}},
         {"node"=>
           {"title"=>"test123",
            "url"=>"https://github.com/octocat/Hello-World/issues/417",
            "labels"=>{"edges"=>[]}}},
 ...
```
