package code;

public class DoubleLinkedListElement<L> {

L data;
DoubleLinkedListElement<L> next;
DoubleLinkedListElement<L> prev;

public DoubleLinkedListElement(L data, DoubleLinkedListElement<L> next, DoubleLinkedListElement<L> prev){
    this.data = data;
    this.next = next;
    this.prev = prev;

}

public DoubleLinkedListElement getNextElement(){
    return next;
}

    public DoubleLinkedListElement getPrevElement(){
        return prev;
    }
public L getData(){
    return data;
}

}
