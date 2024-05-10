package JavaPractice.OOPs.SingletonClass;

// Lazy Initialization
// Lazy initialization means the Singleton instance is created only when it's first requested, conserving resources.


public class LazyInitialization {
    int num;
    private LazyInitialization(int num) {
        System.out.println("Lazy Initialization Constructor");
        this.num = num;
    }
    public static LazyInitialization instance;
    public static LazyInitialization getInstance(int num) {
        if(instance == null) {
            instance = new LazyInitialization(num);
        }
        return instance;
    }
    public void doSomething() {
        System.out.println("Doing Something !");
    }
    public int getNum() {
        return num;
    }
}