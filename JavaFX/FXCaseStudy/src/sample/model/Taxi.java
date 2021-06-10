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
    private String taxiCode;
    private String taxiLicensePlate;
    private String taxiColor;
    private int taxiSeatQuantity;
    private int taxiStatus;

    public Taxi() {
    }

    public Taxi(String taxiCode, String taxiLicensePlate, String taxiColor, int seatQuantity, int status) {
        this.taxiCode = taxiCode;
        this.taxiLicensePlate = taxiLicensePlate;
        this.taxiColor = taxiColor;
        this.taxiSeatQuantity = seatQuantity;
        this.taxiStatus = status;
    }

    public String getTaxiCode() {
        return taxiCode;
    }

    public void setTaxiCode(String taxiCode) {
        this.taxiCode = taxiCode;
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
                "taxiCode='" + taxiCode + '\'' +
                ", taxiLicensePlate='" + taxiLicensePlate + '\'' +
                ", taxiColor='" + taxiColor + '\'' +
                ", seatQuantity=" + taxiSeatQuantity +
                ", status=" + displayStatus() +
                '}';
    }
}
