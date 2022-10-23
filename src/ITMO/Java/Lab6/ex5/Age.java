package ITMO.Java.Lab6.ex5;

import java.util.Scanner;

public class Age {

    private Integer age;
    Scanner scanner = new Scanner(System.in);

    public void setAge(){
        System.out.println("Введите возраст:");
        age = scanner.nextInt();
    }

    public Integer getAge() {
        return age;
    }
}
