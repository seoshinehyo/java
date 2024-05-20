package gof.observer;

public class ShopSubject extends Subject{

    @Override
    public void addNews() {
        System.out.println("#ShopSubject 에 새로운 소식 추가됨!!");
        notifySubscribers(); // 앱만 수신받음
    }
}
