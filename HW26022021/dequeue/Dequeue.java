package dequeue;

import code.DoubleLinkedList;
import code.DoubleLinkedListElement;

public class Dequeue<L> {

    DoubleLinkedList doublelist = new DoubleLinkedList();

    int size = 0;

    public int getSize(){
        return size;
    }

    public void pushBack(L data){
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.addTail(data);
    }


}
