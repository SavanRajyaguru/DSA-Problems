import java.util.HashMap;

/*
    https://leetcode.com/problems/roman-to-integer/
    
    Input: s = "MCMXCIV"
    Output: 1994
    Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 */
public class Roman_to_Integer {
    public static void main(String[] args) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        String s = "MCMXCIV";
        int ans = map.get(s.charAt(s.length()-1));
        for(int i = s.length()-2; i>=0; i--){
            if(map.get(s.charAt(i)) >= map.get(s.charAt(i+1))){
                ans += map.get(s.charAt(i));
                System.out.println(ans);
            }
            else{
                ans -= map.get(s.charAt(i));
                System.out.println(ans);
            }
        }
        System.out.println("Final Ans: "+ans);
    }
}
