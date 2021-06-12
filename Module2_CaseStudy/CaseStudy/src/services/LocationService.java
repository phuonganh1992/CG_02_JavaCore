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


}
