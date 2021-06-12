package services;

import file.TaxiIO;
import model.Client;
import model.Taxi;

import java.io.IOException;
import java.util.List;

public class TaxiService implements GeneralService<Taxi>{
    public static final String PATH_FILE_TAXI = "D:\\Java\\Module2_CaseStudy\\CaseStudy\\src\\file\\DataTaxi.csv";
    private List<Taxi> taxis;
    private static TaxiService instance;


    private TaxiService() {
        try {
            this.taxis = TaxiIO.readFromFile(PATH_FILE_TAXI);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static TaxiService getInstance() {
        if(instance==null) instance=new TaxiService();
        return instance;
    }


    public List<Taxi> getTaxis() {
        return taxis;
    }

    public void setTaxis(List<Taxi> taxis) {
        this.taxis = taxis;
    }

    @Override
    public void create(Taxi taxi) {
        this.taxis.add(taxi);
        try {
            TaxiIO.writeToFile(PATH_FILE_TAXI,this.taxis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        int index=-1;
        for (int i = 0; i < taxis.size(); i++) {
            if(taxis.get(i).getTaxiID()==id) {
                taxis.remove(i);
                index=i;
            }
        }
        if(index==-1) System.out.println("Found no taxi to delete!");
        else System.out.println("Delete successfully!");

    }

    @Override
    public void update(int id, Taxi taxi) {
        int index=-1;
        for (int i = 0; i < taxis.size(); i++) {
            if(taxis.get(i).getTaxiID()==id) {
                taxis.set(i,taxi);
                index=i;
            }
        }
        if(index==-1) System.out.println("Found no id match "+id);
        else System.out.println("Update successfully");

    }

    @Override
    public Taxi findById(int id) {
        int index=-1;
        for (int i = 0; i < taxis.size(); i++) {
            if(taxis.get(i).getTaxiID()==id) {
                index=i;
            }
        }
        if(index==-1) {
//            System.out.println("Found no taxi with id "+id);
            return null;
        } else {
//            System.out.println("Taxi is found successfully!");
            return taxis.get(index);
        }
    }

    public Taxi findByLicensePlate(String taxiLicensePlate) {
        int index=-1;
        for (int i = 0; i < taxis.size(); i++) {
            if(taxis.get(i).getTaxiLicensePlate().equals(taxiLicensePlate)) {
                index=i;
            }
        }
        if(index==-1) {
//            System.out.println("Found no taxi with license plate "+taxiLicensePlate);
            return null;
        } else {
//            System.out.println("Taxi is found successfully!");
            return taxis.get(index);
        }
    }

    @Override
    public List<Taxi> findAll() {
        return taxis;
    }

    @Override
    public void display() {
        for (Taxi taxi:taxis) {
            System.out.println(taxi);
        }

    }
}
