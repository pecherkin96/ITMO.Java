package ITMO.Java.Lab3;

class Car {

//    Создайте простой класс, который будет иметь поля: цвет, название, вес. Создайте метод
//    в классе через который можно будет вывести все эти данные. Добавьте два объекта,
//    установите для них значения и выведите все при помощи ранее созданного метода.
//    Также добавьте несколько конструкторов, которые будут устанавливать:
//            ●	только цвет машины;
//            ●	цвет и вес машины;
//            ●	и пустой конструктор.


    private String Name;
   private String Color;
   private Integer Weight;
   private String Writeine;


   public Car(){

  }
    public Car(String color) {
        this.Color = color;
    }
    public Car(String color,Integer weight){
        this.Color = color;
        this.Weight = weight;
    }
    public String printCar() {
       Writeine = "Цвет:"+ Color + " " + "Вес:" + Weight;
       return this.Writeine;
    }

    public static void main(String[] args) {
        Car car1 = new Car("Black");
        Car car2 = new Car("Silver",900);


        System.out.println(car1.printCar());
        System.out.println(car2.printCar());
    }
}
