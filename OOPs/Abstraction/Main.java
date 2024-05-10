package JavaPractice.OOPs.Abstraction;

public class Main {
    public static void main(String[] args) {

        
        Child child = new Child();
        child.greet("Adarsh");
        child.sayHello("Adarsh");

        Parent parent = new Parent() {
            @Override
            void greet(String name) {
                System.out.println("Hey, "+name+" how are your ?");
            }
        };

        parent.greet("Adarsh");
    }
}
