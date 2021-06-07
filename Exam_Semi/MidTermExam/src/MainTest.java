import javafx.util.converter.DateStringConverter;
import javafx.util.converter.LocalDateStringConverter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MainTest {
    public static void main(String[] args) {
        String dateString="21/12/1992";
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate studentDateOfBirth=LocalDate.parse(dateString,formatter);
        System.out.println(studentDateOfBirth.getMonth());
    }
}
