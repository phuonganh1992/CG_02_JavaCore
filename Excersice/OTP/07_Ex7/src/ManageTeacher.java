public class ManageTeacher {
    private Teacher[] teachers;
    private int size;

    public ManageTeacher() {
        teachers=new Teacher[100];
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public void add(Teacher teacher){
        teachers[size]=teacher;
        size++;
    }
    public void delete(String code){
        int index=find(code);
        if(index==-1) System.out.println("No teacher with code as above, pls re-input");
        else {
            for (int i = index; i <size-1 ; i++) {
                teachers[i]=teachers[i+1];
            }
            teachers[size-1]=null;
            size--;
        }
    }
    public int find(String code){
        for (int i = 0; i < size; i++) {
           if( teachers[i].getCode().equals(code)) return i;
        }
        return -1;
    }
    public int calculateSalary(){
        int sum=0;
        for (int i = 0; i < size; i++) {
            sum+=teachers[i].getNetSalary();
        }
        return sum;
    }
    public void display(){
        System.out.println("-------------------------");
        System.out.println("Teacher list includes: ");
        for (int i = 0; i < size; i++) {
            System.out.println(teachers[i]);
        }
    }
}
