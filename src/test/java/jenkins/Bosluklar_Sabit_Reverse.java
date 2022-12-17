package jenkins;

import java.util.ArrayList;
import java.util.List;

public class Bosluklar_Sabit_Reverse {

    public static void main(String[] args) {

        String str = "I Love JavaCore";

        String str2 = str.replaceAll(" ", "");

        String reverse = "";

        int zero = 0;
        int length = str2.length();

        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.substring(zero, zero + 1).contains(" ")) {
                reverse += " ";
            } else {
                reverse += str2.charAt(length - 1);
                length--;
            }
            zero++;
        }
        System.out.println(reverse);


        System.out.println(reverseWords("My name is Ali"));

    }

    public static String reverseWords(String s){

        String [] arr = s.trim().split(" ");

        String reversed = "";
        for(String each : arr){

            for (int i = each.length()-1; i >= 0 ; i--) {

                reversed += each.charAt(i);
            }
            reversed += " ";
        }
        return reversed;
    }

}