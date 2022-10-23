package ITMO.Java.Lab6.ex1;

public class Clerk extends Person{

    private String Name_bank;

    public void setName_bank(String name_bank) {
        this.Name_bank = name_bank;
    }
    public Clerk(String firstname,String lastname, String name_bank){
        super(firstname, lastname);
        this.Name_bank = name_bank;
    }

    @Override
    public String getAll() {
        return "Сотрудник банка" + Name_bank + ":" + getLastname() + getFirstname();
    }
}
