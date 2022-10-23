package ITMO.Java.Lab6.ex1;

public abstract class Person {

    private String Firstname;
    private String Lastname;

    public String getFirstname() {
        return Firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public Person(String firstname, String lastname){
        this.Firstname = firstname;
        this.Lastname = lastname;
    }
    public abstract String getAll();

}
