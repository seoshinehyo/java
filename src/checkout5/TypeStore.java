package checkout5;

public class TypeStore {
    public static MemberType findType(String memberType) { // 이 부분 없애려면 reflection API 사용
        if (memberType.equals("VIP")) {
            return new VIP();
        } else if (memberType.equals("FAMILY")) {
            return new Family();
        } else if (memberType.equals(("VVIP"))) {
            return new VVIP();
        } else if (memberType.equals("VVVIP")) {
            return new VVVIP();
        } else {
            return new Diamond();
        }
    }
}
