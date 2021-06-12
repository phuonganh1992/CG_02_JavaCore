
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
        Client client= ClientService.getInstance().getClients().get(0);
        Taxi taxi= TaxiService.getInstance().getTaxis().get(1);
        Order order=new Order(3008,client,taxi,"Thanh Xuan","Dong Da",LocalDateTime.now(),LocalDateTime.now().plusMinutes(20),20,1);
        orderService.create(order);









    }
}
