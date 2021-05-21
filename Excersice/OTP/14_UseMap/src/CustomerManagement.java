import java.util.*;

public class CustomerManagement {
    private String keyMap;
    private Map<String,Customer> customerMap;

    public CustomerManagement() {
        customerMap=new HashMap<>();
    }

    public CustomerManagement(Map<String, Customer> customerMap) {
        this.customerMap = customerMap;
    }

    public String getIdentityCard() {
        return keyMap;
    }

    public void setIdentityCard(String identityCard) {
        this.keyMap = identityCard;
    }

    public Map<String, Customer> getCustomerMap() {
        return customerMap;
    }

    public void setCustomerMap(Map<String, Customer> customerMap) {
        this.customerMap = customerMap;
    }
    public void add(Customer customer){
        customerMap.put(customer.getCusIdentity(), customer);
    }
    public void display(){
        for (Map.Entry<String,Customer> entry: customerMap.entrySet()) {
            System.out.println(entry);
        }
        System.out.println("--------------------------------------------------------------------------");
    }
    public Customer findByKey(String key){
        if(isKey(key)) return customerMap.get(key);
        else return null;
    }
    public boolean isKey(String key){
        Set<String> keys=customerMap.keySet();
        for (String keyElement:keys) {
            if(keyElement.equals(keyElement)) return true;
        }
        return false;
    }
    public Map findByName(String cusName){
        Map<String,Customer> sameNameMap=new HashMap<>();
        Set<String> keys=customerMap.keySet();
        for (String key:keys){
            if(customerMap.get(key).getCusName().equals(cusName)){
                sameNameMap.put(key,customerMap.get(key));
            }
        }
        return sameNameMap;
    }
    public void edit(String key,Customer customer){
        if(isKey(key)) customerMap.replace(key,customer);
        else System.out.println("Found no key as above");
    }
    public void delete(String name){
        Map<String,Customer> deleteMap=findByName(name);

        for (Map.Entry<String,Customer> entry:deleteMap.entrySet()) {
            customerMap.remove(entry);
        }
    }
    public void sort(){
        List<Map.Entry<String,Customer>> entryCollection=new ArrayList<>(customerMap.entrySet());
        Collections.sort(entryCollection, new Comparator<Map.Entry<String, Customer>>() {
            @Override
            public int compare(Map.Entry<String, Customer> o1, Map.Entry<String, Customer> o2) {
                return o1.getValue().getCusName().compareTo(o2.getValue().getCusName());
            }
        });
        Map<String,Customer> sortedMap=new LinkedHashMap<>();
        for (Map.Entry<String,Customer> entry:entryCollection) {
            sortedMap.put(entry.getKey(),entry.getValue());
        }
        customerMap=sortedMap;
    }
}
