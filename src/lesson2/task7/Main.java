package lesson2.task7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Введите код города из справочника:");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        int number1 = Integer.parseInt(a);

        String[] city = {"Москва.", "Ростов.", "Краснодар.", "Киров."};
        int[] code = {905, 194, 491, 800};
        double[] cost = {4.15, 1.98, 2.69, 5.00};
        double time = 10, result;


        if(number1 == code[0]){
            result = cost[0] * time;
            System.out.println(city[1] + " Стоимость разговора: " + result);
        }else{
            if(number1 == code[1]){
                result = cost[2] * time;
                System.out.println(city[1] + " Стоимость разговора: " + result);
            }else{
                if(number1 == code[2]){
                    result = cost[2] * time;
                    System.out.println(city[1] + " Стоимость разговора: " + result);
                }else{
                    if(number1 == code[3]){
                        result = cost[3] * time;
                        System.out.println(city[1] + " Стоимость разговора: " + result);
                    }else{
                        System.out.println("Введенный код не найден");
                    }
                }
            }
        }

    }
}
