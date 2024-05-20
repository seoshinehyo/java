package gof.cor.v2;

public class AppHandler extends CarOpenHandler {
    public AppHandler(OpenMethod method, CarOpenHandler prev) {
        super(method, prev);
    }

    @Override
    public void doExtra() {
        System.out.println(">>>> 앱으로 차문 열고 앱에 알림 표시!!");
    }
}