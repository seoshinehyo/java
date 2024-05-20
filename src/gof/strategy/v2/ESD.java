package gof.strategy.v2;

public class ESD implements SaftyMode{
    @Override
    public void action() {
        System.out.println("## 긴급 속도 줄임!!");
    }
}
