public class NLogNSort {

    public void sort(int[] data) {

        mergeSort(data, 0, data.length - 1);

        for (int i = 0; i < data.length; i++)
            System.out.print(data[i] + " ");
    }

}