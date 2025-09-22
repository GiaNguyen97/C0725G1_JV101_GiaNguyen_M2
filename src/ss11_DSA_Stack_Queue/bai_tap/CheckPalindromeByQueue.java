package ss11_DSA_Stack_Queue.bai_tap;

import java.util.ArrayDeque;
import java.util.Stack;

public class CheckPalindromeByQueue {
    public static void main(String[] args) {
        String string = "Able was I ere I saw Elba";
        System.out.print("\"" + string + "\"");
        Stack<Character> characterStack = new Stack<>();
        ArrayDeque<Character> characterArrayDeque = new ArrayDeque<>();
        boolean isPalindrome = true;
        for (int i = 0; i < string.length(); i++) {
            characterStack.push(string.toLowerCase().charAt(i));
            characterArrayDeque.offer(string.toLowerCase().charAt(i));
        }
        for (int i = 0; i < string.length(); i++) {
            if (!characterStack.pop().equals(characterArrayDeque.poll())) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println(" là chuỗi Palindrome");
        } else {
            System.out.println(" không phải là chuỗi Palindrome");
        }
    }
}
