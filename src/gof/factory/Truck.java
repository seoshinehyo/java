package gof.factory;

public class Truck implements Vehicle{
    @Override
    public void go() {
        System.out.println("Truck go()");
    }
}
