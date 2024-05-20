package gof.cor.v2;

public class KeyHandler extends CarOpenHandler {
    public KeyHandler(OpenMethod method, CarOpenHandler prev) {
        super(method, prev);
    }

    @Override
    public void doExtra() {
        System.out.println(">>>> 키로 차문 열고 키 프로파일 로딩!!");
    }
}