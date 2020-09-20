package lesson3.task2;

public class Dog extends Animal {
    private String dogBreed;

    public Dog() {
    }

    public Dog(String food, String location) {
        super(food, location);
    }

    public Dog(String food, String location, String dogBreed) {
        this(food, location);
        this.dogBreed = dogBreed;
    }

    public String getDogBreed() {
        return dogBreed;
    }

    public void setDogBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }


    @Override
    public String makeNoise() {
        return "Говорит на собчьем";
    }

    @Override
    public void eat() {
        System.out.println("Собака ест");
    }

}
