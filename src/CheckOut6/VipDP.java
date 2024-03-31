package CheckOut6;

public class VipDP implements DiscountPolicy {
    @Override
    public int calc(int total) {
        return (int) (total * 0.2);
    }
}
