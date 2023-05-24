public class ShortOperationsShortage {
    public static void main(String[] args) {
       int n,d,q;
        n = 10;
        d = 2;

        if (d!=0 && ( n % d== 0)) System.out.println(d+  "is a divider of" +n);

        d = 0;

        if (d!=0 && ( n % d== 0)) System.out.println(d+  "is a divider of" +n);

        int i;

        i = 0;
        if (true | (++i < 100)) System.out.println("this will be  printed");
        System.out.println("i now is equal to " +i);
    }
}
