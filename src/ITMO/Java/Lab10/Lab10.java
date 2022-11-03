package ITMO.Java.Lab10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lab10 {
    public static void main(String[] args) {
        File file1 = new File("files/file1.txt");
        File file2 = new File("files/file2.txt");
        File file3 = new File("files/files3.txt");
        File file4 = new File("files/file4.txt");

        List<String> strings = ex_1(file1);
        ex_2(strings, file2);
        ex_3(file1,file2,file3);
        ex_4(file3,file4);

    }
    public static List<String> ex_1(File file1){
//        Написать метод, который читает текстовый файл и возвращает его в виде списка строк.

            List<String> stringList = new ArrayList<>();

            try(BufferedReader reader = new BufferedReader(new FileReader(file1))){
                String content = null;
                while((content = reader.readLine()) != null){
                    stringList.add(content);
                }

            }
            catch (IOException e){
                System.err.println("Возникло исключение: " + e.getMessage());
            }
            return stringList;
    }
    public static void ex_2(List<String> string, File file2){
//        Написать метод, который записывает в файл строку, переданную параметром.

        FileWriter filewriter = null;
        String listString = string.stream().map(Object::toString)
                .collect(Collectors.joining("\n"));
        try{
            filewriter = new FileWriter(file2);
            filewriter.write(listString);
        }
        catch (IOException e){
            System.err.println("Возникло исключение: " + e.getMessage());
        }
        finally {
            try{
                assert filewriter != null;
                filewriter.close();
            }
            catch (IOException e){
                System.err.println("Возникло исключение: " + e.getMessage());
            }
        }
    }
    public static void ex_3(File file1, File file2, File file3) {
//        Используя решение 1 и 2, напишите метод, который склеивает два текстовый файла один.


        OutputStream os = null;
        InputStream is1 = null;
        InputStream is2 = null;
        String string = "\n\n==================================================================================\n";

        try {
            os = new FileOutputStream(file3);
            is1 = new FileInputStream(file1);
            is2 = new FileInputStream(file2);

            while (is1.available() > 0) {
                os.write(is1.read());
            }

            os.write(string.getBytes());

            while (is2.available() > 0) {
                os.write(is2.read());
            }
        } catch (IOException e) {
            System.err.println("Возникло исключение: " + e.getMessage());
        } finally {
            try {
                assert is1 != null;
                assert is2 != null;

                is1.close();
                is2.close();
                os.close();
            } catch (IOException e) {
                System.err.println("Возникло исключение: " + e.getMessage());
            }

        }
    }
    public static void ex_4(File file3, File file4){


        InputStream is = null;
        OutputStream os = null;
        String string;
        try{
            os = new FileOutputStream(file4);
            is = new FileInputStream(file3);
            BufferedReader reader = new BufferedReader(new FileReader(file3));
            BufferedWriter writer = new BufferedWriter(new FileWriter(file4));
            while (is.available() > 0){
                os.write(is.read());
            }while ((string = reader.readLine()) != null){
                writer.write(string.replaceAll("[^а-яА-Яa-zA-Z\\d]", "\\$"));
                writer.newLine();
            }
            reader.close();
            writer.close();
        }
        catch (IOException e){
            System.err.println("Возникло исключение: " + e.getMessage());
        }
        finally{
            try{
                if(is != null){
                    is.close();
                }
                if(os != null){
                    os.close();
                }
            } catch (IOException e) {
                System.err.println("Возникло исключение: " + e.getMessage());
            }
        }
    }
}
