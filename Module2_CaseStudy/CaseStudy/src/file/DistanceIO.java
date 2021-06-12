package file;

import model.Distance;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DistanceIO {
    public static List<Distance> readFromFile(String pathFile){
        List<Distance> locations=new ArrayList<>();
        File file=new File(pathFile);
        FileReader fileReader= null;
        try {
            fileReader = new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String lineCSV= bufferedReader.readLine();
            while ((lineCSV=bufferedReader.readLine())!=null){
                String[] lineContent=lineCSV.split(",");
                String startLocation=lineContent[0];
                String endLocation=lineContent[1];
                int lengthDistance=Integer.parseInt(lineContent[2]);
                int journeyEstimateTime=Integer.parseInt(lineContent[3]);
                locations.add(new Distance(startLocation,endLocation,lengthDistance,journeyEstimateTime));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return locations;
    }
}
