package JavaPractice.OOPs.Abstraction.Interface;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.accelerate();
        car.stop();
        
        Engine engine = new Engine() {
            @Override
            public void start() {
                System.out.println("Engine Start");
            }
        
            @Override
            public void accelerate() {
                System.out.println("Engine Accelerate");
            }
        
            @Override
            public void stop() {
                System.out.println("Engine Stop");
            }
        };

        engine.start();
        engine.accelerate();
        engine.stop();
    }
}
