package ss7_abstract_class_and_interface.bai_tap.bai1_interface_resizeable;


public class MainTest {
    public static void main(String[] args) {
        double percent;
        Shape[] arrayShape = new Shape[6];
        for (byte i = 0; i < 6; i+=2) {
            arrayShape[i] = new Circle();
            arrayShape[i+1] = new Rectangle();
            percent = Math.random() * 100;
            arrayShape[i].resize(percent);
            arrayShape[i+1].resize(percent);
        }

        for (byte i = 0; i < 6; i+=2) {
            System.out.println("Hình tròn "+(i+1)+" có diện tích là: "+((Circle) arrayShape[i]).getArea());
            System.out.println("Hình chữ nhật "+(i+2)+" có diện tích là: "+((Rectangle) arrayShape[i+1]).getArea());
        }
    }
}
