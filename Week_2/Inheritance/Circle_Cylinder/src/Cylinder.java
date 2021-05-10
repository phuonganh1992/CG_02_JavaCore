public class Cylinder extends Circle {
    private double height=2.0;
    public Cylinder(){}
    public Cylinder(double height){
        this.height=height;
    }
    public Cylinder(String color,boolean filled, double radius,double height){
        super(color, filled, radius);
        this.height=height;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height){
        this.height=height;
    }
    @Override
    public double getArea(){
        return 2*super.getArea()+super.getPerimeter()*height;
    }
    public double getVolume(){
        return super.getArea()*height;
    }
    @Override
    public String toString(){
        return "A Cylinder with height= "+getHeight()+
                ", which is a subclass of "+super.toString();
    }
}
