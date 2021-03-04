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

    public int Size(){
        return Array.length;

    }

    public A get(int index){
        if (Size() <= index || index < 0)
            throwsException();
        return Array[index];
    }

    public void set (int index, A value){
        if (Size() <= index || index < 0)
            throwsException();
        else
            Array[index] = value;

    }

    public void resize (int NewSize){
        if (NewSize < 1)
            throwsException();

    }

    public int findFirst(A value){
        for (int i = 0; i < Size(); i++){
            if (Array[i] == value){
                return i;

            }
        }
       return -1;

    public int findLast(A value){
        for (int i = Size() - 1; i > -1; i--){
            if (Array[i] == value){
                return i;
            }
        }
        return -1;

    }
}
