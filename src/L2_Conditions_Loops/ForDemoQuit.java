package L2;

import java.io.IOException;
import java.util.Scanner;

public class ForDemoQuit {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        int i;
//
//        System.out.println("To stop enter q");
//        for (i = 0; i > -100; i++){
//            char userInput = input.nextLine().charAt(0);
//            System.out.println("Run nr. " + i);
//            if (userInput =='q') i = -10;
//
//        }

        for (i = 0; i <10;){
            System.out.println("Run nr. " + i);
            i++;
        }
    }
}
