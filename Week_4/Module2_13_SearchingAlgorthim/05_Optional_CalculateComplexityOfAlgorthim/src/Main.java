import javax.swing.plaf.IconUIResource;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        String string="abcabcdgeabxy";
        LinkedList<Character> maxString=new LinkedList<>();
        LinkedList<Character> list=new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            if (list.size() > 1 && string.charAt(i) <= list.getLast() && list.contains(string.charAt(i))) list.clear();
            list.add(string.charAt(i));
            if(list.size()>maxString.size()){
                maxString.clear();
                maxString.addAll(list);
            }
        }
        System.out.println(maxString);
    }
}
