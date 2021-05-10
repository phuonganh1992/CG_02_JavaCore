public class Circle {
    private double radius=1.0;
    private String color="red";
    private boolean filled=false;
    public Circle(){}
    public Circle(String color,boolean filled,double radius){
        this.color=color;
        this.filled=filled;
        this.radius=radius;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
    public boolean isFilled(){
     return filled;
    }
    public void setFilled(boolean filled){
        this.filled=filled;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getArea(){
        return Math.pow(radius,2)*Math.PI;
    }
    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
    @Override
    public String toString(){
        return "A Circle with radius= "+getRadius()+
                ", color= "+getColor()+", "+
                (isFilled()?"filled":"not filled");
    }
}
