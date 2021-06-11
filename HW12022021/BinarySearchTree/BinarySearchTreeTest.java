package BinarySearchTree;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTreeTest {
    @Test
    public void insertionPositive() {
        BinarySearchTree tree = new BinarySearchTree("абвгдежз");
        tree.insert("абв");
        tree.insert("абвг");
        tree.insert("абвгдежзикл");
        tree.insert("абвгдежзи");
        tree.insert("аб");
        tree.insert("абвгдежзиклмнопрстуфхц");
        tree.insert("абвгдёжзиклмноп");
        tree.insert("абвгд");
        tree.insert("а");
        tree.insert("абвгдёжзиклмно");
        tree.insert("абвгдёжзиклмнопр");

        String expected = "абвгдежзиклмнопрстуфхц";
        String actual = tree.getSuccessor(tree.search("абвгдежзикл")).getKey();
        assertEquals(expected, actual);

        expected = "абвгдежзи";
        actual = tree.getSuccessor(tree.search("абвгдежз")).getKey();
        assertEquals(expected, actual);
    }

    @Test
    public void minFound() {
        BinarySearchTree tree = new BinarySearchTree("абвгдежз");
        tree.insert("абв");
        tree.insert("абвг");
        tree.insert("абвгдежзикл");
        tree.insert("абвгдежзи");
        tree.insert("аб");
        tree.insert("абвгдежзиклмнопрстуфхц");
        tree.insert("абвгдёжзиклмноп");
        tree.insert("абвгд");
        tree.insert("а");
        tree.insert("абвгдёжзиклмно");
        tree.insert("абвгдёжзиклмнопр");

        String expected = "а";
        String actual = tree.getMin().getKey();
        assertEquals(expected, actual);
    }

    @Test
    public void maxFound() {
        BinarySearchTree tree = new BinarySearchTree("абвгдежз");
        tree.insert("абв");
        tree.insert("абвг");
        tree.insert("абвгдежзикл");
        tree.insert("абвгдежзи");
        tree.insert("аб");
        tree.insert("абвгдежзиклмнопрстуфхц");
        tree.insert("абвгдёжзиклмноп");
        tree.insert("абвгд");
        tree.insert("а");
        tree.insert("абвгдёжзиклмно");
        tree.insert("абвгдёжзиклмнопр");

        String expected = "абвгдёжзиклмнопр";
        String actual = tree.getMax().getKey();
        assertEquals(expected, actual);
    }

    @Test
    public void thereIsSuccessor() {
        BinarySearchTree tree = new BinarySearchTree("абвгдежз");
        tree.insert("абв");
        tree.insert("абвг");
        tree.insert("абвгдежзикл");
        tree.insert("абвгдежзи");
        tree.insert("аб");
        tree.insert("абвгдежзиклмнопрстуфхц");
        tree.insert("абвгдёжзиклмноп");
        tree.insert("абвгд");
        tree.insert("а");
        tree.insert("абвгдёжзиклмно");
        tree.insert("абвгдёжзиклмнопр");

        String expected = "абвгдежзиклмнопрстуфхц";
        String actual = tree.getSuccessor(tree.search("абвгдежзикл")).getKey();
        assertEquals(expected, actual);

        expected = "абвгдежзи";
        actual = tree.getSuccessor(tree.search("абвгдежз")).getKey();
        assertEquals(expected, actual);
    }

    @Test
    public void thereIsNoSuccessor() {
        BinarySearchTree tree = new BinarySearchTree("абвгдежз");
        tree.insert("абв");
        tree.insert("абвг");
        tree.insert("абвгдежзикл");
        tree.insert("абвгдежзи");
        tree.insert("аб");
        tree.insert("абвгдежзиклмнопрстуфхц");
        tree.insert("абвгдёжзиклмноп");
        tree.insert("абвгд");
        tree.insert("а");
        tree.insert("абвгдёжзиклмно");
        tree.insert("абвгдёжзиклмнопр");

        Object expected = null;
        Object actual = tree.getSuccessor(tree.search("абвгдёжзиклмнопрст"));
        assertEquals(expected, actual);
    }

    @Test
    public void thereIsPredecessor() {
        BinarySearchTree tree = new BinarySearchTree("абвгдежз");
        tree.insert("абв");
        tree.insert("абвг");
        tree.insert("абвгдежзикл");
        tree.insert("абвгдежзи");
        tree.insert("аб");
        tree.insert("абвгдежзиклмнопрстуфхц");
        tree.insert("абвгдёжзиклмноп");
        tree.insert("абвгд");
        tree.insert("а");
        tree.insert("абвгдёжзиклмно");
        tree.insert("абвгдёжзиклмнопр");
        ;

        String expected = "абв";
        String actual = tree.getPredecessor(tree.search("абвг")).getKey();
        assertEquals(expected, actual);
    }

    @Test
    public void thereIsNoPredecessor() {
        BinarySearchTree tree = new BinarySearchTree("абвгдежз");
        tree.insert("абв");
        tree.insert("абвг");
        tree.insert("абвгдежзикл");
        tree.insert("абвгдежзи");
        tree.insert("аб");
        tree.insert("абвгдежзиклмнопрстуфхц");
        tree.insert("абвгдёжзиклмноп");
        tree.insert("абвгд");
        tree.insert("а");
        tree.insert("абвгдёжзиклмно");
        tree.insert("абвгдёжзиклмнопр");

        Object expected = null;
        Object actual = tree.getPredecessor(tree.search("a"));
        assertEquals(expected, actual);
    }

    @Test
    public void insertionIfYes() {
        BinarySearchTree tree = new BinarySearchTree("абвгдежз");
        tree.insert("абв");
        tree.insert("абвг");
        tree.insert("абвгдежзикл");
        tree.insert("абвгдежзи");
        tree.insert("аб");
        tree.insert("абвгдежзиклмнопрстуфхц");
        tree.insert("абвгдёжзиклмноп");
        tree.insert("абвгд");
        tree.insert("а");
        tree.insert("абвгдёжзиклмно");
        tree.insert("абвгдёжзиклмнопр");


        String expected = null;
        Object actual = tree.getSuccessor(tree.search("абвгдёжзиклмнопр"));
        assertEquals(expected, actual);
    }

    @Test
    public void searchingIfFound() {

        BinarySearchTree tree = new BinarySearchTree("абвгдежз");
        tree.insert("абв");
        tree.insert("абвг");
        tree.insert("абвгдежзикл");
        tree.insert("абвгдежзи");
        tree.insert("аб");
        tree.insert("абвгдежзиклмнопрстуфхц");
        tree.insert("абвгдёжзиклмноп");
        tree.insert("абвгд");
        tree.insert("а");
        tree.insert("абвгдёжзиклмно");
        tree.insert("абвгдёжзиклмнопр");

        String expected = "абвг";
        String actual = tree.getSuccessor(tree.search("абв")).getKey();
        assertEquals(expected, actual);
    }

    @Test
    public void searchingIfNotFound() {

        BinarySearchTree tree = new BinarySearchTree("абвгдежз");
        tree.insert("абв");
        tree.insert("абвг");
        tree.insert("абвгдежзикл");
        tree.insert("абвгдежзи");
        tree.insert("аб");
        tree.insert("абвгдежзиклмнопрстуфхц");
        tree.insert("абвгдёжзиклмноп");
        tree.insert("абвгд");
        tree.insert("а");
        tree.insert("абвгдёжзиклмно");
        tree.insert("абвгдёжзиклмнопр");

        Object expected = null;
        Object actual = tree.search("абоба");
        assertEquals(expected, actual);
    }

    @Test
    public void deletionIfNotFound() {

        BinarySearchTree tree = new BinarySearchTree("абвгдежз");
        tree.insert("абв");
        tree.insert("абвг");
        tree.insert("абвгдежзикл");
        tree.insert("абвгдежзи");
        tree.insert("аб");
        tree.insert("абвгдежзиклмнопрстуфхц");
        tree.insert("абвгдёжзиклмноп");
        tree.insert("абвгд");
        tree.insert("а");
        tree.insert("абвгдёжзиклмно");
        tree.insert("абвгдёжзиклмнопр");
        tree.delete(tree.search("прст"));

        String expected = "аб";
        String actual = tree.getSuccessor(tree.search("а")).getKey();
        assertEquals(expected, actual);
    }
}