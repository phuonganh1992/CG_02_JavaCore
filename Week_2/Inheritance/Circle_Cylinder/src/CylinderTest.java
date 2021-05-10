public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cy1=new Cylinder();
        System.out.println(cy1);
        Cylinder cy2=new Cylinder("Blue",true,3,5);
        System.out.println(cy2);
        System.out.println(cy2.getVolume());
        System.out.println(cy1.getVolume());
    }
}
