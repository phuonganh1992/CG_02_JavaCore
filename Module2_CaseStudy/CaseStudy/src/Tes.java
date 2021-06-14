import controller.AdminApp;
import javafx.util.converter.LocalDateTimeStringConverter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Tes {
    public static void main(String[] args) {
        AdminApp adminApp=new AdminApp();
        int x= adminApp.countTaxiInOrder(adminApp.findById(2010));
        System.out.println(x);
        adminApp.sortTaxi();
    }
//


}
