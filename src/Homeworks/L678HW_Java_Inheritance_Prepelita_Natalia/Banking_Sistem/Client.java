package Homeworks.L678_Java_Inheritance_Prepelita_Natalia.Banking_Sistem;

public class Client {
    String firstName;
    String lastName;
    String address;
    String phone;
    CurrentAccount current;
    DepositAccount deposit;

    Client(String f, String l, String add, String p){
        firstName = f;
        lastName = l;
        address = add;
        phone = p;
    }

    public void setDepositAccount(DepositAccount deposit) {
        this.deposit = deposit;
    }
    public void setCurrentAccount(CurrentAccount current) {
        this.current = current;
    }
    void openNewAccount(String type, String accNr, String currency, double balance){
        if (type == "deposit"){
            this.deposit = new DepositAccount(accNr, currency, balance);
        } else this.current = new CurrentAccount(accNr, currency, balance);
    }

}
