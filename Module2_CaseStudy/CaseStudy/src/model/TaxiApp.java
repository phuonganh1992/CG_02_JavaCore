package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaxiApp {
    private Client client;
    private Order order;
    private Taxi taxi;
    public static final Scanner SCANNER = new Scanner(System.in);
    public static List<Taxi> availableTaxi=new ArrayList<>();


    public TaxiApp() {
    }

    public TaxiApp(Client client, Order order, Taxi taxi) {
        this.client = client;
        this.order = order;
        this.taxi = taxi;
    }
    void findTaxi(){
        order=new Order();
        System.out.println("Enter start location");
        String startLocation=SCANNER.nextLine();
        System.out.println("Enter end location");
        String endLocation=SCANNER.nextLine();

    }
}