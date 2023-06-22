package Homeworks.L5HW_Java_Arrays_Prepelita_Natalia;

import java.sql.Array;
import java.util.Arrays;

public class Sales {
    public static void main(String[] args) {
        float prices[] = new float[6];
        showArray(prices);
        float totalSum = sum(prices);

        if (totalSum >= 1000f & totalSum < 10000f){
            System.out.println("Congratulations! You’ve saved " + 0.1 * totalSum +
                    "\nThe total amount of your purchase after discount is " + (totalSum - (0.1*totalSum)));
        } else if (totalSum >= 10000f) {
            System.out.println("Congratulations! You’ve saved " + 0.2 * totalSum +
                    "\nThe total amount of your purchase after discount is " + (totalSum - (0.2*totalSum)));
        }
        else {System.out.println("\nSpend " + (1000f - totalSum) + " $ more to get the discount. Do you want to continue?");
        }

    }

    public static void showArray(float prices[]) {
        for (int i = 0; i < prices.length; i++) {
            prices[i] = i + 0.5f;
            System.out.print(prices[i] + " ");
        }
    }

    static float sum(float prices[]) {
        float sumOfpurchases = 0f;
        for (int i = 0; i < prices.length; i++) {
            sumOfpurchases += prices[i];
        }
        return sumOfpurchases;
    }
}
