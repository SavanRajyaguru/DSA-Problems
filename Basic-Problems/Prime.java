// number is divisible by 1 and it self 
// n = 13 is prime 
// n = 12 is not prime
// 2,3,5,7,11,13,17,19

public class Prime {

    protected static boolean checkPrime(int n){
        if(n == 1) return false;

        if(n == 2 || n == 3) return true;

        if(n % 2 == 0 || n % 3 == 0) return false;
        
        for(int i = 5; i*i <= n; i+=6){
            if(n % i == 0 || n % (i+2) == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 1031;
        System.out.println("Prime: "+checkPrime(n));
    }
}
