package Homeworks.L678_Java_Inheritance_Prepelita_Natalia.Banking_Sistem;

public class Account {
    String accountNumber;
    String currency;
    double balance;
    Account(String accountNumber,String currency, double balance){
        this.accountNumber = accountNumber;
        this.currency = currency;
        this.balance = balance;
    }
    void generateInfo(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Currency: " + currency);
        System.out.println("Balance: " + balance);
    }

}
