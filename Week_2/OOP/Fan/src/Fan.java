public class Fan {
    final int SLOW=1;
    final int MEDIUM=2;
    final int FAST=3;
    private int speed=SLOW;
    private boolean on=false;
    private double radius=5;
    private String color="blue";
    public void setSpeed(int _speed){
        this.speed=_speed;
    }
    public void setOn(boolean _on){
        this.on=_on;
    }
    public void setRadius(double _radius){
        this.radius=_radius;
    }
    public void setColor(String _color){
        this.color=_color;
    }
    public int getSpeed() {
        return this.speed;
    }
    public boolean isOn() {
        return this.on;
    }
    public double getRadius(){
        return this.radius;
    }
    public String getColor(){
        return this.color;
    }
    public Fan(){
    }
    public String toString(){
        String info;
        if(this.on) {
            info="Fan has speed "+this.getSpeed()+", color "+this.getColor()+", radius "+this.getRadius()+" and fan is on!";
        } else {
            info="Fan has color "+this.getColor()+", radius "+this.getRadius()+", and fan is off!";
        }
        return info;
    }
}
