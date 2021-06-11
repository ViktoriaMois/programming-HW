package code;

public class DynamicArray<T> {

    public int maxSize = 15;
    public int DEFAULT_SIZE = 0;
    public T[] list;

    public static String outBorderError = "Выход за границы массива";
    public static String wrongSizeError = "Массив < 1";
    public static String elementError404 = "Элемента не существует";


    public int defaultSize = 0;

    public static String outOfBorderError = "Выход за границы массива";
    public static String wrongArraySizeError = "Массив должен быть больше 1";
    public static String elementNotFoundError = "Такого элемента не существует";

    public DynamicArray() {
        list = (T[]) new Object[defaultSize];
    }

    public DynamicArray(int size) {
        if (size < 1) {
            throw new RuntimeException(wrongArraySizeError);
        }

        list = (T[]) new Object[size];
    }

    public int getsize() {
        return list.length;
    }

    public T get(int index) {
        if (index < 0 || index > list.length) {
            return null;
        }

        return list[index];
    }

    public void resize(int newSize) {

        if (newSize < 1) {
            throw new RuntimeException(wrongArraySizeError);
        }

        T[] newList = (T[]) new Object[newSize];

        int iUpperBound = newSize;
        if (newSize > list.length) {
            iUpperBound = list.length;
        }

        System.arraycopy(list, 0, newList, 0, iUpperBound);

        list = newList;
    }

    public void set(int index, T value) {
        if (index < 0 || index > list.length) {
            throw new RuntimeException(outOfBorderError);
        }

        list[index] = value;
    }

    public int findFirst(T value) {

        for (int i=0; i < list.length; i++) {
            if (list[i] == value) { return i; }
        }

        return -1;
    }

    public int findLast(T value) {

        int last_index = -1;
        for (int i=0; i < list.length; i++) {
            if (list[i] == value) {
                last_index = i;
            }
        }

        if (last_index >= 0) {
            return last_index;
        }

        throw new RuntimeException(elementNotFoundError);
    }

    public void add(T value) {
        resize(list.length + 1);
        list[list.length - 1] = value;
    }

    public void insert(int index, T value) {
        if (index < 0 || index > list.length) {
            throw new RuntimeException(outOfBorderError);
        }

        resize(list.length + 1);

        for (int i = list.length - 1; i > index; i--) {
            list[i] = list[i-1];
        }

        set(index, value);
    }

    public void remove(int index) {
        if (index < 0 || index > list.length) {
            throw new RuntimeException(outOfBorderError);
        }

        T[] newList = (T[]) new Object[list.length - 1];


        for (int i=0; i < index; i++) {
            newList[i] = list[i];
        }

        // ... копируем после индекса ...
        for (int i=index+1; i < list.length; i++) {
            newList[i-1] = list[i];
        }

        list = newList;
    }

    public void printAll() {
        for (Object i : list) {
            System.out.println(i);
        }
    }
}