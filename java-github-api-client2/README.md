# java-github-api-client2

A [GitHub GraphQL API](https://docs.github.com/en/graphql) client example implemented in Java using [Manifold](https://github.com/manifold-systems/manifold).

## Prerequisites

- [Java](http://openjdk.java.net/)
    - `java -version` >= 11

- [Gradle](https://gradle.org)

## Usage

```sh
$ export OAUTH_TOKEN="<GitHub personal access token>"
$ ./gradlew run
```

OR

```sh
$ ./gradlew shadowJar
$ export OAUTH_TOKEN="<GitHub personal access token>"
$ java -jar build/libs/java-github-api-client2-all.jar
```
