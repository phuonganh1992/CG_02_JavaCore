import java.util.Scanner;

public class NextDayCalculator {
    private String dateString;
    public NextDayCalculator() {
       this.dateString=inputDate();
    }

    static String displayNextDay(String dateString) {
        String[] array=dateString.split("/");

        int day=Integer.parseInt(array[0]);
        int month=Integer.parseInt(array[1]);
        int year=Integer.parseInt(array[2]);
        if(month==12 && day==31) {
            day=1;
            month=1;
            year=year+1;
        } else if(day==NextDayCalculator.calculateMondEnd(month,year)){
            day=1;
            month+=1;

        } else {
            day+=1;

        }
        if(day<10 && month<10) return "0"+day+"/0"+month+"/"+year;
        if(day<10 && month>10) return "0"+day+"/"+month+"/"+year;
        else return day+"/"+month+"/"+year;
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
    public static boolean isLeapYear(int year){
        if(year%400==0 || (year%4==0 && year%100!=0)) return true;
        return false;
    }
    public static String inputDate(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your date with date format dd/mm/yyyy: ");
        String dateString=sc.nextLine();
        return dateString;
    }
}
