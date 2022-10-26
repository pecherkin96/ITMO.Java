package ITMO.Java.Lab6.ex5;

public class Name extends Age {

private String name;

    @Override
    public void setAge() {
        super.setAge();
    }
    public void printInfo(){
        System.out.println("Введите Имя:");
        name = scanner.next();
        System.out.println(name + " " + getAge());
    }

    public static void main(String[] args) {
        Name information = new Name();
        information.setAge();
        information.printInfo();
    }
}
