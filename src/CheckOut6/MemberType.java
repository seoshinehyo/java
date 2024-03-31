package CheckOut6;

import java.util.function.Function;

public enum MemberType {
    FAMILY("패밀리", origin -> (int) (origin * 0.9)),
    VIP("VIP", origin -> (int) (origin * 0.8));

    private final String type;
    private final Function<Integer, Integer> expression; // 함수형 프로그램 공부해보기

    MemberType(String type, Function<Integer, Integer> expression) {
        this.type = type;
        this.expression = expression;
    }

    public Integer calc(int origin) {
        return expression.apply(origin);
    }
}
