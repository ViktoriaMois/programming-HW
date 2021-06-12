package code;

public class DoubleLinkedList<L> {


    private DoubleLinkedListElement head;
    private DoubleLinkedListElement tail;
    private int size;
    public static String outOfRangeError = "out of range";
    public static String listIsEmptyError = "list is empty";

    public L getData(int number){
        if (number < 0 || number > size) {
            throw new RuntimeException();
        }
        DoubleLinkedListElement<L> counter = head;
        for (int currData = 0; currData < number; currData++){
            counter = counter.getNextElement();
        }
        return counter.data;
    }

    public DoubleLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public DoubleLinkedListElement<L> getTail(){
        return tail;
    }

    public DoubleLinkedListElement<L> getHead(){
        return head;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void setElementByNumber(int number, DoubleLinkedListElement element){
        if (number < 0 || number > size){
            throw new RuntimeException(outOfRangeError);
        }
        DoubleLinkedListElement counter = head;
        for (int currNumber = 0; currNumber < number; currNumber++) {
            counter = counter.getNextElement();
        }
        if (counter.prev == null){
            head = counter.next;
            return;
        }
        if (counter.next == null){
            tail = counter;
        }
        counter.prev.next = element;
    }

    public DoubleLinkedListElement getElementByNumber(int number){
        if (number < 0 || number > size){
            throw new RuntimeException(outOfRangeError);
        }
        DoubleLinkedListElement counter = head;
        for (int currNumber = 0; currNumber < number; currNumber++){
            counter = counter.getNextElement();
        }
        return counter;
    }

    public L getValueByIndex(int index) {

        if (index < 0 || index > size) {
            throw new RuntimeException(outOfRangeError);
        }

        int currentIndex = 0;

        DoubleLinkedListElement<L> iterator = head;

        while (currentIndex != index) {
            iterator = iterator.getNextElement();
            currentIndex++;
        }

        return iterator.data;
    }


    public Object getLast() {
        if(tail == null){return null;}
        return tail.data;
    }

    public Object getFirst() {
        if(head == null){return null;}
        return head.data;
    }

    public void addHead(L data) {
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

    public void addTail(L data) {
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

    private void throwsException(){
            throw new RuntimeException();
    }

//    public void addBefore (L x, L y){
//        if (isEmpty())
//            throw new ArithmeticException(x.toString());
//        DoubleLinkedListElement<L> current = head;
//        while (current != null && !current.data.equals(x))
//            current = current.next;
//        if (current == null)
//            throw new ArithmeticException(x.toString());
//        DoubleLinkedListElement<L> tmp = new DoubleLinkedListElement<L>(current.prev, y, current);
//        if (current.prev != null)
//            current.prev.next = tmp;
//        else head = tmp;
//        current.prev = tmp;
//
//        size++;
//    }
//
//    public void addAfter (L x, L y){
//        if (isEmpty())
//            throw new ArithmeticException(x.toString());
//        DoubleLinkedListElement<L> current = head;
//        while (current != null && !current.data.equals(x))
//            current = current.next;
//        if (current == null)
//            throw new ArithmeticException(x.toString());
//        DoubleLinkedListElement<L> tmp = new DoubleLinkedListElement<L>(current, y, current.next);
//        if (current.next != null)
//            current.next.prev = tmp;
//        current.next = tmp;
//
//        size++;
//    }

    public void remove (L x){
        if (head.data.equals(x)){
            head = head.next;
            return;
        }
        DoubleLinkedListElement<L> current = head;
        while (current != null && !current.data.equals(x))
            current = current.next;
        if (current == null)
            throw new ArithmeticException(x.toString());
        if (current.next != null)
            current.next.prev = current.prev;
        current.prev.next = current.next;

        size--;
    }

    public void removeElement(int id) {
        DoubleLinkedListElement<L> temp = head;
        temp.next = head.next;
        int counter = 0;

        while (temp.next != null && counter != id) {

            temp = temp.next;
            counter++;
        }

        if (counter == id) {

            if (temp.prev == null && temp.next == null) {
                head = null;
                tail = null;
                size--;
                return;

            }

            if (temp.prev == null) {

                head = temp.next;
                head.prev = null;
                size--;
                return;
            }

            if (temp.next == null) {

                tail = temp.prev;
                tail.next = null;
                size--;
                return;
            }

            DoubleLinkedListElement<L> prevElement = temp.prev;
            DoubleLinkedListElement<L> nextElement = temp.next;
            nextElement.prev = prevElement;
            prevElement.next = nextElement;
            size--;
            return;
        }

        throw new IllegalArgumentException(outOfRangeError);
    }


    public void searchIndex(L data) {
        int i = 1;
        boolean point = false;
        DoubleLinkedListElement current = head;
        if (head == null) {
            return;
        }
        while (current != null) {
            if (current.data == data) {
                point = true;
                break;
            }
            current = current.next;
            i++;
        }
        if (point)
            System.out.println("Element found. index:" +i);
        else
            System.out.println("Element not found");
    }


    public void printAll() {
        if (isEmpty()){
            throw new RuntimeException(listIsEmptyError);
        }
        DoubleLinkedListElement counter = head;
        counter.setNextElement(head.getNextElement());

        while (counter.getNextElement() != null){
            System.out.println(counter.getData() + " ");
            counter = counter.getNextElement();
        }
        System.out.println(counter.getData());
    }
}

//Task 3 complete
