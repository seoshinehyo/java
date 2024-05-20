package gof.observer;

// 게시판과 관련해서 뭔가 새로운 정보가 추가된다면 해당 주제에
// 서브젝트를 등록한 해당 주제 서브젝트로 등록한 옵저버들에게 변경이 통지

public class App {
    public static void main(String[] args) {
        Subject s1 = new ShopSubject();
        s1.addSubscribe(new AppObserver());
        s1.addSubscribe(new WebObserver());

        Subject s2 = new BoardSubject();
        s2.addSubscribe(new WebObserver());

        s1.addNews();
        s2.addNews();
    }
}
