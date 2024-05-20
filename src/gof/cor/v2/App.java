package gof.cor.v2;

public class App {
    public static void main(String[] args) {

        CarOpenHandler h1 = new AppHandler(OpenMethod.APP, null);
        CarOpenHandler h2 = new KeyHandler(OpenMethod.KEY, h1);
        CarOpenHandler h3 = new VoiceHandler(OpenMethod.VOICE, h2);

        boolean result = h3.open(OpenMethod.APP);
        if(!result) {
            System.out.println("## 요청한 방법으로 문을 열 수 없습니다!!!");
        }
    }
}