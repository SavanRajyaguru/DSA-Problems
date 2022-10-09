// Time: O(n)
// Space: O(n)

public class SumOfNumber{

    protected static int sumOfNumber(int n){

        // base case
        if(n <= 0)
            return 0;
            
        return n + sumOfNumber(n-1);
    } 
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sumOfNumber(n));
    }

}