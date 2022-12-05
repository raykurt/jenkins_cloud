package jenkins;

public class Amstrong_Sayilari {

    public static void main(String[] args) {

        for (int i = 0; i < 1000 ; i++) {

            int basamakSayisi = 0;
            int rakam = i;
            int islem = i;
            int toplam = 0;

            while(rakam>0){
               rakam /= 10;
               basamakSayisi++;
            }

            while (islem != 0) {
                int carpim=1;
                for (int k = 1; k<=basamakSayisi; k++) {
                    carpim = carpim * (islem % 10);
                }
                toplam = toplam + carpim;
                islem = islem/10;
            }
            if (i == toplam){
                    System.out.println(i);
                }
            }
        }
    }

