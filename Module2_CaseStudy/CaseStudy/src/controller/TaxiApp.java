package controller;


import model.Client;
import model.Order;
import model.Taxi;
import services.ClientService;
import java.time.LocalDateTime;
import java.util.Scanner;

public class TaxiApp{
    public static final Scanner SCANNER = new Scanner(System.in);
    private Client client;
    private Order order;
    private Taxi taxi;
    private ClientService clientService;

    public TaxiApp() {
        clientService=ClientService.getInstance();
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

    public void register() {

        Client client = new Client();
        clientService.create(client);
    }
    public void login() {
        System.out.print("Enter username: ");
        String username=SCANNER.nextLine();
        System.out.print("Enter password: ");
        String password=SCANNER.nextLine();
        Client client=clientService.findByUsername(username);
        if(client.getClientPassword().equals(password)) System.out.println("Login successfully");
    }

    public void findTaxi() {
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
            LocalDateTime endTime=startTime.plusMinutes(60);
            Taxi currentTaxi = taxiPool.getAvailableTaxi().get(choice);
            order=new Order(,currentTaxi,startLocation,endLocation,startTime,endTime,10,2);
        } while (choice >=taxiPool.getAvailableTaxi().size() );
    }
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





}
