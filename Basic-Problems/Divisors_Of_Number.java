// n = 7 O|P = 1,7
// n = 100 O|P = 1,2,4,5,10,20,25,50,100
// n = 15 O|P = 1,3,5,15

public class Divisors_Of_Number {
    // Efficient Approach
    // Time: O(spuareroot of n)
    protected static void printDivisor(int n){
        int i;
        for(i=1; i*i < n; i++){ // print all divisor from 1 to squreareroot of n
            if(n % i == 0)
                System.out.println(i);
        }
        for( ; i>=1; i--){ // print all the divisor form squreareroot of n to n
            if(n % i == 0)
                System.out.println(n/i);
        }
    }


    // Simple Approach
    // Time: O(n)
    protected static void printDivisorOfNo(int n){
        for(int i = 1; i<=n; i++){
            if(n % i == 0)
                System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int n = 25;
        printDivisor(n);
    }
}
