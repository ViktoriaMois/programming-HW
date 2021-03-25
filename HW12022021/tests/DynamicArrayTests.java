package tests;

import code.DynamicArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

public class DynamicArrayTests extends Assertions {

//    @Test
//    public void DynamicArray_get_throwsException(){
//        DynamicArray dynamicArray = new DynamicArray();
//        assertThrows(ArithmeticException.class, () -> dynamicArray.getData(-1));
//        assertThrows(ArithmeticException.class, () -> dynamicArray.getData(10));
//
//    }

//    @Test
//    public void DynamicArray_set_throwsException(){
//        DynamicArray dynamicArray = new DynamicArray();
//        assertThrows(ArithmeticException.class, () -> dynamicArray.setData(-1, 5));
//        assertThrows(ArithmeticException.class, () -> dynamicArray.setData(10, 18));
//
//    }

    @Test
    public void DynamicArray_get_throwsException(){
        DynamicArray dynamicArray = new DynamicArray();
        assertThrows(ArithmeticException.class, () -> dynamicArray.get(-1));
        assertThrows(ArithmeticException.class, () -> dynamicArray.get(10));

    }

    @Test
    public void DynamicArray_set_throwsException(){
        DynamicArray dynamicArray = new DynamicArray();
        assertThrows(ArithmeticException.class, () -> dynamicArray.set(-1, 5));
        assertThrows(ArithmeticException.class, () -> dynamicArray.set(10, 18));

    }


}
