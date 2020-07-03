import os
from pprint import pprint

from gql import Client, gql
from gql.transport.requests import RequestsHTTPTransport

transport = RequestsHTTPTransport(
    url='https://api.github.com/graphql',
    use_json=True,
    headers={
        'Content-type': 'application/json',
        'Authorization': f'Bearer {os.getenv("OAUTH_TOKEN")}'
    },
    verify=True,
    retries=3,
)

client = Client(
    transport=transport,
    fetch_schema_from_transport=True,
)

query = gql('''
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
''')

pprint(
    client.execute(query, {
        'repository_owner': 'octocat',
        'repository_name': 'Hello-World'
    }))
