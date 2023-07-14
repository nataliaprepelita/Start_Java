package Homeworks.L121314_HW_Java_Collections;

public class TrafficLightDemo1 {
    public static void main(String[] args) {
        TrafficLightSimulator1 tl = new TrafficLightSimulator1(TrafficLightColor1.GREEN);
        for (int i = 0; i < 9; i++){
            System.out.println(tl.getColor());
            tl.waitForChange();
        }
        tl.cancel();
    }
}
enum TrafficLightColor1{
    RED (12000),
    GREEN (10000),
    YELLOW(2000);
    private int delay;
    TrafficLightColor1(int delay){
        this.delay = delay;
    }
    int getDelay(){
        return delay;
    }
}
class TrafficLightSimulator1 implements Runnable{
    private Thread thrd;
    private TrafficLightColor1 tlc;
    boolean stop = false;
    boolean changed = false;

    TrafficLightSimulator1(TrafficLightColor1 init){
        tlc = init;
        thrd = new Thread(this);
        thrd.start();
    }
    TrafficLightSimulator1(){
        tlc = TrafficLightColor1.RED;
        thrd = new Thread(this);
        thrd.start();
    }

    public void run(){
        while (!stop){
            try {
                Thread.sleep(tlc.getDelay());
            }catch (InterruptedException exc){
                System.out.println(exc);
            }
            changeColor();
        }
    }

    synchronized void changeColor(){
        switch (tlc){
            case RED:
                tlc = TrafficLightColor1.GREEN;
                break;
            case YELLOW:
                tlc = TrafficLightColor1.RED;
                break;
            case GREEN:
                tlc = TrafficLightColor1.YELLOW;
                break;
        }
        changed = true;
        notify();
    }
    synchronized void waitForChange(){
        try {
            while (!changed)
                wait();
            changed = false;
        }catch (InterruptedException exc){
            System.out.println(exc);
        }
    }
    TrafficLightColor1 getColor(){
        return tlc;
    }
    void cancel(){
        stop = true;
    }
}
