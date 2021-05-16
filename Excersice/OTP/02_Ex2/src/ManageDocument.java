public class ManageDocument {
    private Document[] listDocument=new Document[100];
    private int size=0;

    public ManageDocument() {
    }

    public void add(Document element){
        listDocument[size]=element;
        size++;
    }

    public int find(String code){
        for (int i = 0; i < size; i++) {
            if (listDocument[i].getCode().equals(code)) return i;
        }
        return -1;
    }
    public void delete(String code){
        int index=find(code);
        if (index!=-1){
            for (int i = index; i <size ; i++) {
                listDocument[i]=listDocument[i+1];
            }
            listDocument[size-1]=null;
            size--;
        }
    }

    public void displayDocument() {
        for (int i = 0; i < size; i++) {
            System.out.println(listDocument[i].toString());

        }
    }
    public void displayDocument(int i){
        System.out.println(listDocument[i].toString());
    }
}
