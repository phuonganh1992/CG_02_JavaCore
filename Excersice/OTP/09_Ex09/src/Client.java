public class Client {
    private String name;
    private String address;
    private int electricMeterNumber;

    public Client() {
    }

    public Client(String name, String address, int electricMeterNumber) {
        this.name = name;
        this.address = address;
        this.electricMeterNumber = electricMeterNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getElectricMeterNumber() {
        return electricMeterNumber;
    }

    public void setElectricMeterNumber(int electricMeterNumber) {
        this.electricMeterNumber = electricMeterNumber;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", electricMeterNumber=" + electricMeterNumber +
                '}';
    }
}
