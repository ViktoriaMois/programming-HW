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

    public void pop(){
        ar.resize(size - 1);
        size--;
    }

    public A peek(){
        return ar.getData(size - 1);
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(ar.getData(i));
        }
    }
}
