package Homeworks.L5HW_Java_Arrays_Prepelita_Natalia;

public class QDemo {
    public static void main(String[] args) {
        Queue qExchange = new Queue(24);
        Queue qLoans = new Queue(10);
        int number;
        int i;

        System.out.println("In the bank for currency exchange number of coupon can be printed only for 24 person:");

        for ( i = 0; i < 25; i++ ){
            qExchange.put(1 + i);
        }
        System.out.print("Number of coupon in the queue for currency exchange: ");
        for (i = 0; i < 25; i++){
            number = qExchange.get();
            if ( number !=0 ) System.out.print(number);
        }
        System.out.println("\n");

        System.out.println("In the bank number for loans number of coupon can be printed only for 10 person:");
        System.out.print("Number of coupon in the queue for currency exchange: ");
        for (i = 0; i < 11; i++){
            System.out.println("Attempt to take a coupon to loans department." + (11 - i));
            qLoans.put(11-i);
        }
        System.out.print("Number of coupons to loans department: ");
        for (i = 0; i < 11; i++){
            number = qLoans.get();
            if (number!= 0) System.out.print(number);
        }
    }
}

class Queue {
    int queue[];
    int putloc, getloc;

    Queue(int size) {
        queue = new int[size + 1];
        putloc = getloc = 0;
    }

    void put(int num) {
        if (putloc == queue.length - 1) {
            System.out.println("\nThe queue is full. There are no more coupons in this terminal. Please, go to another terminal.");
            return;
        }
        putloc++;
        queue[putloc] = num;
    }

    int get() {
        if (getloc == putloc) {
            System.out.println("\nThe queue is empty. Please, take your coupon with your number. ");
            return 0;
        }
        getloc++;
        return queue[getloc];
    }
}
