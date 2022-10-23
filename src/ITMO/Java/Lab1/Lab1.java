package ITMO.Java.Lab1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lab1
{
    public static void main(String[] args) throws IOException {
        ex_3();

    }
    public static void ex_1(){

//        Выведите строки в следующем порядке:
//        Я
//        хорошо
//        знаю
//        Java.

        System.out.println("Я");
        System.out.println("Хорошо");
        System.out.println("Знаю");
        System.out.println("Java");
    }
    public static void ex_2(){

//        Посчитайте результат выражения
//        (46 + 10) * (10 / 3)
//        (29) * (4) * (-15)

        System.out.println((46 + 10) * (10 / 3.0));
        System.out.println(29 * 4 * (-15));
    }
    public static void ex_3() {

//        В переменной number, лежит целое число 10500. В переменной result посчитайте следующее
//        выражение: (number / 10) / 10. Результат выведите на консоль.

        int number = 10500;
        double result = (number / 10) / 10;
        System.out.println(result);
    }
    public static void ex_4() {

//    Даны три числа: 3.6, 4.1, 5.9. В переменной result посчитайте произведение этих чисел.

        double result = 3.6 * 4.1 * 5.9;
        System.out.println(result);
    }
    public static void ex_5() throws IOException {

//        В этой задаче вы должны считать целые числа из стандартного ввода, а затем вывести. Каждое
//        целое число нужно печатать с новой строки. Формат ввода:
//        42
//        100
//        125

        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        int number_1 = Integer.parseInt(reader.readLine());
        int number_2 = Integer.parseInt(reader.readLine());
        int number_3 = Integer.parseInt(reader.readLine());
        System.out.println(number_1);
        System.out.println(number_2);
        System.out.println(number_3);
    }
    public static void ex_6() throws IOException {

//        Для целого числа b выполните следующие условные действия:
//              ● Если b нечетное, выведите “Нечетное”
//              ● Если b четное, выведите “Четное”
//              ● Если b четное и больше 100, выведите “Выход за пределы диапазона”

        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
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