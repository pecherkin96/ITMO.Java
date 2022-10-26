package ITMO.Java.Lab6.ex1;

public class Clerk extends Person{

    private String nameBank;

    public void setNameBank(String nameBank) {
        this.nameBank = nameBank;
    }
    public Clerk(String firstname,String lastname, String nameBank){
        super(firstname, lastname);
        this.nameBank = nameBank;
    }

    @Override
    public void getAll() {
    }
}
