package L7_Inheritance;

public class VarArgsArray {
    static void varTest(String msg, int ... v){
        System.out.println(msg + v.length);
        System.out.println("Contains: ");
        for (int i = 0; i < v.length; i++){
            System.out.print("arg" + i + ": " + v[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        varTest("One argument in an array: ", 10);
        varTest("Two argument in an array: " ,10, 2);
        varTest("No argument in an array: " );
    }
}
