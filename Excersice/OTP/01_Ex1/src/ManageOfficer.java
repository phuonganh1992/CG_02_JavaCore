public class ManageOfficer {
    private Officer[] officers=new Officer[100];
    private int size;

    public ManageOfficer() {
    }

    public ManageOfficer(int size) {
        Officer[] officers=new Officer[size];
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
