package ITMO.Java.Lab3;

public class Tree {
    private String Name;
    private Integer Age;
    private Boolean isAlive;

    public Tree(){
        System.out.println("Пустой конструктор без параметров сработал");
    }
    public Tree(String Name, Integer Age){
        this.Name = Name;
        this.Age = Age;
    }
    public Tree(String Name, Integer Age,Boolean isAlive){
        this.Name = Name;
        this.Age = Age;
        this.isAlive = isAlive;

    }

    public static void main(String[] args) {
        Tree tree1 = new Tree();
        Tree tree2 = new Tree("Big Tree",100);
        Tree tree3 = new Tree("Old",1000,true);
    }
}
