public class Customer {
    private String cusName;
    private int cusAge;
    private String cusAddress;

    public Customer() {
    }

    public Customer(String cusName, int cusAge, String cusAddress) {
        this.cusName = cusName;
        this.cusAge = cusAge;
        this.cusAddress = cusAddress;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public int getCusAge() {
        return cusAge;
    }

    public void setCusAge(int cusAge) {
        this.cusAge = cusAge;
    }

    public String getCusAddress() {
        return cusAddress;
    }

    public void setCusAddress(String cusAddress) {
        this.cusAddress = cusAddress;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cusName='" + cusName + '\'' +
                ", cusAge=" + cusAge +
                ", cusAddress='" + cusAddress + '\'' +
                '}';
    }
}
