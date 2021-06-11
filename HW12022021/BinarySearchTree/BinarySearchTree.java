package BinarySearchTree;

import java.util.Objects;

public class BinarySearchTree {
    public Node root;

    public BinarySearchTree(String key) {
        root = new Node(key);
    }

    public void insert(String key) {
        if (root.key == null) {
            root = new Node(key);
            return;
        }
    }
}
