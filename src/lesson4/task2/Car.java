package lesson4.task2;

public abstract class Car {
    private String carMark, carClass;
    private int carWeight;
    private Engine engine;

    public abstract void stop();

    public abstract void start();

    public abstract void printInfo();

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }
}
