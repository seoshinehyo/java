package gof.cor.v1;

public class KeyHandler extends CarOpenHandler {

    public KeyHandler() {}

    @Override
    public boolean open(OpenMethod method) {
        // 현재 핸들러가 처리할 조건은 다양하게 구성 가능.
        if(method == OpenMethod.KEY) {
            System.out.println("# 자동차 키로 문열기에 성공 했습니다.!!");
            return true;
        } else if(next != null) {
            System.out.println(OpenMethod.KEY+" >> Pass..");
            return next.open(method);
        }
        return false;
    }
}