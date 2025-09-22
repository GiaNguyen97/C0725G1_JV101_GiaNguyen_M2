package ss11_DSA_Stack_Queue.bai_tap;

import java.util.Stack;

public class FromDecimalToBinary {
    public static void main(String[] args) {
        int numberDecimal = 1234;
        StringBuilder numberBinary = new StringBuilder();
        Stack<Integer> integerStack = new Stack<>();
        System.out.print("Số thập phân "+numberDecimal+" chuyển sang nhị phân bằng ");
        while (numberDecimal != 0) {
            integerStack.push(numberDecimal % 2);
            numberDecimal = numberDecimal /2;
        }
        while (!integerStack.isEmpty()) {
            numberBinary.append(integerStack.pop());
        }
        System.out.println(numberBinary);
    }
}
