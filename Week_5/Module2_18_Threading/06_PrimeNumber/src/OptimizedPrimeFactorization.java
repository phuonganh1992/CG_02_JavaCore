public class OptimizedPrimeFactorization implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            if(isPrime(i)) System.out.println("Optimized Prime number = "+i);
        }
    }

    public boolean isPrime(int number){
        if(number<2) return false;
        else if(number==2) return true;
        else{
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if(number%i==0) return false;
            }
            return true;
        }
    }
}
