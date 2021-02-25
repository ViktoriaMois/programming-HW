package code;

public class DynamicArray <A> {

    private int DEFAULT_SIZE = 10;
    private A[] Array;

    public DynamicArray () {

    }

    private void throwsException() {
        throw new ArithmeticException("False");

    }

    public DynamicArray(int start_size){
        if (start_size > -1)
            Array =  (A[]) new Object[start_size];
        else
            throwsException();

    }

    public A get (int index, A value){
        if (start_size() <= index || index < 0)
            throwsException();
        return Array[index];
    }

    public void set (int index, A value){
        if (start_size() <= index || index < 0)
            throwsException();
        else
            Array[index] = value;
        
    }


}
