public class Count_Digits {
    
    // time: O(n)
    protected static int countNo(int n){
        int res = 0;
        while(n > 0){
            n = n/10;
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 7007;
        System.out.println(countNo(n));
    }
}
