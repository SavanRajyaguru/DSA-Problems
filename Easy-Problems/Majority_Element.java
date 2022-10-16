/*
    https://leetcode.com/problems/majority-element/
    The majority element is the element that appears more than ⌊n / 2⌋ times.
    You may assume that the majority element always exists in the array.

    Input: nums = [2,2,1,1,1,2,2]
    Output: 2
 */

public class Majority_Element {
    
    protected static void countElement(int[] arr){

        // Moore's Voting algo
        // Time: O(n)
        // Space: O(1)
        int major = arr[0], count = 1;
        for (int i=1; i<arr.length; i++){
            if(major == arr[i])
                count++;
            else
                count--;

            if(count == 0){
                count++;
                major = arr[i];
            }
        }
        System.out.println(major);
    }
    public static void main(String[] args) {
        int[] arr = {2,2,3,3,2,3,3};
        countElement(arr);
    }
}
