package ITMO.Java.Lab5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lab5 {
    public static void main(String[] args) {

    }
    public static void ex_1(){
        String str = "Ищем самое длинное слово в тексте. Какое же оно?";
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
    public static void ex_2(){

//        Написать метод, который проверяет является ли слово палиндромом.

        String original_string = "Дед";
        StringBuilder builder = new StringBuilder(original_string);
        String reverse_string = builder.reverse().toString();
        if(original_string.equalsIgnoreCase(reverse_string)){
            System.out.println("Палиндром.");
        }
        else {
            System.out.println("Не Палиндром.");
        }
    }
    public static void ex_3(){
//        Напишите метод, заменяющий в тексте все вхождения слова «бяка» на «[вырезано цензурой]»

        String some_text = "Будем менять слово бяка";


        String[] text_array = some_text.split(" ");
        for(int x= 0; x < text_array.length; x++){
            if(text_array[x].length() >= 4){
                String kill_byaka = text_array[x].substring(0, 4);
                if(kill_byaka.equalsIgnoreCase("бяка")){
                    text_array[x] = "[вырезано цензурой]";
                }
            }
        }
        StringBuilder builder = new StringBuilder();
        for(String s1:text_array){
            builder.append(s1)
                    .append(" ");
        }
        System.out.println(builder.toString());
    }
    public static int ex_4(){

//      Имеются две строки. Найти количество вхождений одной (являющейся подстрокой) в другую.

        String s1 = "Считаем количество слова Повтор в тексте. Повтор. Повтор.";
        String s2 = "Повтор";
        int count = 0;

        for (int indexS = s1.indexOf(s2); indexS >= 0; indexS = s1.indexOf(s2, indexS + 1)) {
            count++;
        }
        System.out.println("Количество повторений: ");
        System.out.println(count);
        return count;
    }
    public static void ex_5(){

//        Напишите метод, который инвертирует слова в строке.
//        Предполагается, что в строке нет знаков препинания, и слова разделены пробелами.

        String main_text = "Длинный текст без знаков перпинания.";
        System.out.println(main_text);
        String[] array_main_text = main_text.split(" ");


        for(int x = 0; x < array_main_text.length; x++){
            StringBuilder builder = new StringBuilder(array_main_text[x]);
            array_main_text[x] = builder.reverse().toString();
        }

        StringBuilder builder = new StringBuilder();
        for(String str:array_main_text){
            builder.append(str).append(" ").toString();
        }
        System.out.println(builder);
    }
}
