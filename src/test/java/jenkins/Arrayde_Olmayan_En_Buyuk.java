package jenkins;

import java.util.ArrayList;

import java.util.List;

public class Arrayde_Olmayan_En_Buyuk {

    public static void main(String[] args) {

        int [] arr = {1,2,3,9,5};
        System.out.println("minOutherArray = " + minOutherArray(arr));





        int arr1[] = arr;
        int arr_size = arr1.length;
        int missing = findMissing(arr1, arr_size);
        System.out.println("Smallest number = " + missing);

    }

    public static int minOutherArray(int[] arr){

        List<Integer> list=new ArrayList<Integer>();
        int result = 1;

        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }

        for (int i = 1; i <= list.size()+1; i++) {
            if (!list.contains(i)){
                result = i;
                break;
            }else{
                result = i;
            }
        }
        return result;
    }





    static int segregate(int arr[], int size) {
        int j = 0, i;
        for (i = 0; i < size; i++) {
            if (arr[i] <= 0) {
                int temp;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
        return j;
    }

    static int findMissingPositive(int arr[], int size) {
        int i;

        for (i = 0; i < size; i++) {
            int x = Math.abs(arr[i]);
            if (x - 1 < size && arr[x - 1] > 0)
                arr[x - 1] = -arr[x - 1];
        }

        for (i = 0; i < size; i++)
            if (arr[i] > 0)
                return i + 1;
        return size + 1;
    }

    static int findMissing(int arr[], int size) {
        int shift = segregate(arr, size);
        int arr2[] = new int[size - shift];
        int j = 0;
        for (int i = shift; i < size; i++) {
            arr2[j] = arr[i];
            j++;
        }

        return findMissingPositive(arr2, j);
    }

}
