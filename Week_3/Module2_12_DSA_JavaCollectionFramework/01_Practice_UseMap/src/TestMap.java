import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer> hashMap=new HashMap<>();
        hashMap.put("Hoa",20);
        hashMap.put("Hanh",25);
        hashMap.put("Trung",21);
        hashMap.put("Hung",30);
        hashMap.put("Anh",26);

        System.out.println("---------------HashMap---------------");
        System.out.println(hashMap);

        Map<String,Integer> treeMap=new TreeMap<>(hashMap);
        System.out.println("---------------TreeMap------------------");
        System.out.println(treeMap);

        Map<String,Integer> linkedHashMap=new LinkedHashMap<>(hashMap);
        System.out.println("-----------------LinkedHashMap-------------------");
        System.out.println(linkedHashMap);
    }
}
