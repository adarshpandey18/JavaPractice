package JavaPractice.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        try {
            int ans = 100 / 0;
            System.out.println(ans);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("Final block executed.");
        }
    }
}
