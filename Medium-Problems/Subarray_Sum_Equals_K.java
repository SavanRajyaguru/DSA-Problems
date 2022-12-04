import java.util.HashMap;
// Input: nums = [1,1,1], k = 2
// Output: 2

// Input: nums = [1,2,3], k = 3
// Output: 2
class Subarray_Sum_Equals_K{

    // Time: O(n)
    // Space: O(n)
    private static int findSubarr(int[] arr, int k){
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            if(map.containsKey(sum - k)){
                ans += map.get(sum - k); 
            }
            map.put(sum, map.getOrDefault(sum, 0)+1);
            System.out.println(map);
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1,1,1};
        int k = 2;
        System.out.println(findSubarr(arr, k));
    }
}