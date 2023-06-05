package Homeworks.L3HW_Java_Prepelita_Natalia;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        float a,b;

        Scanner myNumbers = new Scanner(System.in);
        System.out.printf("%s", "Введите исходные числа: ");

        a = myNumbers.nextFloat();
        b = myNumbers.nextFloat();

        float sum;
        sum = a + b;

        System.out.printf("%s %f", "Сумма введенных чисел равна: ", sum);

        float avg;
        avg = (a+b)/2;
        System.out.printf("\n%s %f", "Среднее значение введенных чисел равно: ", avg);

        if ((a>b)==true){
            System.out.printf("\n%s %f %s %f ", "Результат сравдения равен: ", a, " больше ", b);
        }else {
            System.out.printf("\n%s %f %s %f", "Результат сравнения равен: ", a, " меньше ", b);
        }


    }
}
