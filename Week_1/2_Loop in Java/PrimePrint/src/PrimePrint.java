import java.util.Scanner;

public class PrimePrint {
    public static boolean checkPrime(int a) {
        boolean is_prime=true;
        if(a<2) {
            is_prime=false;
        } else {
            int i=2;
            while(i<=Math.sqrt(a)) {
                if(a%i==0) {
                    is_prime=false;
                    break;
                }
                i++;
            }
        }
        return is_prime;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of prime: ");
        int numbers=sc.nextInt();
        int count=0;
        int N=2;
        while(count<numbers) {
            if (checkPrime(N)) {
                System.out.println(N);
                N++;
                count++;
            } else {
                N++;
            }
        }
    }

}
