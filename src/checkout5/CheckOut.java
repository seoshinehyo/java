package checkout5;

public class CheckOut { // 실습2(발표 버전)
    String memberType;
    int totalPrice = 50000;

    public CheckOut(String memberType) {
        this.memberType = memberType;
    }

    public static void main(String[] args) {
        CheckOut checkout1 = new CheckOut("VIP");
        checkout1.calculate(checkout1.memberType, checkout1.totalPrice);

        CheckOut checkout2 = new CheckOut("FAMILY");
        checkout2.calculate(checkout2.memberType, checkout2.totalPrice);

        CheckOut checkout3 = new CheckOut("VVIP");
        checkout3.calculate(checkout3.memberType, checkout3.totalPrice);

        CheckOut checkout4 = new CheckOut("VVVIP");
        checkout4.calculate(checkout4.memberType, checkout4.totalPrice);
    }
    public void calculate(String memberType, int totalPrice) {
        MemberType memberTypeFactory = TypeStore.findType(memberType);

        int discountPrice = memberTypeFactory.discount(totalPrice);
        int finalPrice = totalPrice - discountPrice;

        System.out.println("멤버 등급: " + memberType);
        System.out.println("합계: " + totalPrice);
        System.out.println("할인 적용 후: " + finalPrice);
        System.out.println();
    }
}