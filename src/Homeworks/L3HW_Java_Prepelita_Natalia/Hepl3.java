package Homeworks.L3HW_Java_Prepelita_Natalia;

public class Hepl3 {
    public static void main(String[] args)
            throws java.io.IOException {

        char choice, ignore;

        for (;;) {

            do {

                System.out.printf("Справка%n1.if%n2.switch%n3.for%n4.while%n5.do-while%n6.break%n7.continue%n%nВыберите (q -выход):");
                choice = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (choice < '1' | choice > '7' & choice != 'q');

            if (choice == 'q')break;

            System.out.printf("\n");

            switch (choice) {
                case '1':
                    System.out.printf("Оператор if:%nif(условие) оператор;%nelse оператор;%n");
                    break;

                case '2':
                    System.out.printf("Оператор switch:%nswitch (выражение) {%ncase константа:%nпоследовательность операторов%nbreak;%n// ...%n}%n");
                    break;

                case '3':
                    System.out.printf("Оператор for:%nfor(инициализация; условие; итерация)%nоператор;%n");
                    break;

                case '4':
                    System.out.printf("Оператор while:%nwhile(условие) оператор;%n");
                    break;

                case '5':
                    System.out.printf("Оператор do-while:%ndo {%nоператор;%n} while (условие);%n");
                    break;
                case '6':
                    System.out.printf("Оператор break:%nbreak; или break метка;%n");
                    break;
                case '7':
                    System.out.printf("Оператор continue:%ncontinue; или continue метка;%n");
                    break;
            }
            System.out.println();
        }
    }
}

