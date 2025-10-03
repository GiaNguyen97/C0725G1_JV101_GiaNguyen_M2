package ss22_structural_design_pattern.thuc_hanh.shoppe_facade;

class ShopeeFacade {
    private PaymentService payment;
    private InventoryService inventory;
    private ShippingService shipping;
    private NotificationService notification;

    public ShopeeFacade() {
        payment = new PaymentService();
        inventory = new InventoryService();
        shipping = new ShippingService();
        notification = new NotificationService();
    }

    public void placeOrder() {
        payment.processPayment();
        inventory.updateStock();
        shipping.arrangeDelivery();
        notification.sendNotification();
        System.out.println("ShopeeFacade: Đặt hàng thành công!");
    }
}