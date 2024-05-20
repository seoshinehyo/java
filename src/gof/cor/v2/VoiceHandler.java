package gof.cor.v2;

public class VoiceHandler extends CarOpenHandler {
    public VoiceHandler(OpenMethod method, CarOpenHandler prev) {
        super(method, prev);
    }

    @Override
    public void doExtra() {
        System.out.println(">>>> 음성으로 차문 열고 프로파일 선택 화면 표시!!");
    }
}