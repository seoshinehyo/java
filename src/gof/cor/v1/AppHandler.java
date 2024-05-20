package gof.cor.v1;

public class AppHandler extends CarOpenHandler {

    public AppHandler(){}

    @Override
    public boolean open(OpenMethod method) { // App 방식일때만 open() 동작
        if(method == OpenMethod.APP) {
            System.out.println("# 스마트폰 앱으로 원격 문열기 성공 했습니다.!!");
            return true;
        } else if(next != null) { // 다음에 처리할 방법이 존재한다면 다음으로 넘겨
            System.out.println(OpenMethod.APP+" >> Pass..");
            return next.open(method); // next의 open()으로 넘겨버려
        }
        return false;
    }
}