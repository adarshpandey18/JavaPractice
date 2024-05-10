package JavaPractice.OOPs.Abstraction.AbstractClass;

public abstract class Parent {
    abstract void greet(String name);
    final void sayHello(String name) {
        System.out.println("hello "+ name);
    }
}
