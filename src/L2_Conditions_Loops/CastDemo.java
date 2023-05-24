package L2;

public class CastDemo {
    public static void main(String[] args) {
        double x,y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;
        i = (int) (x/y);
        System.out.println("Integer part of result of division x/y: " + i);

        i = 100;
        b = (byte) i;
        System.out.println("Value of b: " + b);

        i = 257;
        b = (byte) i;
        System.out.println("Value of b: " + b);

        b = 88;
        ch = (char) b;
        System.out.println("ch: " + ch);

        ch = '&';
        b = (byte) ch;
        System.out.println("Value of b: " + b);

        b = 10;
        i = b * b;

        b = (byte) (b * b);

        for (i = 0; i < 5; i++){
            System.out.println(i + "/ 3: " + i/3);
            System.out.println(i + "/ 3 : with floating point " + (double) i/3);
        }




    }
}
