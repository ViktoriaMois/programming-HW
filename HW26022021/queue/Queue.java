package queue;

import code.DoubleLinkedList;
import code.DoubleLinkedListElement;

public class Queue {

    DoubleLinkedList doublelist = new DoubleLinkedList<Integer>();

    int size = 0;

    public int getSize(){
        return size;
    }

    public Object peek(){
        return doublelist.getHead().getData();
    }

    public void enqueue(int data){
        doublelist.addTail(data);
        size = size + 1;
    }

    public void dequeue(){
        DoubleLinkedListElement elementToSet = doublelist.getElementByNumber();
        doublelist.setElementByNumber(0, elementToSet);
        size--;
    }

    public void printAll(){
        doublelist.printAll();
    }

}
