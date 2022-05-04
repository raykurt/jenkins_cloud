package jenkins;

public class Bosluklar_Sabit_Reverse {

    public static void main(String[] args) {

        String str = "I Love Java Batch49";

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
    }
}