package main

import (
	"context"
	"log"
	"os"

	"github.com/k0kubun/pp"
	"github.com/machinebox/graphql"
)

type Response struct {
	Repository struct {
		Issues struct {
			Edges []struct {
				Node struct {
					Title  string
					Url    string
					Labels struct {
						Edges []struct {
							Node struct {
								Name string
							}
						}
					}
				}
			}
		}
	}
}

func main() {
	client := graphql.NewClient("https://api.github.com/graphql")

	req := graphql.NewRequest(`
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
`)
	req.Header.Add("Authorization", "Bearer "+os.Getenv("OAUTH_TOKEN"))
	req.Var("repository_owner", "octocat")
	req.Var("repository_name", "Hello-World")

	ctx := context.Background()

	var res Response
	if err := client.Run(ctx, req, &res); err != nil {
		log.Fatal(err)
	}
	pp.Println(res)
}
