package gof.adapter;

public class SteeringModule implements ModuleIF{
    @Override
    public void connect() {
        System.out.println("핸들 조향 모듈 연결!!");
    }
}
