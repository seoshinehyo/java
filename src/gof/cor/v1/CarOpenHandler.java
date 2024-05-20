package gof.cor.v1;

public abstract class CarOpenHandler { // Handler 역할, 인터페이스로 해도됨
    protected CarOpenHandler next; // 다음에 올 것 지정할 수 있는 대상 -> 내 다음이 누군지 알아야 연결이 됨

    // 생성자에서 next 를 지정해도 되고 setNext() 를 별도로 만들어도 가능 함. 객체 생성 체인 구조는 Decorator Pattern과 유사.
    // setNext() 가 코드 구조상 직관적이기는 함.
    public CarOpenHandler(){} // 생성자에서는 따로 할 일 x

    // CarOpenHandler 타입을 리턴하는 구조로 만들면 메서드 체이닝도 가능.
    // 특정 필터 앞, 뒤에 필터를 끼워넣는 구조를 만들수도 있음.
    public CarOpenHandler setNext(CarOpenHandler handler) { // 현재 핸들러 객체 다음에 올 대상 지정
        next = handler; // next를 지정
        return handler; // 그 다음놈을 리턴
    }

    // 서브 클래스에서 구현해야할 추상 메서드 - 각각의 핸들러가 할 일이 있기때문
    public abstract boolean open(OpenMethod method);
    // enum 타입의 OpenMethod를 인자로 받아옴
    // 자동차의 문을 여는 방법이 다양할 때 사용자가 이용하는 방법에 따라서 핸들러가 동작
    // -> 키, 음성 인식, 스마트폰 앱의 방식을 그때그때 처리하는 것이 아닌 체인 방식으로 해서 새로운 방식이 나왔을때 쉽게 추가

}
