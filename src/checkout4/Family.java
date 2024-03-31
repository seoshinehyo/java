package checkout4;

public class Family implements MemberType {
    @Override
    public int discount(int totalPrice) {
        return (int) (totalPrice * 0.1);
    }
}
