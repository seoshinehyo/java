package gof.strategy.v2;

public class CarSystem {
    void saftyAction(SaftyMode mode) { // 파라미터가 String이 아닌 SaftyMode -> if문 사용 안해도됨
        mode.action();
    }

    // 변화하는 요소를 객체화하고, 그걸 파라미터로 전달해 action() 메서드로 콜백
    public static void main(String[] args) {
        CarSystem cs = new CarSystem();
        // 안전 장치 동작을 위한 모드는 센서 시스템쪽에서 해당 조건이 되면 전달한다고 가정한다.
        cs.saftyAction(new ESD());
    }
}
