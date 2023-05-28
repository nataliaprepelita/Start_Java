package Homeworks.L2HW_Java_Prepelita_Natalia;

import java.util.Scanner;

//Упражнение 1 стр.125
//Напишите программу, которая получает символы, введенные с клавиатуры, до тех пор, пока не встретится точка.
// Предусмотрите в программе счетчик пробелов. Сведения о количестве пробелов должны выводиться в конце программы.
public class ForTest1 {
    public static void main(String[] args)
    throws java.io.IOException {
       int i = 0;
       int spaces = 0;
       char ch;


       do{
           ch = (char)System.in.read();
           if (ch == ' ') spaces++;
           i++;
           System.out.println("Проход # " + i);
       } while (ch != '.');

        System.out.println("Пробелов: " + spaces);
    }
}
