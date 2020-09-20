package lesson3.task3;

public class Aspirant extends Student {
    private boolean sciWork;

    public void hasSciWork() {
        if (sciWork) {
            System.out.println("У этого аспиранта есть научная работа");
        } else {
            System.out.println("У этого аспиранта нет научной работы");
        }
    }

    public Aspirant(String firstName, String lastName, String group, double averageMark) {
        super(firstName, lastName, group, averageMark);
        this.sciWork = true;
    }

    @Override
    public void getScholarship() {

        if (getAverageMark() == 5) {
            System.out.println(getFirstName() + " получает стипендию " + 200);
        } else {
            System.out.println(getFirstName() + " получает стипендию " + 180);
        }
    }

}
