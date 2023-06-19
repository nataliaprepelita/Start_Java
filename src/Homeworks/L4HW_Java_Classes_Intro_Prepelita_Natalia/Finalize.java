package Homeworks.L4HW_Classes_Intro_Prepelita_Natalia;

public class Finalize {
    public static void main(String[] args) {
        int count;
        FDemo ob = new FDemo(0);
        /*Генерируется большое количество объектов.
         В какой-то момент времени должна начаться сборка мусора.
         Примечание: возможно, для того чтобы активизировать
         систему сборки мусора, количество генерируемых объектов
         придется увеличить. */

        for(count=1; count < 1000000; count++)
            ob.generator(count);
    }
}
