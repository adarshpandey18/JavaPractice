package JavaPractice.OOPs.Polymorphism;

public class MethodOverriding {
    public static void main(String[] args) {
        SuperClass superObj = new SuperClass();
        superObj.display();

        System.out.println("\n");
        
        SubClass subObj = new SubClass();
        subObj.display();

        System.out.println("\n");
    
        SuperClass obj = new SubClass();
        obj.display();

    }
}

class SuperClass {
    SuperClass() {
        System.out.println("SuperClass Constructor");
    }
    public void display() {
        System.out.println("SuperClass display method");
    }
}

class SubClass extends SuperClass {
    SubClass() {
        System.out.println("SubClass Constructor");
    }
    public void display() {
        System.out.println("SubClass display method");
    }
}
