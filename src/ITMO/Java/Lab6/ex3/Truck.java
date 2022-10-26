package ITMO.Java.Lab6.ex3;

public class Truck extends Car{
    Integer maxWeight;
    Integer wheelsNumber;

    public Truck(int w, String m, char c, float s, Integer maxWeight, Integer wheelsNumber) {
        super(w, m, c, s);
        this.maxWeight = maxWeight;
        this.wheelsNumber = wheelsNumber;
    }

    public void newWheels( int wheelsNumber){
        this.wheelsNumber = wheelsNumber;
        System.out.println("Текущее количество колёс:" + wheelsNumber);
    }
}
