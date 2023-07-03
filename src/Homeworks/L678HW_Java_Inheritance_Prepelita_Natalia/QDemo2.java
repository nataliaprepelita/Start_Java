package Homeworks.L678_Java_Inheritance_Prepelita_Natalia;

public class QDemo2 {
    public static void main(String[] args) {
        Queue1 q1 = new Queue1(10);
        char name [] = {'T', 'o', 'm'};
        Queue1 q2 = new Queue1(name);//создать очередь на основе массива
        char ch;
        int i;

        for (i = 0; i < 10; i++)//поместить ряд символов в очередь q1
            q1.put((char)('A' + i));
        //создать одну очередь на основе другой
        Queue1 q3 = new Queue1(q1);

        System.out.print("q1 content: ");
        for (i = 0; i < 10; i++){
            ch = q1.get();
            System.out.print(ch);
        }
        System.out.println("\n");

        System.out.print("q2 content: ");
        for (i = 0; i < 3; i++){
            ch = q2.get();
            System.out.print(ch);
        }
        System.out.println("\n");

        System.out.print("q3 content: ");
        for (i = 0; i < 10; i++){
            ch = q3.get();
            System.out.print(ch);
        }

    }
}
class Queue1 {
    private char q[]; //an array to store the elements of the queue
    private int putloc, getloc; //indexes for insertion and extraction queue elements

    Queue1(int size) {
        q = new char[size + 1]; //allocate memory for the queue
        putloc = getloc = 0;
    }

    Queue1(Queue1 ob) {
        putloc = ob.putloc;
        getloc = ob.getloc;
        q = new char[ob.q.length];
        for (int i = getloc + 1; i <= putloc; i++)
            q[i] = ob.q[i];
    }

    Queue1(char a[]) {
        putloc = 0;
        getloc = 0;
        q = new char[a.length + 1];
        for (int i = 0; i < a.length; i++)
            put(a[i]);
    }

    void put(char ch) {
        if (putloc == q.length - 1) {
            System.out.println(" - The queue is full");
            return;
        }
        putloc++;
        q[putloc] = ch;
    }

    char get() {
        if (getloc == putloc) {
            System.out.println(" - The queue is empty");
            return (char) 0;
        }
        getloc++;
        return q[getloc];
    }
}