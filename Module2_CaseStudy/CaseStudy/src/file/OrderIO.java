package file;

import model.Client;
import model.Distance;
import model.Order;
import model.Taxi;
import services.ClientService;
import services.DistanceService;
import services.TaxiService;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class OrderIO {
    public static void writeToFile(String pathFile, List<Order> list) {
        File file=new File(pathFile);
        FileWriter fileWriter= null;
        try {
            fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            bufferedWriter.write("Order ID,Client Username,Taxi ID,Start Location,End Location,Start Time,End Time,Journey Time,Length Distance,Price,Total Amount,Order Status\n");
            for (Order order:list) {
                bufferedWriter.write(order.getOrderId()+","+
                        order.getClient().getClientUsername()+","+
                        order.getTaxi().getTaxiID()+","+
                        order.getDistance().getStart()+","+
                        order.getDistance().getEnd()+","+
                        order.displayTime(order.getStartTime())+","+
                        order.displayTime(order.getEndTime())+","+
                        order.getDistance().getJourneyEstimateTime()+","+
                        order.getDistance().getLength()+","+
                        order.getPrice()+","+
                        order.getTotalAmount()+","+
                        order.getOrderStatus()+"\n"
                );
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Order> readFromFile(String pathFile) {
        List<Order> orders=new ArrayList<>();
        File file=new File(pathFile);
        FileReader fileReader= null;
        try {
            fileReader = new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String lineCSV= bufferedReader.readLine();
            while ((lineCSV=bufferedReader.readLine())!=null){
                String[] lineContent=lineCSV.split(",");
                int orderId=Integer.parseInt(lineContent[0]);
                String clientUserName=lineContent[1];
                Client client= ClientService.getInstance().findByUsername(clientUserName);
                int taxiId=Integer.parseInt(lineContent[2]);
                Taxi taxi= TaxiService.getInstance().findById(taxiId);
                String startLocation=lineContent[3];
                String endLocation=lineContent[4];
                int journeyTime= DistanceService.getInstance().findJourneyTime(startLocation,endLocation);
                int length=DistanceService.getInstance().findLength(startLocation,endLocation);
                Distance distance=new Distance(startLocation,endLocation,length,journeyTime);
                LocalDateTime startTime=convertStringToDate(lineContent[5]);
                LocalDateTime endTime=convertStringToDate(lineContent[6]);

                int orderStatus=Integer.parseInt(lineContent[11]);
                Order order=new Order(orderId,client,taxi,startTime,endTime,distance);
                orders.add(order);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return orders;
    }
    public static LocalDateTime convertStringToDate(String timeString){
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return LocalDateTime.parse(timeString,formatter);
    }

}
