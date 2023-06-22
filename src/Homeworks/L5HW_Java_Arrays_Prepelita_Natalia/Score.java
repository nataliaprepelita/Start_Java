package Homeworks.L5HW_Java_Arrays_Prepelita_Natalia;

public class Score {
    public static void main(String[] args) {
        Score grade1 = new Score();
        System.out.println(grade1.examGrade(90));
    }

    public String examGrade(int i){
        if (i >= 90) return "A";
        else if (i >= 80) return "B";
        else if (i >= 70) return "C";
        else if (i >= 60) return "D";
        else return "F";
    }
}

