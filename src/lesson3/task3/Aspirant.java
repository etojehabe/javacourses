package lesson3.task3;

public class Aspirant extends Student {

    private boolean sciWork;

    public boolean hasSciWork() {
        return sciWork;
    }

    public Aspirant(String firstName, String lastName, String group, double averageMark) {
        super(firstName, lastName, group, averageMark);
        this.sciWork = true;
    }

    @Override
    public void getScholarship() {
        if (averageMark == 5) {
            System.out.println(firstName + " получает стипендию " + 200);
        } else {
            System.out.println(firstName + " получает стипендию " + 180);
        }
    }

}
