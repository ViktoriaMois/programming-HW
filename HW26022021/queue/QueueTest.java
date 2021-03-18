package queue;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QueueTest {

    @Test
    public void enqueueTestData(){
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(15);
        queue.dequeue();
        assertEquals(15, queue.peek());
    }

    @Test
    public void enqueueTestSize(){
        Queue queue = new Queue();
        queue.enqueue(1);
        assertEquals(1, queue.getSize());

        queue.enqueue(2);
        assertEquals(2, queue.getSize());

    }

    @Test
    public void dequeueTestData(){
        Queue queue = new Queue();
        queue.enqueue(5);
        queue.enqueue(15);
        queue.dequeue();
        assertEquals(15, queue.peek());
    }

    @Test
    public void dequeueTestSize(){
        Queue queue = new Queue();
        queue.enqueue(5);
        queue.enqueue(4);
        queue.enqueue(3);
        queue.dequeue();
        assertEquals(2, queue.getSize());

        queue.dequeue();
        assertEquals(1, queue.getSize());
    }

}
