package Homeworks.L3HW_Java_Prepelita_Natalia;

public class Task6 {
    public static void main(String[] args)
    throws java.io.IOException {

        char choice, ignore;

        do {
            System.out.printf("Languages:%n1.English%n2.Russian%n3.Romanian%n4.Italian%nChoice:");
            choice = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            }while (ignore != '\n');
        }while (choice < '1' | choice > '4');

        System.out.printf("\n");

        switch (choice) {
            case '1':
                System.out.printf("Hello! ");
                break;
            case '2':
                System.out.printf("Добрый день! ");
                break;
            case '3':
                System.out.printf("Buna ziua! ");
                break;
            case '4':
                System.out.printf("Ciao! ");
                break;
        }
    }
}
