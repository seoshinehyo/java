package creational_patterns.factory.v2;

public class Car implements Vehicle {
    @Override
    public void go() {
        System.out.println("Car go");
    }
}
