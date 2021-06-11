
import controller.TaxiApp;
import controller.TaxiPool;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Tes {
    public static void main(String[] args) {
        LocalDateTime time1=LocalDateTime.now();
        LocalDateTime time2=time1.plusSeconds(1800);
        System.out.println(time1);
        String dateString= time1.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        String dateString1= time2.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));

        System.out.println(dateString1);





    }
}
