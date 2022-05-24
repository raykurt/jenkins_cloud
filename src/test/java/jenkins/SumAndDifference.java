package jenkins;

import java.util.ArrayList;
import java.util.List;

public class SumAndDifference {

    static List<Integer> negatifs =new ArrayList<>();
    static List<Integer> pozitifs =new ArrayList<>();


    public static void main(String[] args) {

        List<Integer> columns =new ArrayList<>();
        columns.add(3);
        columns.add(-1);
        columns.add(-5);
        columns.add(2);

        for( Integer integer : columns){
            if(integer<0){
                negatifs.add(integer);
            }else{
                pozitifs.add(integer);
            }
        }

        System.out.println("RESULT => sum(negatifs) = " + sum(negatifs));
        System.out.println("RESULT => sum(pozitifs) = " + sum(pozitifs));

        System.out.println("RESULT => difference(negatifs) = " + difference(negatifs));
        System.out.println("RESULT => difference(pozitifs) = " + difference(pozitifs));

        if(sum(negatifs)<sum(pozitifs)){
            System.out.println("OUTPUT SUM => Positives");
        }else{
            System.out.println("OUTPUT SUM => Negatives");
        }

        if(difference(negatifs)<difference(pozitifs)){
            System.out.println("OUTPUT DIFFERENCE => Positives");
        }else{
            System.out.println("OUTPUT DIFFERENCE => Negatives");
        }

    }

    public static int sum(List<Integer> negatifs){
        return negatifs.get(0)+negatifs.get(1);
    }

    public static int difference(List<Integer> negatifs){
        if(negatifs.get(0)<negatifs.get(1)){
            return negatifs.get(1)-negatifs.get(0);
        }else{
            return negatifs.get(0)-negatifs.get(1);
        }
    }

}
