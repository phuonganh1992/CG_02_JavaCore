package services;

import file.DistanceIO;
import model.Distance;
import java.util.List;
import static file.Path.PATH_FILE_LOCATION;

public class DistanceService {

    private List<Distance> distances;
    public static DistanceService instance;

    private DistanceService() {
        this.distances = DistanceIO.readFromFile(PATH_FILE_LOCATION);
    }

    public static DistanceService getInstance() {
        if(instance==null) instance=new DistanceService();
        return instance;
    }

    public List<Distance> getDistances() {
        return distances;
    }

    public static void setInstance(DistanceService instance) {
        DistanceService.instance = instance;
    }

    public int findDistance(String start, String end){
        int distance=0;
        for (int i = 0; i< distances.size(); i++){
            if(distances.get(i).getStart().equals(start) && distances.get(i).getEnd().equals(end)) {
                distance= distances.get(i).getLengthDistance();
            }
        }
        return distance;
    }
    public int findJourneyTime(String start, String end){
        int journeyTime=0;
        for (int i = 0; i < distances.size(); i++) {
            if(distances.get(i).getStart().equals(start) && distances.get(i).getEnd().equals(end)) {
                journeyTime= distances.get(i).getJourneyEstimateTime();
            }
        }
        return journeyTime;
    }


}
