package ITMO.Java.Lab6.ex4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class InputNumber {

    private int number;

    public int getNumber() {
        return number;
    }

    public int setNumber()  {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = scanner.nextInt();
        return number;
    }
}
