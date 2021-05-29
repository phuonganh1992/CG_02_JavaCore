import model.ManagementProduct;
import model.Product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static final String FILE_PATH = "src/file/products.txt";

    public static void main(String[] args) {
        ManagementProduct managementProduct=new ManagementProduct();
        managementProduct.add(availableList());
        managementProduct.display();
        try {
            managementProduct.writeToFile(FILE_PATH, managementProduct.getProductList());
            List<Product> listRead1st=managementProduct.readFromFile(FILE_PATH);
            for (Product product:listRead1st) {
                System.out.println(product);
            }
//            managementProduct.add(new Product("Code_7","Banh","Kinh Do",700,30));
//            managementProduct.delete("Code_5");
        }
        catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
//        catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }

    }
    static List<Product> availableList(){
        List<Product> productList=new ArrayList<>();
        Product product_1=new Product("Code_1","Banh","Kinh Do",200,10);
        Product product_2=new Product("Code_2","Keo","Orion",300,10);
        Product product_3=new Product("Code_3","Chinsu","Orion",500,10);
        Product product_4=new Product("Code_4","Nam Ngu","Kinh Do",600,10);
        Product product_5=new Product("Code_5","Keo","Kinh Do",900,10);
        Product product_6=new Product("Code_6","Banh","Kinh Do",700,10);

        productList.add(product_1);
        productList.add(product_2);
        productList.add(product_3);
        productList.add(product_4);
        productList.add(product_5);
        productList.add(product_6);
        return productList;
    }

}
