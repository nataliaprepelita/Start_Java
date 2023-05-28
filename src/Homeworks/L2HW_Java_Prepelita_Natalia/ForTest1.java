package Homeworks.L2HW_Java_Prepelita_Natalia;
//Упражнение 1 стр.125
//Напишите программу, которая получает символы, введенные с клавиатуры, до тех пор, пока не встретится точка.
// Предусмотрите в программе счетчик пробелов. Сведения о количестве пробелов должны выводиться в конце программы.
public class ForTest {
    public static void main(String[] args)
    throws java.io.IOException{

        int i;

        System.out.println("Для остановки нажмите клавишу символ точки ' . '");
        for (i=0; (char)System.in.read() != '.'; i++){
            System.out.println("Проход # " +i );
        }

    }
}
