import java.beans.PropertyEditorSupport;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class hi {
    public static void main(String[] args) throws ParseException {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your date: ");
        String dateString=sc.nextLine();
//        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
//        Date date=df.parse(dateString);
//
//        System.out.println(date);
//        System.out.println(date.getDate());
//        System.out.println(date.getMonth()+1);
//        System.out.println(date.getYear()+1900);
//
//        Calendar cal=Calendar.getInstance();

        String [] result= dateString.split("/");

        String a=result[0];
//        System.out.println(result[1]);
//        System.out.println(result[2]);
        System.out.println(a);
        int b=Integer.parseInt(a);
        System.out.println(b+1);



    }
}
