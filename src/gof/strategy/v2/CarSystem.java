package gof.strategy.v2;

public class CarSystem {
    void saftyAction(SaftyMode mode) {
        mode.action();
    }

    public static void main(String[] args) {
        CarSystem cs = new CarSystem();
        // 안전 장치 동작을 위한 모드는 센서 시스템쪽에서 해당 조건이 되면 전달한다고 가정한다.
        cs.saftyAction(new ESD());
    }
}
