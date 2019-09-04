package java_github_api_client.entity;

import java.util.List;

public class Labels {
    private List<LabelEdge> edges;

    public List<LabelEdge> getEdges() {
        return edges;
    }

    public void setEdges(List<LabelEdge> edges) {
        this.edges = edges;
    }

    @Override
    public String toString() {
        return "Labels{" +
                "edges=" + edges +
                '}';
    }
}
