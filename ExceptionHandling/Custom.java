package JavaPractice.ExceptionHandling;

public class Custom {
    public static void main(String[] args) {
        int a = 100;
        int b = 0;
        try {
            divide(a,b);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void divide(int a , int b) throws ArithmeticException{
        if(b == 0) {
            throw new ArithmeticException("Wrong");
        }
    }
    
}
