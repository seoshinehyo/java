package CheckOut6;

public class FamilyDP implements DiscountPolicy {
    @Override
    public int calc(int total) {
        return (int) (total * 0.2);
    }
}
