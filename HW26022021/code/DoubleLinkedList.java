public class DoubleLinkedList<L> {

    private DoubleLinkedListElement head;
    private DoubleLinkedListElement tail;
    private int size;

    public DoubleLinkedList() {
        head = null;
        tail = null;
        size = 0;
    public void addFirst(L data) {
        DoubleLinkedListElement tmp = new DoubleLinkedListElement(data, head, null);
        if (head != null) {
            head.prev = tmp;
        }
        head = tmp;
        if (tail == null) {
            tail = tmp;
        }
        size++;
    }

    public void addLast(L data) {

        DoubleLinkedListElement tmp = new DoubleLinkedListElement(data, null, tail);
        if (tail != null) {
            tail.next = tmp;
        }
        tail = tmp;
        if (head == null) {
            head = tmp;
        }
        size++;
    }
