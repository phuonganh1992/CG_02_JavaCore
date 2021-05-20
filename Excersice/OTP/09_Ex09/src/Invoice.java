public class Invoice {
    private Client client;
    private int currentElectricityIndicator;
    private int oldElectricityIndicator;
    private int payableAmount;

    public Invoice() {
    }

    public Invoice(Client client, int currentElectricityIndicator, int oldElectricityIndicator, int payableAmount) {
        this.client = client;
        this.currentElectricityIndicator = currentElectricityIndicator;
        this.oldElectricityIndicator = oldElectricityIndicator;
        this.payableAmount = payableAmount;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public int getCurrentElectricityIndicator() {
        return currentElectricityIndicator;
    }

    public void setCurrentElectricityIndicator(int currentElectricityIndicator) {
        this.currentElectricityIndicator = currentElectricityIndicator;
    }

    public int getOldElectricityIndicator() {
        return oldElectricityIndicator;
    }

    public void setOldElectricityIndicator(int oldElectricityIndicator) {
        this.oldElectricityIndicator = oldElectricityIndicator;
    }

    public int getPayableAmount() {
        return payableAmount;
    }

    public void setPayableAmount(int payableAmount) {
        this.payableAmount = payableAmount;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                " currentElectricityIndicator=" + currentElectricityIndicator +
                ", oldElectricityIndicator=" + oldElectricityIndicator +
                ", payableAmount=" + payableAmount +
                ", client=" + client.toString() +
                '}';
    }
}
