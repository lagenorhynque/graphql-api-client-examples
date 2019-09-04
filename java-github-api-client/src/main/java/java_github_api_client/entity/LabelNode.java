package java_github_api_client.entity;

public class LabelNode {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "LabelNode{" +
                "name='" + name + '\'' +
                '}';
    }
}
