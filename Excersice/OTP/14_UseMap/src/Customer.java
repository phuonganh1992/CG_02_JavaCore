public class Customer {
    private String cusName;
    private int cusAge;
    private String cusAddress;
    private String cusIdentity;
    private int cusGender;

    public Customer() {
    }

    public Customer(String cusName, int cusAge, String cusAddress, String cusIdentity,int cusGender) {
        this.cusName = cusName;
        this.cusAge = cusAge;
        this.cusAddress = cusAddress;
        this.cusIdentity = cusIdentity;
        this.cusGender=cusGender;
    }

    public String getCusIdentity() {
        return cusIdentity;
    }

    public void setCusIdentity(String cusIdentity) {
        this.cusIdentity = cusIdentity;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public int getCusGender() {
        return cusGender;
    }

    public void setCusGender(int cusGender) {
        this.cusGender = cusGender;
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

    public String displayGender(){
        switch (this.cusGender){
            case 0:
                return "female";
            case 1:
                return "male";
        }
        return "other";
    }

    @Override
    public String toString() {
        return "Customer{" +
                "Name='" + cusName + '\'' +
                ", Age=" + cusAge +
                ", Address='" + cusAddress + '\'' +
                ", Identity='" + cusIdentity + '\'' +
                ", Gender='" + displayGender() + '\'' +
                '}';
    }
}
