package stack;

import code.*;

public class Stack<A> {
    private int size = 0;
    private int top = -1;
    DynamicArray<A> array = new DynamicArray<A>(0);

    public boolean isEmpty() {
        return (size == 0);
    }

    public int getSize() {
        return size;
    }

    public void push(A value){
        if (size > 15){
            throw new RuntimeException();
        }
        array.list[top++] = value;
    }

    public A pop(){
        if(isEmpty()){
            throw new RuntimeException();
        }
        else {
            return array.list[top--];
        }
    }

    public A peek(){
        if(isEmpty()){
            throw new RuntimeException();
        }
        else {
            return array.list[top];
        }
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array.getsize());
        }
    }
}
//Task 4 complete
