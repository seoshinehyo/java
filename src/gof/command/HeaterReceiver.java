package gof.command;

public class HeaterReceiver implements Receiver{
    @Override
    public void turnOn() {
        System.out.println("차량내 히터를 켰습니다!!");
    }

    @Override
    public void turnOff() {
        System.out.println("차량내 히터를 껐습니다!!");
    }
}
