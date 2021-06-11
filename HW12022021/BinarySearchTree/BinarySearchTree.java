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

    public Node search(String key) {
        return searchRec(key, root);
    }

    public Node getSuccessor(Node thisNode) {
        return getSuccessorRec(thisNode);
    }

    public Node getPredecessor(Node thisNode) {
        return getPredecessorRec(thisNode);
    }


    public void delete(Node thisNode) {
        if (thisNode == null) {
            return;
        }

        deleteRec(thisNode);
    }

    public Node getMin() {
        Node thisNode = root;
        while (nodeExists(thisNode, "left")) {
            thisNode = thisNode.leftNode;
        }

        return thisNode;
    }

    public Node getMax() {
        Node thisNode = root;
        while (nodeExists(thisNode, "right")) {
            thisNode = thisNode.rightNode;
        }

        return thisNode;
    }

    private Node deleteRec(Node thisNode) {

        if (thisNode.parNode == null) {
            thisNode.parNode = new Node();
            thisNode.parNode.leftNode = thisNode;
        }
        boolean isLeftChild = thisNode.parNode.leftNode == thisNode;

        if (thisNode.leftNode == null & thisNode.rightNode == null) {

            if (isLeftChild) {

                thisNode.parNode.leftNode = null;
            } else {

                thisNode.parNode.rightNode = null;
            }
            if (root.leftNode == null & root.rightNode == null) {

                root = null;
            }
        } else if (thisNode.leftNode != null & thisNode.rightNode == null) {

            if (isLeftChild) {
                thisNode.parNode.leftNode = thisNode.leftNode;
            } else {
                thisNode.parNode.rightNode = thisNode.leftNode;
            }

            thisNode.leftNode.parNode = thisNode.parNode;

            if (thisNode == root) {
                root = thisNode.leftNode;
            }
        } else if (thisNode.leftNode == null & thisNode.rightNode != null) {

            if (isLeftChild) {
                thisNode.parNode.leftNode = thisNode.rightNode;
            } else {
                thisNode.parNode.rightNode = thisNode.rightNode;
            }

            thisNode.rightNode.parNode = thisNode.parNode;

            if (thisNode == root) {
                root = thisNode.rightNode;
            }
        } else {
            Node successorNode = getSuccessor(thisNode);


            successorNode.parNode.leftNode = successorNode.rightNode;
            if (successorNode.rightNode != null) {
                successorNode.rightNode.parNode = successorNode.parNode;
            }

            successorNode.rightNode = thisNode.rightNode;
            thisNode.rightNode.parNode = successorNode;

            successorNode.parNode = thisNode.parNode;
            if (isLeftChild) {
                thisNode.parNode.leftNode = successorNode;
            } else {
                thisNode.parNode.rightNode = successorNode;
            }

            successorNode.leftNode = thisNode.leftNode;
            successorNode.leftNode.parNode = successorNode;

            thisNode.parNode = null;
            thisNode.leftNode = null;
            thisNode.rightNode = null;
            thisNode.key = null;

            if (root.key == null) {
                root = successorNode;
                root.parNode = null;
            }

            return successorNode;
        }

        return null;
    }

    private static Node getSuccessorRec(Node thisNode) {
        if (nodeExists(thisNode, "right")) {
            thisNode = thisNode.rightNode;
            while (thisNode.leftNode != null) {
                thisNode = thisNode.leftNode;
            }
            return thisNode;
        } else {
            while (nodeExists(thisNode, "parent")) {
                Node thisNodeParent = thisNode.parNode;
                if (thisNodeParent.leftNode == thisNode) {
                    return thisNodeParent;
                } else {
                    thisNode = thisNodeParent;
                }
            }
            return null;
        }
    }

    private static Node getPredecessorRec(Node thisNode) {
        if (nodeExists(thisNode, "left")) {
            thisNode = thisNode.leftNode;
            while (nodeExists(thisNode, "right")) {
                thisNode = thisNode.rightNode;
            }
            return thisNode;
        } else {

            while (nodeExists(thisNode, "parent")) {
                Node thisNodeParent = thisNode.parNode;
                if (thisNodeParent.rightNode == thisNode) {

                    return thisNodeParent;
                } else {
                    thisNode = thisNodeParent;
                }
            }
            return null;
        }
    }

    private static boolean nodeExists(Node thisNode, String whichNode) {
        boolean doesExist;

        switch (whichNode) {
            case "right" -> {
                try {
                    doesExist = thisNode.rightNode != null;
                } catch (Exception NullPointerException) {
                    doesExist = false;
                }
                return doesExist;
            }
            case "left" -> {
                try {
                    doesExist = thisNode.leftNode != null;
                } catch (Exception NullPointerException) {
                    doesExist = false;
                }
                return doesExist;
            }
            case "parent" -> {
                try {
                    doesExist = thisNode.parNode != null;
                } catch (Exception NullPointerException) {
                    doesExist = false;
                }
                return doesExist;
            }

            default -> throw new RuntimeException("Node do not exist");
        }
    }

    private static Node searchRec(String key, Node thisNode) {
        if (thisNode == null) {
            return null;
        }
        if (key.equals(thisNode.key)) {
            return thisNode;
        }
        if (key.compareTo(thisNode.key) > 0) {
            return searchRec(key, thisNode.rightNode);
        }

        else if (key.compareTo(thisNode.key) < 0) {
            return searchRec(key, thisNode.leftNode);
        }
        return null;
    }
}
