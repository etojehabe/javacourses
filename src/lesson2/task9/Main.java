package lesson2.task9;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {15, 10, 51, -6, -5, 3, -10, -34, 0, 32, 56, -12, 24, -52};

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
