package jenkins;

public class Asal_Sayilar {

    public static void main(String[] args) {

        int bolen;

        for (int i = 2; i < 500; i++) {

            bolen = 0;

            for (int j = 1; j <= i; j++) {
                if(i % j == 0){
                    bolen++;
                }
            }
            if (bolen == 2){
                System.out.println(i + " ");
            }
        }
    }
}
