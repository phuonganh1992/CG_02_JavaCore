import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ValidDate {
    public static final Scanner SCANNER = new Scanner(System.in);

    private static LocalDate getCustomerDateOfBirth(){
        int day, month,year;
        do {
            System.out.print("Enter customer date of birth with format 'dd/MM/yyyy': ");
            String inputString = SCANNER.nextLine();
            String[] strings = inputString.split("/");
            day = Integer.parseInt(strings[0]);
            month = Integer.parseInt(strings[1]);
            year = Integer.parseInt(strings[2]);
            if (year < 0 || !(month > 1 && month <= 12) || !(day >= 1 && day < calculateMondEnd(month, year)))
                System.out.println("Invalid date, pls re-enter");
        } while (year < 0 || !(month > 1 && month <= 12) || !(day >= 1 && day < calculateMondEnd(month, year)));
        return LocalDate.of(year,month,day);
    }
    public static String displayDate(LocalDate localDate){
        return localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
    public static boolean isLeapYear(int year){
        if(year%400==0 || (year%4==0 && year%100!=0)) return true;
        return false;
    }
    public static int calculateMondEnd(int month,int year){
        int endMonth=0;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                endMonth=31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                endMonth=30;
                break;
            case 2:
                if(isLeapYear(year)) endMonth=29;
                else endMonth=28;
                break;
        }
        return endMonth;
    }
}
