package creational_patterns.factory.v1;

public class VehicleFactory {
    public static Vehicle createNew(Vtype type) {    // 인자를 받아 판단
//        switch (type) {
//            case CAR:
//                return new Car();
//            case TRUCK:
//                return new Truck();
//            default:
//                return null;
//        }
        return switch (type) {  // 새로운 switch문
            case CAR -> new Car();
            case TRUCK -> new Truck();
        };



    }
}

// Control Coupling이 생김
