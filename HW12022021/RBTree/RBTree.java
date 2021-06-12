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
}
