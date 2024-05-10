package JavaPractice.OOPs.Polymorphism;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(add(1.0, 2.0));
    }
    public static double add(double a, double b) {
        return a + b;
    }
    public static int add(int a , int b) {
        return a + b;
    }

}
