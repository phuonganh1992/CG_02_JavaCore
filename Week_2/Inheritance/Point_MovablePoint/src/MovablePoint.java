public class MovablePoint extends Point{
    private float xSpeed=0.0f;
    private float ySpeed=0.0f;
    MovablePoint(){}
    MovablePoint(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    MovablePoint(float x,float y, float xSpeed, float ySpeed){
        super(x,y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed(){
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        return new float[]{xSpeed,ySpeed};
    }
    @Override
    public String toString(){
        return super.toString()+", "+"speed=("+getSpeed()[0]+","+getSpeed()[1]+")";
    }
    public MovablePoint move(){
        setX(getX()+xSpeed);
        setY(getY()+ySpeed);
        return this;
    }
}
class main{
    public static void main(String[] args) {
        MovablePoint obj_1=new MovablePoint(3,4,20,30);
        System.out.println(obj_1);
        obj_1.move();
        System.out.println(obj_1);
    }

}