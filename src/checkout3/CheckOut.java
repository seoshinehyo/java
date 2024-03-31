package checkout3;

public class CheckOut {
    public static void main(String[] args) {



        int totalPrice = 50000;
        int discountPrice;

        MemberType m1 = new VIP();
        MemberType m2 = new Family();



        discountPrice = m1.discount(totalPrice);
        calculate(m1, totalPrice, discountPrice);

        discountPrice = m2.discount(totalPrice);
        calculate(m2, totalPrice, discountPrice);

    }

    public static void calculate(MemberType member, int totalPrice, int discountPrice) {
        System.out.println("합계: " + totalPrice);
        System.out.println("할인 적용 후: " + (totalPrice - discountPrice));
    }
}