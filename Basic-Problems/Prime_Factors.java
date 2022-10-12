// n = 12 O/P = 2,2,3
// n = 13 O/P = 13
// n = 315 O/P = 3,3,5,7
// n = 450 O/P = 2,3,3,5,5

// Time: O(squareroot of n)
public class Prime_Factors {
    
    protected static void findPrimeFactors(int n){
        while(n % 2 == 0){
            System.out.println(2);
            n = n/2;
        }
        while(n % 3 == 0){
            System.out.println(3);
            n = n/3;
        }
        for(int i=5; i*i <= n; i+=6){
            while(n % i == 0){
                System.out.println(i);
                n = n/i;
            }
            while(n % (i+2) == 0){
                System.out.println(i+2);
                n = n/(i+2);
            }
        }
        if(n > 3)
            System.out.println(n);
        
    }
    public static void main(String[] args) {
        int n = 450;
        findPrimeFactors(n);
    }
}
