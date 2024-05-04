package JavaPractice.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[]array = {5,4,3,2,1};
        for(int i = 0; i < array.length; i++) {
            boolean flag = false;
            for (int j = 1; j < array.length-i; j++) {
                if(array[j] < array[j-1]) {
                    swap(array,j,j-1);
                    flag = true;
                }
            }
            if(!flag) break;
        }
        System.out.println(Arrays.toString(array));
    }

    private static void swap(int[] array, int j, int i) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
