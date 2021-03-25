package tests;

import code.DynamicArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

public class DynamicArrayTests extends Assertions {

    @Test
    public void init_sizeDefault() {
        DynamicArray array = new DynamicArray();
        assertEquals(array.DEFAULT_SIZE, array.getSize());
    }


    @Test
    public void testGetSize(){
        DynamicArray array = new DynamicArray(10);
        assertEquals(10, array.ar.length);
    }

    @Test
    public void testSize(){
        DynamicArray array = new DynamicArray(15);
        assertEquals(15, array.getSize());
    }

    @Test
    public void testAddData(){
        DynamicArray array = new DynamicArray(15);
        array.addData(345);
        assertEquals(345, array.getData(14));
    }

    @Test
    public void testFindFirst(){
        DynamicArray array = new DynamicArray(15);
        for (int i = 0; i < array.getSize(); i++) {
            array.setData(i, "empty");
        }
        array.setData(1, 15);
        assertEquals(1, array.findFirst(15));
    }

    @Test
    public void testFindLast(){
        DynamicArray array = new DynamicArray(15);
        for (int i = 0; i < array.getSize(); i++){
            array.setData(i, "empty");
        }
        array.setData(1, 15);
        assertEquals(1, array.findLast(15));
    }

    @Test
    public void testRemove(){
        DynamicArray array = new DynamicArray(3);

        array.setData(0, 5);
        array.setData(1, 15);
        array.setData(2, 4);
        array.remove(1);

        assertEquals(2, array.getSize());
    }
}
