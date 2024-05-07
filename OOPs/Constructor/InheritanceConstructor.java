package JavaPractice.OOPs.Constructor;

public class InheritanceConstructor {
    public static void main(String[] args) {
        Derive d = new Derive();
    }
    
}
 class Base {
    Base() {
        System.out.println("Base Class Constructor");
    }
    
}

 class Derive extends Base {
    Derive() {
        System.out.println("Derive Class Constructor");
    }
}