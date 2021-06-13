package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Order {
    public static final int PRICE = 10000;
    public static final String WAITING = "Waiting";
    public static final int STATUS_WAITING = 0;
    public static final String CANCEL = "Cancel";
    public static final int STATUS_CANCEL = 1;
    public static final String ACCEPTED = "Accepted";
    public static final int STATUS_ACCEPTED = 2;
    public static final int STATUS_PAID = 3;
    public static final String PAID = "Paid";
    private int orderId;
    private Client client;
    private Taxi taxi;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Distance distance;
    private int price= PRICE;
    private int totalAmount;
    private int orderStatus;


    public Order() {

    }

    public Order(int orderId, Client client, Taxi taxi, LocalDateTime startTime, LocalDateTime endTime, Distance distance) {
        this.orderId = orderId;
        this.client = client;
        this.taxi = taxi;
        this.startTime = startTime;
        this.endTime = endTime;
        this.distance = distance;
        if(orderStatus==0 || orderStatus==1 || orderStatus==2) this.totalAmount=0;
        else this.totalAmount = distance.getLength()*this.price;
        this.orderStatus = 0;
    }
    public Distance getDistance() {
        return distance;
    }

    public void setDistance(Distance distance) {
        this.distance = distance;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }


    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Taxi getTaxi() {
        return taxi;
    }

    public void setTaxi(Taxi taxi) {
        this.taxi = taxi;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount() {
        if(orderStatus==0 || orderStatus==1 || orderStatus==2) this.totalAmount=0;
        else this.totalAmount = distance.getLength()*this.price;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
        setTotalAmount();
    }
    public String displayTime(LocalDateTime time){
        return time.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
    }
    public String displayStatus(){
        switch (orderStatus){
            case STATUS_WAITING:
                return WAITING;
            case STATUS_CANCEL:
                return CANCEL;
            case STATUS_ACCEPTED:
                return ACCEPTED;
            case STATUS_PAID:
                return PAID;
        }
        return "";
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID=" + orderId +
                ", client=" + client +
                ", taxi=" + taxi +
                ", startLocation='" + distance.getStart() + '\'' +
                ", endLocation='" + distance.getEnd() + '\'' +
                ", startTime='" + displayTime(startTime) + '\'' +
                ", endTime='" + displayTime(endTime) + '\'' +
                ", journeyTime='" + distance.getJourneyEstimateTime() + '\'' +
                ", length=" + distance.getLength() +
                ", price=" + price +
                ", totalAmount=" + totalAmount +
                ", orderStatus='" + displayStatus() + '\'' +
                '}';
    }
}
