package model;

import java.time.Duration;
import java.time.LocalDateTime;

public class Tes {
    public static void main(String[] args) {
        TaxiPool taxiPool=new TaxiPool();
        taxiPool.display();
        LocalDateTime time1=LocalDateTime.now();
        LocalDateTime time2=time1.plusMinutes(1);
        Duration duration=Duration.between(time1,time2);
        System.out.println(time1);
        System.out.println(time2);
        System.out.println(duration.getSeconds());
    }
}
