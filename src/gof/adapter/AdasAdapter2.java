package gof.adapter;

public class AdasAdapter2 implements ModuleIF{ // 방법2 상속 안 받고, 위임 사용

    ADASModule adas = new ADASModule();

    @Override
    public void connect() { // connect() 요청이 왔을때 open() 호출해줌
        adas.open();
    }
}
