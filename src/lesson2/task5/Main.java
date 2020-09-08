package lesson2.task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String... args) throws IOException {
        int count = 0;
        int min = Integer.MAX_VALUE;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите количество чисел для сравнения");

        int exit = Integer.parseInt(reader.readLine());

        System.out.println("Теперь введите сами числа");

        do {
            int numb = Integer.parseInt(reader.readLine());
            if (numb < min) {
                min = numb;
            }
            count++;
        } while (count != exit);
        System.out.println("Наименьшее число - " + min);

    }
}