import java.util.*;

public class PrimeNumberChecker {
    public static boolean isPrime(int num) {
        if(num <= 1) return false;

        for(int i=2;i <= Math.sqrt(num);i++){
            if(num % i ==0) {
                return  false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int number = sc.nextInt();

        if(isPrime(number)) {
            System.out.print(number + " is a Prime");
        }
        else {
            System.err.println(number + " is not a Prime");
        }
    }
}