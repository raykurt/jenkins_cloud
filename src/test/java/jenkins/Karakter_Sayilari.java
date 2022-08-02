package jenkins;

import java.util.HashMap;
import java.util.Map;

public class Karakter_Sayilari {

    public static void main(String[] args) {

        Map<Character, Integer> map = new HashMap<>();

        String str = "aayh288bcbzzy";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        System.out.println(map);
    }

}