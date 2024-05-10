package JavaPractice.OOPs.Encapsulation;

public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRadius(5.0);
        System.out.println(c.getRadius());
    }
}
class Circle {
    private double radius;
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
}