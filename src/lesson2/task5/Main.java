package lesson2.task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        int number1 = Integer.parseInt(a);
        String s = reader.readLine();
        int number2 = Integer.parseInt(s);
        String d = reader.readLine();
        int number3 = Integer.parseInt(d);

        if(number1 <= number2 && number1 <= number3){
            System.out.println(number1);
        }else{
            if(number2 <= number1 && number2 <= number3){
                System.out.println(number2);
            }else{
                if(number3 <= number2 && number3 <= number1){
                    System.out.println(number3);
                }
            }
        }
    }
}
