package lesson3.task2;

public class Cat extends Animal {
    private String catColor;

    public Cat() {
    }

    public Cat(String food, String location) {
        super(food, location);
    }

    public Cat(String food, String location, String catColor) {
        this(food, location);
        this.catColor = catColor;
    }

    public String getCatColor() {
        return catColor;
    }

    public void setCatColor(String catColor) {
        this.catColor = catColor;
    }

    @Override
    public String makeNoise() {
        return "Говорит на кошачьем";
    }

    @Override
    public void eat() {
        System.out.println("Кошка ест");
    }


}
