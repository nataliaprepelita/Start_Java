package Homeworks.L5HW_Java_Arrays_Prepelita_Natalia;

public class Avg {
    public static void main(String[] args) {
        double numbers [] = {0.5, 6.0, 7.2, 6.9, 9.0, 3.4, 5.25, 5.5, 7.0, 8.6 };

        double avg;
        double sum = 0;

        for(double x: numbers) sum+=x;
        avg = sum / numbers.length;
        System.out.println("Среднее арифметическое массива numbers равно: " + avg);
        




    }
}
