package ITMO.Java.Lab2;

public class Calculator {

//    Создать класс Calculator. У него должны быть методы:
//          -	Сумма
//          -	Деление
//          -	Умножение
//          -	Вычитание
//    Все методы должны быть перегружены и работать с тремя типами данных- double, long и int.

    public void sum(int a, int b){
        System.out.println(a + b);
    }
    public void sum(double a, double b){
        System.out.println(a + b);
    }
    public void sum(long a, long b){
        System.out.println(a + b);
    }
    public void minus( int a, int b){
        System.out.println(a - b);
    }
    public void minus( double a, double b){
        System.out.println(a - b);
    }
    public void minus( long a, long b){
        System.out.println(a - b);
    }
    public void multiply(int a, int b){
        System.out.println(a * b);
    }
    public void multiply(double a, double b){
        System.out.println(a * b);
    }
    public void multiply(long a, long b){
        System.out.println(a * b);
    }
    public void division(int a, int b){
       double result = (double) a / (double) b;

        System.out.println(result);
    }
    public void division(double a, double b){
        System.out.println(a / b);
    }
    public void division(long a, long b){
        double result = a / b;
        System.out.println(result);
    }

}
