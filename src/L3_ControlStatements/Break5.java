package L3_;

public class Break5 {
    public static void main(String[] args) {

        done: for (int i = 0; i <10; i ++){
              for (int j = 0; j < 10; j++){
              for (int k = 0; k < 10; k++){
                  System.out.println( k+ " ");
                  if (k==5)break done;
            }
                  System.out.println("После цикла по k ");
        }
            System.out.println("после цикла по j ");
        }
        System.out.println("после цикала по i ");
    }
}
