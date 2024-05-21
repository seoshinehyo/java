package gof.adapter;

public class ADASModule { // 주행 보조 시스템이 새로 생김
    public void open() { // 이 모듈은 기존 connect()가 아닌 open() 사용
        System.out.println("자율주행 모듈 연결!!");
    }
}
