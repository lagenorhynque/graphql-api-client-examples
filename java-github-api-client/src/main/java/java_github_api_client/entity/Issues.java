package java_github_api_client.entity;

import java.util.List;

public class Issues {
    private List<IssueEdge> edges;

    public List<IssueEdge> getEdges() {
        return edges;
    }

    public void setEdges(List<IssueEdge> edges) {
        this.edges = edges;
    }

    @Override
    public String toString() {
        return "Issues{" +
                "edges=" + edges +
                '}';
    }
}
