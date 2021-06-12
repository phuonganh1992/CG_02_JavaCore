package services;

import file.LocationIO;
import model.Location;

import java.io.IOException;
import java.util.List;

public class LocationService {
    public static final String PATH_FILE_LOCATION = "D:\\Java\\Module2_CaseStudy\\CaseStudy\\src\\file\\DataLocation.csv";
    private List<Location> locations;

    public LocationService() {
        try {
            this.locations = LocationIO.readFromFile(PATH_FILE_LOCATION);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public int findDistance(String start, String end){
        int distance=0;
        for (int i=0; i<locations.size(); i++){
            if(locations.get(i).getStart().equals(start) && locations.get(i).getEnd().equals(end)) {
                distance=locations.get(i).getDistance();
            }
        }
        return distance;
    }
    public int findJourneyTime(String start, String end){
        int journeyTime=0;
        for (int i = 0; i < locations.size(); i++) {
            if(locations.get(i).getStart().equals(start) && locations.get(i).getEnd().equals(end)) {
                journeyTime=locations.get(i).getJourneyTime();
            }
        }
        return journeyTime;
    }


}
