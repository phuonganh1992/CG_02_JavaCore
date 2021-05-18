import java.util.Map;
import java.util.TreeMap;

public class UsingTreeMap {
    public static void main(String[] args) {
        TreeMap<String,Integer> treeMap=new TreeMap<String,Integer>();
        String sentence="Em nuoi mot con meo ma meo keu meo meo";
        String[] sentenceUpper=sentence.toUpperCase().split(" ");
        System.out.println(sentenceUpper.length);
        for (String element: sentenceUpper) {
            int value=element.length();
            if(treeMap.containsKey(element)) {
                value+=treeMap.get(element);
            }
            treeMap.put(element,value);
        }
        System.out.println(treeMap);
    }
}
