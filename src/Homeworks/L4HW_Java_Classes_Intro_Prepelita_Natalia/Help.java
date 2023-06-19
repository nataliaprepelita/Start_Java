package Homeworks.L4HW_Classes_Intro_Prepelita_Natalia;

public class Help {
    void helpon (int what){
        switch (what) {
            case '1':
                System.out.printf("Оператор if:%nif(условие) оператор;%nelse оператор;%n");
                break;

            case '2':
                System.out.printf("Оператор switch:%nswitch (выражение) {%ncase константа:%nпоследовательность операторов%nbreak;%n// ...%n}%n");
                break;

            case '3':
                System.out.printf("Оператор for:%nfor(инициализация; условие; итерация)%nоператор;%n");
                break;

            case '4':
                System.out.printf("Оператор while:%nwhile(условие) оператор;%n");
                break;

            case '5':
                System.out.printf("Оператор do-while:%ndo {%nоператор;%n} while (условие);%n");
                break;
            case '6':
                System.out.printf("Оператор break:%nbreak; или break метка;%n");
                break;
            case '7':
                System.out.printf("Оператор continue:%ncontinue; или continue метка;%n");
                break;
        }
        System.out.println();

    }

    void showmenu(){
        System.out.printf("Справка%n1.if%n2.switch%n3.for%n4.while%n5.do-while%n6.break%n7.continue%n%nВыберите (q -выход):");
    }

    boolean isvalid (int ch){
        if (ch < '1' | ch > '7' & ch != 'q') return false;
        else return true;
    }
}
