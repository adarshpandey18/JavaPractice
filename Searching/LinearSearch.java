package JavaPractice.Searching;

class LinearSearch {
    public static void main(String[]args) {
        int[]array = {1,2,3,4,5,6,7,8,9};
        int target = 5; 

        //Finding index of target (5)  using Linear Search 
        int ans = -1;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == target)
                ans = i;
        }
        
        System.out.println("Index : " + ans);
    }
}