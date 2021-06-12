package RBTree;
import RBTree.*;

import java.time.chrono.ThaiBuddhistChronology;

public class RBTree {
    Node root;
    private RBTree parent;
    private RBTree header;
    private RBTree grandpar;
    private RBTree greatpar;

    static final int Red = 1;
    static final int Black = 0;

    RBTree() {
        root = null;
    }

    public int Max(int a, int b) {
        return Math.max(a, b);
    }

    public int getHeight(Node node) {
        if (node == null) return 0;

        return  node.height;
    }

    private void RBTransplant(Node r, Node b) {
        if (r.parentNode == null) {
            root = b;
        } else if (r == r.parentNode.leftNode) {
            r.parentNode.rightNode = b;
        }
        b.parentNode = r.parentNode;
    }

    private Node rotateRight(Node y) {
        Node x = y.leftNode;
        Node t = x.rightNode;

        x.rightNode = y;
        y.leftNode = t;

        y.height = Max(getHeight(y.leftNode), getHeight(y.rightNode)) + 1;
        x.height = Max(getHeight(x.leftNode), getHeight(x.rightNode)) + 1;

        return x;
    }

    public Node rotateLeft(Node x) {
        Node y = x.rightNode;
        Node t = y.leftNode;

        y.leftNode = x;
        x.rightNode = t;

        x.height = Max(getHeight(x.leftNode), getHeight(x.rightNode)) + 1;
        y.height = Max(getHeight(y.leftNode), getHeight(y.rightNode)) + 1;

        return y;
    }

    boolean search(String key) {
        root = searchRec(root, key);
        return root != null;
    }

    public Node getSuccessor(Node root, String value) {
        return successorRec(root, value);
    }

    public Node getPredecessor(Node root, String value) {
        return predecessorRec(root, value);
    }

    public Node searchRec(Node root, String key) {
        if (root == null || root.key.equals(key)) {
        return root;
        }
        if (key.compareTo(root.key) <0) {
            return searchRec(root.leftNode, key);
        }
        return  searchRec(root.rightNode, key);
    }

    public Node minValue(Node root) {
        Node minVal = root;
        while (root.leftNode != null) {
            minVal = root.leftNode;
            root = root.leftNode;
        }
        return minVal;
    }

    public Node maxValue(Node root) {
        Node maxVal = root;
        while (root.rightNode != null) {
            maxVal = root.rightNode;
            root = root.rightNode;
        }
        return maxVal;
    }

    public Node successorRec(Node root, String value) {
        Node current = searchRec(root, value);
        if (current == null) {
            return current;
        }

        if (current.rightNode != null) {
            return minValue(current.rightNode);
        } else {
            Node tmp = root.leftNode;
            while (tmp.rightNode != null)
                tmp = tmp.rightNode;
            current = tmp;
        }
        return current;
    }

    public Node predecessorRec(Node root, String value) {
        Node pre = null;
        while (root != null) {
            if (root.key.equals(value)) {
                if (root.leftNode != null) {
                    pre = root.leftNode;
                    while (pre.leftNode != null)
                        pre = pre.rightNode;
                }
                return pre;
            }
            else if (value.compareTo(root.key) > 0) {
                    pre = root;
            root = root.rightNode;
            }
        }
        return pre;
    }

    
}
