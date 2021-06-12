
import com.sun.org.apache.xpath.internal.operations.Or;
import controller.TaxiApp;
import controller.TaxiPool;
import file.LocationIO;
import file.OrderIO;
import input.Input;
import model.Client;
import model.Location;
import model.Order;
import model.Taxi;
import services.ClientService;
import services.OrderService;
import services.TaxiService;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Tes {
    public static void main(String[] args) {
        try {
            List<Location> list= LocationIO.readFromFile("D:\\Java\\Module2_CaseStudy\\CaseStudy\\src\\file\\DataLocation.csv");
            for (Location lo:list) {
                System.out.println(lo);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
