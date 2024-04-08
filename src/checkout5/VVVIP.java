package checkout5;

public class VVVIP implements MemberType {
    @Override
    public int discount(int totalPrice) {
        return (int) (totalPrice * 0.4);
    }
}
