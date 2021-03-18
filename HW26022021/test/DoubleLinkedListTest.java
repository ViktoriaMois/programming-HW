package test;

import code.DoubleLinkedList;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DoubleLinkedListTest extends Assertions {

    private DoubleLinkedList<Integer> doublelist;

    @Before
    public void setUp() {
        doublelist = new DoubleLinkedList<Integer>();
    }

    @Test
    public void testIsEmptyReturnsTrue() {
        DoubleLinkedList<Integer> doublelist = new DoubleLinkedList<Integer>();
        assertTrue(doublelist.isEmpty());
    }

    @Test
    public void testIsEmptySizeZero() {
        DoubleLinkedList<Integer> doublelist = new DoubleLinkedList<Integer>();
        assertEquals(0, doublelist.size());
    }

    @Test(expected = ArithmeticException.class)
    @Test
    public void testAddBeforeArithmeticException() {
        doublelist.addFirst(1);
        DoubleLinkedList<Integer> doublelist = new DoubleLinkedList<Integer>();
        doublelist.addBefore(0, 2);
    }

    @Test(expected = ArithmeticException.class)
    public void testAddAfterArithmeticException() {
        doublelist.addFirst(1);
        DoubleLinkedList<Integer> doublelist = new DoubleLinkedList<Integer>();
        doublelist.addAfter(0, 2);
    }

    @Test
    public void testAddFirst() {
        for (int i = 0; i < 5; i++) {
            doublelist.addFirst(i);
    }
        assertEquals("[4, 3, 2, 1, 0]", doublelist.toString());
        DoubleLinkedList<Integer> doublelist = new DoubleLinkedList<Integer>();
    }

    @Test
    public void testAddLast(){
        DoubleLinkedList<Integer> doublelist = new DoubleLinkedList<Integer>();
        for (int i = 0; i < 5; i++) {
            doublelist.addLast(i);
        }
        assertEquals("[0, 1, 2, 3, 4]", doublelist.toString());
    }

    @Test
    public void testAddAfter(){
        DoubleLinkedList<Integer> doublelist = new DoubleLinkedList<Integer>();
        for (int i = 0; i < 5; i++){
            doublelist.addLast(i);
        }
        doublelist.addAfter(4, 10);
        doublelist.addAfter(0, 20);
        doublelist.addAfter(2, 30);

        assertEquals("[0, 20, 1, 2, 30, 3, 4, 10]", doublelist.toString());
    }

    @Test
    public void testBefore(){
        DoubleLinkedList<Integer> doublelist = new DoubleLinkedList<Integer>();
        for (int i = 0; i < 5; i++){
            doublelist.addFirst(i);
        }
        doublelist.addBefore(4, 10);
        doublelist.addBefore(0, 20);
        doublelist.addBefore(2, 30);

        assertEquals("[10, 4, 3, 30, 2, 1, 20, 0]", doublelist.toString());
    }

    @Test
    public void testRemove(){
        DoubleLinkedList<Integer> doublelist = new DoubleLinkedList<Integer>();
        for (int i = 0; i < 15; i++){
            doublelist.addLast(i);
        }
        for (int i = 0; i < 10; i++){
            doublelist.remove(i);
        }
        assertEquals("[10, 11, 12, 13, 14]", doublelist.toString());
    }

    @Test
    public void testSearchIndex(){

    }

}
