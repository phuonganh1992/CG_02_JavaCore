import java.util.Scanner;

public class Town {
    private Family[] families;
    private int size;

    public Town() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size: ");
        this.size = sc.nextInt();
        families=new Family[size];
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public void input(){
        for(int i=0;i<size;i++){
            System.out.println("Information of family "+(i+1));
            Family family=new Family();
            family.input();
            families[i]=family;
        }
    }
    public void display(){
        System.out.println("Town have "+size+" families:");
        for(int i=0;i<size;i++){
            families[i].display();
        }
    }

}
