package JavaPractice.OOPs.SingletonClass;
// Eager Initialization
// Eager initialization creates the Singleton instance when the class is loaded, ensuring it's always available but potentially wasting resources if it's not used.
public class EagerInitialization {
    public static final EagerInitialization instance = new EagerInitialization();
    
    private EagerInitialization() {
        System.out.println("EagerInitialization Constructor");
    }

    public static EagerInitialization getInstance() {
        return instance;
    }

    public void doSomething() {
        System.out.println("Doing Something !");
    }
}
