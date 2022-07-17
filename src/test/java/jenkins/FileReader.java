package jenkins;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FileReader {

    public static void main(String[] args) throws IOException {

        List<String> data = new ArrayList<>();
        List<Integer> incorrectData = new ArrayList<>();

        try {
            File file = new File("dosya.txt");
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                data.add(myReader.nextLine());
            }
            myReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        String [] shapes = new String[data.size()];
        double [] area = new double[data.size()];

        for (int i = 0; i < data.size(); i++) {
            String[] i2 = data.get(i).split(" ");
            shapes[i] = i2[0];

            switch(shapes[i]) {
                case "rectangle":
                    area[i]=Double.parseDouble(i2[1])*Double.parseDouble(i2[2]);
                    if (Double.parseDouble(i2[1])<=0 || Double.parseDouble(i2[2])<=0 ){
                        incorrectData.add(i);
                    }
                    break;
                case "square":
                    area[i]=Math.pow(Double.parseDouble(i2[1]),2);
                    if (Double.parseDouble(i2[1])<=0 ){
                        incorrectData.add(i);
                    }
                    break;
                case "triangle":
                    area[i]=Double.parseDouble(i2[1])*Double.parseDouble(i2[2])/2;
                    if (Double.parseDouble(i2[1])<=0 || Double.parseDouble(i2[2])<=0 ){
                        incorrectData.add(i);
                    }
                    break;
                case "circle":
                    area[i]=Math.PI*(Math.pow(Double.parseDouble(i2[1])/2,2));
                    if (Double.parseDouble(i2[1])<=0){
                        incorrectData.add(i);
                    }
                    break;
                default:
                    System.out.println("An error occurred.");
            }
        }


        String temp;
        double temp1;

        for (int i = 0; i < data.size(); i++) {
            for (int j = i+1; j < data.size(); j++) {
                if (area[i]<area[j]){
                    temp=shapes[i];
                    shapes[i]=shapes[j];
                    shapes[j]=temp;
                    temp1=area[i];
                    area[i]=area[j];
                    area[j]=temp1;
                }

            }
        }


        System.out.println(Arrays.toString(shapes));
        System.out.println(Arrays.toString(area));
        System.out.println(incorrectData);

    }
}
