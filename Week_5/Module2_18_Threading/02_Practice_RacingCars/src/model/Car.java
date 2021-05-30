package model;

import java.util.Random;
import static model.MainTest.DISTANCE;
import static model.MainTest.STEP;

public class Car implements Runnable{

    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        int runDistance=0;
        Long startTime=System.currentTimeMillis();
        while (runDistance< DISTANCE){
            int speed=new Random().nextInt(20);
            runDistance+=speed;
            String log="|";
            int percentTravel=runDistance*100/DISTANCE;
            for (int i = 0; i < DISTANCE; i+=STEP) {
                if(percentTravel>=i+ STEP){
                    log+="=";
                } else if (percentTravel >= i && percentTravel < i + STEP) {
                    log += "o";
                } else {
                    log+="-";
                }
            }
            log += "|";
            System.out.println("model.MainTest.Car" + this.name + ": " + log + " " + Math.min(DISTANCE, runDistance) + "KM");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println("model.MainTest.Car" + this.name + " broken...");
                break;
            }
        }
        Long endTime=System.currentTimeMillis();
        System.out.println("model.MainTest.Car" + this.name + " Finish in " + (endTime - startTime) / 1000 + "s");
    }
}
