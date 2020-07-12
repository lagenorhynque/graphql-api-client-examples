package java_github_api_client2;

public class App {
    public static void main(String[] args) {
        var query = GitHubAPIQueries.FindRecentlyClosedIssues
                .builder("octocat", "Hello-World").build();
        var result = query.request("https://api.github.com/graphql")
                .withBearerAuthorization(System.getenv("OAUTH_TOKEN"))
                .post();
        System.out.println(result.write().toJson());
    }
}
