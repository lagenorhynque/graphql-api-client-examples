# py-github-api-client

A [GitHub GraphQL API](https://docs.github.com/en/graphql) client example implemented in Python using [GQL](https://github.com/graphql-python/gql).

## Prerequisites

- [Python](https://www.python.org/)

- [Pipenv](https://pipenv.pypa.io/en/latest/)

## Usage

```sh
$ pipenv sync
$ export OAUTH_TOKEN="<GitHub personal access token>"
$ pipenv run python main.py
{'repository': {'issues': {'edges': [{'node': {'labels': {'edges': []},
                                               'title': 'Hello from the '
                                                        'engineroom',
                                               'url': 'https://github.com/octocat/Hello-World/issues/524'}},
                                     {'node': {'labels': {'edges': []},
                                               'title': 'Hello from the '
                                                        'engineroom',
                                               'url': 'https://github.com/octocat/Hello-World/issues/525'}},
 ...
```
