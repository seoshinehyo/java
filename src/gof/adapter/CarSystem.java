package gof.adapter;

public class CarSystem {
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
