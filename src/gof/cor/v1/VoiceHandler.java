package gof.cor.v1;

public class VoiceHandler extends CarOpenHandler {

    public VoiceHandler(){}

    @Override
    public boolean open(OpenMethod method) {
        if(method == OpenMethod.VOICE) {
            System.out.println("# 음성인식으로 문열기에 성공 했습니다.!!");
            return true;
        } else if(next != null) {
            System.out.println(OpenMethod.VOICE+" >> Pass..");
            return next.open(method);
        }
        return false;
    }
}