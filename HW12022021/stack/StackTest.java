package stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StackTest {

        @Test
        public void init_test() {
            Stack<Integer> stack = new Stack<Integer>();
        }

        @Test
        public void testIsEmptyTrue (){
            Stack<Integer> stack = new Stack<Integer>();
            stack.pop();
            assertEquals(true, stack.isEmpty());
        }

        @Test
        public void testIsEmptyFalse(){
            Stack<Integer> stack = new Stack<Integer>();
            assertEquals(false, stack.isEmpty());
        }

        @Test
        public void testPushSize (){
            Stack<Integer> stack = new Stack<Integer>();
            stack.push(1);
            assertEquals(2, stack.getSize());
        }

        @Test
        public void testPushData (){
            Stack<Integer> stack = new Stack<Integer>();
            stack.push(1);
            assertEquals(1, stack.peek());
        }

        @Test
        public void testGetSize (){
            Stack<Integer> stack = new Stack<Integer>();
            assertEquals(1, stack.getSize());

            stack.push(751);

            assertEquals(2, stack.getSize());
        }

        @Test
        public void testPeek (){
            Stack<Integer> stack = new Stack<Integer>();
            stack.push(1);
            stack.push(2);
            assertEquals(2, stack.peek());
        }

        @Test
        public void testPopSize(){
            Stack<Integer> stack = new Stack<Integer>();
            stack.push(2);
            stack.push(3);
            stack.pop();
            assertEquals(2, stack.getSize());
        }


    }