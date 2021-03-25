package code;

public class DynamicArray <A> {

    public int DEFAULT_SIZE = 0;
    public A[] ar;

    public static String outBorderError = "Выход за границы массива";
    public static String wrongSizeError = "Массив < 1";
    public static String elementError404 = "Элемента не существует";

    public DynamicArray() {
        ar = (A[]) new Object[DEFAULT_SIZE];

    }

    public DynamicArray(int size) {
        if (size < 1) {
            throw new RuntimeException(wrongSizeError);
        }
        ar = (A[]) new Object[size];
    }

    public void addData(A value) {
        resize(ar.length + 1);
        ar[ar.length - 1] = value;
    }


    public int getSize() {
        return ar.length;

    }

    public A getData(int index) {
        if (ar.length < index || index < 0) {
            throw new RuntimeException(outBorderError);
        }
        return ar[index];
    }


    public void setData(int index, A value) {
        if (index < 0 || index > ar.length) {
            throw new RuntimeException(outBorderError);
        }

        ar[index] = value;

    }

    public void resize(int NewSize) {
        if (NewSize < 1) {
            throw new RuntimeException(wrongSizeError);
        }
        A[] newAr = (A[]) new Object[NewSize];
        int top = NewSize;
        if (NewSize > ar.length) {
            top = ar.length;
        }
        System.arraycopy(ar, 0, newAr, 0, top);
        ar = newAr;
    }

    public int parameter() {
        int num = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] != null) {
                num = i;

            }
        }
        return num + 1;

    }

    public int findFirst(A value) {
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == value) {
                return i;
            }
        }
        throw new RuntimeException(elementError404);
    }

    public int findLast(A value) {
        int lastind = -1;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == value) {
                lastind = i;
            }
        }
        if (lastind >= 0) {
            return lastind;
        }
        throw new RuntimeException(elementError404);
    }

    public void remove(int index) {
        if (index < 0 || index > ar.length) {
            throw new RuntimeException(outBorderError);
        }
        A[] newar = (A[]) new Object[ar.length - 1];
        for (int i = 0; i < index; i++) {
            newar[i] = ar[i];
        }
        for (int i = index + 1; i < ar.length; i++) {
            newar[i - 1] = ar[i];
        }
        ar = newar;
    }

    public void printAll() {
        for (Object i : ar) {
            System.out.println(i);
        }

    }
}
