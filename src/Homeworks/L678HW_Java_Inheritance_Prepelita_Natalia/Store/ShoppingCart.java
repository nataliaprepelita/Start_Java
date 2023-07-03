package Homeworks.L678_Java_Inheritance_Prepelita_Natalia.Store;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    float total = 0.0f;
    List<Products> items = new ArrayList<>();

    void addItem(Products p){
        items.add(p);
        System.out.println("New item added: " + p.getName());
    }
    void removeItem(Products p){
        items.remove(p);
        System.out.println("Item: " + p.getName() + " removed from cart");
    }

    float totalCount() {
        for (Products x: items) {
            total += x.getPrice();
        }
        return total;
    }

    void showCart() {
        System.out.println("Cart contents: ");
        for (int i = 0; i < items.size(); i++) {
            Products p = items.get(i);
            System.out.println(p.getName());
        }
    }
}
