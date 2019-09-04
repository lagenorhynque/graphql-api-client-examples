package java_github_api_client.entity;

import io.aexp.nodes.graphql.annotations.GraphQLArgument;
import io.aexp.nodes.graphql.annotations.GraphQLArguments;

public class IssueNode {
    private String title;
    private String url;
    @GraphQLArguments({
            @GraphQLArgument(name = "first", type = "Integer")
    })
    private Labels labels;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Labels getLabels() {
        return labels;
    }

    public void setLabels(Labels labels) {
        this.labels = labels;
    }

    @Override
    public String toString() {
        return "IssueNode{" +
                "title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", labels=" + labels +
                '}';
    }
}
