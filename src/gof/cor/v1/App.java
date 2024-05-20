package gof.cor.v1;

public class App { // 메인에서 필터 체인 만듬
    public static void main(String[] args) {

        CarOpenHandler handler = new AppHandler();
        CarOpenHandler h1 = new KeyHandler();
        CarOpenHandler h2 = new VoiceHandler();
        //CarOpenHandler handler = new KeyHandler(new VoiceHandler(h1));

//        handler.setNext(h1);
//        h1.setNext(h2);
        // chain 구성 -> 메서드 체이닝으로 붙여줌(setNext의 리턴값이 Handler이어야 함 -> Handelr 추상 클래스에서 return handler;)
        handler.setNext(h2).setNext(h1); // setNext(h2)는 next인 h1 handler를 리턴

        boolean result = handler.open(OpenMethod.KEY); // KEY로 요청
        if(!result) {
            System.out.println("## 요청한 방법으로 문을 열 수 없습니다!!!");
        }
    }
}