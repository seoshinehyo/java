package gof.observer;

public class WebObserver implements Observer{

    @Override
    public void update() {
        System.out.println("Web에서 변경을 통지 받아 처리 합니다!!!");
    }
}
