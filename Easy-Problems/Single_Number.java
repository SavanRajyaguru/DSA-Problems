/*
    https://leetcode.com/problems/single-number/
    You must implement a solution with a linear runtime complexity 
    and use only constant extra space.
    Input: nums = [4,1,2,1,2]
    Output: 4
 */
public class Single_Number {

    // XOR opration with all the element
    protected static int findUnique(int[] arr){
        int res = 0;
        for(int i : arr){
            res ^= i;
            System.out.println(res);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        System.out.println("Final result: "+findUnique(arr));
    }
}
