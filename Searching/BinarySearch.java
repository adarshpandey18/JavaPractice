package JavaPractice.Searching;

class BinarySearch {
    public static void main(String[] args) {
        int[]array = {1,2,3,4,5,6,7,8,9};
        int target = 5; 

        //Finding index of target (5)  using BinarySearch

        int ans = -1;
        int start = 0;
        int end = array.length-1;
        while (start<=end) {
            int mid = start + (end-start)/2;
            if(array[mid] < target) {
                end = mid - 1;
            } else if (array[mid] > target) {
                start = mid +1;
            } else {
                ans = mid;
                break;
            }
        }
        System.out.println("Index : " + ans);
    }
}