import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class NextDayCalculator {
    static String displayNextDay(String dateString) {
        String[] array=dateString.split("/");

        int day=Integer.parseInt(array[0]);
        int month=Integer.parseInt(array[1]);
        int year=Integer.parseInt(array[2]);
        if(month==12 && day==31) {
            day=1;
            month=1;
            year=year+1;
        } else if(day==endMonth()){

        }


        return "";
    }
}
