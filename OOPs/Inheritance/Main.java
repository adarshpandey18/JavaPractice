package JavaPractice.OOPs.Inheritance;

public class Main {
    public static void main(String[] args) {
        SubClass sc = new SubClass(4, 8, 2);
        sc.func();

        SuperClass sp = new SubClass(1, 2, 3);
        System.out.println(sp.height);
    }
}
