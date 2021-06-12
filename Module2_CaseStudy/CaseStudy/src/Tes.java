
import com.sun.org.apache.xpath.internal.operations.Or;
import controller.TaxiApp;
import controller.TaxiPool;
import file.OrderIO;
import input.Input;
import model.Client;
import model.Order;
import model.Taxi;
import services.ClientService;
import services.OrderService;
import services.TaxiService;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Tes {
    public static void main(String[] args) {

        OrderService orderService=OrderService.getInstance();
        Client client_1= ClientService.getInstance().getClients().get(0);
        Client client_2= ClientService.getInstance().getClients().get(1);
        Client client_3= ClientService.getInstance().getClients().get(2);
        Client client_4= ClientService.getInstance().getClients().get(3);
        Client client_5= ClientService.getInstance().getClients().get(4);
        Client client_6= ClientService.getInstance().getClients().get(5);
        Taxi taxi_1= TaxiService.getInstance().getTaxis().get(1);
        Taxi taxi_2= TaxiService.getInstance().getTaxis().get(2);
        Taxi taxi_3= TaxiService.getInstance().getTaxis().get(3);
        Taxi taxi_4= TaxiService.getInstance().getTaxis().get(4);
        Taxi taxi_5= TaxiService.getInstance().getTaxis().get(5);
        Taxi taxi_6= TaxiService.getInstance().getTaxis().get(0);
        Order order_1=new Order(3000,client_1,taxi_1,"Thanh Xuan","Dong Da",LocalDateTime.now(),LocalDateTime.now().plusMinutes(20),20,1);
        Order order_2=new Order(3001,client_2,taxi_2,"Thanh Xuan","Dong Da",LocalDateTime.now(),LocalDateTime.now().plusMinutes(20),20,1);
        Order order_3=new Order(3002,client_3,taxi_3,"Thanh Xuan","Dong Da",LocalDateTime.now(),LocalDateTime.now().plusMinutes(20),20,1);
        Order order_4=new Order(3003,client_4,taxi_4,"Thanh Xuan","Dong Da",LocalDateTime.now(),LocalDateTime.now().plusMinutes(20),20,1);
        Order order_5=new Order(3004,client_5,taxi_5,"Thanh Xuan","Dong Da",LocalDateTime.now(),LocalDateTime.now().plusMinutes(20),20,1);
        Order order_6=new Order(3005,client_6,taxi_6,"Thanh Xuan","Dong Da",LocalDateTime.now(),LocalDateTime.now().plusMinutes(20),20,1);
        orderService.create(order_1);
        orderService.create(order_2);
        orderService.create(order_3);
        orderService.create(order_4);
        orderService.create(order_5);
        orderService.create(order_6);









    }
}
