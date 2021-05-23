public class Maintest {
    public static void main(String[] args) {
    Customer customer_1=new Customer("Hoa",20,"HN","ID001",0);
    Customer customer_2=new Customer("Anh",29,"ND","ID002",0);
    Customer customer_3=new Customer("Quan",30,"BG","ID003",1);
    Customer customer_4=new Customer("Xuan",40,"DN","ID004",0);
    Customer customer_5=new Customer("Tu",19,"HCM","ID005",1);
    Customer customer_7=new Customer("Anh",19,"HCM","ID007",0);
    CustomerManagement customerManagement=new CustomerManagement();
    customerManagement.add("CU001",customer_1);
    customerManagement.add("CU002",customer_2);
    customerManagement.add("C003",customer_3);
    customerManagement.add("CU004",customer_4);
    customerManagement.add("CU005",customer_5);
    customerManagement.add("CU007",customer_7);
    customerManagement.sort();
    customerManagement.display();

    System.out.println(customerManagement.findByKey("CU004"));
    System.out.println("--------------------------------------------");


    Customer customer_6=new Customer("Hung",26,"YB","ID006",2);
    customerManagement.edit("CU004",customer_6);
    customerManagement.display();
        System.out.println(customerManagement.findByName("Anh"));
        customerManagement.deleteByName("Anh");

    customerManagement.display();
    }
}
