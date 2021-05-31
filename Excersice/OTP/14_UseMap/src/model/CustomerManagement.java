package model;

import java.util.*;

public class CustomerManagement {
    private String keyMap;
    private Map<String, Customer> customerMap;

    public CustomerManagement() {
        customerMap=new HashMap<>();
    }

    public CustomerManagement(Map<String, Customer> customerMap) {
        this.customerMap = customerMap;
    }

    public String getKeyMap() {
        return keyMap;
    }

    public void setKeyMap(String keyMap) {
        this.keyMap = keyMap;
    }

    public Map<String, Customer> getCustomerMap() {
        return customerMap;
    }

    public void setCustomerMap(Map<String, Customer> customerMap) {
        this.customerMap = customerMap;
    }
    public void add(String key, Customer customer){
        customerMap.put(key, customer);
    }

    public void display(){
        for (Map.Entry<String, Customer> entry: customerMap.entrySet()) {
            System.out.println(entry);
        }
        System.out.println("--------------------------------------------------------------------------");
    }
    public Customer findByKey(String key){
        if(customerMap.containsKey(key)) return customerMap.get(key);
        else return null;
    }

    public Map<String, Customer> findByName(String cusName){
        Map<String, Customer> sameNameMap=new HashMap<>();
        Set<String> keys=customerMap.keySet();
        for (String key:keys){
            if(customerMap.get(key).getCusName().equals(cusName))
                sameNameMap.put(key,customerMap.get(key));

        }
        return sameNameMap;
    }

    public Map<String, Customer> findAgeRange(int minAge, int maxAge){
        Map<String, Customer> sameAgeRange=new HashMap<>();
        Set<String> keys= customerMap.keySet();
        for(String key: keys){
            if(customerMap.get(key).getCusAge()>=minAge && customerMap.get(key).getCusAge()<=maxAge)
                sameAgeRange.put(key,customerMap.get(key));
        }

        return sameAgeRange;
    }
    public void edit(String key, Customer customer){
        if(customerMap.containsKey(key)) customerMap.replace(key,customer);
        else System.out.println("Found no key as above");
    }

    public void deleteByKey(String key){
        customerMap.remove(key);
    }

    public void deleteByName(String name){
        Map<String, Customer> sameNameMap=findByName(name);
        if(findByName(name).isEmpty()) System.out.println("Found no customer to delete");
        else {
            for (String key : sameNameMap.keySet()) {
                customerMap.remove(key);
            }
        }
    }
    public void deleteAgeRange(int minAge,int maxAge){
        Map<String, Customer> sameAgeRange=findAgeRange(minAge,maxAge);
        for(String key: sameAgeRange.keySet()){
            customerMap.remove(key);
        }
    }
    public void sort(){
        List<Map.Entry<String, Customer>> entryCollection=new ArrayList<>(customerMap.entrySet());
        Collections.sort(entryCollection, new Comparator<Map.Entry<String, Customer>>() {
            @Override
            public int compare(Map.Entry<String, Customer> o1, Map.Entry<String, Customer> o2) {
                if(o1.getValue().getCusName().equals(o2.getValue().getCusName())) return o2.getValue().getCusDateOfBirth().compareTo(o1.getValue().getCusDateOfBirth());
               else return o1.getValue().getCusName().compareTo(o2.getValue().getCusName());
            }
        });
        Map<String, Customer> sortedMap=new LinkedHashMap<>();
        for (Map.Entry<String, Customer> entry:entryCollection) {
            sortedMap.put(entry.getKey(),entry.getValue());
        }
        customerMap=sortedMap;
    }
}
