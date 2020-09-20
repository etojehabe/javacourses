package lesson4.task1;

public class Rectangle implements Shape {
    @Override
    public double square(double sh) {
        sh = sh * sh;
        return sh;
    }
}
