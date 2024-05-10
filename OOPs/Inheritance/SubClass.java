package JavaPractice.OOPs.Inheritance;

public class SubClass extends SuperClass {
    int weight;
    SubClass(int height, int width, int weight) {
        super(height, width);
        this.weight = weight;
    }

    public void subFunc() {
        System.out.println("SubClass Function");
    }
}
