package lesson3.task3;

public class Student {
    public String firstName, lastName, group;
    public double averageMark;


    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getGroup() {
        return group;
    }
 
    public void getScholarship() {
        if (averageMark == 5) {
            System.out.println(firstName + " получает стипендию " + 100);
        } else {
            System.out.println(firstName + " получает стипендию " + 80);
        }
    }
}
