package controller;

import file.OrderIO;
import input.Input;
import model.Client;
import model.Distance;
import model.Order;
import model.Taxi;
import services.ClientService;
import services.DistanceService;
import services.OrderService;
import services.TaxiService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
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
        taxiService = TaxiService.getInstance();
        distanceService = DistanceService.getInstance();
    }

    public TaxiApp(Client client) {
        this.client = client;
        clientService = ClientService.getInstance();
        orderService = OrderService.getInstance();
        taxiService = TaxiService.getInstance();
        distanceService = DistanceService.getInstance();
    }

    public TaxiApp(Client client, Order order, Taxi taxi) {
        this.client = client;
        this.order = order;
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

//    public void login() {
//        String username;
//        Client clientLogin;
//        do {
//            System.out.print("Enter username: ");
//            username = SCANNER.nextLine();
//            clientLogin = clientService.findByUsername(username);
//            if (clientLogin == null) System.out.println("Wrong username!");
//        } while (clientLogin == null);
//
//        String password;
//        do {
//            System.out.print("Enter password: ");
//            password = SCANNER.nextLine();
//            if (!clientLogin.getClientPassword().equals(password)) System.out.println("Wrong password!");
//            else {
//                this.client = clientLogin;
//                System.out.println("Client login successfully!");
//            }
////            if(username.equals("ProAdmin") && password.equals("ProAdmin123")) Main.
//        } while (!clientLogin.getClientPassword().equals(password));
//    }

    public void makeOrder() {
        Distance distance = Input.inputDistance();
        LocalDateTime startTime = LocalDateTime.now();
        LocalDateTime endTime = startTime.plusSeconds(distance.getJourneyEstimateTime());

        System.out.println("Client \'" + client.getClientUsername() + "\' want to go from \'" + distance.getStart() + "\' to \'" + distance.getEnd() + "\' with length \'" + distance.getLength() + "\' km, will take time of \'" + distance.getJourneyEstimateTime() + "\' minutes");

        Taxi currentTaxi = chooseTaxi();
        System.out.println("Taxi chosen has information: ");
        System.out.println(currentTaxi);

        int orderId = Input.inputOrderId();
        order = new Order(orderId, client, currentTaxi, startTime, endTime, distance);
        this.orderService.create(order);
        System.out.println("Order is creating");
        System.out.println(this.order);
    }

    public Taxi chooseTaxi() {
        System.out.println("Wait a minutes, we are find taxis for you");
        System.out.println("...");
        System.out.println("Currently, there are list of available taxi as below: ");
        List<Taxi> availableTaxis = this.taxiService.getAvailableTaxis();
        taxiService.display(availableTaxis);
        System.out.print("Enter taxi ID that you want to choose: ");
        int taxiIndex = SCANNER.nextInt();
        Taxi currentTaxi = taxiService.findById(taxiIndex);
        return currentTaxi;
    }

    public void acceptTaxi() {
        order.setOrderStatus(2);
        System.out.println("Order is accepted");
        OrderIO.writeToFile(PATH_FILE_ORDER, orderService.getOrders());
        System.out.println(order);
    }

    public void rejectTaxi() {
        order.setOrderStatus(1);
        System.out.println("Order is cancelled");
        OrderIO.writeToFile(PATH_FILE_ORDER, orderService.getOrders());
        System.out.println(order);
    }

    public void payment() {
        order.setOrderStatus(3);
        System.out.println(order);
        System.out.println("Client paid: " + order.getAmount());
        OrderIO.writeToFile(PATH_FILE_ORDER, orderService.getOrders());
    }

    public void findHistory() {
        List<Order> historyOrder = orderService.findByUsername(client.getClientUsername());

        System.out.println("Client with username of " + client.getClientUsername() + " has history as below");
        for (Order order : historyOrder) {
            System.out.println(order);
        }
        calculateTotalAmount(historyOrder);
    }

    public void calculateTotalAmount(List<Order> orderList) {
        int totalAmount = 0;
        for (Order order : orderList) {
            totalAmount += order.getAmount();
        }
        System.out.println("Client paid total amount: " + totalAmount);
    }

    public void filterHistory(LocalDate startDate, LocalDate endDate) {
        List<Order> historyOrder = orderService.findByUsername(client.getClientUsername());
        List<Order> filterOrder = new ArrayList<>();
        for (Order order : historyOrder) {
            if (order.getStartTime().toLocalDate().compareTo(startDate) > 0 && order.getStartTime().toLocalDate().compareTo(endDate) < 0)
                filterOrder.add(order);
        }

        System.out.println("Client with username of " + client.getClientUsername() + " from " + startDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " to " + endDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + " has the following orders: ");
        for (Order order : filterOrder) {
            System.out.println(order);
        }
        calculateTotalAmount(filterOrder);

    }
}
