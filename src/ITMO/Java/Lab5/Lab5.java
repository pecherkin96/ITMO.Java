package ITMO.Java.Lab5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lab5 {
    public static void main(String[] args) {
        String str = "Ищем самое длинное слово в тексте. Какое же оно?";
        ex_1(str);

    }
    public static void ex_1(String str){
//       Написать метод для поиска самого длинного слова в тексте.

        String words[] = str.split(" ");

        int length = 0;
        String longest = "";

        for(String string : words){
            if(string.length() > length){
                length = string.length();
                longest = string;
            }
        }
        System.out.println(longest);
    }
    public static void ex_2(String str){

//        Написать метод, который проверяет является ли слово палиндромом.


        StringBuilder builder = new StringBuilder(str);
        String reverse_string = builder.reverse().toString();
        if(str.equalsIgnoreCase(reverse_string)){
            System.out.println("Палиндром.");
        }
        else {
            System.out.println("Не Палиндром.");
        }
    }
    public static void ex_3(String str){
//        Напишите метод, заменяющий в тексте все вхождения слова «бяка» на «[вырезано цензурой]»


        String[] textArray = str.split(" ");
        for(int x= 0; x < textArray.length; x++){
            if(textArray[x].length() >= 4){
                String kill_byaka = textArray[x].substring(0, 4);
                if(kill_byaka.equalsIgnoreCase("бяка")){
                    textArray[x] = "[вырезано цензурой]";
                }
            }
        }
        StringBuilder builder = new StringBuilder();
        for(String s1:textArray){
            builder.append(s1)
                    .append(" ");
        }
        System.out.println(builder.toString());
    }
    public static int ex_4(String str, String str2){

//      Имеются две строки. Найти количество вхождений одной (являющейся подстрокой) в другую.

        int count = 0;

        for (int indexS = str.indexOf(str2); indexS >= 0; indexS = str.indexOf(str2, indexS + 1)) {
            count++;
        }
        System.out.println("Количество повторений: ");
        System.out.println(count);
        return count;
    }
    public static void ex_5(String str){

//        Напишите метод, который инвертирует слова в строке.
//        Предполагается, что в строке нет знаков препинания, и слова разделены пробелами.

        System.out.println(str);
        String[] arrayStr = str.split(" ");


        for(int x = 0; x < arrayStr.length; x++){
            StringBuilder builder = new StringBuilder(arrayStr[x]);
            arrayStr[x] = builder.reverse().toString();
        }

        StringBuilder builder = new StringBuilder();
        for(String string:arrayStr){
            builder.append(string).append(" ").toString();
        }
        System.out.println(builder);
    }
}
