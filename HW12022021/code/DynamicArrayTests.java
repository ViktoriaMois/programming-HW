package code;

import code.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

public class DynamicArrayTests extends Assertions {

    @Test
    public void init_sizeDefault() {
        DynamicArray array = new DynamicArray();
        assertEquals(array.DEFAULT_SIZE, array.getsize());
    }


    @Test
    public void testGetSize(){
        DynamicArray array = new DynamicArray(10);
        assertEquals(10, array.list.length);
    }

    @Test
    public void testSize(){
        DynamicArray array = new DynamicArray(14);
        assertEquals(14, array.getsize());
    }

    @Test
    public void testAddData(){
        DynamicArray array = new DynamicArray(1);
        array.add(345);
        assertEquals(345, array.get(1));
    }

    @Test
    public void testInsertIndex() {
        DynamicArray array = new DynamicArray(1);
        array.set(0, 10);
        array.insert(0, 5);
        assertEquals(1, array.findFirst(10));
    }

    @Test
    public void testInsertData() {
        DynamicArray array = new DynamicArray(1);
        array.set(0, 10);
        array.insert(0, 5);
        assertEquals(10, array.get(1));
    }

    @Test
    public void testFindFirst(){
        DynamicArray array = new DynamicArray(14);
        for (int i = 0; i < array.getsize(); i++) {
            array.set(i, "empty");
        }
        array.set(1, 15);
        array.set(2, 25);
        assertEquals(1, array.findFirst(15));
    }

    @Test
    public void testFindLast(){
        DynamicArray array = new DynamicArray(14);
        for (int i = 0; i < array.getsize(); i++){
            array.set(i, "empty");
        }
        array.set(1, 15);
        array.set(2, 25);
        assertEquals(2, array.findLast(25));
    }

    @Test
    public void testRemove(){
        DynamicArray array = new DynamicArray(3);

        array.set(0, 5);
        array.set(1, 15);
        array.set(2, 4);
        array.remove(1);

        assertEquals(2, array.getsize());
    }
}
