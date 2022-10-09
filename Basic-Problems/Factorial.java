// n = 5 ( 1*2*3*4*5 = 120 )
public class Factorial {
    // Recursive 
    // Time: O(n)
    // Auxiliary space: O(n) beacuse of function stack memory
    protected static int fact(int n){
        // base case 
        if(n == 0)
            return 1;
        return n * fact(n-1);
    }

    // Iterative solution
    // Time: O(n)
    // Space: O(1)
    protected static int factorial(int n){
        int res = 1;
        for(int i = 2; i <= n; i++)
            res = res*i;
        return res;
    }

    public static void main(String[] args) {
        int x = 5;
        System.out.println("Recursive: "+fact(x));
        System.out.println("Intrative: "+factorial(x));
    }
}
