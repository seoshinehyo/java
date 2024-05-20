package gof.strategy.v2;

public class ESTOP implements SaftyMode{
    @Override
    public void action() {
        System.out.println("## 비상 정지 동작!!");
    }
}
