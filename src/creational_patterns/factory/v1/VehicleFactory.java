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

//        return switch (type) {  // 새로운 switch문
//            case CAR -> new Car();
//            case TRUCK -> new Truck();
//        };

        return switch (type) { // Factory에서 타입에 맞게 리턴
            case CAR -> new Car();
            case TRUCK -> new Truck();
            case BUS -> new Bus();
        };


    }
}

// Control Coupling이 생김
