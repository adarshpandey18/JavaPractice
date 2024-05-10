package JavaPractice.OOPs.SingletonClass;

public class Main {
    public static void main(String[] args) {
        //Eager Initialization
        EagerInitialization ei = EagerInitialization.getInstance();
        ei.doSomething();
   
        System.out.println("\n");

        // Lazy Initialization
        LazyInitialization li = LazyInitialization.getInstance(5);
        li.doSomething();
        System.out.println(li.getNum());
        
        LazyInitialization li2 = LazyInitialization.getInstance(0);
        System.out.println(li2.getNum());
    }

}
