package checkout4;

public class VVIP implements MemberType {
    @Override
    public int discount(int totalPrice) {
        return (int) (totalPrice * 0.3);
    }
}
