package Homeworks.L91011HW_Java_Polymorthism.qpack;

public interface ICharQ {
    void  put(char ch) throws QueueFullException;
    char get () throws  QueueEmptyException;
}
