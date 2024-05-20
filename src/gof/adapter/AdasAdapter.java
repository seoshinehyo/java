package gof.adapter;

public class AdasAdapter extends ADASModule implements ModuleIF{
    @Override
    public void connect() {
        // ADASModule 상속으로 open() 메서드 바로 사용 가능
        open();
    }
}
