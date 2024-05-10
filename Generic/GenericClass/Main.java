package JavaPractice.Generic.GenericClass;

public class Main {
    public static void main(String[] args) {
        GenericClass <String> gc = new GenericClass<>();
        gc.set("Adarsh");
        System.out.println(gc.get());
    }
}
