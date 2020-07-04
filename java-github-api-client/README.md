# java-github-api-client

A [GitHub GraphQL API](https://docs.github.com/en/graphql) client example implemented in Java using [Nodes](https://github.com/americanexpress/nodes).

## Prerequisites

- [Java](http://openjdk.java.net/)

- [Gradle](https://gradle.org)

## Usage

```sh
$ export OAUTH_TOKEN="<GitHub personal access token>"
$ ./gradlew run

> Task :run
query:
    query { repository (owner:"octocat",name:"Hello-World") { issues (last:20,states:CLOSED) { edges { node { title url labels (first:5) { edges { node { name } } } } } } } }
response:
    FindRecentlyClosedIssues{repository=Repository{issues=Issues{edges=[IssueEdge{node=IssueNode{title='test123', url='https://github.com/octocat/Hello-World/issues/421', labels=Labels{edges=[]}}}, IssueEdge{node=IssueNode{title='test123', url='https://github.com/octocat/Hello-World/issues/422', labels=Labels{edges=[]}}}, IssueEdge{node=IssueNode{title='test123', url='https://github.com/octocat/Hello-World/issues/423', labels=Labels{edges=[]}}}, IssueEdge{node=IssueNode{title='-title=test', url='https://github.com/octocat/Hello-World/issues/424', labels=Labels{edges=[]}}}, IssueEdge{node=IssueNode{title='Testing Rest API', url='https://github.com/octocat/Hello-World/issues/426', labels=Labels{edges=[]}}}, IssueEdge{node=IssueNode{title='What is an issue', url='https://github.com/octocat/Hello-World/issues/431', labels=Labels{edges=[]}}}, IssueEdge{node=IssueNode{title='Testing if I can create an issue with GitHub API', url='https://github.com/octocat/Hello-World/issues/439', labels=Labels{edges=[]}}}, IssueEdge{node=IssueNode{title='Testing Github API', url='https://github.com/octocat/Hello-World/issues/440', labels=Labels{edges=[]}}}, IssueEdge{node=IssueNode{title='Testing Github API', url='https://github.com/octocat/Hello-World/issues/514', labels=Labels{edges=[]}}}, IssueEdge{node=IssueNode{title='Testing Github API', url='https://github.com/octocat/Hello-World/issues/515', labels=Labels{edges=[]}}}, IssueEdge{node=IssueNode{title='Testing Github API', url='https://github.com/octocat/Hello-World/issues/516', labels=Labels{edges=[]}}}, IssueEdge{node=IssueNode{title='Testing Github API', url='https://github.com/octocat/Hello-World/issues/517', labels=Labels{edges=[]}}}, IssueEdge{node=IssueNode{title='test the GraphQL', url='https://github.com/octocat/Hello-World/issues/519', labels=Labels{edges=[]}}}, IssueEdge{node=IssueNode{title='How are you?', url='https://github.com/octocat/Hello-World/issues/520', labels=Labels{edges=[]}}}, IssueEdge{node=IssueNode{title='Just For Test labels', url='https://github.com/octocat/Hello-World/issues/521', labels=Labels{edges=[]}}}, IssueEdge{node=IssueNode{title='Hello from the engineroom', url='https://github.com/octocat/Hello-World/issues/523', labels=Labels{edges=[]}}}, IssueEdge{node=IssueNode{title='Hello from the engineroom', url='https://github.com/octocat/Hello-World/issues/524', labels=Labels{edges=[]}}}, IssueEdge{node=IssueNode{title='Hello from the engineroom', url='https://github.com/octocat/Hello-World/issues/525', labels=Labels{edges=[]}}}, IssueEdge{node=IssueNode{title='Hello from the engineroom', url='https://github.com/octocat/Hello-World/issues/526', labels=Labels{edges=[]}}}, IssueEdge{node=IssueNode{title='Hello from the engineroom', url='https://github.com/octocat/Hello-World/issues/527', labels=Labels{edges=[]}}}]}}}

BUILD SUCCESSFUL in 2s
2 actionable tasks: 1 executed, 1 up-to-date
```

OR

```sh
$ ./gradlew shadowJar
$ export OAUTH_TOKEN="<GitHub personal access token>"
$ java -jar build/libs/java-github-api-client-all.jar
query:
    query { repository (owner:"octocat",name:"Hello-World") { issues (last:20,states:CLOSED) { edges { node { title url labels (first:5) { edges { node { name } } } } } } } }
response:
    FindRecentlyClosedIssues{repository=Repository{issues=Issues{edges=[IssueEdge{node=IssueNode{title='test123', url='https://github.com/octocat/Hello-World/issues/421', labels=Labels{edges=[]}}}, IssueEdge{node=IssueNode{title='test123', url='https://github.com/octocat/Hello-World/issues/422', labels=Labels{edges=[]}}}, IssueEdge{node=IssueNode{title='test123', url='https://github.com/octocat/Hello-World/issues/423', labels=Labels{edges=[]}}}, IssueEdge{node=IssueNode{title='-title=test', url='https://github.com/octocat/Hello-World/issues/424', labels=Labels{edges=[]}}}, IssueEdge{node=IssueNode{title='Testing Rest API', url='https://github.com/octocat/Hello-World/issues/426', labels=Labels{edges=[]}}}, IssueEdge{node=IssueNode{title='What is an issue', url='https://github.com/octocat/Hello-World/issues/431', labels=Labels{edges=[]}}}, IssueEdge{node=IssueNode{title='Testing if I can create an issue with GitHub API', url='https://github.com/octocat/Hello-World/issues/439', labels=Labels{edges=[]}}}, IssueEdge{node=IssueNode{title='Testing Github API', url='https://github.com/octocat/Hello-World/issues/440', labels=Labels{edges=[]}}}, IssueEdge{node=IssueNode{title='Testing Github API', url='https://github.com/octocat/Hello-World/issues/514', labels=Labels{edges=[]}}}, IssueEdge{node=IssueNode{title='Testing Github API', url='https://github.com/octocat/Hello-World/issues/515', labels=Labels{edges=[]}}}, IssueEdge{node=IssueNode{title='Testing Github API', url='https://github.com/octocat/Hello-World/issues/516', labels=Labels{edges=[]}}}, IssueEdge{node=IssueNode{title='Testing Github API', url='https://github.com/octocat/Hello-World/issues/517', labels=Labels{edges=[]}}}, IssueEdge{node=IssueNode{title='test the GraphQL', url='https://github.com/octocat/Hello-World/issues/519', labels=Labels{edges=[]}}}, IssueEdge{node=IssueNode{title='How are you?', url='https://github.com/octocat/Hello-World/issues/520', labels=Labels{edges=[]}}}, IssueEdge{node=IssueNode{title='Just For Test labels', url='https://github.com/octocat/Hello-World/issues/521', labels=Labels{edges=[]}}}, IssueEdge{node=IssueNode{title='Hello from the engineroom', url='https://github.com/octocat/Hello-World/issues/523', labels=Labels{edges=[]}}}, IssueEdge{node=IssueNode{title='Hello from the engineroom', url='https://github.com/octocat/Hello-World/issues/524', labels=Labels{edges=[]}}}, IssueEdge{node=IssueNode{title='Hello from the engineroom', url='https://github.com/octocat/Hello-World/issues/525', labels=Labels{edges=[]}}}, IssueEdge{node=IssueNode{title='Hello from the engineroom', url='https://github.com/octocat/Hello-World/issues/526', labels=Labels{edges=[]}}}, IssueEdge{node=IssueNode{title='Hello from the engineroom', url='https://github.com/octocat/Hello-World/issues/527', labels=Labels{edges=[]}}}]}}}
```
