package gof.adapter;

public class CarSystem { // 자동차에 탑재되는 모듈이 ModulF 규격을 따라야함
    void init(ModuleIF m) {
        m.connect();
    }

    public static void main(String[] args) {
        CarSystem cs = new CarSystem();
        cs.init(new BreakModule());
        cs.init(new SteeringModule());
        cs.init(new AdasAdapter());
    }
}
