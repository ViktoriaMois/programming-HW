public class NLogNSort {

    public void sort(int[] data) {

        mergeSort(data, 0, data.length - 1);

        for (int i = 0; i < data.length; i++)
            System.out.print(data[i] + " ");
    }

    public static void mergeSort(int[] data, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(data, l, m);
            mergeSort(data, m + 1, r);
            merge(data, l, m, r);
        }
    }

}