package lesson2.task10;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {15, 10, 0, -6, -5, 3, 0, -34, 0, 32, 56, 0, 24, -52};
        int tmp;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] == 0) {
                    tmp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = tmp;
                }
            }
        }
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }

    }
}
