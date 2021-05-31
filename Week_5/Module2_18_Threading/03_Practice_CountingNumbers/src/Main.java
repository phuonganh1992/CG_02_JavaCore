public class Main {
    public static void main(String[] args) {
        CountNumber countNumber = new CountNumber();
        try {
            while (countNumber.getMyThread().isAlive()) {
                System.out.println("Main thread will be alive till the child thread is live");
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread run is over" );
    }
}
