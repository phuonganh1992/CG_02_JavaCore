import java.util.LinkedList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        String string="Wellcome";
        List<Character> maxString=new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> list=new LinkedList<>();
            list.add(string.charAt(i));
            for (int j = i+1; j < string.length(); j++) {
                if(string.charAt(j)>list.getLast()){
                    list.add(string.charAt(j));
                }
            }
            if(list.size()> maxString.size()){
                maxString.clear();
                maxString.addAll(list);
            }
            list.clear();
        }
        System.out.println(maxString);

    }
}
