import java.util.ArrayList;
import java.util.Arrays;
class test{
    private static void union(int[] arr1, int[] arr2, int n, int m){
        int ans = 0;
        int total = m *(m+1)/2;
        for(int i: arr2)
            ans += i;
        System.out.println(total-ans);
    }

    public static void main(String[] args) {
         
        int arr1[] = {1,35};  
        int arr2[] = {0,1,3};
        int n = arr1.length, m = arr2.length;
        
        union(arr1, arr2, n, m);
    }

}