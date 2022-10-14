package jenkins;

public class EmptyFile {

    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print("#_");
            }
            for (int k=4-i; k<0; k++) {
                System.out.print("#_");
            }
            System.out.println();
        }
    }
}
