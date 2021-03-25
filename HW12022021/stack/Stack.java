package stack;

import code.DynamicArray;

public class Stack<A> {
    int size = 1;
    DynamicArray<A> ar = new DynamicArray<A>(size);

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public void push(A value){
        ar.addData(value);
        size++;
    }

}
