package Homeworks.L3HW_Java_Prepelita_Natalia;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
      int a;

          System.out.println("Введите число: ");
          Scanner myNumber = new Scanner(System.in);
          a = myNumber.nextInt();

          if ((a % 2) == 0) {
              System.out.printf("Число %d является чётным",a);
          } else {
              System.out.printf("Число %d является нечётным",a);
          }
    }
}
