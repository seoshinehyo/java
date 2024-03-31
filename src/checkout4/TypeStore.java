package checkout4;

import checkout4.MemberType;

public class TypeStore {
    public static MemberType findType(String memberType) {
        if (memberType.equals("VIP")) {
            return new VIP();
        } else if (memberType.equals("FAMILY")) {
            return new Family();
        } else {
            return new VVIP();
        }
    }
}
