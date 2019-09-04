package java_github_api_client.entity;

import io.aexp.nodes.graphql.annotations.GraphQLArgument;
import io.aexp.nodes.graphql.annotations.GraphQLArguments;

public class FindRecentlyClosedIssues {
    @GraphQLArguments({
            @GraphQLArgument(name = "owner", type = "String"),
            @GraphQLArgument(name = "name", type = "String")
    })
    private Repository repository;

    public Repository getRepository() {
        return repository;
    }

    public void setRepository(Repository repository) {
        this.repository = repository;
    }

    @Override
    public String toString() {
        return "FindRecentlyClosedIssues{" +
                "repository=" + repository +
                '}';
    }
}
