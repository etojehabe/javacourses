package lesson4.task2;

public class Lorry extends Car {
    private String lorryMark, lorryClass;
    private int lorryWeight, lorryLift;
    private Engine engine;

    public Lorry() {

    }

    public Lorry(String lorryMark, String lorryClass, int lorryWeight, int lorryLift, Engine engine) {
        this.lorryMark = lorryMark;
        this.lorryClass = lorryClass;
        this.lorryWeight = lorryWeight;
        this.lorryLift = lorryLift;
        this.engine = engine;
    }

    @Override
    public void stop() {
        System.out.println("Грузовик остановился");
    }

    @Override
    public void start() {
        System.out.println("Грузовик поехал");
    }

    @Override
    public void printInfo() {
        System.out.println("Марка грузовика: " + lorryMark + ". Класс грузовика: " + lorryClass + ". Вес грузовика: " + lorryWeight + ". Грузоподъемность грузовика: " + lorryLift + ". " + engine);
    }
}
