package lesson3.task3;

public class Main {
    public static void main(String[] args) {

        Aspirant someAspirant = new Aspirant("Иван", "Иванов", "6Z", 3);

        Student[] students = new Student[4];
        students[0] = new Student("Антон", "Антонов", "2B", 5);
        students[1] = new Aspirant("Андрей", "Андреев", "3C", 5);
        students[2] = new Student("Евгений", "Петров", "2B", 3);
        students[3] = new Aspirant("Пётр", "Петров", "3C", 3);

        for (Student student : students) {
            student.getScholarship();
        }

        System.out.println();

        someAspirant.hasSciWork();

    }
}
