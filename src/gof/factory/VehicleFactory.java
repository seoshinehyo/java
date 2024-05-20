package gof.factory;

public class VehicleFactory {
    public static Vehicle createNew(Vtype type) {
        Vehicle v = null;

        /* Java 17 switch */
        return switch (type) {
            case Truck -> new Truck();
            default -> new Car();
        };

        /*
        switch(type) {
            case Car: v = new Car();break;
            case Truck: v =  new Truck();break;
        }
        return v;
         */
    }
}
