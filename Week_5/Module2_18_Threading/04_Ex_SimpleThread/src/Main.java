public class Main {
    public static void main(String[] args) {
        NumberGenerator number_1=new NumberGenerator("Generator_1");
        NumberGenerator number_2=new NumberGenerator("Generator_2");
        Thread thread_1=new Thread(number_1);
        thread_1.start();
        Thread thread_2=new Thread(number_2);
        thread_2.start();
        thread_1.setPriority(Thread.MIN_PRIORITY);
        thread_2.setPriority(Thread.MAX_PRIORITY);
    }
}
