package gof.adapter;

public class AdasAdapter extends ADASModule implements ModuleIF{ // 방법1 ADAS 상속받아 open() 사용 -> 기존, 새로운 규격 다 갖고있음
    @Override
    public void connect() {
        // ADASModule 상속으로 open() 메서드 바로 사용 가능
        open();
    }
}
