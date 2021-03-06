package controller;

import model.Client;
import model.Order;
import model.Taxi;
import services.ClientService;
import services.DistanceService;
import services.OrderService;
import services.TaxiService;

import java.util.Scanner;

public class App {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static final int ROLE_ADMIN = 2;
    public static final int ROLE_CLIENT = 1;
    private Client client;
    private Order order;
    private Taxi taxi;
    private ClientService clientService;
    private OrderService orderService;
    private TaxiService taxiService;
    private DistanceService distanceService;

    public App() {
        clientService = ClientService.getInstance();
        orderService = OrderService.getInstance();
        taxiService=TaxiService.getInstance();
        distanceService=DistanceService.getInstance();
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
    public int login() {
        String username;
        Client clientLogin;
        int role=0;
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


            boolean isAdminAcount = username.equals("ProAdmin") && password.equals("ProAdmin123");
            if(isAdminAcount) {
                role= ROLE_ADMIN;
            }
            if(!isAdminAcount && clientLogin.getClientPassword().equals(password)){
                this.client=clientLogin;
                System.out.println("Client login successfully!");
                role= ROLE_CLIENT;
            }
            if(!clientLogin.getClientPassword().equals(password)) {
                System.out.println("Wrong password!");
            }
        }while (!clientLogin.getClientPassword().equals(password));
        return role;
    }
}
