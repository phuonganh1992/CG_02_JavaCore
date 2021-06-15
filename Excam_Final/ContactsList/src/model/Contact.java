package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Contact {
    private String phoneNumber;
    private String group;
    private String name;
    private String gender;
    private String address;
    private String email;
    private LocalDate dateOfBirth;

    public Contact() {
    }

    public Contact(String phoneNumber, String group, String name, String gender, String address, String email, LocalDate dateOfBirth) {
        this.phoneNumber = phoneNumber;
        this.group = group;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    public String displayDate(){
        return dateOfBirth.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    @Override
    public String toString() {
        return "Phone number='" + phoneNumber +
                ", group: " + group +
                ", name: " + name +
                ", gender: " + gender +
                ", address: " + address +
                ", email: " + email +
                ", date of birth: " + displayDate();
    }
}
