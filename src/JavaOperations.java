import java.util.Scanner;

public class JavaOperations {
    public static void main(String[] args) {
        int a = 1, b = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integer value of variable a:");
        a = input.nextInt();
        System.out.println("Enter integer value of variable b:");
        b = input.nextInt();

        double  resultPlus = a + b;
        double  resultMinus = a - b;
        double  resultDivide = a / b;
        double  resultMultiply = a * b;
        double  resultModule = a % b;

//
//        System.out.println("resultPlus: " + resultPlus);
//        System.out.println("resultMinus: " + resultMinus);
//        System.out.println("resultDivide: " + resultDivide);
//        System.out.println("resultMultiply: " + resultMultiply);
//        System.out.println("resultModule: " + resultModule);
//
//        System.out.println("initial " + a);
//        System.out.println("1st " + a++);
//        System.out.println("2st " + ++a);
//        System.out.println("3st " + a);

        boolean b1, b2;

        if (a > b) System.out.println("a > b");
        if (a < b) System.out.println("a < b");
        if (a >= b) System.out.println("a >= b");
        if (a <= b) System.out.println("a <= b");
        if (a == b) System.out.println("a == b");
        if (a != b) System.out.println("a != b");

        b1 = true;
        b2 = false;

        if (b1 & b2) System.out.println("b1 & b2 = true");
        if (b1 | b2) System.out.println("b1 & b2 = true");
        if (!(b1 & b2)) System.out.println("b1 & b2 = true");
        if (b1 && b2) System.out.println("b1 & b2 = true");
        if (b1 || b2) System.out.println("b1 & b2 = true");


    }
}
