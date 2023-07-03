package Homeworks.L678_Java_Inheritance_Prepelita_Natalia.Store;

import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        char addMore = 'y';

        do {
            System.out.println("Enter product name: ");
            Scanner input = new Scanner(System.in);
            String productName = input.nextLine();
            switch (productName){
                case "milk":
                    Milk milk = new Milk();
                    cart.addItem(milk);
                    break;
                case "carrot":
                    Carrot carrot = new Carrot();
                    cart.addItem(carrot);
                    break;
            }
            System.out.println("If you want to continue shopping enter 'y'. If not - 'n'.");
            addMore = input.next().charAt(0);

            if (addMore == 'n') break;

        }while (addMore == 'y');


        cart.showCart();
        System.out.println("Total cart: " + cart.totalCount());
    }
}
