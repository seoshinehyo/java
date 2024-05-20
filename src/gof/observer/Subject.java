package gof.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    List<Observer> observers = new ArrayList<>(); // 옵저버 갖는 리스트

    public void addSubscribe(Observer observer) {
        observers.add(observer); // 옵저버 등록
    }

    void notifySubscribers() { // 등록된 Subscriber들에게 이벤트가 발생하면 메시지를 보냄
        observers.forEach(s -> s.update()); // 람다 사용해 옵저버들에 대해 업데이트 메서드 호출
    }

    abstract void addNews(); // 새로운 게시글이 등록이 되었다는 것을 처리
}