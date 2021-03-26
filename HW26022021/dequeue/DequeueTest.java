package dequeue;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DequeueTest {

    @Test
    public void testPushBack(){
        Dequeue deq = new Dequeue();
        deq.pushFront(2);
        deq.pushBack(3);
        assertEquals(3, deq.peekBack());
    }

    @Test
    public void testPushFront(){
        Dequeue deq = new Dequeue();
        deq.pushFront(1);
        deq.pushBack(2);
        assertEquals(1, deq.peekFront());
    }

    @Test
    public void testPopBack(){
        Dequeue deq = new Dequeue();
        deq.pushFront(1);
        deq.pushFront(2);
        deq.popBack();
        assertEquals(1, deq.popBack());
    }

    @Test
    public void testPopFront(){
        Dequeue deq = new Dequeue();
        deq.pushFront(1);
        deq.pushFront(2);
        deq.popFront();
        assertEquals(2, deq.popFront());
    }

    @Test
    public void testPeekBack(){
        Dequeue deq = new Dequeue();
        deq.pushFront(1);
        deq.pushFront(2);
        deq.pushFront(3);
        deq.pushFront(4);
        deq.peekBack();
        assertEquals(4, deq.peekBack());
    }

    @Test
    public void testPeekFront(){
        Dequeue deq = new Dequeue();
        deq.pushFront(1);
        deq.pushFront(2);
        deq.pushFront(3);
        deq.pushFront(4);
        deq.peekFront();
        assertEquals(1, deq.peekFront());
    }
}
//Task 6 complete
