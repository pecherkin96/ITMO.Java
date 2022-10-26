package ITMO.Java.Lab7;

public class Plane {

//    Создайте класс Самолет. В классе создайте вложенный класс крыло. Внутри класса Крыло реализуйте:
//            ●	поле для хранения информации про вес крыла;
//            ●	метод, что будет показывать вес крыла.
//
//	    В главном классе создайте объект и добавьте во вложенный класс данные про вес крыла,
//    а также выведите информацию на экран. Создайте два объекта и добавьте разный вес для крыльев.


    class Wing {
        Integer weight = 0;

        public void printWeigh(Integer weight) {
            this.weight = weight;
            System.out.println("Вес крыла составляет: " + weight);
        }
    }

    public static void main(String[] args) {
        Plane plane = new Plane();
        Plane.Wing leftWing = plane.new Wing();
        Plane.Wing rightWing = plane.new Wing();

        leftWing.weight = 150;
        leftWing.printWeigh(leftWing.weight);

        rightWing.weight = 200;
        rightWing.printWeigh(rightWing.weight);
    }
}
