package gof.observer;

public class BoardSubject extends Subject{

    @Override
    void addNews() {
        System.out.println("#BoardSubject 에 새로운 소식 추가됨!!");
        notifySubscribers(); // 앱과 웹 모두 변화 수신받음
    }
}
