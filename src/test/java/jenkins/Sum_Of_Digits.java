package jenkins;

public class Sum_Of_Digits {

    public static void main(String[] args) {

        	int number = 13578946;
            int sum = 0;
            while(number > 0) {
                sum += number%10;
                number = number/10;
            }
            System.out.println(sum);
    }
}

