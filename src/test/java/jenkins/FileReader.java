package jenkins;

import java.io.*;
import java.util.Scanner;
import java.util.TreeMap;

public class FileReader {

    public static void main(String[] args) throws IOException {


        try {
            File file = new File("dosya.txt");
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
