package code;

public class DoubleLinkedListElement<L> {

L data;
DoubleLinkedListElement<L> next;
DoubleLinkedListElement<L> prev;

public DoubleLinkedListElement (DoubleLinkedListElement<L> prev, L data, DoubleLinkedListElement<L> next){
    this.data = data;
    this.next = next;
    this.prev = prev;

}

}
