package L2;

import L1_Java_Primitives_Operations.Sound;

public class ForDemo {
    public static void main(String[] args) {
//        for (intialisation; condition; iteration){
//            sequance of operators;
//        }

        double num, squareRoot, roundErr;

        for (num = 1.0; num <100.0; num++){
            squareRoot = Math.sqrt(num);
            System.out.println("Square root of: " + num + " is equal to " + squareRoot);
            roundErr = num - (squareRoot * squareRoot);
            System.out.println("error is " + roundErr);
            System.out.println();

        }

        for (int x = 100; x > - 100; x -=5){
            System.out.println(x);
        }

        for (int counter = 10; counter < 5; counter ++){
            System.out.println("THIS WON'T BE PRINTED");
        }

        int i,j;


        for (i = 0, j = 10; i <j; i++, j--){
            System.out.println("i & j" + i + " ");
        }


    }
}
