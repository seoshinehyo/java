package creational_patterns.factory.v2;

public class App {
    public static void main(String[] args) {
        Vehicle v = VehicleFactory.createNew(Vtype.CAR);
        v.go();
    }
}
