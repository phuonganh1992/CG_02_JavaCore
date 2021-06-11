package controller;

import file.TaxiIO;
import model.Taxi;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TaxiPool {
    private List<Taxi> availableTaxi;


    public TaxiPool() {
        TaxiIO taxiIO=new TaxiIO();
        try {
            availableTaxi=taxiIO.readFromFile("D:\\Java\\Module2_CaseStudy\\CaseStudy\\src\\file\\DataTaxi.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }

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
