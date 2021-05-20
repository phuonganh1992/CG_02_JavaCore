import java.util.*;

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
    public Invoice researchInvoive(int electricMeterNumber) {
        int index = findByElectricityMeter(electricMeterNumber);
        if (index == -1) return null;
        else return invoices.get(index);
    }
    public List<Integer> findByElectricMeterArray(int electricMeterNumber){
        int index=findByElectricityMeter(electricMeterNumber);
        List<Integer> indexList=new ArrayList<>();
        boolean isExist;
        if(index==-1) isExist=false;
        else isExist=true;

        while (isExist) {
            indexList.add(index);
            for (int i = index+1; i < invoices.size(); i++) {
                if(invoices.get(i).getClient().getElectricMeterNumber()==electricMeterNumber){
                    index=i;
                    indexList.add(index);
                    isExist=true;
                    break;
                }else isExist=false;
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
    public void edit(int electricityMeter,Invoice invoice){
        int index=findByElectricityMeter(electricityMeter);
        if(index==-1) System.out.println("Found no invoice for electricity meter number as above");
        else invoices.set(index,invoice);
    }
    public void delete(int electricityMeter){
        int index=findByElectricityMeter(electricityMeter);
        if(index==-1) System.out.println("Found no invoice for electricity meter number as above");
        else invoices.remove(invoices.get(index));
    }
    public void sortByName(){
        Collections.sort(invoices, new Comparator<Invoice>() {
            @Override
            public int compare(Invoice o1, Invoice o2) {
                return o1.getClient().getName().compareTo(o2.getClient().getName());
            }
        });
    }
}
