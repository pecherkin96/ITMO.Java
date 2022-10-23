package ITMO.Java.Lab6.ex4;

import java.io.IOException;

public class OutputNumber extends InputNumber{
    public void output(){
        System.out.println("Введённое число:" + setNumber());
    }

    public static void main(String[] args) {
        OutputNumber number = new OutputNumber();
        number.output();
    }

}
