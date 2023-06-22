package Homeworks.L5HW_Java_Arrays_Prepelita_Natalia;

import java.util.Scanner;

public class RetirementAge {
    public static void main(String[] args) {
        System.out.println("Введите ваш пол: f or m ");
        Scanner g = new Scanner(System.in);
        char gender = g.next().charAt(0);

        System.out.println("Введите ваш возраст:");
        Scanner a = new Scanner(System.in);
        int age = a.nextInt();

        if (gender == 'm'){
             if (age <= 70) System.out.println("До выхода на пенсию осталось: " + (70 - age) + " лет");
             else System.out.println((age - 70) + " лет назад человек вышел на пенсию");
        }
        else {
            if (age <= 65) System.out.println("До выхода на пенсию осталось: " + (65 - age) + " лет");
            else System.out.println((age - 65) + " лет назад человек вышел на пенсию");

        }
    }
}
