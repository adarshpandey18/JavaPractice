package JavaPractice.Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {5, 4, 3, 2, 1};
        sort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    static void sort(int[] array, int start, int end) {
        if (start >= end)
            return;
        int s = start;
        int e = end;
        int mid = s + (e - s) / 2;
        int pivot = array[mid];
        while (s <= e) {
            while (array[s] < pivot)
                s++;
            while (array[e] > pivot)
                e--;
            if (s <= e) {
                int temp = array[s];
                array[s] = array[e];
                array[e] = temp;
                s++;
                e--;
            }
        }
        sort(array, start, e);  
        sort(array, s, end);    
    }
}
