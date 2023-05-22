import java.util.Scanner;

public class WeightOnTheMoon {
    public static void main(String[] args) {
        double weightE;
        double weightM;

        Scanner weight = new Scanner(System.in);
        System.out.println("Введите свой вес: ");

        weightE = weight.nextDouble();
        weightM = weightE * 0.17;

        String string_1 = "Ваш вес на Луне равен:  ";
        System.out.println(string_1 + weightM + " кг");


    }
}
