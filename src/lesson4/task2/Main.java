package lesson4.task2;

public class Main {
    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.setEngineMark("X5RetailGroup");
        engine.setPower(300);
        Lorry lorry1 = new Lorry("MAZ", "TESTCLASS", 9999, 888, engine);
        lorry1.start();
        lorry1.turnLeft();
        lorry1.stop();
        lorry1.printInfo();

        System.out.println();

        Car katafalk = new SportCar();
        katafalk.start();
        katafalk.turnRight();
        katafalk.stop();
    }
}
