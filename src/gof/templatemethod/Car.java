package gof.templatemethod;

public abstract class Car {
    String model;
    String number;

    public Car(String model, String number) {
        this.model = model;
        this.number = number;
    }

    public void start() {
        System.out.println("# start !!");
        // start 과정에 필요한 구체적인 구현은 추상메서드로 정의하고 호출 순서를 지정.
        engineStart();
        parkingOff();
    }

    abstract void engineStart();

    abstract void parkingOff();
}
