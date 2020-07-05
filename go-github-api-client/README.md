# go-github-api-client

A [GitHub GraphQL API](https://docs.github.com/en/graphql) client example implemented in Go using [graphql](https://github.com/machinebox/graphql).

## Prerequisites

- [Go](https://golang.org/)

## Usage

```sh
$ export OAUTH_TOKEN="<GitHub personal access token>"
$ go run main.go
main.Response{
  Repository: struct { Issues struct { Edges []struct { Node struct { Title string; Url string; Labels struct { Edges []struct { Node struct { Name string } } } } } } }{
    Issues: struct { Edges []struct { Node struct { Title string; Url string; Labels struct { Edges []struct { Node struct { Name string } } } } } }{
      Edges: []struct { Node struct { Title string; Url string; Labels struct { Edges []struct { Node struct { Name string } } } } }{
        struct { Node struct { Title string; Url string; Labels struct { Edges []struct { Node struct { Name string } } } } }{
          Node: struct { Title string; Url string; Labels struct { Edges []struct { Node struct { Name string } } } }{
            Title:  "Hello from the engineroom",
            Url:    "https://github.com/octocat/Hello-World/issues/524",
            Labels: struct { Edges []struct { Node struct { Name string } } }{
              Edges: []struct { Node struct { Name string } }{},
            },
          },
        },
        struct { Node struct { Title string; Url string; Labels struct { Edges []struct { Node struct { Name string } } } } }{
          Node: struct { Title string; Url string; Labels struct { Edges []struct { Node struct { Name string } } } }{
            Title:  "Hello from the engineroom",
            Url:    "https://github.com/octocat/Hello-World/issues/525",
            Labels: struct { Edges []struct { Node struct { Name string } } }{
              Edges: []struct { Node struct { Name string } }{},
            },
          },
        },
 ...
```

OR

```sh
$ go build
$ export OAUTH_TOKEN="<GitHub personal access token>"
$ ./go-github-api-client
main.Response{
  Repository: struct { Issues struct { Edges []struct { Node struct { Title string; Url string; Labels struct { Edges []struct { Node struct { Name string } } } } } } }{
    Issues: struct { Edges []struct { Node struct { Title string; Url string; Labels struct { Edges []struct { Node struct { Name string } } } } } }{
      Edges: []struct { Node struct { Title string; Url string; Labels struct { Edges []struct { Node struct { Name string } } } } }{
        struct { Node struct { Title string; Url string; Labels struct { Edges []struct { Node struct { Name string } } } } }{
          Node: struct { Title string; Url string; Labels struct { Edges []struct { Node struct { Name string } } } }{
            Title:  "Hello from the engineroom",
            Url:    "https://github.com/octocat/Hello-World/issues/524",
            Labels: struct { Edges []struct { Node struct { Name string } } }{
              Edges: []struct { Node struct { Name string } }{},
            },
          },
        },
        struct { Node struct { Title string; Url string; Labels struct { Edges []struct { Node struct { Name string } } } } }{
          Node: struct { Title string; Url string; Labels struct { Edges []struct { Node struct { Name string } } } }{
            Title:  "Hello from the engineroom",
            Url:    "https://github.com/octocat/Hello-World/issues/525",
            Labels: struct { Edges []struct { Node struct { Name string } } }{
              Edges: []struct { Node struct { Name string } }{},
            },
          },
        },
 ...
```
