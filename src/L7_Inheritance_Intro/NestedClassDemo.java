package L7_Inheritance;

import L6_Acces_Modifiers.Overload;

public class NestedClassDemo {
    public static void main(String[] args) {
        int[] x = {3, 12, 45, -7, 0, 24};
        Outer outerOb = new Outer(x);
        outerOb.analyze();

        Overload myClassObj = new Overload();
        int n = 15;
        myClassObj.sum(2,3,4,5);
    }
}
