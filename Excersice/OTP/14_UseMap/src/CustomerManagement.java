import java.util.*;

public class CustomerManagement {
    private String identityCard;
    private Map<String,Customer> customerMap;

    public CustomerManagement() {
        customerMap=new HashMap<>();
    }

    public CustomerManagement(Map<String, Customer> customerMap) {
        this.customerMap = customerMap;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public Map<String, Customer> getCustomerMap() {
        return customerMap;
    }

    public void setCustomerMap(Map<String, Customer> customerMap) {
        this.customerMap = customerMap;
    }
    public void add(String identityCard,Customer customer){
        customerMap.put(identityCard, customer);
    }
    public void display(){
        for (Map.Entry<String,Customer> entry: customerMap.entrySet()) {
            System.out.println(entry);
        }
        System.out.println("----------------------------------------------------");
    }
    public Customer findByKey(String identityCard){
        if(isKey(identityCard)) return customerMap.get(identityCard);
        else return null;
    }
    public boolean isKey(String identityCard){
        Set<String> keys=customerMap.keySet();
        for (String key:keys) {
            if(key.equals(identityCard)) return true;
        }
        return false;
    }
    public Map findByName(String cusName){
        Map<String,Customer> sameNameMap=new HashMap<>();
        Set<String> keys=customerMap.keySet();
        Collection<Customer> customers= customerMap.values();
        for (String key:keys){
            if(customerMap.get(key).getCusName().equals(customers)){
                sameNameMap.put(key,customerMap.get(key));
            }
        }
        return sameNameMap;
    }
//    public void
}
