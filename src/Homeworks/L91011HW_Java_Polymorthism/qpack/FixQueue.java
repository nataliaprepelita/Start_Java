package Homeworks.L91011HW_Java_Polymorthism.qpack;

import L9_Interfaces.ICharQ;

public class FixQueue implements ICharQ {
    private char [] q;
    private  int putloc, getloc;

    public FixQueue(int size){
        q = new char[size + 1];
        putloc = getloc = 0;
    }

    @Override
    public void put(char ch) throws QueueFullException {
        if (putloc == q.length -1){
           throw new QueueFullException(q.length - 1);
        }
        putloc++;
        q[putloc] = ch;
    }

    @Override
    public char get() throws QueueEmptyException{
        if (getloc == putloc){
            throw new QueueEmptyException();
        }
        getloc++;
        return q[getloc];
    }
}
