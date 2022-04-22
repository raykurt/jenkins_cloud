package jenkins;

import java.util.Arrays;

public class Rotate_Arr {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};

        System.out.println(Arrays.toString(shiftArray(arr, 2)) );
    }

    static int[] shiftArray(int[] arr, int times){
        int len= arr.length;
        if (len<=1) return arr;

        int shift = times%len;
        if (shift==0) return arr;
        
        int[] result=new int[len];

        for (int i = 0; i < result.length; i++, shift++) {
            if(shift<len)result[i] = arr[shift];
            else result[i]=arr[shift-len];
        }

        return result;

    }
}
