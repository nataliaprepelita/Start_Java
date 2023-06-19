package L3_;

public class Break4 {
    public static void main(String[] args) {
        int i;

        for (i =1; i <4; i++){
            one:{
            two:{
                three:{
                    System.out.println("\ni равно " + i);
                    if (i == 1) break one;
                    if (i == 2) break two;
                    if (i == 3) break three;

                    System.out.println("не будет выведено");
                }
                System.out.println("после блока three");
            }
            System.out.println("после блока two");
            }
            System.out.println("после блока one");
        }
        System.out.println("после цикла for");

    }
}
