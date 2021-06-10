package model;

import java.util.ArrayList;
import java.util.List;

public class TaxiPool {
    private List<Taxi> availableTaxi;


    public TaxiPool() {
        availableTaxi=new ArrayList<>();
        availableTaxi.add(new Taxi("Code001","LI001","white",4,1));
        availableTaxi.add(new Taxi("Code002","LI002","red",5,1));
        availableTaxi.add(new Taxi("Code003","LI003","green",7,1));
        availableTaxi.add(new Taxi("Code004","LI004","black",4,1));
        availableTaxi.add(new Taxi("Code005","LI005","white",7,1));
    }

    public List<Taxi> getAvailableTaxi() {
        return availableTaxi;
    }

    public void setAvailableTaxi(List<Taxi> availableTaxi) {
        this.availableTaxi = availableTaxi;
    }

    public void display(){
        for (Taxi taxi:availableTaxi) {
            System.out.println(taxi);
        }
    }
}
