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

    public void pushFront(L data){
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.addHead(data);
    }

    public L popBack(){
        DoubleLinkedList dll = new DoubleLinkedList();
        if (size < 1){
            dll.isEmpty();
        }
        dll.remove(dll.getTail());
        return (L) dll.getTail();
    }


}
