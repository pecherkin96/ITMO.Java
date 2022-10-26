package ITMO.Java.Lab4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class Part2 {

    private Integer[] ex_2;

    public static void main(String[] args) throws IOException {

        Part2 array = new Part2();
        array.ex_2();

        array.ex_4();

    }

    public  void ex_1() {

//        Напишите программу, которая проверяет отсортирован ли массив по возрастанию.
//        Если он отсортирован по возрастанию то выводится “OK”, если нет, то будет выводиться текст
//        “Please, try again”

        this.ex_2 = ex_2;
        boolean sort = false;
        for (int x = 0; x < ex_2.length - 1; x++) {
            if (ex_2[x] < ex_2[x + 1]) {
                sort = true;
            } else {
                sort = false;
            }
        }
        if (sort) {
            System.out.println("OK");
        } else {
            System.out.println("Please, try again.");
        }
    }

    public Integer [] ex_2() throws IOException {

//        Напишите программу, которая считывает с клавиатуры длину массива
//        (например, пользователь вводит цифру 4), затем пользователь вводит 4 числа и на новой строке
//        выводится массив из 4 элементов.

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("Введите размер массива:");
        int sizeArray = Integer.parseInt(reader.readLine());
        this.ex_2 = new Integer[sizeArray];

        for (int x = 0; x < sizeArray; x++) {
            System.out.println("Введите  число:");
            int numbers = Integer.parseInt(reader.readLine());
            ex_2[x] = numbers;
        }
        System.out.println(Arrays.toString(ex_2));
        return this.ex_2;
    }

    public  void ex_3() {

//        Напишите метод, который меняет местами первый и последний элемент массива.

        System.out.println(Arrays.toString(ex_2));

        int firstNumberArray = ex_2[0];
        int lastNumberArray = ex_2[ex_2.length - 1];

        ex_2[0] = lastNumberArray;
        ex_2[ex_2.length - 1] = firstNumberArray;

        System.out.println(Arrays.toString(ex_2));
    }

    public void ex_4() {

//        Дан массив чисел. Найдите первое уникальное в этом массиве число.
//                Например, для массива [1, 2, 3, 1, 2, 4] это число 3.

        boolean bool = false;
        int uniqNumber=0;

        for (int x = 0; x < ex_2.length; x++) {
            for (int y = 0; y < ex_2.length; y++) {
                if(ex_2[x] == ex_2[y] && x != y){
                    bool = false; break;
                }
                if(ex_2[x] != ex_2[y] ){
                    bool = true;
                }
            }
            if(bool) {
                uniqNumber = ex_2[x]; break;
            }
        }
        System.out.println("Уникальное число: " + ((bool) ? uniqNumber : " не найдено"));
    }
    public  void ex_5(){

//      Заполните массив случайным числами и отсортируйте его. Используйте сортировку слиянием.

        int arrayListNumbers [] = Arrays.stream(ex_2).mapToInt(i->i).toArray();

        Random r = new Random();
        for (int i = 0; i < arrayListNumbers.length; i++) {
            arrayListNumbers[i] = r.nextInt(100);
        }
        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(arrayListNumbers));
        int[] newArr = cutArray(arrayListNumbers);
        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(newArr));
    }
    public static int[] cutArray(int[] arr) {

        if (arr.length < 2) return arr;

        int mid = arr.length / 2;
        int[] arrleft = new int[mid];

        int[] arrright;
        if (arr.length % 2 == 0 )
            arrright = new int[mid];
        else
            arrright = new int[mid + 1];

        for (int i = 0; i < mid; i++) {
            arrleft[i] = arr[i];
        }
        for (int j = 0; j < arrright.length; j++) {
            arrright[j] = arr[mid + j];
        }

        System.out.println(Arrays.toString(arrleft));
        System.out.println(Arrays.toString(arrright));
        arrleft = cutArray(arrleft);
        arrright = cutArray(arrright);
        return mergeParts(arrleft, arrright);
    }
    private static int[] mergeParts(int[] arrleft, int[] arrright) {
        int[] resultArr = new int[arrleft.length + arrright.length];
        int leftPoint = 0;
        int rightPoint = 0;
        int resultPoint = 0;
        while (leftPoint < arrleft.length || rightPoint < arrright.length) {
            if (leftPoint < arrleft.length && rightPoint < arrright.length) {
                if (arrleft[leftPoint] < arrright[rightPoint]) {
                    resultArr[resultPoint++] = arrleft[leftPoint++];
                } else
                    resultArr[resultPoint++] = arrright[rightPoint++];
            }
            else if (leftPoint < arrleft.length)
                resultArr[resultPoint++] = arrleft[leftPoint++];
            else if (rightPoint < arrright.length)
                resultArr[resultPoint++] = arrright[rightPoint++];
        }
        return resultArr;
    }

}