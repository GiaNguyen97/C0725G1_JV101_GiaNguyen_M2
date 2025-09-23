package ss11_DSA_Stack_Queue.bai_tap;

import java.util.HashMap;
import java.util.Map;

public class CountCharInStringByMap {
    public static void main(String[] args) {
        String string = "Tran Le Gia Nguyen";
        Map<Character, Integer> countCharMap = new HashMap<>();
        string = string.toLowerCase().replace(" ","");
        for (byte i = 0; i< string.length(); i++) {
            countCharMap.put(string.charAt(i),countCharMap.getOrDefault(string.charAt(i),0)+1);
        }

        for (Map.Entry<Character, Integer> characterIntegerEntry : countCharMap.entrySet()){
            System.out.print(characterIntegerEntry.getKey()+":"+characterIntegerEntry.getValue()+"  ");
        }
    }
}
