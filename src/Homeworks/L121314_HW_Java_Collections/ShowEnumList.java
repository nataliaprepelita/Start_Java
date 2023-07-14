package Homeworks.L121314_HW_Java_Collections;

public class ShowEnumList {
    public static void main(String[] args) {
        for (Tools t : Tools.values()) {
            System.out.println(t + " " + "is by index : " + t.ordinal());
        }

    }
}
enum Tools{
    SCREWDRIVER,
    WRENCH,
    НАММЕR,
    PLIERS
}
