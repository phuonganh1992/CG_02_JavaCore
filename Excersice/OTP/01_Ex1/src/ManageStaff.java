public class ManageStaff implements ManageOfficer<Staff>{
    private Staff[] staffList=new Staff[0];
    private int size=0;

    public ManageStaff(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void add(Staff staff) {
        staffList[size]=staff;
        size++;
    }

    @Override
    public int find(String name) {
        for (int i = 0; i < size; i++) {
            if(staffList[i].getName()==name) return i;
            break;
        }
        return -1;
    }

    @Override
    public void displayList() {
        for (int i=0;i<size;i++){
            staffList[i].toString();
        }

    }
}
