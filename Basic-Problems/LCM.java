// a=4, b=6 LCM=12 

public class LCM {
    
    // Euclidean algo 
    // Time: log(min(a,b))
    static int gcd(int a, int b){
        if(b == 0)
            return a;
        else
            return(gcd(b, a%b));
    }

    protected static int lcm(int a, int b){
        return (a*b) / gcd(a,b);
    }

    protected static int findlcm(int a, int b){
        int res = Math.max(a, b);
        while(true){
            if(res % a == 0 && res % b == 0)
                return res;
            res++;
        }
    }
    public static void main(String[] args) {
        int a = 6, b = 4;
        System.out.println("Euclidean LCM: "+lcm(a,b));
        System.out.println("Simple LCM: "+lcm(a,b));
        
    }
}
