package ITMO.Java.Lab6.ex3;

public class Truck extends Car{
    Integer Max_weight;
    Integer Wheels_number;

    public Truck(int w, String m, char c, float s, Integer max_weight, Integer wheels_number) {
        super(w, m, c, s);
        this.Max_weight = max_weight;
        this.Wheels_number = wheels_number;
    }

    public void newWheels( int wheels_number){
        this.Wheels_number = wheels_number;
        System.out.println("Текущее количество колёс:" + Wheels_number);
    }
}
