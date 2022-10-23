package ITMO.Java.Lab6.ex1;

public class Main implements ICreateAccount {
    public static void main(String[] args) {
        Client client1 = new Client("Ivan", "Petrov", "Green");
        Clerk clerk1 = new Clerk("Irina","Vasilkova","Green");
        client1.getAll();
        clerk1.getAll();
    }

    @Override
    public String CreateAccount() {
        return "Создан новый клиент";
    }
}
