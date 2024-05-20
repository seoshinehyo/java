package gof.adapter;

public class BreakModule implements ModuleIF{
    @Override
    public void connect() {
        System.out.println("브레이크 모듈 연결!!");
    }
}
