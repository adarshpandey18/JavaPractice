package JavaPractice.Generic.Wildcard;
import java.util.ArrayList;
import java.util.List;

public class WildcardExample {
    // Method to print elements of a list using wildcard
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Creating lists of different types
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);

        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");

        // Printing both lists using the printList method
        System.out.print("Integer List: ");
        printList(integerList);

        System.out.print("String List: ");
        printList(stringList);
    }
}
