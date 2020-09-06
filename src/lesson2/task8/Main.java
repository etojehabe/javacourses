package lesson2.task8;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, -10, 5, 6, 45, 23, -45, -34, 0, 32, 56, -1, 2, -2};
        int max = numbers[0];
        int sumPositive = 0, sumNegative= 0, sumNegativeOdd = 0, avgNegative = 0, countPositive = 0, countNegative = 0;

        for (int number : numbers) {

            if (number > max) {
                max = number;
            }

            if (number > 0) {
                sumPositive += number;
            }

            if (number < 0 && number % 2 != 0) {
                sumNegativeOdd += number;
            }

            if (number > 0) {
                countPositive++;
            }

            if (number < 0) {
                sumNegative += number;
                countNegative++;
                avgNegative = sumNegative / countNegative;
            }
        }


        System.out.println("Максимум : " + max);
        System.out.println("Сумма положительных элементов: " + sumPositive);
        System.out.println("Сумма нечетных отрицательных элементов: " + sumNegativeOdd);
        System.out.println("Количество положительных элементов: " + countPositive);
        System.out.println("Среднее значение отрицательных элементов: " + avgNegative);
    }
}