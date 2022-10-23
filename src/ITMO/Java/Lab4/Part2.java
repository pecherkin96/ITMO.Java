package ITMO.Java.Lab4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;

public class Part2 {
    public static void main(String[] args) throws IOException {
        ex_5();
    }

    public static void ex_1() {

//        Напишите программу, которая проверяет отсортирован ли массив по возрастанию.
//        Если он отсортирован по возрастанию то выводится “OK”, если нет, то будет выводиться текст
//        “Please, try again”

        int[] arrayListNumbers = {3, 5, 10, 13, 21, 99, 88};
        boolean sort = false;
        for (int x = 0; x < arrayListNumbers.length - 1; x++) {
            if (arrayListNumbers[x] < arrayListNumbers[x + 1]) {
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

    public static void ex_2() throws IOException {

//        Напишите программу, которая считывает с клавиатуры длину массива
//        (например, пользователь вводит цифру 4), затем пользователь вводит 4 числа и на новой строке
//        выводится массив из 4 элементов.

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите размер массива:");
        int size_array = Integer.parseInt(reader.readLine());
        int[] own_array = new int[size_array];

        for (int x = 0; x < size_array; x++) {
            System.out.println("Введите  число:");
            int numbers = Integer.parseInt(reader.readLine());
            own_array[x] = numbers;
        }

        System.out.println(Arrays.toString(own_array));
    }

    public static void ex_3() {

//        Напишите метод, который меняет местами первый и последний элемент массива.

        int[] arrayListNumbers = {3, 5, 10, 13, 21, 99, 88};
        System.out.println(Arrays.toString(arrayListNumbers));

        int firstNumberArray = arrayListNumbers[0];
        int lastNumberArray = arrayListNumbers[arrayListNumbers.length - 1];

        arrayListNumbers[0] = lastNumberArray;
        arrayListNumbers[arrayListNumbers.length - 1] = firstNumberArray;

        System.out.println(Arrays.toString(arrayListNumbers));
    }

    public static void ex_4() {

//        Дан массив чисел. Найдите первое уникальное в этом массиве число.
//                Например, для массива [1, 2, 3, 1, 2, 4] это число 3.

        boolean bool = false;
        int uniq_number=0;
        int[] array = {1, 2, 1, 2, 5, 6, 6, 8, 9, 9, 7, 3};

        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array.length; y++) {
                if(array[x] == array[y] && x != y){
                    bool = false; break;
                }
                if(array[x] != array[y] ){
                    bool = true;
                }
            }
            if(bool) {
                uniq_number = array[x]; break;
            }
        }
        System.out.println("Уникальное число: " + ((bool) ? uniq_number : " не найдено"));
    }
    public static void ex_5(){

//      Заполните массив случайным числами и отсортируйте его. Используйте сортировку слиянием.

        int[] sortarray = new int[11];
        Random r = new Random();
        for (int i = 0; i < sortarray.length; i++) {
            sortarray[i] = r.nextInt(100);
        }
        System.out.println("Исходный массив:");
        System.out.println(Arrays.toString(sortarray));
        int[] newArr = cutArray(sortarray);
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