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

    private static void merge(int[] subData, int l, int m, int r) {
        int d = r - l + 1;
        int[] Ar = new int[d];

        int i = l;
        int j = m + 1;
        int k = 0;

        while (i <= m || j <= r) {
            if (i > m)
                Ar[k++] = subData[j++];
            else if (j > r)
                Ar[k++] = subData[i++];
            else if (subData[i] < subData[j])
                Ar[k++] = subData[i++];
            else
                Ar[k++] = subData[j++];
        }
        for (j = 0; j < d; j++)
            subData[l + j] = Ar[j];
    }
}