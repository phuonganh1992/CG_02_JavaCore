package model;

import java.time.Duration;
import java.time.LocalDateTime;

public class Order {
//    enum OrderStatusEnum{
//        _0("Waiting"),_1("Cancel"),_2("Accepted"),_3("Paid");
//        String display;
//
//        OrderStatusEnum(String display) {
//            this.display = display;
//        }
//    }
    private int orderId;
    private Client client;
    private Taxi taxi;
    private String startLocation;
    private String endLocation;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private int journeyTime;
    private int km;
    private int price=10;
    private int totalAmount;
    private int orderStatus;

    public Order() {

    }
    public Order(int orderId,Client client, Taxi taxi, String startLocation, String endLocation, LocalDateTime startTime, LocalDateTime endTime, int km, int orderStatus) {
        this.orderId=orderId;
        this.client = client;
        this.taxi = taxi;
        this.startLocation = startLocation;
        this.endLocation = endLocation;
        this.startTime = startTime;
        this.endTime = endTime;
        this.journeyTime=(int) Duration.between(startTime,endTime).getSeconds();
        this.totalAmount = price*journeyTime;
        this.orderStatus = orderStatus;
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

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
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
        this.totalAmount =price*journeyTime;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
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
                "client=" + client +
                ", taxi=" + taxi +
                ", startLocation='" + startLocation + '\'' +
                ", endLocation='" + endLocation + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                ", journeyTime='" + journeyTime + '\'' +
                ", km=" + km +
                ", price=" + price +
                ", totalAmount=" + totalAmount +
                ", orderStatus='" + displayStatus() + '\'' +
                '}';
    }
}
