// 상품 재고 주문 처리
public class Main {
    public static void main(String[] args) {
        int itemCount = 5;
        for (int i=1; i <= 10; i++) {
            if (itemCount > 0) {
                itemCount--;
                System.out.println(i + "번 주문 성공, 남은 재고: " + itemCount);
            } else {
                System.out.println(i + "번 주문 실패, 재고 없음");
            }
        }
    }
}