package ITMO.Java.Lab6.ex1;

public class Client extends Person {

    private String Name_bank;

    public Client(String firstname, String lastname, String name_bank) {
        super(firstname, lastname);
        this.Name_bank = name_bank;
    }

    public void setName_bank(String name_bank) {
        this.Name_bank = name_bank;
    }


    @Override
    public String getAll() {
        String firstname = super.getFirstname();
        String lastname = super.getLastname();
        String full_info = lastname + firstname + Name_bank;
        return full_info;
    }
}
