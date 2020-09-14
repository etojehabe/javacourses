package lesson3.task2;

public abstract class Animal {
    public String food, location;

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

/*
Не уверен что так правильно, но не понял как еще вывести по нормальному, а не в формате lesson3.task2.Dog@1540e19d etc.
Сейчас получается, что для того, чтобы переопределить метод под какой-либо класс придется сделать переменные food и location public.
*/

    public String toString() {
        return food + ", " + location;
    }
}
