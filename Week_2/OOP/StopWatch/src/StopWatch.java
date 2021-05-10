public class StopWatch {
    private long startTime, endTime;
    public StopWatch(){
        start();
    }
    public long getStartTime(){
        return startTime;
    }
    public void start(){
        this.startTime=System.currentTimeMillis();
    }
    public long getEndTime(){
        return endTime;
    }
    public void stop(){
        endTime=System.currentTimeMillis();
    }
    public long getElapsedTime() {
        return (endTime-startTime);
    }
}
