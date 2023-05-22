/*
Упражнение 1.1 стр.46
Программа перевода галлонов в литры.
Присвойте файлу с исходным кодом имя GalToLit.java.
*/

import java.util.Scanner;

public class GalToLit {
    public static void main(String[] args) {
        double gallons; //в этой переменной хранится значение,
                        // выражающее объем жидкости в галлонах
        double liters; //в этой переменной хранится значение,
                       // выражающее объем жидкости в литрах
//       gallons = 10;
//       liters = gallons * 3.7854;
//       System.out.println( gallons +" галлонам соответсвует " + liters + " литров");


        Scanner y = new Scanner(System.in);
        System.out.println("Введите исходное значение галлонов: ");

        gallons = y.nextDouble();
        liters = gallons * 3.7854;

        String my_string = "Галлоны, преобразованные в литры: ";
        System.out.println(my_string + liters + " liters");




    }
}
