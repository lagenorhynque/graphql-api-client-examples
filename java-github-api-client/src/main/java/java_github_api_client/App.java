package java_github_api_client;

import io.aexp.nodes.graphql.*;
import java_github_api_client.entity.FindRecentlyClosedIssues;
import java_github_api_client.entity.IssueState;

import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        GraphQLTemplate graphQLTemplate = new GraphQLTemplate();
        GraphQLRequestEntity requestEntity = GraphQLRequestEntity.Builder()
                .url("https://api.github.com/graphql")
                .arguments(
                        new Arguments(
                                "repository",
                                new Argument<>("owner", "octocat"),
                                new Argument<>("name", "Hello-World")
                        ),
                        new Arguments("repository.issues", new Argument<>("last", 20)),
                        new Arguments("repository.issues", new Argument<>("states", IssueState.CLOSED)),
                        new Arguments("repository.issues.edges.node.labels", new Argument<>("first", 5))
                )
                .request(FindRecentlyClosedIssues.class)
                .headers(Map.of("Authorization", "Bearer " + System.getenv("OAUTH_TOKEN")))
                .build();
        System.out.printf("query:%n    %s%n", requestEntity.getRequest());

        GraphQLResponseEntity<FindRecentlyClosedIssues> responseEntity = graphQLTemplate.query(requestEntity, FindRecentlyClosedIssues.class);
        System.out.printf("response:%n    %s%n", responseEntity.getResponse());
    }
}
