package services;

import file.TaxiIO;
import model.Client;
import model.Taxi;

import java.io.IOException;
import java.util.List;
import static file.Path.PATH_FILE_TAXI;

public class TaxiService implements GeneralService<Taxi>{

    private List<Taxi> taxis;
    private List<Taxi> availableTaxis;
    private static TaxiService instance;


    private TaxiService() {
        this.taxis = TaxiIO.readFromFile(PATH_FILE_TAXI);
        this.availableTaxis=TaxiIO.readFromFileBaseStatus(PATH_FILE_TAXI,1);
    }

    public static TaxiService getInstance() {
        if(instance==null) instance=new TaxiService();
        return instance;
    }

    public List<Taxi> getAvailableTaxis() {
        return availableTaxis;
    }

    public void setAvailableTaxis(List<Taxi> availableTaxis) {
        this.availableTaxis = availableTaxis;
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
        TaxiIO.writeToFile(PATH_FILE_TAXI,this.taxis);
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
        TaxiIO.writeToFile(PATH_FILE_TAXI,this.taxis);
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
        TaxiIO.writeToFile(PATH_FILE_TAXI,this.taxis);
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
            return null;
        } else {
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
            return null;
        } else {
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
    public void display(List<Taxi> list) {
        for (Taxi taxi:list) {
            System.out.println(taxi);
        }
    }
}
