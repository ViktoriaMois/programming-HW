package ListHashTable;

import code.DoubleLinkedList;

public class ListHashTable {
    int tablesize;
    DoubleLinkedList<TableObject>[] table;

    protected String outOfBoundsException = "The key is out of bounds.";

    public ListHashTable(int size) {
        tablesize = size;
        table = new DoubleLinkedList[tablesize];
        for (int i = 0; i < tablesize; i++) {
            table[i] = new DoubleLinkedList<TableObject>();
        }
    }

    public void insert(int data) {
        int key = data % tablesize;
        TableObject newObject = new TableObject(key, data);
        table[key].addTail(newObject);
    }

    public void remove(int data) {
        int number = data % tablesize;
        for (int i = 0; i < table[number].size(); i++) {
            if (data == table[number].getValueByIndex(i).data) {
                table[number].removeElement(i);
            }
        }
    }

    public DoubleLinkedList<TableObject> get(int data) {
        int index = data % tablesize;
        return table[index];
    }
}

