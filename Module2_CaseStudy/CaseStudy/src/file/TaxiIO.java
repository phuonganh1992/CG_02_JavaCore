package file;

import model.Client;
import model.Taxi;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TaxiIO {
    public static void writeToFile(String pathFile, List<Taxi> list) throws IOException {
        File file=new File(pathFile);
        FileWriter fileWriter=new FileWriter(file);
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
        bufferedWriter.write("Taxi ID,Taxi License Plate,Taxi Color,Taxi Seat Quantity,Taxi Status\n");
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
