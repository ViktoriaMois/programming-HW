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

}
