package lesson2.task6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        int number1 = Integer.parseInt(a);

        if (number1 > 0 && number1 % 2 == 0) {
            System.out.println(number1 + " - Положительное четное число");
        } else {
            if (number1 > 0 && number1 % 2 != 0) {
                System.out.println(number1 + " - Положительное нечетное число");
            } else {
                if (number1 < 0 && number1 % 2 == 0) {
                    System.out.println(number1 + " - Отрицательное четное число");
                } else {
                    if (number1 < 0 && number1 % 2 != 0) {
                        System.out.println(number1 + " - Отрицательное нечетное число");
                    } else {
                        System.out.println(number1 + " - Нулевое число");
                    }
                }
            }
        }
    }
}
