package L3_;

public class BreakWithLabelDemo {
    public static void main(String[] args) {
        int i;

        for (i = 1; i < 4; i++){
            one: {
            two: {
            three:{
                System.out.println("\ni is equal: " + i);
                if (i==1) break one;
                if (i==2) break two;
                if (i==3) break three;

                System.out.println("THIS WON'T BE PRINTED");
            }
                System.out.println("After code block three" );
            }
                System.out.println("After code block two" );
            }
                System.out.println("After code block one" );
        }
    }
}
