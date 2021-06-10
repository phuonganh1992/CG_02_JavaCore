package model;

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
    private Client client;
    private TaxiPool taxi;
    private String startLocation;
    private String endLocation;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private int km;
    private int price;
    private int totalAmount;
    private int orderStatus;

    public Order() {
        this.client=null;
        this.taxi=null;
        this.startLocation=null;
        this.endLocation=null;
        this.startTime=null;
        this.endTime=null;
        this.km=0;
        this.price=0;
        this.totalAmount=0;
        this.orderStatus=0;
    }

    public Order(Client client, TaxiPool taxi, String startLocation, String endLocation, LocalDateTime startTime, LocalDateTime endTime, int km, int price, int totalAmount, int orderStatus) {
        this.client = client;
        this.taxi = taxi;
        this.startLocation = startLocation;
        this.endLocation = endLocation;
        this.startTime = startTime;
        this.endTime = endTime;
        this.km = km;
        this.price = price;
        this.totalAmount = totalAmount;
        this.orderStatus = orderStatus;
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

    public TaxiPool getTaxi() {
        return taxi;
    }

    public void setTaxi(TaxiPool taxi) {
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

    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
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
                "client=" + client +
                ", taxi=" + taxi +
                ", startLocation='" + startLocation + '\'' +
                ", endLocation='" + endLocation + '\'' +
                ", km=" + km +
                ", price=" + price +
                ", totalAmount=" + totalAmount +
                ", orderStatus='" + displayStatus() + '\'' +
                '}';
    }
}
