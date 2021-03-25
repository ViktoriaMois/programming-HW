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

    }