package CheckOut6;

public class CheckOutSolution {
    final int totalPrice = 50000;


    // solution1 :
    public void calcDiscount(DiscountPolicy policy) { // calcDiscount
        int afterTotal = policy.calc(totalPrice);
        System.out.println("합계: " + totalPrice);
        System.out.println("할인 적용 후: " + afterTotal);
    }

    // solution2 : enum, enum 사용법 공부하기
    public void calcDiscount2(MemberType memberType) {
        int afterTotal = memberType.calc(totalPrice);
        System.out.println("합계: " + totalPrice);
        System.out.println("할인 적용 후: " + afterTotal);
    }

    public static void main(String[] args) {
        CheckOutSolution checkout = new CheckOutSolution();
        checkout.calcDiscount(new VipDP());
        checkout.calcDiscount2(MemberType.VIP); // 객체 생성, 할인 비율 갖고 오는 것이 아닌 타입 지정해 객체 생성
    }
}
