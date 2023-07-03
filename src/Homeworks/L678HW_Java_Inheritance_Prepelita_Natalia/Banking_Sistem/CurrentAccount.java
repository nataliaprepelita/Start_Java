package Homeworks.L678_Java_Inheritance_Prepelita_Natalia.Banking_Sistem;

public class CurrentAccount extends Account{
    String type = "current";
    CurrentAccount(String accountNumber, String currency, double balance) {
        super(accountNumber, currency, balance);
    }
}
