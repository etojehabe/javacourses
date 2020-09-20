package lesson4.task2;

public class SportCar extends Car {
    private String scMark, scClass;
    private int scWeight, speedLimit;
    private Engine engine;

    public SportCar() {

    }

    public SportCar(String scMark, String scClass, int scWeight, int speedLimit, Engine engine) {
        this.scMark = scMark;
        this.scClass = scClass;
        this.scWeight = scWeight;
        this.speedLimit = speedLimit;
        this.engine = engine;
    }

    @Override
    public void stop() {
        System.out.println("SportCar остановился");
    }

    @Override
    public void start() {
        System.out.println("SportCar поехал");
    }

    @Override
    public void printInfo() {
        System.out.println(scMark + " " + scClass + " " + scWeight + " " + speedLimit + " " + engine);
    }
}
