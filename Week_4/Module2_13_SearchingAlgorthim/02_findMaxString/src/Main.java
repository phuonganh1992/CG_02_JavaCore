import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String string="Wellcome";
        String[] stringSplit=string.split("");
        List<String> stringList=new ArrayList<>();
        stringList.add(stringSplit[0]);
        for (int i = 1; i < stringSplit.length; i++) {
            int size= stringList.size();
            if(stringSplit[i].compareTo(stringList.get(size-1))>0) stringList.add(stringSplit[i]);
        }
        System.out.println(stringList);
    }
}
