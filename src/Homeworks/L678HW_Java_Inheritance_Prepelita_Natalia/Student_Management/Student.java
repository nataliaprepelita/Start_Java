package Homeworks.L678_Java_Inheritance_Prepelita_Natalia.Student_Management;

import java.util.ArrayList;
import java.util.List;

public class Student {
    String firstName;
    String lastName;
    List<Integer> grades = new ArrayList<>();

    int gradesAvg() {
        Integer total = 0;
        int count = 0;
        for (Integer g : grades) {
            total += g;
            count++;
        }

        return total / count;
    }
}
