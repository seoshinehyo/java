package gof.strategy.v1;

public class CarSystem { // 속도에 맞게 안전장치 대처 작동 -> if else문 사용
    void saftyAction(String mode) {
            // 각 조건에 따른 실행은 별도 메서드로 만들어질 수 있음.
            if(mode.equals("case1")) {
                System.out.println("## 비상 정지 동작!!");
            } else if(mode.equals("case2")) {
                System.out.println("## 비상 회피 동작!!");
            } else if(mode.equals("case3")) {
                System.out.println("## 속도 줄임!!");
            }
            // 케이스가 늘어나면 if-else문 길어짐 -> SaftyMode 인터페이스 만들기
    }

    public static void main(String[] args) {
        CarSystem cs = new CarSystem();
        // 안전 장치 동작을 위한 모드는 센서 시스템쪽에서 해당 조건이 되면 전달한다고 가정한다.
        cs.saftyAction("case2");
    }
}
