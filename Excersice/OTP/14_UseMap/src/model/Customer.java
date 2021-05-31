package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Customer {
    private String cusName;
    private int cusAge;
    private String cusAddress;
    private String cusIdentity;
    private int cusGender;
    private LocalDate cusDateOfBirth;

    public Customer() {
    }

    public Customer(String cusName, String cusAddress, String cusIdentity, int cusGender, LocalDate cusDateOfBirth) {
        this.cusName = cusName;
        this.cusAddress = cusAddress;
        this.cusIdentity = cusIdentity;
        this.cusGender = cusGender;
        this.cusDateOfBirth = cusDateOfBirth;
        this.cusAge=LocalDate.now().getYear()- cusDateOfBirth.getYear();
    }

    public LocalDate getCusDateOfBirth() {
        return cusDateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.cusDateOfBirth = dateOfBirth;
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

    public void setCusAge() {
        this.cusAge =LocalDate.now().getYear()- cusDateOfBirth.getYear();
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
    public String displayDateOfBirth(){
        return cusDateOfBirth.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    @Override
    public String toString() {
        return "model.Customer{" +
                "Name='" + cusName + '\'' +
                ", Age=" + cusAge +
                ", Address='" + cusAddress + '\'' +
                ", Identity='" + cusIdentity + '\'' +
                ", Gender='" + displayGender() + '\'' +
                ", DOB='" + displayDateOfBirth() + '\'' +
                '}';
    }
}
