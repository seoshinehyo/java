package gof.adapter;

public class AdasAdapter2 implements ModuleIF{

    ADASModule adas = new ADASModule();

    @Override
    public void connect() {
        adas.open();
    }
}
