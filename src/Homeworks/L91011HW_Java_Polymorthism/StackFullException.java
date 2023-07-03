package Homeworks.L91011HW_Java_Polymorthism;

public class StackFullException extends Exception{
    int size;
    StackFullException(int s){
        size = s;
    }

    public String toString(){
        return "\nStack is full. Maximum size of the stack is: " + size;
    }
}
