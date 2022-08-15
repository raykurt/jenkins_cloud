package jenkins;

public class Java_Q {

    public static void main(String[] args) {

        String num = "035229808";

        int sum = 10;
        int total = 0;
        String lastDigit= "0";

        if (num.length() !=9 ){
            System.out.println("Number is not 9 digit");
        } else {
            for (int i=0; i<9; i++){
                if (num.charAt(i)=='0'){
                    sum--;
                }else {
                    total += sum*Integer.parseInt(num.substring(i,i+1));
                    sum--;
                }
            }

            if (total%11==0){
                System.out.println(num+"0");
            }else {
                for (int i=1; i<11; i++){
                    if ((total+i)%11==0){
                        lastDigit= String.valueOf(i);
                        break;
                    }
                }
                System.out.println(num+lastDigit);
            }
        }
    }
}
