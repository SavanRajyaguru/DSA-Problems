//Fib Numbers: 0 1 1 2 3 5 8
public class Fib_Number {

    // Recursion 
    // time: O(2^n)
    // Auxiliary space: O(n)
    protected static int fib(int n){
        
        // base case
        if(n == 0 || n == 1){
            return n;
        }
        
        return fib(n-1) + fib(n-2);
    }

    // Loop DP consept
    // time: O(n)
    // Auxiliary space: O(1)
    protected static void fibonacci(int n){
        int a = 0;
        int b = 1;
        System.out.print(a + " "+ b);
        for(int i = 2; i <= n; i++){
            int c = a + b;
            System.out.print(" "+c);
            a = b;
            b = c;
        }
    }
    public static void main(String[] args){
        int n = 9;
        System.out.println(fib(n));
        fibonacci(n);
    } 
}
