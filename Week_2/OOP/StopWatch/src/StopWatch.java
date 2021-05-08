public class StopWatch {
    private long startTime, endTime;
    public long getStartTime(){
        return this.startTime;
    }
    public long getEndTime(){
        return this.endTime;
    }
    public StopWatch(){
        start();
    }
    public void start(){
        this.startTime=System.currentTimeMillis();
    }
    public void stop(){
        this.endTime=System.currentTimeMillis();
    }
    public long getElapsedTime() {
        return (this.endTime-this.startTime);
    }
}
