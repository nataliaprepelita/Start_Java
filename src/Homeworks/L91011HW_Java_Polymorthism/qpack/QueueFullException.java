package Homeworks.L91011HW_Java_Polymorthism.qpack;

public class QueueFullException extends Exception {
    int size;

    QueueFullException(int s) {
        size = s;
    }

    public String toString() {
        return "\nThe queue is full. Maximum size of the queue: " + size;
    }
}
