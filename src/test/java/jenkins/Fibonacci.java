package jenkins;

public class Fibonacci {


    public static void main(String[] args) {


        int a = 0;
        int b = 1;
        int c = 1;

        int number = 14;

        for (int i = 0; i < number; i++) {
            System.out.print(c +" ");

            c=b+a;
            a=b;
            b=c;

        }

    }
}
