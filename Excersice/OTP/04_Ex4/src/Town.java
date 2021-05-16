public class Town {
    private Family[] families;
    private int size;

    public Town() {
        families=new Family[0];
    }

    public Town(int size) {
        this.size = size;
        families=new Family[size];
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
