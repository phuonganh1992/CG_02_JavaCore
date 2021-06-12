
import file.DistanceIO;
import model.Distance;

import java.io.IOException;
import java.util.List;

public class Tes {
    public static void main(String[] args) {
        try {
            List<Distance> list= DistanceIO.readFromFile("D:\\Java\\Module2_CaseStudy\\CaseStudy\\src\\file\\DataLocation.csv");
            for (Distance lo:list) {
                System.out.println(lo);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
