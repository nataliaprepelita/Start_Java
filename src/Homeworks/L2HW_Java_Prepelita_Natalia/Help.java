package Homeworks.L2HW_Java_Prepelita_Natalia;

public class Help {
    public static void main(String[] args)
       throws java.io.IOException{


        char choice;

        System.out.println("Справка: ");
        System.out.println("1. if");
        System.out.println("2. switch");
        System.out.print("Выберите: ");

        System.out.println("\n");

        choice = (char)System.in.read();

        switch (choice){
            case '1':
                System.out.println("Оператор if: \n");
                System.out.println("if (ycлoвиe) оператор;");
                System.out.println("else оператор;");
                break;

            case '2':
                System.out.println("Oпepaтop switch:\n");
                System.out.println("switch(выpaжeниe) {");
                System.out.println("case константа:");
                System.out.println("последовательность операторов");
                System.out.println("break;");
                System.out.println("// ... ");
                System.out.println("}");
                break;
            default:
                System.out.print("Запрос не найден");



        }
    }
}
