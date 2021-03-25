package code;

public class DynamicArray <A> {

    public int DEFAULT_SIZE = 10;
    public A[] ar;

    public static String Error = "Выход за границы массива";

    public DynamicArray () {
        ar = (A[]) new Object[DEFAULT_SIZE];

    }

    public DynamicArray(int size){
        if (size < 1) {
            throw new RuntimeException(Error);
        }
        ar =  (A[]) new Object[size];
    }

    public void addData(A value) {
        resize(ar.length + 1);
        setData(ar.length - 1, value);
    }


    public int getSize(){
        return ar.length;

    }

    public A getData (int index){
        if (ar.length < index || index < 0) {
            throw new RuntimeException(Error);
        }
        return ar[index];
    }


    public void setData (int index, A value){
        if (ar.length < index || index < 0) {
            throw new RuntimeException(Error);
        }

            ar[index] = value;

    }

    public void resize (int NewSize){
        if (NewSize < 1)
            throw new RuntimeException(Error);
    }

    public int parameter(){
        int num = 0;
        for (int i = 0; i < ar.length; i++){
            if(ar[i] != null){
               num = i;

            }
        }
        return num + 1;

    }

    public int findFirst(A value){
        for (int i = 0; i < ar.length; i++){
            if (ar[i] == value){
                return i;
            }
        }
        throw new RuntimeException(Error);
    }

    public int findLast(A value){
        int lastind = -1;
        for (int i = 0; i < ar.length; i++){
            if (ar[i] == value){
                lastind = i;
            }
        }
        if (lastind >= 0){
            return lastind;
        }
        throw new RuntimeException(Error);
    }


}
