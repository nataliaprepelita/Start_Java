package Homeworks.L4HW_Classes_Intro_Prepelita_Natalia;

public class FDemo {
    int x;
    FDemo (int i){
        x = i;
    }
    //вызывается при удалении объекта
    protected void finalize () {
        System.out.println(" Финализация " + x );
    }
    //генерирует объект, который тотчас уничтожается
    void generator (int i) {
        FDemo o = new FDemo(i);
    }
}
