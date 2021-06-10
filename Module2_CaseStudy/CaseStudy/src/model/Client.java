package model;

public class Client {
    private String clientName;
    private String clientPhoneNumber;
    private String clientCountry;

    public Client() {
    }

    public Client(String clientName, String clientPhoneNumber, String clientCountry) {
        this.clientName = clientName;
        this.clientPhoneNumber = clientPhoneNumber;
        this.clientCountry = clientCountry;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientPhoneNumber() {
        return clientPhoneNumber;
    }



    public void setClientPhoneNumber(String clientPhoneNumber) {
        this.clientPhoneNumber = clientPhoneNumber;
    }

    public String getClientCountry() {
        return clientCountry;
    }

    public void setClientCountry(String clientCountry) {
        this.clientCountry = clientCountry;
    }
    @Override
    public String toString() {
        return "Client{" +
                "clientName='" + clientName + '\'' +
                ", clientPhoneNumber='" + clientPhoneNumber + '\'' +
                ", clientCountry='" + clientCountry + '\'' +
                '}';
    }
}
