package model;

import java.io.Serializable;

public class Product implements Serializable {
    private String proCode;
    private String proName;
    private String proBrand;
    private int proPrice;
    private int proQuantity;

    public Product() {
    }

    public Product(String proCode, String proName, String proBrand, int proPrice, int proQuantity) {
        this.proCode = proCode;
        this.proName = proName;
        this.proBrand = proBrand;
        this.proPrice = proPrice;
        this.proQuantity = proQuantity;
    }

    public String getProCode() {
        return proCode;
    }

    public void setProCode(String proCode) {
        this.proCode = proCode;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getProBrand() {
        return proBrand;
    }

    public void setProBrand(String proBrand) {
        this.proBrand = proBrand;
    }

    public int getProPrice() {
        return proPrice;
    }

    public void setProPrice(int proPrice) {
        this.proPrice = proPrice;
    }

    public int getProQuantity() {
        return proQuantity;
    }

    public void setProQuantity(int proQuantity) {
        this.proQuantity = proQuantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "proCode='" + proCode + '\'' +
                ", proName='" + proName + '\'' +
                ", proBrand='" + proBrand + '\'' +
                ", proPrice='" + proPrice + '\'' +
                ", proQuantity='" + proQuantity + '\'' +
                '}';
    }
}
