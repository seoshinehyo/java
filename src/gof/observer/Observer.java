package gof.observer;

public interface Observer { // 게시판에 새로운 글이 추가되거나 쇼핑몰에 새로운 상품이 추가되는 이벤트 발생했을때 정보를 수신하는 대상

    void update(); // update로 콜백함
}
