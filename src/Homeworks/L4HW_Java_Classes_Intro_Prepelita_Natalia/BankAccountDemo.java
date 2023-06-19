package Homeworks.L4HW_Classes_Intro_Prepelita_Natalia;

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount accountHolder1 = new BankAccount();
        accountHolder1.balance = 100.45;

        BankAccount accountHolder2 = new BankAccount();
        accountHolder2.balance = 1667.78;

        double a = 200.00;
        accountHolder1.replenishmentAccount(a);
        System.out.println("Bank account of accountHolder1 was replenished with " + a + "." +
                " Balance account of accountHolder1 is " + accountHolder1.balance + "." );

        double c = 259.89;
        accountHolder1.cashWithdrawal(c);
        System.out.println("From the bank account of accountHolder2 were withdrawn money in the amount of " + c + "." +
                " Balance account of accountHolder2 is " + accountHolder1.balance + "." );


        double h = 200.56;
        accountHolder2.replenishmentAccount(a);
        System.out.println("Bank account of accountHolder1 was replenished with " + h + "." +
                " Balance account of accountHolder1 is " + accountHolder2.balance + "." );
        double b = 145.70;
        accountHolder2.cashWithdrawal(b);
        System.out.println("From the bank account of accountHolder2 were withdrawn money in the amount of " + b + "." +
                " Balance account of accountHolder2 is " + accountHolder2.balance + "." );

    }
}
