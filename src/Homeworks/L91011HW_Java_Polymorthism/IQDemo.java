package Homeworks.L91011HW_Java_Polymorthism;

import Homeworks.L91011HW_Java_Polymorthism.qpack.*;
public class IQDemo {
    public static void main(String[] args) {
        FixQueue fixedQueue = new FixQueue(10);
        DynQueue dynQueue = new DynQueue(10);
        CircularQueue circularQueue = new CircularQueue(10);
        int i = 0;
        char ch;
//        for (i = 0; i < 10; i++)
//            fixedQueue.put((char) ('A' + i));
//
//        for (i = 0; i < 10; i++)
//            System.out.print(fixedQueue.get());
//        System.out.println();

        for (i = 0; i < 10; i++)
            circularQueue.put((char) ('A' + i));
        for (i = 0; i < 5; i++){
            ch = circularQueue.get();
        System.out.print(ch);
        }
        for (i = 0; i < 10; i++)
            circularQueue.put((char) ('N' + i));

        for (i = 0; i < 10; i++){
            ch = circularQueue.get();
            System.out.print(ch);
        }

        for (i = 0; i < 20; i++){
            ch = circularQueue.get();
            System.out.print(ch);
        }
    }
}
