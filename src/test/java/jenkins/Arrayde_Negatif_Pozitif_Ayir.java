package jenkins;

import org.apache.commons.io.IOExceptionList;

import java.util.Arrays;

public class Arrayde_Negatif_Pozitif_Ayir {

    public static void main(String[] args) {


        int arr[] = {-12, 11, -13, -5, 6, -7, 5, -3, -6 };
        int n = arr.length;

        int key =0;

        for(int i =0; i <n ; i++){
            for (int j=i+1; j<n; j++){
                if(arr[i]>0){
                    key=arr[i];
                    arr[i]=arr[j];
                    arr[j]=key;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
