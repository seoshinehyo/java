package checkout5;

public class Diamond implements MemberType {
    @Override
    public int discount(int totalPrice) {
        return (int) (totalPrice * 0.7);
    }
}
