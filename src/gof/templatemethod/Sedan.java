package gof.templatemethod;

public class Sedan extends Car{
    public Sedan(String model, String number) {
        super(model, number);
    }

    void engineStart() {
        System.out.println("# 엔진 시동 !!");
    }

    void parkingOff() {
        System.out.println("# 주차 브레이크 해제 !!");
    }
}
