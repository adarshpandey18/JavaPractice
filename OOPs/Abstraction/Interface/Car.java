package JavaPractice.OOPs.Abstraction.Interface;

public class Car implements Engine {

    @Override
    public void start() {
        System.out.println("Car Start");
    }

    @Override
    public void accelerate() {
        System.out.println("Car Accelerate");
    }

    @Override
    public void stop() {
        System.out.println("Car Stop");
    }
    
}
