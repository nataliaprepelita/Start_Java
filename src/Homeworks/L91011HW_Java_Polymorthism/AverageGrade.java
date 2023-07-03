package Homeworks.L91011HW_Java_Polymorthism;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AverageGrade {
    public static void main(String[] args) {
        Scanner in = null;
        int numGrades = 0;
        int sum = 0;
        int average = 0;

        try{
            in = new Scanner(new File("C:\\Users\\user\\IdeaProjects\\Start_Java\\src\\Homeworks\\L678_Java_Inheritance_Prepelita_Natalia\\Grades.txt"));
        }catch (FileNotFoundException ex){
            System.out.println("Cannot open file " + ex);
        }

        while (in.hasNextLine()){
            String lineOfGrades = in.nextLine();
            ArrayList<String> listOfGrades = new ArrayList<>(Arrays.asList(lineOfGrades.split(",")));
            ArrayList<Integer> listOfIntGrades = new ArrayList<Integer>();
            for (int i = 0; i < listOfGrades.size(); i++){
                listOfIntGrades.add(Integer.parseInt(listOfGrades.get(i)));
            }
            int numberOfGradesPerStudent = 0;
            int sumPerStudent = 0;
            int avgPerStudent = 0;

            for (int i = 0; i < listOfIntGrades.size(); i++) {
                sumPerStudent += listOfIntGrades.get(i);
                numberOfGradesPerStudent++;
            }

            avgPerStudent = sumPerStudent / numberOfGradesPerStudent;
            System.out.println("Average per students is: " + avgPerStudent);
            numGrades += numberOfGradesPerStudent;
            sum += sumPerStudent;
        }
        in.close();
        average = sum/ numGrades;
        System.out.println("Average is per group:  " + average);
    }


}
