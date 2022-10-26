package ITMO.Java.Lab3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.Scanner;

public class House {


//    Создайте класс Дом. Добавьте в него следующие данные:

//            ●	поля: количество этажей, год постройки, наименование;
//            ●	метод для установки всех значений;
//            ●	метод для вывода всех значений;
//            ●	метод, возвращающий количество лет с момента постройки.

//      На основе класса создайте два объекта и пропишите для каждого характеристики.
//      Добавление характеристик реализуйте через метод класса.
//      Выведите информацию про каждый объект.


    private String name;
    private Integer yearbuilt;
    private Integer numberfloors;
    private String writeline;
    private Integer age;

    public void settingall(String name,Integer yearbuilt, Integer numberfloors){

        this.name = name;
        this.yearbuilt = yearbuilt;
        this.numberfloors = numberfloors;
    }
    public void  printhouse(){

        System.out.println("Название: " + name + " " + "Год постройки: " + yearbuilt + " "
               + "Кол. Этажей: " + " " + numberfloors + " " + "Возраст: " + age());
//
    }
    public Integer  age(){
        LocalDate date = LocalDate.now();
        int yearcurrent = date.getYear();
        age = yearcurrent - yearbuilt;
        return this.age;
    }
    public void constracthouse() {
        System.out.println("Название Дома?");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            name = scanner.nextLine();
        }

        System.out.println("Количество этажей?");
        if (scanner.hasNext()) {
            numberfloors = scanner.nextInt();
        }
        System.out.println("Год постройки?");
        if (scanner.hasNext()){
            yearbuilt = scanner.nextInt();
        }
        }

    public static void main(String[] args) {
        House house1 = new House();
        House house2 = new House();

        house1.constracthouse();
        house2.settingall("BigHouse", 1988,9);

        house1.printhouse();
        house2.printhouse();

    }
}