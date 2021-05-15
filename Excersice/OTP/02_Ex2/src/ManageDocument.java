import java.util.ArrayList;

public class ManageDocument<T> {
    private ArrayList<T> list;
//    private int size;

    public ManageDocument() {
        list = new ArrayList<>();
    }
    public void add(T element){
        list.add(element);

    }
    public void delete(String code){
        for (T element:list) {
            if (((Document) element).getCode()==code){
                list.remove(element);
            }
        }
    }
    public void displayDocument(){
        for (T element:list) {
            System.out.println(element+"\t");
        }
    }
    public int find(T element){
        for (int i = 0; i < list.size(); i++) {
            if (element==list.get(i)) return i;
            break;
        }
        return -1;
    }
}
