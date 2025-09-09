package ss3_array_methor_java.bai_tap;

public class NumberArray2DMax {
    public static void main(String[] args) {
        short[][] array2D = {
                {100, 2, 3, 4},
                {1, 30, 5, 6},
                {2, 3, 40, 5}
        };
        short maxArray2D = array2D[0][0];
        for (short[] shorts : array2D) {
            for (short aShort : shorts) {
                if (maxArray2D < aShort) {
                    maxArray2D = aShort;
                }
            }
        }
        System.out.println(maxArray2D);
    }
}
