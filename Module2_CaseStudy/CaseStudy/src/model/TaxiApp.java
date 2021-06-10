package model;


import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public class TaxiApp {
    public static final Scanner SCANNER = new Scanner(System.in);
    private Client client;
    private Order order;
    private Taxi taxi;

    public TaxiApp() {
    }

    public TaxiApp(Client client, Order order, Taxi taxi) {
        this.client = client;
        this.order = order;
        this.taxi = taxi;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Taxi getTaxi() {
        return taxi;
    }

    public void setTaxi(Taxi taxi) {
        this.taxi = taxi;
    }

    public void findTaxi() {
        order = new Order();
        System.out.println("Enter start location");
        String startLocation = SCANNER.nextLine();
        System.out.println("Enter end location");
        String endLocation = SCANNER.nextLine();

        int choice;
        TaxiPool taxiPool = new TaxiPool();
        do {
            taxiPool.display();
            System.out.println("Enter taxi that you want to choose: ");
            choice = SCANNER.nextInt();
            LocalDateTime startTime=LocalDateTime.now();
            LocalDateTime endTime=startTime.plusMinutes(10);
            Taxi currentTaxi = taxiPool.getAvailableTaxi().get(choice);
            order.setTaxi(currentTaxi);
            order.setOrderStatus(2);
            order.setStartLocation(startLocation);
            order.setEndLocation(endLocation);


        } while (choice >=taxiPool.getAvailableTaxi().size() );
    }




}
