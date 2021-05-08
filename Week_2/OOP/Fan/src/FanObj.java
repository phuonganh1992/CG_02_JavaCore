public class FanObj {
    public static void main(String[] args) {
        Fan fan_1=new Fan();
        fan_1.setSpeed(fan_1.FAST);fan_1.setRadius(10);fan_1.setColor("yellow");fan_1.setOn(true);

        Fan fan_2=new Fan();
        fan_2.setSpeed(fan_2.MEDIUM);

        System.out.println(fan_1.toString());
        System.out.println(fan_2.toString());
    }
}
