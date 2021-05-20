import java.util.ArrayList;
import java.util.List;

public class InvoiceManager {
    private List<Invoice> invoices;

    public InvoiceManager() {
        this.invoices = new ArrayList<>();
    }

    public List<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(List<Invoice> invoices) {
        this.invoices = invoices;
    }
    public void add(Invoice invoice){
        this.invoices.add(invoice);
    }
    public int findByElectricityMeter(int electricMeterNumber){
        for (int i = 0; i < invoices.size(); i++) {
            if(invoices.get(i).getClient().getElectricMeterNumber()==electricMeterNumber) return i;
        }
        return -1;
    }
    public List<Integer> findByElectricMeterArray(int electricMeterNumber){
        int index=findByElectricityMeter(electricMeterNumber);
        List<Integer> indexList=new ArrayList<>();
        while (index!=-1){
            indexList.add(index);
            for (int i = index; i <invoices.size() ; i++) {
                if(invoices.get(i).getClient().getElectricMeterNumber()==electricMeterNumber) {
                    index=i;
                }
            }
        }
        return indexList;
    }
    public void display(){
        for (int i = 0; i < invoices.size(); i++) {
            System.out.println(invoices.get(i));
        }
        System.out.println("-----------------------------------------------------------------------");
    }
}
