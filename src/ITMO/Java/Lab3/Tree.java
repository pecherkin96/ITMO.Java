package ITMO.Java.Lab3;

public class Tree {

//    Создайте класс Tree. Добавьте в него поля: возраст, живое ли дерево и название дерева.
//    Создайте три конструктора:
//            ●	Конструктор, который устанавливает только возраст и название;
//            ●	Конструктор, который устанавливает все переменные в классе;
//            ●	Конструктор, который ничего не устанавливает, но выводит сообщение
//            «Пустой конструктор без параметров сработал».

//    Создайте три объекта на основе класса и используйте по одному конструктору на каждый.

    private String name;
    private Integer age;
    private Boolean isAlive;

    public Tree(){
        System.out.println("Пустой конструктор без параметров сработал");
    }
    public Tree(String name, Integer age){
        this.name = name;
        this.age = age;
    }
    public Tree(String name, Integer age,Boolean isAlive){
        this.name = name;
        this.age = age;
        this.isAlive = isAlive;

    }

    public static void main(String[] args) {
        Tree tree1 = new Tree();
        Tree tree2 = new Tree("Big Tree",100);
        Tree tree3 = new Tree("Old",1000,true);
    }
}
