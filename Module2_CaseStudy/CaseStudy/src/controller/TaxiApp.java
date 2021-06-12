package controller;

import file.OrderIO;
import input.Input;
import model.Client;
import model.Order;
import model.Taxi;
import services.ClientService;
import services.DistanceService;
import services.OrderService;
import services.TaxiService;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;
import static file.Path.PATH_FILE_ORDER;

public class TaxiApp {
    public static final Scanner SCANNER = new Scanner(System.in);
    private Client client;
    private Order order;
    private Taxi taxi;
    private ClientService clientService;
    private OrderService orderService;
    private TaxiService taxiService;
    private DistanceService distanceService;

    public TaxiApp() {
        clientService = ClientService.getInstance();
        orderService = OrderService.getInstance();
        taxiService=TaxiService.getInstance();
        distanceService=DistanceService.getInstance();

    }

    public ClientService getClientService() {
        return clientService;
    }

    public void setClientService(ClientService clientService) {
        this.clientService = clientService;
    }

    public OrderService getOrderService() {
        return orderService;
    }

    public void setOrderService(OrderService orderService) {
        this.orderService = orderService;
    }

    public TaxiService getTaxiService() {
        return taxiService;
    }

    public void setTaxiService(TaxiService taxiService) {
        this.taxiService = taxiService;
    }

    public DistanceService getDistanceService() {
        return distanceService;
    }

    public void setDistanceService(DistanceService distanceService) {
        this.distanceService = distanceService;
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
        Client client = Input.inputClient();
        clientService.create(client);
    }

    public void login() {
        String username;
        Client clientLogin;
        do {
            System.out.print("Enter username: ");
            username=SCANNER.nextLine();
            clientLogin = clientService.findByUsername(username);
            if(clientLogin==null) System.out.println("Wrong username!");
        }while (clientLogin==null);

        String password;
        do {
            System.out.print("Enter password: ");
            password = SCANNER.nextLine();
            if(!clientLogin.getClientPassword().equals(password)) System.out.println("Wrong password!");
            else {
                this.client=clientLogin;
                System.out.println("Login successfully!");
            }
        }while (!clientLogin.getClientPassword().equals(password));
    }

    public void makeOrder() {
        System.out.print("Enter start location: ");
        String startLocation = SCANNER.nextLine();
        System.out.print("Enter end location: ");
        String endLocation = SCANNER.nextLine();
        LocalDateTime startTime = LocalDateTime.now();
        int journeyEstimateTime=distanceService.findJourneyTime(startLocation,endLocation);
        LocalDateTime endTime = startTime.plusMinutes(journeyEstimateTime);
        int lengthDistance=distanceService.findDistance(startLocation,endLocation);

        System.out.println("Client \'"+client.getClientUsername()+ "\' want to go from \'"+startLocation+"\' to \'"+endLocation+ "\' with distance \'"+lengthDistance +"\' km, will take time of \'"+journeyEstimateTime +"\' minutes");

        Taxi currentTaxi = chooseTaxi();
        System.out.println("Taxi chosen has information: ");
        System.out.println(currentTaxi);

        int orderId= Input.inputOrderId();
        order = new Order(orderId, client, currentTaxi, startLocation, endLocation, startTime, endTime, lengthDistance);
        this.orderService.create(order);
        System.out.println("Order is creating");
        System.out.println(this.order);
    }

    public Taxi chooseTaxi() {
        System.out.println("Wait a minutes, we are find taxis for you");
        System.out.println("...");
        System.out.println("Currently, there are list of available taxi as below: ");
        List<Taxi> availableTaxis= this.taxiService.getAvailableTaxis();
        taxiService.display(availableTaxis);
        System.out.println("Enter taxi that you want to choose: ");
        int taxiIndex = SCANNER.nextInt();
        Taxi currentTaxi = taxiService.getTaxis().get(taxiIndex);
        return currentTaxi;
    }
    public void acceptTaxi(){
        order.setOrderStatus(2);
        System.out.println("Order is accepted");
        OrderIO.writeToFile(PATH_FILE_ORDER,orderService.getOrders());
        System.out.println(order);
    }
    public void rejectTaxi(){
        order.setOrderStatus(1);
        System.out.println("Order is cancelled");
        OrderIO.writeToFile(PATH_FILE_ORDER,orderService.getOrders());
        System.out.println(order);
    }

    public void payment() {
        System.out.println("Client paid: " + order.getTotalAmount());
        order.setOrderStatus(3);
        System.out.println("Order status is: " + order.displayStatus());
        OrderIO.writeToFile(PATH_FILE_ORDER,orderService.getOrders());
    }

    public void findHistory() {
        List<Order> historyOrder = orderService.findByUsername(client.getClientUsername());
        System.out.println("Client with username of " + client.getClientUsername() + " has history as below");
        for (Order order : historyOrder) {
            System.out.println(order);
        }
    }
}
