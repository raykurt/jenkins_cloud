package jenkins;

import java.util.Arrays;
import java.util.Scanner;

public class Put_Zeros_End {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the array.....");
        int length = scan.nextInt();
        System.out.println("Enter the array elements...");

        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        int[] brr = new int[length];
        int idx = 0;

        for (int i = 0; i < length; i++) {
            if (arr[i] != 0) {
                brr[idx] = arr[i];
                idx++;
            }
        }

        System.out.println(Arrays.toString(brr));

        scan.close();
    }
}
