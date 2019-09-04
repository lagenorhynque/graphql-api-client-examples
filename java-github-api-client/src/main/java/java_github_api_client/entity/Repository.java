package java_github_api_client.entity;

import io.aexp.nodes.graphql.annotations.GraphQLArgument;
import io.aexp.nodes.graphql.annotations.GraphQLArguments;

public class Repository {
    @GraphQLArguments({
            @GraphQLArgument(name = "last", type = "Integer"),
            @GraphQLArgument(name = "states")
    })
    private Issues issues;

    public Issues getIssues() {
        return issues;
    }

    public void setIssues(Issues issues) {
        this.issues = issues;
    }

    @Override
    public String toString() {
        return "Repository{" +
                "issues=" + issues +
                '}';
    }
}
