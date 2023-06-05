package Homeworks.L3HW_Java_Prepelita_Natalia;

import java.util.Scanner;

public class Task8 {
    public static void main(String args[]) {
        int n;
        boolean exists = false;
        String result = new String();

        System.out.printf("Enter the number: ");
        Scanner myNumber = new Scanner(System.in);
        n = myNumber.nextInt();

        for (int i = 2; i <= Math.sqrt(n); i++) {
            for (int j = 2; j < n; j++) {
                if (i * j == n) {
                    result = "\n" + result + i + " and " + j + "\n";
                    exists = true;
                }
            }
        }

        if (exists == false){
            System.out.printf(" The number %d has no multipliers, so it is a prime number. " +
                    "A prime number (or a prime) is a natural number greater than 1 that is not " +
                    "a product of two smaller natural numbers", n);
        } else {
            System.out.printf("The number %d is a product of: %s",n, result);
        }


    }
}
