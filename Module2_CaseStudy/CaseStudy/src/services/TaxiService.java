package services;

import model.Client;
import model.Taxi;

import java.util.ArrayList;
import java.util.List;

public class TaxiService implements GeneralService<Taxi>,FindByLicensePlate<Taxi> {
    private List<Taxi> taxis;

    public TaxiService() {
        this.taxis = new ArrayList<>();
    }

    @Override
    public void create(Taxi taxi) {
        taxis.add(taxi);
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
            System.out.println("Found no taxi with id "+id);
            return null;
        } else {
            System.out.println("Taxi is found successfully!");
            return taxis.get(index);
        }
    }

    @Override
    public List<Taxi> findByLicensePlate(String taxiLicensePlate) {
        List<Taxi> findList=new ArrayList<>();
        for (int i = 0; i < taxis.size(); i++) {
            if(taxis.get(i).getTaxiLicensePlate().equals(taxiLicensePlate))  findList.add(taxis.get(i));
        }
        if (findList.isEmpty()) System.out.println("Found taxi with license plate "+taxiLicensePlate);
        else {
            System.out.println("List taxi is found");
        }
        return findList;

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
