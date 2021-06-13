import javafx.util.converter.LocalDateTimeStringConverter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Tes {
    public static void main(String[] args) {
        String timeString = "13/06/2021";
        String time2String=timeString+" 00:00:00";


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
//        LocalDateTime time = LocalDateTime.parse(timeString, formatter);
        LocalDateTime time=LocalDateTime.parse(time2String,formatter);
        System.out.println(time);
    }
//


}
