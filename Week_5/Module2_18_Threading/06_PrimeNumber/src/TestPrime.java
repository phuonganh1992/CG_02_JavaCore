public class TestPrime {
    public static void main(String[] args) {
        LazyPrimeFactorization lazyPrime=new LazyPrimeFactorization();
        OptimizedPrimeFactorization optimizedPrime=new OptimizedPrimeFactorization();
        Thread thread_1=new Thread(lazyPrime);
        Thread thread_2=new Thread(optimizedPrime);
        thread_1.start();
        thread_2.start();
    }
}
