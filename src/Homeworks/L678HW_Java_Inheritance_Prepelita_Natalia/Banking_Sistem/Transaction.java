package Homeworks.L678_Java_Inheritance_Prepelita_Natalia.Banking_Sistem;

public class Transaction {
    public static void replenishment(Account account, double amount){
        account.balance += amount;
    }
    public static void withdrawal(Account account, double amount){
        account.balance -= amount;
    }
}
