require "graphql/client"
require "graphql/client/http"

module GitHubAPI
  HTTP = GraphQL::Client::HTTP.new("https://api.github.com/graphql") do
    def headers(context)
      {
        "Authorization" => "Bearer #{ENV['OAUTH_TOKEN']}"
      }
    end
  end

  Schema = GraphQL::Client.load_schema(HTTP)

  Client = GraphQL::Client.new(schema: Schema, execute: HTTP)
end

QFindRecentlyClosedIssues = GitHubAPI::Client.parse <<-'GRAPHQL'
query FindRecentlyClosedIssues($repository_owner: String!,
                               $repository_name: String!,
                               $issues_last: Int = 20,
                               $issues_states: [IssueState!] = CLOSED,
                               $labels_first: Int = 5) {
  repository(owner: $repository_owner, name: $repository_name) {
    issues(last: $issues_last, states: $issues_states) {
      edges {
        node {
          title
          url
          labels(first: $labels_first) {
            edges {
              node {
                name
              }
            }
          }
        }
      }
    }
  }
}
GRAPHQL

pp GitHubAPI::Client.query(
  QFindRecentlyClosedIssues::FindRecentlyClosedIssues,
  variables: {
    repository_owner: "octocat",
    repository_name: "Hello-World"
  }
).original_hash
