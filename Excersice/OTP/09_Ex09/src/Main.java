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
        Invoice invoice6=new Invoice(client2,300,500,900);
        Invoice invoice7=new Invoice(client1,30,50,300);
        invoiceManager.add(invoice1);
        invoiceManager.add(invoice2);
        invoiceManager.add(invoice3);
        invoiceManager.add(invoice4);
        invoiceManager.add(invoice5);
        invoiceManager.add(invoice6);
        invoiceManager.add(invoice7);
        System.out.println("Original invoice list: ");
        invoiceManager.display();
        System.out.println("Invoice list after sorting: ");
        invoiceManager.sortByName();
        invoiceManager.display();

        System.out.println("Invoice with electric meter number is: "+invoiceManager.researchInvoive(130));
        invoiceManager.delete(130);
        System.out.println("Invoice list afer deleting: ");
        invoiceManager.display();

        Invoice invoice8=new Invoice(client3,40,199,900);
        invoiceManager.edit(99,invoice6);
        System.out.println("Invoice list after editing: ");
        invoiceManager.display();

        List<Integer> indexList=invoiceManager.findByElectricMeterArray(130);
        System.out.println("List invoice with electric meter number above is: ");
        if (indexList.size()==0) System.out.println("Found no invoice with electric meter number as above");

        for (int i = 0; i < indexList.size(); i++) {
            System.out.println(invoiceManager.getInvoices().get(indexList.get(i)));
        }
    }
}
