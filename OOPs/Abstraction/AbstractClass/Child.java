package JavaPractice.OOPs.Abstraction.AbstractClass;

public class Child extends Parent{
    @Override
    public void greet(String name) {
        System.out.println("Hey,"+ name+" how are you ?");
    }
}
