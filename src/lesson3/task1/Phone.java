package lesson3.task1;

public class Phone {
    private String model;
    private int number;
    private double weight;

    public Phone(int number, String model, double weight) {
        this(number, model);
        this.weight = weight;

    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {

    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, int number) {
        System.out.println("Звонит " + name + ", Номер - " + number);
    }

    public int getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    public void sendMessage(int... nums) {
        for (int num : nums) {
            System.out.println("SMS будет отправлена на номер: " + num);
        }
    }

}
