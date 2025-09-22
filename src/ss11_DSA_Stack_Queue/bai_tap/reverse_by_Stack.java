package ss11_DSA_Stack_Queue.bai_tap;

import java.util.Arrays;
import java.util.Stack;

public class reverse_by_Stack {
    public static void main(String[] args) {
        Stack <Integer> integerStack = new Stack<>();
        int[] arrays = {1,2,3,4,5};
        for (int array : arrays) {
            integerStack.push(array);
        }
        System.out.println(Arrays.toString(arrays));
        for (int i = 0;i<arrays.length;i++) {
            arrays[i] = integerStack.pop();
        }
        System.out.println(Arrays.toString(arrays));

        Stack <Character> characterStack = new Stack<>();
        String string = "ABCDEF";
        for (int i=0;i<string.length();i++) {
            characterStack.push(string.charAt(i));
        }
        System.out.println(string);
        StringBuilder newstring = new StringBuilder();
        for (int i=0;i<string.length();i++) {
            newstring.append(characterStack.pop());
        }
        System.out.println(newstring);
    }
}
