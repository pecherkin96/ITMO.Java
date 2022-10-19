package ITMO.Java.Lab3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.Scanner;

public class House {

    private String Name;
    private Integer Year_built;
    private Integer Number_Floors;
    private String Writeline;
    private Integer Age;

    public void Settingall(String name,Integer year_built, Integer number_floors){

        this.Name = name;
        this.Year_built = year_built;
        this.Number_Floors = number_floors;
    }
    public String Printhouse(){

        Writeline ="Название: " + Name + " " + "Год постройки: " + Year_built + " "
                + "Кол. Этажей: " + " " + Number_Floors + " " + "Возраст: " + Age();
        return this.Writeline;
    }
    public Integer  Age(){
        this.Year_built = Year_built;
        LocalDate date = LocalDate.now();
        int year_current = date.getYear();
        Age = year_current - Year_built;
        return this.Age;
    }
    public void ConstractHouse() {
        System.out.println("Название Дома?");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            Name = scanner.nextLine();
        }

        System.out.println("Количество этажей?");
        if (scanner.hasNext()) {
            Number_Floors = scanner.nextInt();
        }
        System.out.println("Год постройки?");
        if (scanner.hasNext()){
            Year_built = scanner.nextInt();
        }
        }

    public static void main(String[] args) {
        House house1 = new House();
        House house2 = new House();

        house1.ConstractHouse();
        house2.Settingall("BigHouse", 1988,9);

        System.out.println(house1.Printhouse());
        System.out.println((house2.Printhouse()));

    }
}