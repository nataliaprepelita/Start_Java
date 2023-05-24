package L2;

import java.util.Scanner;

public class FactorilaDemo {
    public static void main(String[] args) {

        int sum = 0;
        int factorial = 1;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number to get sum of all integer numbers from 1 to it and its factorial " );
        int num = input.nextInt();

        for (int i =1; i <= num; i++){
            sum +=i;
            factorial *= i;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Factorial: " + factorial);
    }
}
