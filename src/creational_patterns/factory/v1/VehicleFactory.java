package creational_patterns.factory.v1;

public class VehicleFactory {
    public static Vehicle createNew(Vtype type) {
//        switch (type) {
//            case CAR:
//                return new Car();
//            case TRUCK:
//                return new Truck();
//            default:
//                return null;
//        }
        return switch (type) {
            case CAR -> new Car();
            case TRUCK -> new Truck();
        };

    }
}
