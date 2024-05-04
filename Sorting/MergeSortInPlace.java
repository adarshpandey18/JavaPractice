package JavaPractice.Sorting;

import java.util.Arrays;

public class MergeSortInPlace {
    public static void main(String[] args) {
        int[] array = {5, 4, 3, 2, 1};
        mergeSortInPlace(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    public static void mergeSortInPlace(int[] array, int start, int end) {
        if (end - start < 1)
            return;

        int mid = start + (end - start) / 2;
        mergeSortInPlace(array, start, mid);
        mergeSortInPlace(array, mid + 1, end);
        mergeInPlace(array, start, mid, end);
    }

    public static void mergeInPlace(int[] array, int start, int mid, int end) {
        int[] merge = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= end) {
            if (array[i] < array[j]) {
                merge[k++] = array[i++];
            } else {
                merge[k++] = array[j++];
            }
        }
        while (i <= mid) {
            merge[k++] = array[i++];
        }
        while (j <= end) {
            merge[k++] = array[j++];
        }

        for (int l = 0; l < merge.length; l++) {
            array[start + l] = merge[l];
        }
    }
}
