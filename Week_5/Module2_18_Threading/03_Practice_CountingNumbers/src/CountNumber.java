public class CountNumber implements Runnable {
    private Thread myThread;

    public CountNumber() {
        this.myThread = new Thread(this,"my runnable thread");
        System.out.println("My thread created "+myThread);
        myThread.start();
    }

    public Thread getMyThread() {
        return myThread;
    }

    public void setMyThread(Thread myThread) {
        this.myThread = myThread;
    }

    @Override
    public void run() {
        try{
            for (int i = 0; i < 10; i++) {
                System.out.println("Printing the count "+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
