package jenkins;

import java.util.Arrays;

public class Duplicateleri_Sil {

    public static void main(String[] args) {

        String str = "abGXYxHGb12421";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if(!result.contains(String.valueOf(str.charAt(i)))) {
                result += String.valueOf(str.charAt(i));
            }
        }
        System.out.println(result);
    }
}
