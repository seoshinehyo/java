package gof.singleton;

public class Singleton1 { // Eager initialization
    private static final Singleton1 instance = new Singleton1(); // 미리 하나 만들고 시작

    private Singleton1() {} // 외부에서 new Singleton1()으로 객체 생성 안 되게 막기 위해 private 사용

    public static Singleton1 getInstance() {
        return instance;
    }
}