package stack;

import code.DynamicArray;

public class Stack<A> {
    private A[] array;
    private int size = 0;
    private int top = -1;
    DynamicArray<A> ar = new DynamicArray<A>(size);

    public boolean isEmpty() {
        return (top == -1);
    }

    public int getSize() {
        return size;
    }

    public void push(A value){
        array[top++] = value;
    }

    public int pop(){
        if(isEmpty()){
            throw new RuntimeException();
            return 0;
        }
        else {
            return array[top--];
        }
    }

    public A peek(){
        if(isEmpty()){
            throw new RuntimeException();
        }
        else {
            return array[top];
        }
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(ar.getData(i));
        }
    }
}
