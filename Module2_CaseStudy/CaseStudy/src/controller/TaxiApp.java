package controller;


import model.Client;
import model.Order;
import model.Taxi;
import services.ClientService;
import services.GeneralService;

import java.time.LocalDateTime;
import java.util.Scanner;

public class TaxiApp{
//    public static final Scanner SCANNER = new Scanner(System.in);
//    private Client client;
//    private Order order;
//    private Taxi taxi;
//
//    public TaxiApp() {
//    }
//
//    public TaxiApp(Client client, Order order, Taxi taxi) {
//        this.client = client;
//        this.order = order;
//        this.taxi = taxi;
//    }
//
//    public Client getClient() {
//        return client;
//    }
//
//    public void setClient(Client client) {
//        this.client = client;
//    }
//
//    public Order getOrder() {
//        return order;
//    }
//
//    public void setOrder(Order order) {
//        this.order = order;
//    }
//
//    public Taxi getTaxi() {
//        return taxi;
//    }
//
//    public void setTaxi(Taxi taxi) {
//        this.taxi = taxi;
//    }
//
//    @Override
//    public void findTaxi() {
//        client=new Client("Anh","xxxxx","HN","user","password");
//        System.out.println("Enter start location");
//        String startLocation = SCANNER.nextLine();
//        System.out.println("Enter end location");
//        String endLocation = SCANNER.nextLine();
//
//        int choice;
//        TaxiPool taxiPool = new TaxiPool();
//        do {
//            taxiPool.display();
//            System.out.println("Enter taxi that you want to choose: ");
//            choice = SCANNER.nextInt();
//            LocalDateTime startTime=LocalDateTime.now();
//            LocalDateTime endTime=startTime.plusMinutes(60);
//            Taxi currentTaxi = taxiPool.getAvailableTaxi().get(choice);
//            order=new Order(client,currentTaxi,startLocation,endLocation,startTime,endTime,10,2);
//        } while (choice >=taxiPool.getAvailableTaxi().size() );
//    }
//    public void payment(){
//        System.out.println("Client paid: "+order.getTotalAmount());
//        order.setOrderStatus(3);
//
//    }
//    @Override
//    public void register(){
//
//
//    }
    ClientService clientService = new ClientService();

    void register() {

        Client client = new Client("");
        clientService.create(client);
    }

    void login() {
        clientService.f
    }
}
