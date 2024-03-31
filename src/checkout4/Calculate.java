package checkout4;

public class Calculate {
    public void processCalculate(String memberType, int totalPrice) {
        MemberType member = TypeStore.findType(memberType);

        int discountPrice = member.discount(totalPrice);
        int finalPrice = totalPrice - discountPrice;

        System.out.println("멤버 등급: " + memberType);
        System.out.println("합계: " + totalPrice);
        System.out.println("할인 적용 후: " + finalPrice);
        System.out.println();
    }
}
