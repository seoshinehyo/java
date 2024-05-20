package gof.strategy.v2;

public class ESA implements SaftyMode{
    @Override
    public void action() {
        System.out.println("## 비상 회피 동작!!");
    }
}
