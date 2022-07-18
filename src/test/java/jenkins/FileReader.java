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

        String [] shapesFinal = new String[data.size()- incorrectData.size()];
        double [] areaFinal = new double[data.size()- incorrectData.size()];

        for (int i = 0; i < shapesFinal.length; i++) {
            if (!incorrectData.contains(i)){
                shapesFinal[i]=shapes[i];
                areaFinal[i]=area[i];
            }else {
                shapesFinal[i]=shapes[i+1];
                areaFinal[i]=area[i+1];
            }
        }

        String temp;
        double temp1;

        for (int i = 0; i < shapesFinal.length; i++) {
            for (int j = i+1; j < shapesFinal.length; j++) {
                if (areaFinal[i]<areaFinal[j]){
                    temp=shapesFinal[i];
                    shapesFinal[i]=shapesFinal[j];
                    shapesFinal[j]=temp;
                    temp1=areaFinal[i];
                    areaFinal[i]=areaFinal[j];
                    areaFinal[j]=temp1;
                }
            }

            System.out.println(shapesFinal[i]+" "+areaFinal[i]);
        }
    }
}
