package jenkins;

public class Reverse_Integer {

    public static void main(String[] args) {

            int num = 1285734, reversed = 0;

            while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
            }
            System.out.println("Reversed Number: " + reversed);


    }
}