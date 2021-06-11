package controller;


import model.Client;
import model.Order;
import model.Taxi;
import services.ClientService;
import services.OrderService;
import services.TaxiService;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public class TaxiApp {
    public static final Scanner SCANNER = new Scanner(System.in);
    private Client client;
    private Order order;
    private Taxi taxi;
    private ClientService clientService;
    private OrderService orderService;
    private TaxiService taxiService;

    public TaxiApp() {
        clientService = ClientService.getInstance();
        orderService = OrderService.getInstance();
        taxiService=TaxiService.getInstance();
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

        Client client = new Client(1000, "Anh", "0337644653", "HN", "anhlai", "anhlai123");
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

    public void findTaxi() {
        System.out.print("Enter start location: ");
        String startLocation = SCANNER.nextLine();
        System.out.print("Enter end location: ");
        String endLocation = SCANNER.nextLine();
        int choice;
        do {
            this.taxiService.display();
            System.out.println("Enter taxi that you want to choose: ");
            choice = SCANNER.nextInt();
            LocalDateTime startTime = LocalDateTime.now();
            LocalDateTime endTime = startTime.plusMinutes(60);
            Taxi currentTaxi = taxiService.getTaxis().get(choice);
            order = new Order(123, client, currentTaxi, startLocation, endLocation, startTime, endTime, 10, 2);
            this.orderService.create(order);
        } while (choice >= taxiService.getTaxis().size());
    }

    public void payment() {
        System.out.println("Client paid: " + order.getTotalAmount());
        order.setOrderStatus(3);
        System.out.println("Order status is: " + order.displayStatus());
    }

    public void findHistory() {
        List<Order> historyOrder = orderService.findByUsername(client.getClientUsername());
        System.out.println("Client with username of " + client.getClientUsername() + " has history as below");
        for (Order order : historyOrder) {
            System.out.println(order);
        }
    }
}
