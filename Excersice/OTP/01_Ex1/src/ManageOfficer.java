public class ManageOfficer {
    private Officer[] officers;
    private int size;

    public ManageOfficer() {
        officers=new Officer[100];
    }

    public void add(Officer element){
        officers[size]=element;
        size++;
    }
    public int find(String name){
        int index=-1;
        for (int i = 0; i < size; i++) {
            if (officers[i].getName().equals(name)) {
                index=i;
                break;
            }
        }
        return index;
    }

    public void displayOfficer() {
        for (int i = 0; i < size; i++) {
            System.out.println(officers[i].toString());
        }
    }
    public void displayOfficer(int i){
        System.out.println(officers[i].toString());
    }

}
