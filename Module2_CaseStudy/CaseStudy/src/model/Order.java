package model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Order {
    public enum OrderStatus{
        WAITING(0),CANCEL(1),ACCEPTED(2),PAID(3);
        int value;
        OrderStatus(int value){
            this.value=value;
        }
    }
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
    private String startLocation;
    private String endLocation;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private int journeyTime;
    private int lengthDistance;
    private int price= PRICE;
    private int totalAmount;
    private int orderStatus;


    public Order() {

    }
    public Order(int orderId,Client client, Taxi taxi, String startLocation, String endLocation, LocalDateTime startTime, LocalDateTime endTime,int journeyTime, int lengthDistance) {
        this.orderId=orderId;
        this.client = client;
        this.taxi = taxi;
        this.startLocation = startLocation;
        this.endLocation = endLocation;
        this.startTime = startTime;
        this.endTime = endTime;
        this.journeyTime=journeyTime;
        this.lengthDistance=lengthDistance;
        this.totalAmount = lengthDistance*this.price;
        this.orderStatus = 0;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setJourneyTime(int journeyTime) {
        this.journeyTime = journeyTime;
    }

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }

    public int getJourneyTime() {
        return journeyTime;
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

    public String getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(String startLocation) {
        this.startLocation = startLocation;
    }

    public String getEndLocation() {
        return endLocation;
    }

    public void setEndLocation(String endLocation) {
        this.endLocation = endLocation;
    }

    public int getLengthDistance() {
        return lengthDistance;
    }

    public void setLengthDistance(int lengthDistance) {
        this.lengthDistance = lengthDistance;
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
        this.totalAmount =this.price*this.lengthDistance;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
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
                ", startLocation='" + startLocation + '\'' +
                ", endLocation='" + endLocation + '\'' +
                ", startTime='" + displayTime(startTime) + '\'' +
                ", endTime='" + displayTime(endTime) + '\'' +
                ", journeyTime='" + journeyTime + '\'' +
                ", km=" + lengthDistance +
                ", price=" + price +
                ", totalAmount=" + totalAmount +
                ", orderStatus='" + displayStatus() + '\'' +
                '}';
    }
}
