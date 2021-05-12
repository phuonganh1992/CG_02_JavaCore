import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class hi {
    public static void main(String[] args) {
//        Calendar calendar=Calendar.getInstance();
//        System.out.println(calendar);

//        System.out.println(calendar.set(2020,12,29));
//        String dateString="20/12/2008";
//        DateFormat df=new SimpleDateFormat("dd/MM/yyyy");
//        Date date=df.parse(dateString);

        Date date = new Date(2008-1900,11,29);
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String dateString = df.format(date);
        System.out.println("Current date: " + dateString);



    }
}
