package ITMO.Java.Lab6.ex1;

public class Client extends Person {

    private String nameBank;

    public Client(String firstname, String lastname, String nameBank) {
        super(firstname, lastname);
        this.nameBank = nameBank;
    }

    public void setNameBank(String nameBank) {
        this.nameBank = nameBank;
    }


    @Override
    public void getAll() {
        String firstname = super.getFirstname();
        String lastname = super.getLastname();
    }
}
