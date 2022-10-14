package ITMO.Java.Lab1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab1
{
    public static void main(String[] args) throws IOException {
        System.out.println("Я");
        System.out.println("Хорошо");
        System.out.println("Знаю");
        System.out.println("Java");
        System.out.println((46 + 10) * (10 / 3.0));
        System.out.println(29 * 4 * (-15));
        int number = 10500;
        System.out.println((number / 10) / 10);
        double result = 3.6 * 4.1 * 5.9;
        System.out.println(result);
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        int number_1 = Integer.parseInt(reader.readLine());
        int number_2 = Integer.parseInt(reader.readLine());
        int number_3 = Integer.parseInt(reader.readLine());
        System.out.println(number_1);
        System.out.println(number_2);
        System.out.println(number_3);
        int b = Integer.parseInt(reader.readLine());
        if (b % 2 == 0 && b > 100 ) {
            System.out.println("Выход за пределы диапазона");
        }
        else if (b % 2 == 0){
                System.out.println("Чётное");
        }
        else{
            System.out.println("Нечётное");
        }
    }
}