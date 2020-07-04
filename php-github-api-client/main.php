<?php
require_once(__DIR__ . '/vendor/autoload.php');

$client = new \GraphQL\Client(
    'https://api.github.com/graphql',
    ['Authorization' => 'Bearer ' . getenv('OAUTH_TOKEN')]
);

$query = <<<'GRAPHQL'
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
GRAPHQL;

var_export($client->runRawQuery($query, true, [
    'repository_owner' => 'octocat',
    'repository_name' => 'Hello-World'
])->getData());
