package controller;

import model.Order;
import services.ClientService;
import services.OrderService;
import services.TaxiService;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class AdminApp {
    private ClientService clientService;
    private OrderService orderService;
    private TaxiService taxiService;

    public AdminApp() {
        clientService=ClientService.getInstance();
        orderService=OrderService.getInstance();
        taxiService=TaxiService.getInstance();
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


}
