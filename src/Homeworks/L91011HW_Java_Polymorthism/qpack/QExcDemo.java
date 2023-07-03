package Homeworks.L91011HW_Java_Polymorthism.qpack;

public class QExcDemo {
    public static void main(String[] args) {
        FixQueue q = new FixQueue(10);
        char ch;
        int i;

        try{
            for (i = 0; i < 11; i++){
                System.out.print("Attempt to save: " + (char)('A' + i));
                q.put((char)('A' + i));
                System.out.println(" - Ok");
            }
            System.out.println();
        }catch (QueueFullException exc){
            System.out.println(exc);
        }
        System.out.println();

        try{
            for (i = 0; i < 11; i++){
                System.out.print("Getting the next character: ");
                ch = q.get();
                System.out.println(ch);
            }
        }catch (QueueEmptyException exc){
            System.out.println(exc);
        }

    }
}

