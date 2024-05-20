package gof.observer;

public class AppObserver implements Observer{

    @Override
    public void update() {
        System.out.println("App에서 변경을 통지 받아 처리 합니다!!!");
    }
}
