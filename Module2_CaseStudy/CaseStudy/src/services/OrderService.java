package services;

import file.OrderIO;
import model.Order;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class OrderService implements GeneralService<Order> {
    public static final String PATH_FILE_ORDER = "D:\\Java\\Module2_CaseStudy\\CaseStudy\\src\\file\\DataOrder.csv";
    private List<Order> orders;
    private static OrderService instance;

    private OrderService() {
        try {
            this.orders = OrderIO.readFromFile(PATH_FILE_ORDER);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static OrderService getInstance() {
        if (instance==null) instance=new OrderService();
        return instance;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }



    @Override
    public void create(Order order) {
        this.orders.add(order);
        try {
            OrderIO.writeToFile(PATH_FILE_ORDER,this.orders);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        int index=-1;
        for (int i = 0; i < orders.size(); i++) {
            if(orders.get(i).getOrderId()==id) {
                orders.remove(i);
                index=i;
            }
        }
        if(index==-1) System.out.println("Found no order to delete!");
        else System.out.println("Delete successfully!");
    }

    @Override
    public void update(int id, Order order) {
        int index=-1;
        for (int i = 0; i < orders.size(); i++) {
            if(orders.get(i).getOrderId()==id) {
                orders.set(i,order);
                index=i;
            }
        }
        if(index==-1) System.out.println("Found no id match "+id);
        else System.out.println("Update successfully");
    }

    @Override
    public Order findById(int id) {
        int index=-1;
        for (int i = 0; i < orders.size(); i++) {
            if(orders.get(i).getOrderId()==id) {
                index=i;
            }
        }
        if(index==-1) {
//            System.out.println("Found no order with id "+id);
            return null;
        } else {
            System.out.println("Order is found successfully!");
            return orders.get(index);
        }
    }
    public List<Order> findByUsername(String username){
        List<Order> findList=new ArrayList<>();
        for (int i = 0; i < orders.size(); i++) {
            if(orders.get(i).getClient().getClientUsername().equals(username))  findList.add(orders.get(i));
        }
        if (findList.isEmpty()) System.out.println("Found no order with username "+username);
        else {
            System.out.println("list order is found");
        }
        return findList;
    }

    @Override
    public List<Order> findAll() {
        return orders;
    }

    @Override
    public void display() {
        for (Order order:orders) {
            System.out.println(order);
        }

    }
}
