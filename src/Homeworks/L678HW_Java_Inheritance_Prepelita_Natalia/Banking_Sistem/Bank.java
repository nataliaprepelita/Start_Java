package Homeworks.L678_Java_Inheritance_Prepelita_Natalia.Banking_Sistem;

public class Bank {
    public static void main(String[] args) {
        Client client1 = new Client("John", "Brown", "California str.", "+3789-0088-888");
        CurrentAccount acc1 = new CurrentAccount("MD12ML4567", "EUR",0.00);
        client1.setCurrentAccount(acc1);
        getClientInfo(client1);

        Transaction.replenishment(client1.current, 100);
        System.out.println("Account replenishment with: " + client1.current.balance);
        int i = 30;
        Transaction.withdrawal(client1.current,i);
        System.out.println("Account withdrawal with: " + i);
        client1.current.generateInfo();
        System.out.println();

        Client client2 = new Client("Mary", "Teilor", "Wall str.", "+34-89-980-00");
        client2.openNewAccount("deposit", "MD89ML678","EUR", 100);
        getClientInfo(client2);
        client2.deposit.generateInfo();



    }
    static void getClientInfo(Client client){
        System.out.println("FirstName: "+ client.firstName + "\n" + "LastName: " + client.lastName);
    }
}
