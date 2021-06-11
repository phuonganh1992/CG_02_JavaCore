
import controller.TaxiApp;
import controller.TaxiPool;
import file.OrderIO;
import model.Order;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Tes {
    public static void main(String[] args) {
        List<Order> list= null;
        try {
            list = OrderIO.readFromFile("D:\\Java\\Module2_CaseStudy\\CaseStudy\\src\\file\\DataOrder.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Order order:list) {
            System.out.println(order);
        }







    }
}
