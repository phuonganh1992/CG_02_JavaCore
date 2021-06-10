package model;

import java.time.Duration;
import java.time.LocalDateTime;

public class Bill {
    private Client client;
    private Taxi taxi;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private int journeyTime;
    private int price=10;
    private int amount;

    public Bill() {
    }

    public Bill(Client client, Taxi taxi, LocalDateTime startTime, LocalDateTime endTime) {
        this.client = client;
        this.taxi = taxi;
        this.startTime = startTime;
        this.endTime = endTime;
        this.journeyTime = (int) Duration.between(startTime,endTime).getSeconds();
        this.amount = price*journeyTime;
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

    public int getJourneyTime() {
        return journeyTime;
    }

    public void setJourneyTime() {
        this.journeyTime = (int) Duration.between(startTime,endTime).getSeconds();
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "client=" + client +
                ", taxi=" + taxi +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", journeyTime=" + journeyTime +
                ", amount=" + amount +
                '}';
    }
}
