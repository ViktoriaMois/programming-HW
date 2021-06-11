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

    private Node insertRec(String data, Node thisNode) {

        if (thisNode.key == null) {
            thisNode.key = data;
            return thisNode;
        }

        boolean toRight = data.compareTo(thisNode.key) > 0;
        boolean hasRightChild = thisNode.rightNode != null;
        boolean hasLeftChild = thisNode.leftNode != null;

        if (toRight) {

            if (hasRightChild) {
                return insertRec(data, thisNode.rightNode);
            } else {

                thisNode.rightNode = new Node(data);
                thisNode.rightNode.parNode = thisNode;
                return thisNode.rightNode;
            }
        }

        else {

            if (hasLeftChild) {
                return insertRec(data, thisNode.leftNode);
            } else {

                thisNode.leftNode = new Node(data);
                thisNode.leftNode.parNode = thisNode;
                return thisNode.leftNode;
            }
        }
    }

    
}
