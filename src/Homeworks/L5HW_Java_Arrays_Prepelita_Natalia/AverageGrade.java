package Homeworks.L5HW_Java_Arrays_Prepelita_Natalia;

import java.util.Scanner;

public class AverageGrade {
    public static void main(String[] args) {
        System.out.println("In this group there are 5 students.");

        int [][] studentGrade = {
                {10,8,9,8,9,10,8},
                {10,7,8,9},
                {10,9,9,10},
                {8,8,9},
                {10,9,9}
        };

        int i = 0;
        float g =0;
        do {
            float m =0;
            float sum = 0f;
            for (float grades : studentGrade[i] ) sum +=grades;
            m = sum / studentGrade[i].length;
            g += m;
            i++;
        }
        while (i < studentGrade.length);
        System.out.println("Average grade of this group is: : " + (g/ studentGrade.length));

    }


}
