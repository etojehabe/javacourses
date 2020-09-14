package lesson3.task2;

public class Horse extends Animal {
    private String horseClass;

    public Horse() {
    }

    public Horse(String food, String location) {
        super(food, location);
    }

    public Horse(String food, String location, String horseClass) {
        this(food, location);
        this.horseClass = horseClass;
    }

    public String getHorseClass() {
        return horseClass;
    }

    public void setHorseClass(String horseClass) {
        this.horseClass = horseClass;
    }


    @Override
    public String makeNoise() {
        return "Говорит на лошадинном";
    }


    @Override
    public void eat() {
        System.out.println("Лошадь ест.");
    }

}
