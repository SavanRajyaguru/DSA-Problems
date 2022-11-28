// I/P: n = 5, k = 1 binary of n = 0101 
// O/P: Yes
// I/P: n = 8, k = 2 binary of n = 1000 
// O/P: No

public class Kth_bit_is_set_or_not {

    protected static boolean isKthSet(int n, int k){
        int x = (n << (k-1));
        if((n & x) != 0) 
            return true; 
        else
            return false;

    }

    public static void main(String[] args) {
        int n = 8, k = 2;
        System.out.println(isKthSet(n, k));
    }
}
