package lesson2.task9;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int numbers[] = {15, 10, 51, -6, -5, 3, -10, -34, 0, 32, 56, -12, 24, -52};

        for (int i = 0; numbers.length / 2 > i; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - i - 1];
            numbers[numbers.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(numbers));
    }
}

/* Или надо так ?

 int numbers[] = {15, 10, 51, -6, -5, 3, -10, -34, 0, 32, 56, -12, 24, -52};
        System.out.println(Arrays.toString(numbers));

        reverse(numbers);

        System.out.println(Arrays.toString(numbers));
    }

    private static void reverse(int numbers[]) {

        for (int i = 0; i < numbers.length; i++) {

            int reversed = 0;
            while (numbers[i] != 0) {
                reversed = reversed * 10;
                reversed = reversed + numbers[i] % 10;
                numbers[i] = numbers[i] / 10;

            }
            numbers[i] = reversed;
        }
    }*/
