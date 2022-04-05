package jenkins;

import java.util.Arrays;

public class Duplicateleri_Sil {

    public static void main(String[] args) {

        String str = "abGHYHGb12421";
        String sonuc = "";

        for (int i =0; i<str.length(); i++){
            if(!sonuc.contains(""+ str.charAt(i))){
                sonuc += ""+ str.charAt(i);
            }
        }

        System.out.println(sonuc);
    }
}
