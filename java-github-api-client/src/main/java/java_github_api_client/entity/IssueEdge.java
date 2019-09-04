package java_github_api_client.entity;

public class IssueEdge {
    private IssueNode node;

    public IssueNode getNode() {
        return node;
    }

    public void setNode(IssueNode node) {
        this.node = node;
    }

    @Override
    public String toString() {
        return "IssueEdge{" +
                "node=" + node +
                '}';
    }
}
