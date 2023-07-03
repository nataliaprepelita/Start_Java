package Homeworks.L678_Java_Inheritance_Prepelita_Natalia.Banking_Sistem;

import java.nio.charset.Charset;
import java.util.Random;

public class DepositAccount extends Account{
    String type = "deposit";
    DepositAccount(String accountNumber, String currency, double balance) {
        super(accountNumber, currency, balance);
    }

}
