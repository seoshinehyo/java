package checkout4;

public class CheckOut {
    String memberType;
    int totalPrice = 50000;

    public CheckOut(String memberType) {
        this.memberType = memberType;
    }

    public static void main(String[] args) {
        Calculate calculate = new Calculate();

        CheckOut checkout1 = new CheckOut("VIP");
        calculate.processCalculate(checkout1.memberType, checkout1.totalPrice);

        CheckOut checkout2 = new CheckOut("FAMILY");
        calculate.processCalculate(checkout2.memberType, checkout2.totalPrice);

        CheckOut checkout3 = new CheckOut("VVIP");
        calculate.processCalculate(checkout3.memberType, checkout3.totalPrice);
    }
}