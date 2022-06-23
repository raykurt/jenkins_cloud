package jenkins;

import java.util.HashMap;
import java.util.Map;

public class Count_Words {

    public static void main(String[] args) {

        String str = "Hi Hello How are you to welcome to USA Thanks Welcome to USA USA";
        Map<String, Integer> hashMap = new HashMap<>();

        String[] words = str.split(" ");

        for (String word : words) {
            Integer integer = hashMap.get(word);
            if (integer == null)
                hashMap.put(word, 1);
            else {
                hashMap.put(word, integer + 1);
            }
        }
        System.out.println(hashMap);
    }
}
