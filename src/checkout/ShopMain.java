package checkout;

public class ShopMain {
    public static void main(String[] args) {
        CheckOut m1 = new CheckOut("FAMILY");
        CheckOut m2 = new CheckOut("VIP");
        int price = 10000;

        calculate(m1, price);
        calculate(m2, price);

    }

    public static void calculate(CheckOut member, int price) {
        if (member.type.equals("FAMILY")) {
            System.out.println("적용 전 금액: " + price);
            System.out.println("10% 할인 적용 후 금액: " + price / 100 * 90);
        } else {
            System.out.println("적용 전 금액: " + price);
            System.out.println("20% 할인 적용 후 금액: " + price / 100 * 80);
        }
    }
}
