package services;

import file.OrderIO;
import model.Order;
import java.util.ArrayList;
import java.util.List;
import static file.Path.PATH_FILE_ORDER;

public class OrderService implements GeneralService<Order> {

    private List<Order> orders;
    private static OrderService instance;

    private OrderService() {
        this.orders = OrderIO.readFromFile(PATH_FILE_ORDER);
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
        OrderIO.writeToFile(PATH_FILE_ORDER,this.orders);
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
        OrderIO.writeToFile(PATH_FILE_ORDER,this.orders);
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
        OrderIO.writeToFile(PATH_FILE_ORDER,this.orders);
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
