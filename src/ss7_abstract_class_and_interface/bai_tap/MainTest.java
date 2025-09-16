package ss7_abstract_class_and_interface.bai_tap;


import java.util.Random;

public class MainTest {
    public static void main(String[] args) {
        double percent;
        Random random = new Random();
        Shape[] arrayShape = new Shape[6];
        for (int i = 0; i < arrayShape.length; i++) {
            int type = random.nextInt(3);
            switch (type) {
                case 0:
                    arrayShape[i] = new Circle();
                    percent = Math.random() * 100;
                    arrayShape[i].resize(percent);
                    System.out.println("Hình tròn thứ " + (i + 1) + " có diện tích bằng " + ((Circle) arrayShape[i]).getArea());
                    break;

                case 1:
                    arrayShape[i] = new Rectangle();
                    percent = Math.random() * 100;
                    arrayShape[i].resize(percent);
                    System.out.println("Hình chữ nhật thứ " + (i + 1) + " có diện tích bằng " + ((Rectangle) arrayShape[i]).getArea());
                    break;
                case 2:
                    arrayShape[i] = new Square();
                    percent = Math.random() * 100;
                    arrayShape[i].resize(percent);
                    System.out.println("Hình vuông thứ " + (i + 1) + " có diện tích bằng " + ((Square) arrayShape[i]).getArea());
                    break;
            }
            if (arrayShape[i] instanceof IColorable) {
                ((IColorable)arrayShape[i]).howToColor();
            }
        }
    }
}





