package RBTree;
import RBTree.*;

public class Node {
    String key;
    Node parentNode;
    Node leftNode;
    Node rightNode;
    int nodeColor;

    int height;

    public Node(String key) {
        leftNode = rightNode = null;
        height = 1;
    }

    public String key() {
        return key;
    }

    public int getHeight(Node node) {
        if (node == null) return 0;

        return  node.height;
    }

    public int getBalance(Node node) {
        if (node == null) return 0;

        return getHeight(node.leftNode) - getHeight(node.rightNode);
    }

    public String preOrder(Node root) {
        String a;
        if (root != null) {
            a = root.key;
            preOrder(root.leftNode);
            preOrder(root.rightNode);
            return  a;
        }
        return null;
    }

}
