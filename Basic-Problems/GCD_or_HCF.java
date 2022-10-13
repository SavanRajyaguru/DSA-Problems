// a=10, b=15  GCD=5
// a=7, b=13 GCD=1
// Logic: GCD is never going beyond the minimum of the a and b

public class GCD_or_HCF {

    // Euclidean Algo
    // Time: O(log(min(a,b)))
    protected static int gcd(int a, int b){
        // base case 
        if(b == 0)
            return a;
        else 
            return gcd(b, a%b);
    }

    // Simple approach
    // Time: O(min(a,b))
    protected static int findGCD(int a, int b){
        // find the minimun of a and b
        int res = Math.min(a, b);
        while(res > 0){
            if(a % res == 0 && b % res == 0)
                break;
            res--;
        }
        return res;
    }
    public static void main(String[] args) {
        int a = 10, b = 15;
        System.out.println("Simple GCD: "+findGCD(a,b));
        System.out.println("Eucliden GCD: "+gcd(a,b));
    }
}
