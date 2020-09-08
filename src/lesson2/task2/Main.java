package lesson2.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int number = Integer.parseInt(s);
        sum(number);

    }

    public static void sum(int n) {
        int sm = 0;
        for (; n != 0; n /= 10) {
            sm += n % 10;
        }
        System.out.println(Math.abs(sm));
    }
}
