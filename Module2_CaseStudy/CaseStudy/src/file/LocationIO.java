package file;

import model.Client;
import model.Location;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LocationIO {
    public static List<Location> readFromFile(String pathFile) throws IOException {
        List<Location> locations=new ArrayList<>();
        File file=new File(pathFile);
        FileReader fileReader=new FileReader(file);
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        String lineCSV= bufferedReader.readLine();
        while ((lineCSV=bufferedReader.readLine())!=null){
            String[] lineContent=lineCSV.split(",");
            String startLocation=lineContent[0];
            String endLocation=lineContent[1];
            int distance=Integer.parseInt(lineContent[2]);
            int journeyTime=Integer.parseInt(lineContent[3]);
            locations.add(new Location(startLocation,endLocation,distance,journeyTime));
        }
        return locations;
    }
}
