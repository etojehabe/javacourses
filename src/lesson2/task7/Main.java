package lesson2.task7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        double[] cost = {4.15, 1.98, 2.69, 5.00};
        String[] city = {"Москва", "Ростов", "Краснодар", "Киров"};
        int minutes = 10;

        switch (number) {
            case 905:
                System.out.println(city[0] + ". Стоимость разговора: " + cost[0] * minutes);
                break;
            case 194:
                System.out.println(city[1] + ". Стоимость разговора: " + cost[1] * minutes);
                break;
            case 491:
                System.out.println(city[2] + ". Стоимость разговора: " + cost[2] * minutes);
                break;
            case 800:

                System.out.println(city[3] + ". Стоимость разговора: " + cost[3] * minutes);
                break;
            default:
                System.out.println("Указанный код отсутствует.");
        }

    }
}
