package checkout4;

public class VIP implements MemberType {
    @Override
    public int discount(int totalPrice) {
        return (int) (totalPrice * 0.2);
    }
}
