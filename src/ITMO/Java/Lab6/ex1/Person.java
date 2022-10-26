package ITMO.Java.Lab6.ex1;

public abstract class Person {

    private final String firstname;
    private final String lastname;

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

     Person(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
    }
    public abstract void getAll();

}
