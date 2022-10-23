package ITMO.Java.Lab2;

public class Calculator {

//    Создать класс Calculator. У него должны быть методы:
//          -	Сумма
//          -	Деление
//          -	Умножение
//          -	Вычитание
//    Все методы должны быть перегружены и работать с тремя типами данных- double, long и int.

    public void Sum(int a, int b){
        System.out.println(a + b);
    }
    public void Sum(double a, double b){
        System.out.println(a + b);
    }
    public void Sum(long a, long b){
        System.out.println(a + b);
    }
    public void Minus( int a, int b){
        System.out.println(a - b);
    }
    public void Minus( double a, double b){
        System.out.println(a - b);
    }
    public void Minus( long a, long b){
        System.out.println(a - b);
    }
    public void Multiply(int a, int b){
        System.out.println(a * b);
    }
    public void Multiply(double a, double b){
        System.out.println(a * b);
    }
    public void Multiply(long a, long b){
        System.out.println(a * b);
    }
    public void Division(int a, int b){
       double result = a / b;

        System.out.println(result);
    }
    public void Division(double a, double b){
        System.out.println(a / b);
    }
    public void Division(long a, long b){
        double result = a / b;
        System.out.println(result);
    }

}
