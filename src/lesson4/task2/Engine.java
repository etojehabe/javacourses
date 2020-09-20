package lesson4.task2;

public class Engine {
    private int power;
    private String engineMark;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getEngineMark() {
        return engineMark;
    }

    public void setEngineMark(String engineMark) {
        this.engineMark = engineMark;
    }

    public String toString() {
        return "Двигатель [Мощность = " + power + ", Производитель = " + engineMark + ']';
    }
}
