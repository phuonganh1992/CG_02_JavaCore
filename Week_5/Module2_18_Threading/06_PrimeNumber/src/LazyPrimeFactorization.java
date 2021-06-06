public class LazyPrimeFactorization implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 300; i++) {
            if(isPrime(i)) System.out.println("Lazy Prime number = "+i);
        }
    }

    public boolean isPrime(int number){
        if(number<2) return false;
        else if(number==2) return true;
        else{
            for (int i = 2; i < number; i++) {
                if(number%i==0) return false;
            }
            return true;
        }
    }
}
