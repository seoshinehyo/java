package CheckOut6;

public class CheckOut { // 교수님이 작성하신 코드

    int totalPrice = 50000;
    private String memberType;

    public CheckOut(String memberType) {
        this.memberType = memberType;
    }

    public void calculate() {
        System.out.println("합계: " + totalPrice);

        if (memberType.equals("VIP")) {
            totalPrice -= (int) Math.round(totalPrice * 0.2);
        } else {
            totalPrice -= (int) Math.round(totalPrice * 0.1);
        }

        // JDK 17 switch 버전
/*        totalPrice -= switch (memberType) {
            case "VIP" -> (int) Math.round(totalPrice * 0.2);
            defalut -> 0;
        };*/

        System.out.println("할인 적용 후: " + totalPrice);

    }

    public static void main(String[] args) {
        CheckOut checkOut = new CheckOut("VIP");
        checkOut.calculate();
    }
}
