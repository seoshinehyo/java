package gof.command;

public class WiperReceiver implements Receiver{
    @Override
    public void turnOn() {
        System.out.println("차량 와이퍼를 켰습니다!!");
    }

    @Override
    public void turnOff() {
        System.out.println("차량 와이퍼를 껐습니다!!");
    }
}
