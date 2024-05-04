package JavaPractice.Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[]array = {5,4,3,2,1};
        int[]ans = mergeSort(array);

        System.out.println(Arrays.toString(ans));
    }
    public static int[] mergeSort(int[]array) {
        if(array.length == 1)
            return array;
        int mid = 0 + array.length / 2;
        int[]left = mergeSort(Arrays.copyOfRange(array, 0, mid));
        int[]right = mergeSort(Arrays.copyOfRange(array, mid, array.length));
        return mege(left, right);
    }
    public static int[] mege(int[]first, int[]second) {
        int[]ans = new int[first.length+second.length];
        int i = 0, j = 0, index = 0;
        while(i < first.length && j < second.length) {
            if(first[i] < second[j]) {
                ans[index++] = first[i++];
            } else {
                ans[index++] = second[j++];
            }
        }
        while(i < first.length) {
            ans[index++] = first[i++];
        }

        while(j < first.length) {
            ans[index++] = second[j++];
        }
        return ans;
    }
}
