package Homeworks.L5HW_Java_Arrays_Prepelita_Natalia;

public class BubbleString {
    public static void main(String[] args) {
        String vegetables[] = {"carrot", "potato","cucumber", "tomato"};

        int a, b;
        String t;
        int size = vegetables.length;

        System.out.print("Исходный массив: ");
        for (int i = 0; i < size; i++)
            System.out.print(" " + vegetables[i]);
        System.out.println();

        for (a = 1; a < size; a++)
            for (b = size - 1; b >= a; b--) {
                if (vegetables[b-1].compareTo(vegetables[b])>0) {
                    t = vegetables[b - 1];
                    vegetables[b - 1] = vegetables[b];
                    vegetables[b] = t;
                }
            }

        System.out.print("Отсортированный массив:");
        for(int i=0; i < size; i++)
            System.out.print(" " + vegetables[i]);
        System.out.println();

    }
}
