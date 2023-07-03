package Homeworks.L678_Java_Inheritance_Prepelita_Natalia.Student_Management;

import java.util.Scanner;

public class University {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the course: master or bachelor.");
        char course = input.next().charAt(0);

        if (course == 'b'){
            System.out.println("Enter the number of Bachelor students: ");
            int[] bStudents = new int[input.nextInt()];

            Bachelor b = new Bachelor();
            for(int i = 0; i < bStudents.length; i++) {
                Student s = new Student();
                b.addStudent(s);
                //
                System.out.println("Enter student name and last name.");
                String firstName = input.nextLine();
                s.firstName = firstName;
                //
                String lastName = input.nextLine();
                s.lastName = lastName;
                //
                System.out.println("Enter the number of student grades.");
                int sGradesCount = input.nextInt();
                System.out.println("Enter grades.");
                for(int j = 0; j < sGradesCount; j++) {
                    int grade = input.nextInt();
                    s.grades.add(grade);
                }
            }

            System.out.println("Calculate average grades for students.");
            b.avgCheck();
            b.getCourseInfo();
        } else if (course == 'm'){
            System.out.println("Enter the number of Bachelor students: ");
            int[] bStudents = new int[input.nextInt()];

            Master m = new Master();
            for(int i = 0; i < bStudents.length; i++) {
                Student s = new Student();
                m.addStudent(s);
                //
                System.out.println("Enter student name and last name.");
                String firstName = input.nextLine();
                s.firstName = firstName;
                //
                String lastName = input.nextLine();
                s.lastName = lastName;
                //
                System.out.println("Enter the number of student grades.");
                int sGradesCount = input.nextInt();
                System.out.println("Enter grades.");
                for(int j = 0; j < sGradesCount; j++) {
                    int grade = input.nextInt();
                    s.grades.add(grade);
                }

            }

            System.out.println("Calculate average grades for students.");
            m.avgCheck();
            m.getCourseInfo();
        }
    }
}
