public class Main {
    public static void main(String[] args) {
    Customer customer_1=new Customer("Hoa",20,"HN","ID001");
    Customer customer_2=new Customer("Anh",29,"ND","ID002");
    Customer customer_3=new Customer("Quan",30,"BG","ID003");
    Customer customer_4=new Customer("Xuan",40,"DN","ID004");
    Customer customer_5=new Customer("Tu",19,"HCM","ID005");
    CustomerManagement customerManagement=new CustomerManagement();
    customerManagement.add(customer_1);
    customerManagement.add(customer_2);
    customerManagement.add(customer_3);
    customerManagement.add(customer_4);
    customerManagement.add(customer_5);
    customerManagement.display();

    System.out.println(customerManagement.findByKey("ID004"));
    System.out.println("--------------------------------------------");


    Customer customer_6=new Customer("Hung",26,"YB","ID006");
    customerManagement.edit("ID004",customer_6);
    customerManagement.display();
    }
}
