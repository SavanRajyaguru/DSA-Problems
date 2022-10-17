import java.util.ArrayList;
import java.util.Stack;

/*
https://leetcode.com/problems/baseball-game/
You are given a list of strings operations, where operations[i] is the ith operation you must apply to the record and is one of the following:

An integer x.
    Record a new score of x.
'+'.
    Record a new score that is the sum of the previous two scores.
'D'.
    Record a new score that is the double of the previous score.
'C'.
    Invalidate the previous score, removing it from the record.
Return the sum of all the scores on the record after applying all the operations.

Input: ops = ["5","2","C","D","+"]
Output: 30
Explanation:
"5" - Add 5 to the record, record is now [5].
"2" - Add 2 to the record, record is now [5, 2].
"C" - Invalidate and remove the previous score, record is now [5].
"D" - Add 2 * 5 = 10 to the record, record is now [5, 10].
"+" - Add 5 + 10 = 15 to the record, record is now [5, 10, 15].
The total sum is 5 + 10 + 15 = 30.
 */

public class Baseball_Game {

    // Simple approch 
    // Time: O(2n)
    // Space: O(N)
    private static int calPoints(String[] arr) {
        ArrayList<Integer> points = new ArrayList<Integer>();
        int i = 0;
        int j = -1;
        while(i < arr.length){
            if(arr[i] == "+"){
                int sum = points.get(j-1) + points.get(j);
                points.add(sum);
                j++;
            }
            else if(arr[i] == "C"){
                points.remove(j);
                j--;
            }
            else if(arr[i] == "D"){
                int mul = 2 * points.get(j);
                points.add(mul);
                j++;
            }
            else {
                int n = Integer.parseInt(arr[i]);
                points.add(n);
                j++;
            }
            i++; 
            System.out.println(points);   
        }
        int sum = points.stream().mapToInt(k -> k).sum();
        return sum;
    }

    // using stack 
    // Time: O(N)
    // Space: O(1)
    private static int secondApproch(String[] arr){
        Stack<Integer> stack = new Stack<>();

        for(String op : arr){
            if(op.equals("+")){
                int top = stack.pop();
                int newtop = top + stack.peek();
                stack.push(top);
                stack.push(newtop);
            } else if(op.equals("C")){
                stack.pop();
            } else if(op.equals("D")){
                stack.push(2 * stack.peek());
            } else {
                stack.push(Integer.valueOf(op));
            }
        }

        int ans = 0;
        for(int i : stack) ans += i;
        return ans;
    }
    public static void main(String[] args) {
        String[] arr = {"5","-2","4","C","D","9","+","+"};
        System.out.println(calPoints(arr));
        System.out.println("Second Approch: "+secondApproch(arr));
    }
}
