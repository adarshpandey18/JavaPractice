package JavaPractice.Generic.GenericMethod;

public class GenericMethod {
    public static void main(String[] args) {
        Integer[] list = {1, 2, 3};
        printArray(list); 
    }

    public static <T> void printArray(T[] list) {
        for (T item : list) {
            System.out.println(item);
        }
    }
}
