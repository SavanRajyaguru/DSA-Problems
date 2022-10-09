// n = 5  factorial ans = 120 that's why trailing zeros is 1
// n = 10 factorial ans = 3628800  Trailing zeros is 2 

// Time: O(logn)
public class Trailing_Zeros_in_Factorial {

    protected static int countTrailingZeros(int n){
        int res = 0;
        for(int i = 5; i <= n; i=i*5)
            res = res + (n / i);
        return res;
    }

    public static void main(String[] args) {
        int x = 251;
        System.out.println("Trailing Zeros: "+countTrailingZeros(x));
    }
}
