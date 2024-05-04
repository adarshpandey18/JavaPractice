package JavaPractice.Sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] array = {5, 4, 3, 2, 1};
        int i = 0;
        while (i < array.length) {
            int rightIndex = array[i] - 1;
            if (array[i] != array[rightIndex]) {
                swap(array, i, rightIndex);
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    private static void swap(int[] array, int i, int rightIndex) {
        int temp = array[i];
        array[i] = array[rightIndex];
        array[rightIndex] = temp;
    }
}
