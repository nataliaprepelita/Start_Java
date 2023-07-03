package Homeworks.L678_Java_Inheritance_Prepelita_Natalia;

public class QDemo {
    public static void main(String[] args) {
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;
        int i;

        System.out.println("Using the queue bigQ to save the alphabet");
        for (i = 0; i < 26; i++){
            bigQ.put ((char) ('A' + i));
        }
        System.out.print("bigQ content: ");
        for (i = 0; i < 26; i++){
            ch = bigQ.get();
            if (ch!= (char) 0) System.out.print(ch);
        }
        System.out.println("\n");
        System.out.println("Using the queue smallQ to generate errors");
        for (i = 0; i < 5; i++){
            System.out.print("Attempt to save " + (char) ('Z' - i));
            smallQ.put((char) ('Z' - i));
            System.out.println();
        }
        System.out.println();
        System.out.print("smallQ content: ");
        for (i = 0; i < 5; i++){
            ch = smallQ.get();
            if (ch!= (char) 0) System.out.print(ch);
        }
    }
}
class Queue{
    private char q []; //an array to store the elements of the queue
    private int putloc, getloc; //indexes for insertion and extraction queue elements
    Queue (int size){
        q = new char[size+1]; //allocate memory for the queue
        putloc = getloc = 0;
    }
    void put (char ch){
        if (putloc == q.length - 1){
            System.out.println(" - The queue is full");
            return;
        }
        putloc++;
        q[putloc] = ch;
    }

    char get (){
        if (getloc == putloc){
            System.out.println(" - The queue is empty");
            return (char) 0;
        }
        getloc++;
        return q[getloc];
    }



}
