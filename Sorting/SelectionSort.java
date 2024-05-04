package JavaPractice.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[]array = {5,4,3,2,1};
        for(int i = 0; i < array.length; i++) {
            swap(array,i,findMin(array, i, array.length));
        }
        System.out.println(Arrays.toString(array));
    }
    public static void swap(int[]array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
    public static int findMin(int[]array, int start, int end) {
        int min = start;
        for(int i = start; i < end; i++) {
            if(array[min] > array[i])
                min = i;
        }
        return min;
    }
    
}