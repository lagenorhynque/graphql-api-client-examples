# py-github-api-client

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
