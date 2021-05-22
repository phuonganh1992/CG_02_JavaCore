import javax.swing.plaf.IconUIResource;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        String string="abcabcdgabxy";
        LinkedList<Character> maxString=new LinkedList<>();
        LinkedList<Character> list=new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            list.add(string.charAt(i));
            for (int j = i+1; j <string.length() ; j++) {
                if(string.charAt(j)>list.getLast())
                    list.add(string.charAt(j));
            }
            if(list.size()>maxString.size()){
                maxString.clear();
                maxString.addAll(list);
                list.clear();
            }
        }

        System.out.println(maxString);
    }
}
