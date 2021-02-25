package code;

public class DynamicArray <A> {

    private int DEFAULT_SIZE = 10;
    private A[] Array;

    public DynamicArray () {
        Array = (A[]) new Object[DEFAULT_SIZE];

    }

    private void throwsException() {
        throw new ArithmeticException("False");

    }

    public DynamicArray(int StartSize){
        if (StartSize > -1)
            Array =  (A[]) new Object[StartSize];
        else
            throwsException();

    }

    public int StartSize(){
        return Array.length;

    }

    public A get (int index, A value){
        if (StartSize() <= index || index < 0)
            throwsException();
        return Array[index];
    }

    public void set (int index, A value){
        if (StartSize() <= index || index < 0)
            throwsException();
        else
            Array[index] = value;

    }

    public void resize (int NewSize){
        if (NewSize < 1)
            throwsException();

    }


}
