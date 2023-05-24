package Homeworks.L1HW_Java_Prepelita_Natalia;

public class InchesToMeters {
    public static void main(String[] args) {
        double inches, meters;
        int feet;

        feet = 0;
        for (inches = 1; inches <= 144; inches++) {
            meters = inches * 39.37; // преобразовать в метры
            System.out.println(inches + " дюймама соответсвует  " + meters + " метров.");

            feet++;
            if (feet == 12) {
                System.out.println();
                feet = 0;
            }
        }
    }
}
