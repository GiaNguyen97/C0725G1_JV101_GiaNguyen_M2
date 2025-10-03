package ss22_structural_design_pattern.thuc_hanh.shoppe_facade;

public class Main {
    public static void main(String[] args) {
        ShopeeFacade shopee = new ShopeeFacade();
        shopee.placeOrder(); // chỉ cần gọi 1 hàm duy nhất
    }
}