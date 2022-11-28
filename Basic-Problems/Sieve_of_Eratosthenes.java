import java.util.Arrays;

// I/P: 10  O/P: 2,3,5,7 (Prime Number)
// I/P: 23  O/P: 2,3,5,7,11,13,17,19,23
// Time: O(N log log N)

public class Sieve_of_Eratosthenes {

    // check for the prime number
    protected static boolean isPrime(int n){
        if(n == 1) return false;
        if(n == 2 || n == 3) return true;
        if(n%2 == 0 || n%3 == 0) return false;
        for(int i=5; i*i <= n; i+=6){
            if(n%i == 0 || n % (i+2) == 0)
                return false;
        }
        return true;
    }

    protected static void displayPrimeNumber(int n){
        boolean arr[] = new boolean[n+1];
        Arrays.fill(arr, true);
        
        for(int i = 2; i<=n; i++){
            if(isPrime(i)){
                System.out.println(i);
                for(int j=i*i; j<=n; j=j+i){
                    arr[j] = false;
                }
            }
        }
    }
    public static void main(String[] args) {
        int n = 23;
        displayPrimeNumber(n);
    }
}
