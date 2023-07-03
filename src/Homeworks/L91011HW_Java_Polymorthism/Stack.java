package Homeworks.L91011HW_Java_Polymorthism;

public class Stack {
    private char stck[];
    private int tos;

    Stack(int size) {
        stck = new char[size];
        tos = 0;
    }

    Stack(Stack ob) {
        tos = ob.tos;
        stck = new char[ob.stck.length];

        for (int i = 0; i < tos; i++)
            stck[i] = ob.stck[i];
    }

    Stack(char a[]) {
        stck = new char[a.length];
        for (int i = 0; i < a.length; i++) {
            try {
                push(a[i]);
            } catch (StackFullException exc) {
                System.out.println(exc);
            }
        }
    }

    void push(char ch) throws StackFullException {
        if (tos == stck.length) {
            throw new StackFullException(stck.length);
        }
        stck[tos] = ch;
        tos++;
    }

    char pop() throws StackEmptyException{
        if (tos == 0) {
            throw new StackEmptyException();
        }
        tos--;
        return stck[tos];
    }
}

class SDemo {
    public static void main(String[] args) throws StackEmptyException, StackFullException {
        Stack stk1 = new Stack(10);
        char name[] = {'T', 'o', 'm'};

        Stack stk2 = new Stack(name);
        char ch;
        int i;

        for (i = 0; i < 10; i++)
            stk1.push((char) ('A' + i));

        Stack stk3 = new Stack(stk1);

        System.out.print("stk1 content: ");
        for (i = 0; i < 10; i++) {
            ch = stk1.pop();
            System.out.print(ch);
        }
        System.out.println("\n");

        System.out.print("stk2 content: ");
        for (i = 0; i < 3; i++) {
            ch = stk2.pop();
            System.out.print(ch);
        }
        System.out.println("\n");
        System.out.print("stk3 content: ");
        for (i = 0; i < 10; i++) {
            ch = stk3.pop();
            System.out.print(ch);
        }


    }
}

