package ITMO.Java.Lab6.ex5;

public class Name extends Age {

private String name;

    @Override
    public void setAge() {
        super.setAge();
        System.out.println("Введите Имя:");
        name = scanner.next();
        System.out.println(name + " " + getAge());
    }

    public static void main(String[] args) {
        Name name_age = new Name();
        name_age.setAge();
    }
}
