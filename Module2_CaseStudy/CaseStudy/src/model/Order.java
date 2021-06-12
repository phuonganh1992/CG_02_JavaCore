package model;

import services.DistanceService;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Order {
    public static final int PRICE = 10;
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
    public Order(int orderId,Client client, Taxi taxi, String startLocation, String endLocation, LocalDateTime startTime, LocalDateTime endTime, int lengthDistance) {
        this.orderId=orderId;
        this.client = client;
        this.taxi = taxi;
        this.startLocation = startLocation;
        this.endLocation = endLocation;
        this.startTime = startTime;
        this.endTime = endTime;
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

    public void setJourneyTime() {
        this.journeyTime = (int) Duration.between(startTime,endTime).getSeconds();
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
            case 0:
                return "Waiting";
            case 1:
                return "Cancel";
            case 2:
                return "Accepted";
            case 3:
                return "Paid";
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
