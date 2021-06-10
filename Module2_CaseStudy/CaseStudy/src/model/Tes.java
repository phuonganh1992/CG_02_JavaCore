package model;

import com.sun.org.apache.xpath.internal.operations.Or;
import services.TaxiApp;

import java.time.Duration;
import java.time.LocalDateTime;

public class Tes {
    public static void main(String[] args) {
        TaxiApp app=new TaxiApp();
        app.findTaxi();
        app.payment();
//        Order order=new Order();
//        LocalDateTime startTime=LocalDateTime.now();
//        LocalDateTime endTime=startTime.plusMinutes(60);
//
//        Duration duration=Duration.between(startTime,endTime);
//        int journey= (int) duration.getSeconds();
//
//        System.out.println(journey);
//        order.setStartTime(startTime);
//        order.setEndTime(endTime);
//
//        System.out.println(order.toString());
//
//        System.out.println(order.getJourneyTime());
//        System.out.println(order);





    }
}
