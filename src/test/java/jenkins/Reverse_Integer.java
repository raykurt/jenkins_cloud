package jenkins;

public class Reverse_Integer {

    public static void main(String[] args) {

            int num = 128579634, reversed = 0;

            while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
            }
            System.out.println("Reversed Number: " + reversed);


            System.out.println(StrReverse("JavaLower"));
    }

    public static String StrReverse(String str) {

        String reverse="";

        for(int i=str.length()-1; i >= 0; i--) {
            reverse += str.substring(i,i+1);
        }
        return reverse;

    }
}
