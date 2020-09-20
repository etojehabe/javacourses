package lesson3.task2;

public abstract class Animal {
    private String food, location;

    public Animal() {
    }

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public abstract String makeNoise();

    public abstract void eat();

    public void sleep() {
        System.out.println("Это животное сейчас спит.");
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String toString() {
        return food + ", " + location;
    }
}
