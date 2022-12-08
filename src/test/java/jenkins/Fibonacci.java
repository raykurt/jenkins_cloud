package jenkins;


public class Fibonacci {


    public static void main(String[] args) {


        int a = 1;
        int b = 0;
        int c = 0;

        int number = 11;

        for (int i = 0; i < number; i++) {
            System.out.print(c +" ");

            c=b+a;
            a=b;
            b=c;
        }


    }
}
