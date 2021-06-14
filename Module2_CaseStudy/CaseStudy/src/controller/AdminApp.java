package controller;

import model.Order;
import model.Taxi;
import services.ClientService;
import services.OrderService;
import services.TaxiService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class AdminApp {
    private ClientService clientService;
    private OrderService orderService;
    private TaxiService taxiService;

    public AdminApp() {
        clientService=ClientService.getInstance();
        orderService=OrderService.getInstance();
        taxiService=TaxiService.getInstance();
    }
    public List<Order> findAllOrder(){
        return orderService.findAll();
    }
    public List<Order> filterByDate(LocalDate startDate,LocalDate endDate){
        List<Order> allOrders = orderService.findAll();
        List<Order> filterOrder=new ArrayList<>();
        for (Order order : allOrders) {
            if(order.getStartTime().toLocalDate().compareTo(startDate)>=0 &&order.getStartTime().toLocalDate().compareTo(endDate)<=0) filterOrder.add(order);
        }

        System.out.println("Orders from "+startDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))+" to "+endDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        for (Order order : filterOrder) {
            System.out.println(order);
        }
        calculateTotalAmount(filterOrder);
        return filterOrder;
    }
    public void calculateTotalAmount(List<Order> orderList) {
        int totalAmount=0;
        for (Order order: orderList) {
            totalAmount+=order.getAmount();
        }
        System.out.println("Total amount: "+totalAmount);
    }
    public void displayOrder(){
        orderService.display();
        calculateTotalAmount(findAllOrder());
    }
    public void createTaxi(Taxi taxi){
        taxiService.create(taxi);
    }

    public void deleteTaxi(int id){
        taxiService.delete(id);
    }

    public void update(int id, Taxi taxi){
        taxiService.update(id,taxi);
    }
    public Taxi findById(int id){
        return taxiService.findById(id);
    }
    public Taxi findByLicense(String taxiLicense){
        return taxiService.findByLicensePlate(taxiLicense);
    }
    public List<Taxi> findAllTaxi(){
        return taxiService.findAll();
    }
    public void displayTaxi(){
        taxiService.display();
    }

    public int countTaxiInOrder(Taxi taxi){
        int turn=0;
        for (Order order:findAllOrder()) {
            if(order.getTaxi().equals(taxi)) turn+=1;
        }
        return turn;
    }
    public void sortTaxi(){
        Collections.sort(findAllTaxi(), new Comparator<Taxi>() {
            @Override
            public int compare(Taxi o1, Taxi o2) {
                return countTaxiInOrder(o1)-countTaxiInOrder(o2);
            }
        });
        displayTaxi();
    }
}
