package gof.factory;

public class App {
    public static void main(String[] args) {
        Vehicle v = VehicleFactory.createNew(Vtype.Truck);
        v.go();
    }
}
