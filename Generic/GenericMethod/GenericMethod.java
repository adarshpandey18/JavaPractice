package JavaPractice.Generic.GenericMethod;

import java.util.ArrayList;
import java.util.List;

public class GenericMethod {
    public static void main(String[] args) {
        int[]list = {1,2,3};
        add(list);
        
    }
    public static <T> void printArray(T[] list) {
        for(T item : list) {
            System.out.println(item);
        }
    }
}
