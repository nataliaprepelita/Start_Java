package L7_Inheritance;

public class B extends A {
    int i;

    B(int a, int b){
        super.i = a;
        i = b;
    }
    void show (){
        System.out.println("i in superclass: " + super.i);
        System.out.println("i in subclass: " + i);
    }

    public static void main(String[] args) {
        B myB = new B (2,4);
        myB.show();
    }
}
