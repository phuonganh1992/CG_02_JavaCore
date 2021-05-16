import java.util.ArrayList;

public class ManageDocument {
    private Document[] listDocument;
    private int size;

    public ManageDocument() {
    }

    public ManageDocument(int size) {
        listDocument=new Document[size];
    }

    public void add(Document element){
        listDocument[size]=element;
        size++;
    }

    public int find(Document element){
        for (int i = 0; i < size; i++) {
            if (element==listDocument[i]) return i;
            break;
        }
        return -1;
    }
    public void delete(String code){
        for (Document element:listDocument) {
            if (element.getCode()==code){

            }
        }
    }
    public void displayDocument(){
        for (Document element:listDocument) {
            System.out.println(element+"\t");
        }
    }

}
