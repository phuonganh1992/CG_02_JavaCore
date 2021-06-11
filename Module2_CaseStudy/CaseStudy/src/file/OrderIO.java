package file;

import model.Order;
import model.Taxi;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class OrderIO {
    public static void writeToFile(String pathFile, List<Order> list) throws IOException {
        File file=new File(pathFile);
        FileWriter fileWriter=new FileWriter(file);
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
        bufferedWriter.write("Order ID,Client Username,Taxi ID,Start Location,End Location,Start Time,End Time,Journey Time,Km,Price,Total Amount,Order Status\n");
        for (Taxi taxi:list) {
            bufferedWriter.write(taxi.getTaxiID()+","+
                    taxi.getTaxiLicensePlate()+","+
                    taxi.getTaxiColor()+","+
                    taxi.getTaxiSeatQuantity()+","+
                    taxi.getTaxiStatus()+"\n"
            );
        }
        bufferedWriter.close();
        fileWriter.close();
    }

    public static List<Taxi> readFromFile(String pathFile) throws IOException {
        List<Taxi> taxis=new ArrayList<>();
        File file=new File(pathFile);
        FileReader fileReader=new FileReader(file);
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        String lineCSV= bufferedReader.readLine();
        while ((lineCSV=bufferedReader.readLine())!=null){
            String[] lineContent=lineCSV.split(",");
            int taxiID=Integer.parseInt(lineContent[0]);
            String taxiLicensePlate=lineContent[1];
            String taxiColor=lineContent[2];
            int taxiSeatQuantity=Integer.parseInt(lineContent[3]);
            int taxiStatus=Integer.parseInt(lineContent[4]);
            taxis.add(new Taxi(taxiID,taxiLicensePlate,taxiColor,taxiSeatQuantity,taxiStatus));
        }
        return taxis;
    }
}
