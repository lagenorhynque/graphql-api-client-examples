# php-github-api-client

A [GitHub GraphQL API](https://docs.github.com/en/graphql) client example implemented in PHP using [php-graphql-client](https://github.com/mghoneimy/php-graphql-client).

## Prerequisites

- [PHP](https://www.php.net/)

- [Composer](https://getcomposer.org/)

## Usage

```sh
$ composer install
$ export OAUTH_TOKEN="<GitHub personal access token>"
$ php main.php
array (
  'repository' =>
  array (
    'issues' =>
    array (
      'edges' =>
      array (
        0 =>
        array (
          'node' =>
          array (
            'title' => 'Hello from the engineroom',
            'url' => 'https://github.com/octocat/Hello-World/issues/524',
            'labels' =>
            array (
              'edges' =>
              array (
              ),
            ),
          ),
        ),
        1 =>
        array (
          'node' =>
          array (
            'title' => 'Hello from the engineroom',
            'url' => 'https://github.com/octocat/Hello-World/issues/525',
            'labels' =>
            array (
              'edges' =>
              array (
              ),
            ),
          ),
        ),
 ...
```
