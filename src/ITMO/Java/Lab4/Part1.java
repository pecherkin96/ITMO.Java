package ITMO.Java.Lab4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Part1 {
    public static void main(String[] args) throws IOException {
        ex_6();

    }
    public static void ex_1(){
        for (int x = 0; x < 100; x++){
            if(x % 2 != 0){
                System.out.println(x);
            }
        }
    }
    public static void ex_2(){
        for (int x = 0; x < 100; x++){
            if(x % 3 == 0){
                System.out.println("Делиться на 3:" + " " + x);
            }
            if(x % 5 == 0){
                System.out.println("Делиться на 5:" + " " + x);
            }
            if(x % 3 == 0 && x % 5 == 0){
                System.out.println("Делиться на 3 и на 5:" + " " + x);
            }
        }
    }
    public static void ex_3() throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));

        System.out.println("Введите первое число:");
        int number_1 = Integer.parseInt(reader.readLine());
        System.out.println("Введите второе число:");
        int number_2 = Integer.parseInt(reader.readLine());
        System.out.println("Введите третье число:");
        int number_3 = Integer.parseInt(reader.readLine());

        if (number_1 + number_2 == number_3){
            System.out.println("Результат: true");
        }
        else{
            System.out.println("Результат: false");
        }

    }
    public static void ex_4() throws IOException {
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));

        System.out.println("Введите первое число:");
        int number_1 = Integer.parseInt(reader.readLine());
        System.out.println("Введите второе число:");
        int number_2 = Integer.parseInt(reader.readLine());
        System.out.println("Введите третье число:");
        int number_3 = Integer.parseInt(reader.readLine());

        if (number_1 < number_2 && number_2 < number_3){
            System.out.println("Результат: true");
        }
        else{
            System.out.println("Результат: false");
        }
    }
    public static void ex_5(){
        int[] arrayListNumbers = {3,22,14,13};
        System.out.println("Array = " + Arrays.toString(arrayListNumbers));
        if (arrayListNumbers[0] == 3 || arrayListNumbers[arrayListNumbers.length - 1] == 3){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
    public static void ex_6(){
        int[] arrayListNumbers = {18,22,14,1};
        boolean content_1_or_3 = false;
        for(int x = 0; x < arrayListNumbers.length; x++){
            if(arrayListNumbers[x] == 3 || arrayListNumbers[x] ==1 ){
                content_1_or_3 = true;
            }
        }
        if(content_1_or_3){
            System.out.println("В массиве ЕСТЬ числа 1 или 3");
        }
        else {
            System.out.println("В массиве НЕТ чисел 1 или 3");
        }
    }
}
