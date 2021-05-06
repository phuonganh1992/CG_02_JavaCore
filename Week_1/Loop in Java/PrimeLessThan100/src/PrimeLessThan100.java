import java.util.Scanner;

public class PrimeLessThan100 {
    public static boolean checkPrime (int a){
            boolean is_prime = true;
            if (a < 2) {
                is_prime = false;
            } else {
                int i = 2;
                while (i <= Math.sqrt(a)) {
                    if (a % i == 0) {
                        is_prime = false;
                        break;
                    }
                    i++;
                }
            }
            return is_prime;
        }
        public static void main (String[]args){
            System.out.println("The prime less than 100 is listed below: ");
            int N = 2;
            while (N < 100) {
                if (checkPrime(N)) {
                    System.out.println(N);
                    N++;
                } else {
                    N++;
                }
            }
        }
    }

