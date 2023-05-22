public class Scope {
    public static void main(String[] args) {
        int x;

        x = 10;

        if (x == 10) {
            int y = 20;
            System.out.println(x);
            System.out.println(y);
            // x and y: 10 20

        }

        int y;
        y = 1000;
        x = 1000;


    }
}
