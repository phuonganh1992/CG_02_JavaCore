public class NumberGenerator implements Runnable {
    private String name;

    public NumberGenerator(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Name= "+this.name+", Number = "+i + ", Hashcode= "+this.hashCode());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
