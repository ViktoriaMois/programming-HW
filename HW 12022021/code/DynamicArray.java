package code;

public class DynamicArray <A> {

    private int DEFAULT_SIZE = 10;
    private A[] Array;

    public DynamicArray () {

    }


    }

    public DynamicArray(int start_size){
        if (start_size > -1)
            Array =  (A[]) new Object[start_size];
        else
            throwsException();

    }



}
