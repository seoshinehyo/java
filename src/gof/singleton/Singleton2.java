package gof.singleton;

public class Singleton2 { // Static inner
    private Singleton2() {}

    private static class SingletonHolder { // SingletonHolder 클래스
        private static final Singleton2 INSTANCE = new Singleton2(); // static inner로 안전하게 사용
    }

    public static Singleton2 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
