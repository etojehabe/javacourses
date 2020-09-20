package lesson4.task1;

public class Circle implements Shape {
    @Override
    public double square(double sh) {
        int radius = 3;
       return  radius * radius * Math.PI;
    }

}
