import java.util.List;

public class Main {
    public static void main(String[] args) {
        InvoiceManager invoiceManager=new InvoiceManager();
        Client client1=new Client("Nguyen Van Ha","HN",100);
        Client client2=new Client("Tran Duc Thanh","HN",130);
        Client client3=new Client("Lai Thieu Tien","HN",99);
        Invoice invoice1=new Invoice(client1,12,20,500);
        Invoice invoice2=new Invoice(client2,123,200,600);
        Invoice invoice3=new Invoice(client3,15,40,700);
        Invoice invoice4=new Invoice(client1,20,30,800);
        Invoice invoice5=new Invoice(client2,200,300,900);
        invoiceManager.add(invoice1);
        invoiceManager.add(invoice2);
        invoiceManager.add(invoice3);
        invoiceManager.add(invoice4);
        invoiceManager.add(invoice5);
        System.out.println("Original invoice list: ");
        invoiceManager.display();
//        System.out.println(invoiceManager.findByElectricityMeter(130));
//        List<Integer> indexList=invoiceManager.findByElectricMeterArray(130);
//        System.out.println(indexList.size());
    }
}
