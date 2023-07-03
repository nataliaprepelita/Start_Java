package Homeworks.L678_Java_Inheritance_Prepelita_Natalia.Student_Management;

import java.util.ArrayList;
import java.util.List;

public class Bachelor {
    List<Student> students = new ArrayList<>();

    void removeStudent(int n) {
        students.remove(n);
        System.out.println("Student nr " + n + " expelled");
    }

    void addStudent(Student s) {
        students.add(s);
    }

    void avgCheck() {
        for (int i = 0; i < students.size(); i++) {
            int avg = students.get(i).gradesAvg();
            System.out.println("Avg of grades is: " + avg);

            if (avg <= 4) {
                removeStudent(i);
            }
        }
    }

    void getCourseInfo() {
        System.out.println("Students of Master course: ");

        for (Student s : students) {
            System.out.println(s.firstName + " " + s.lastName);

            System.out.println("Grades: ");
            for (int g : s.grades) {
                System.out.print(g + " ");
            }
        }
    }
}
