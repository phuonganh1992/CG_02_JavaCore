package model;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ManagementProduct {
    private List<Product> productList;

    public ManagementProduct() {
        productList=new LinkedList<>();
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
    public void add(List<Product> list){
        for (Product product:list) {
            productList.add(product);
        }
    }
    public void add(Product product){
        productList.add(product);
        System.out.println("Product is added successfully");
    }
    public void display(){
        System.out.println("List of products: ");
        for (Product product :productList) {
            System.out.println(product);
        }
    }
    public Product search(String productCode){
        for (int i = 0; i < productList.size(); i++) {
            if(productList.get(i).getProCode().equals(productCode)) return productList.get(i);
        }
        return null;
    }
    public void delete(String productCode){
        Product productDelete=search(productCode);
        if(productDelete==null) System.out.println("No product with code above to delete!");
        else {
            productList.remove(productDelete);
            System.out.println("Delete product successfully");
        }
    }

    public void writeToFile(String pathFile,List<Product> productList) throws IOException {

        FileOutputStream fileOutputStream=new FileOutputStream(pathFile);
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(productList);
        objectOutputStream.close();
        fileOutputStream.close();
        System.out.println("Recording product list to file "+pathFile+" is done.");
    }
    public List<Product> readFromFile(String pathFile) throws IOException, ClassNotFoundException {
        List<Product> list=new ArrayList<>();

        FileInputStream fileInputStream=new FileInputStream(pathFile);
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        list=(List<Product>) objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();
        return list;
    }
}
