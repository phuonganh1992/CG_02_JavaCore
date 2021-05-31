import model.Customer;
import model.CustomerManagement;

import java.time.LocalDate;

public class Maintest {
    public static void main(String[] args) {
    Customer customer_1=new Customer("Hoa","HN","ID001",0, LocalDate.of(1992,2,13));
    Customer customer_2=new Customer("Anh","ND","ID002",0,LocalDate.of(1999,5,20));
    Customer customer_3=new Customer("Quan","BG","ID003",1,LocalDate.of(1984,2,13));
//    model.Customer customer_4=new model.Customer("Xuan",40,"DN","ID004",0,LocalDate.of(1996,9,27));
//    model.Customer customer_5=new model.Customer("Tu",19,"HCM","ID005",1,LocalDate.of(2002,2,13));
//    model.Customer customer_7=new model.Customer("Anh",19,"HCM","ID007",0,LocalDate.of(1991,1,13));
        System.out.println(customer_1);
        LocalDate bob=LocalDate.of(1992,10,3);
        String stringDate="03/10/1992";
        String[] strings=stringDate.split("/");
        int day=Integer.parseInt(strings[0]);
        int month=Integer.parseInt(strings[1]);
        int year=Integer.parseInt(strings[2]);
        LocalDate localDate=LocalDate.of(year,month,day);
        System.out.println(localDate);


    CustomerManagement customerManagement=new CustomerManagement();
    customerManagement.add("CU001",customer_1);
//    customerManagement.add("CU002",customer_2);
//    customerManagement.add("C003",customer_3);
//    customerManagement.add("CU004",customer_4);
//    customerManagement.add("CU005",customer_5);
//    customerManagement.add("CU007",customer_7);
//
//        System.out.println(customerManagement.findAgeRange(20,30));
//        customerManagement.deleteAgeRange(20,30);
//        customerManagement.display();
//    ;
//    customerManagement.sort();
//    customerManagement.display();
//
//    System.out.println(customerManagement.findByKey("CU004"));
//    System.out.println("--------------------------------------------");
//
//
//    model.Customer customer_6=new model.Customer("Hung",26,"YB","ID006",2);
//    customerManagement.edit("CU004",customer_6);
    customerManagement.display();
//        System.out.println(customerManagement.findByName("Anh"));
//        customerManagement.deleteByName("Anh");
//
//    customerManagement.display();
    }
}
