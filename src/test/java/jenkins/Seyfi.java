package jenkins;

import java.util.Scanner;

public class Seyfi {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String...");
        String str = scan.nextLine();
        int number;

        String newStr = "";

        if (str.contains(" ") || str.length()==0){
            throw new RuntimeException("The string will not be empty and not include spaces..");
        }


        for (int i = 0; i < str.length(); i++) {
            number = str.charAt(i);
            if (number == 99 || number == 103|| number == 109 || number == 115) {
                newStr= newStr + (char)(number-30);
            }else if (number == 121){
                newStr= newStr + (char)(number-56);
            }else if (number >= 65 && number <= 88){
                newStr= newStr + (char)(number+2);
            }else if (number >= 97 && number <= 120){
                newStr= newStr + (char)(number+2);
            }else if (number == 89 || number == 90 || number == 122){
                newStr= newStr + (char)(number-24);
            }else{
                newStr= newStr + (char)number;
            }
        }

        System.out.println(newStr);
    }
}
