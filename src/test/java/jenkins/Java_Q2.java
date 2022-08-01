package jenkins;

public class Java_Q2 {

    public static void main(String[] args) {

        double [] doubleArr = {2.1,3.0, 2.5, 4, 5.2, 3.5};
        double euclideanDistance = 0;

        if (doubleArr.length!=6){
            System.out.println("Number of point is not 6");
        }else {
            euclideanDistance = Math.sqrt(Math.pow((doubleArr[0]-doubleArr[3]),2)+
                                Math.pow((doubleArr[1]-doubleArr[4]),2)+
                                Math.pow((doubleArr[2]-doubleArr[5]),2));

            System.out.println("euclideanDistance = " + euclideanDistance);

        }
    }
}
