package gof.cor.v2;

public abstract class CarOpenHandler { // v2 다시 확인하기
    protected CarOpenHandler prev;
    private OpenMethod method;

    public CarOpenHandler(OpenMethod method, CarOpenHandler prev) {
        this.method = method;
        this.prev = prev;
    }

    public boolean open(OpenMethod method) {
        if(this.method == method) {
            System.out.printf("# %s 으로 문열기 성공 했습니다.!!\n", method);
            doExtra();
            return true;
        } else if(prev != null) {
            System.out.println(this.method+" >> Pass..");
            return prev.open(method);
        }
        return false;
    }
    // 서브 클래스에서 구현해야할 추상 메서드
    public abstract void doExtra();
}
