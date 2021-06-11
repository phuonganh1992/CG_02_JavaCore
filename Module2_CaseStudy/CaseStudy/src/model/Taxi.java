package model;

public class Taxi {
//    enum TaxiStatusEnum {
//        _1("Available"), _0("Unavailable");
//        String display;
//
//        TaxiStatusEnum(String display) {
//            this.display = display;
//        }
//    }
    private int taxiID;
    private String taxiLicensePlate;
    private String taxiColor;
    private int taxiSeatQuantity;
    private int taxiStatus;

    public Taxi() {
    }

    public Taxi(int taxiID, String taxiLicensePlate, String taxiColor, int seatQuantity, int status) {
        this.taxiID = taxiID;
        this.taxiLicensePlate = taxiLicensePlate;
        this.taxiColor = taxiColor;
        this.taxiSeatQuantity = seatQuantity;
        this.taxiStatus = status;
    }

    public int getTaxiID() {
        return taxiID;
    }

    public void setTaxiID(int taxiID) {
        this.taxiID = taxiID;
    }

    public int getTaxiSeatQuantity() {
        return taxiSeatQuantity;
    }

    public void setTaxiSeatQuantity(int taxiSeatQuantity) {
        this.taxiSeatQuantity = taxiSeatQuantity;
    }

    public int getTaxiStatus() {
        return taxiStatus;
    }

    public void setTaxiStatus(int taxiStatus) {
        this.taxiStatus = taxiStatus;
    }

    public String getTaxiLicensePlate() {
        return taxiLicensePlate;
    }

    public void setTaxiLicensePlate(String taxiLicensePlate) {
        this.taxiLicensePlate = taxiLicensePlate;
    }

    public String getTaxiColor() {
        return taxiColor;
    }

    public void setTaxiColor(String taxiColor) {
        this.taxiColor = taxiColor;
    }

    public int getSeatQuantity() {
        return taxiSeatQuantity;
    }

    public void setSeatQuantity(int seatQuantity) {
        this.taxiSeatQuantity = seatQuantity;
    }

    public int getStatus() {
        return taxiStatus;
    }

    public void setStatus(int status) {
        this.taxiStatus = status;
    }
    public String displayStatus(){
        switch (taxiStatus){
            case 0:
                return "Unavailable";
            case 1:
                return "Available";
        }
        return "";
    }


    @Override
    public String toString() {
        return "Taxi{" +
                "taxiID='" + taxiID + '\'' +
                ", taxiLicensePlate='" + taxiLicensePlate + '\'' +
                ", taxiColor='" + taxiColor + '\'' +
                ", seatQuantity=" + taxiSeatQuantity +
                ", taxiStatus=" + displayStatus() +
                '}';
    }
}
