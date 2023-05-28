package L3_;

import java.util.Scanner;

public class ExceptingOrDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Is the product on 50% discount?");
        boolean isDiscounted = in.nextBoolean();

        System.out.println("Do you have 50% discount card?");
        boolean hasCard = in.nextBoolean();
        
        System.out.println("Enter product price: ");
        double initialPrice = in.nextDouble();

        if (isDiscounted ^ hasCard){
            System.out.println("Either customer has discount card or the product is discounted itself, not both!");
            initialPrice /=2;
        }else {
            if (isDiscounted){
                System.out.println("Already discounted. You have card but it is not applicable.");
            }else {
                System.out.println("Neither the product is discounted nor you have discount card, so pay full initialPrice");
            }
        }

        System.out.println("The discount has been applied. The final product price is " + initialPrice);
    }

}
