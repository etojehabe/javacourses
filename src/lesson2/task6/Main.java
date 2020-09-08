package lesson2.task6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number1 = Integer.parseInt(reader.readLine());
        String tmp1 = null, tmp2 = null, result;

        if (number1 > 0) {
            tmp1 = "Положительное";
        } else if (number1 < 0) {
            tmp1 = "Отрицательное";
        }
        result = tmp1;
        if (number1 % 2 == 0 && number1 != 0) {
            tmp2 = " чётное";
        } else if (number1 % 2 != 0) {
            tmp2 = " нечётное";
        }
        result += tmp2;
        if (number1 == 0) {
            result = "Нулевое число";
        }
        System.out.println(result);
    }
}
