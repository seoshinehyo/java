package creational_patterns.factory.v1;

public class App {
    public static void main(String[] args) {
        Vehicle v = VehicleFactory.createNew(Vtype.CAR); // enum type에 따라 달라짐, Factory로 객체 생성
        v.go();
    }
}
