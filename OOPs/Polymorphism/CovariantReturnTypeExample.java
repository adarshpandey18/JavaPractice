package JavaPractice.OOPs.Polymorphism;

public class CovariantReturnTypeExample {
    public static void main(String[] args) {
        SubClass subObj = new SubClass();
        SuperClass superObj = subObj.createInstance(); // Returns SubClass instance
        System.out.println(superObj.getClass().getSimpleName()); // Prints "SubClass"
    }
    
}
class SuperClass {
    SuperClass() {}

    SuperClass createInstance() {
        return new SuperClass();
    }
}

class SubClass extends SuperClass {
    SubClass() {}

    // Covariant return type: SubClass instead of SuperClass
    @Override
    SubClass createInstance() {
        return new SubClass();
    }
}
