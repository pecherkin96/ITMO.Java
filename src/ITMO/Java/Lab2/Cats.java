package ITMO.Java.Lab2;

public class Cats {

//    Создать класс, который обозначает какую-либо сущность.
//    Определить у него несколько конструкторов - конструктор по умолчанию и конструктор со всеми параметрами.
//    Определить для него несколько параметров.



    String breed;
    String color;
    Integer age;

    public Cats(){

    }

    public Cats(String breed, String color, Integer age){
        this.breed = breed;
        this.color = color;
        this.age = age;

    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
