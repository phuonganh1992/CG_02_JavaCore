public class Circle {
    private double radius=1.0;
    private String color="red";
    Circle(){}
    Circle(double _radius){
        this.radius=_radius;
    }
    double getRadius(){
        return this.radius;
    }
    double getArea(){
        return Math.pow(this.radius,2)*Math.PI;
    }
}
