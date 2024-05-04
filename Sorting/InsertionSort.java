package JavaPractice.Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[]array = {5,4,3,2,1};
        for(int i = 0; i < array.length-1; i++) {
            for(int j = i+1; j > 0; j--) {
                if(array[j] < array[j-1]) {
                    swap(array,j, j-1);
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
    public static void swap(int[]array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
