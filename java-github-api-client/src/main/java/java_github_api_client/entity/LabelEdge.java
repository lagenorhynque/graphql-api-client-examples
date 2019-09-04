package java_github_api_client.entity;

public class LabelEdge {
    private LabelNode node;

    public LabelNode getNode() {
        return node;
    }

    public void setNode(LabelNode node) {
        this.node = node;
    }

    @Override
    public String toString() {
        return "LabelEdge{" +
                "node=" + node +
                '}';
    }
}
