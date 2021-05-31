public class CountNumber implements Runnable {
    private Thread myThread;

    public CountNumber() {
        this.myThread = new Thread(this,"my runnable thread");
        System.out.println("My thread created "+myThread);
        myThread.start();
    }

    @Override
    public void run() {

    }
}
