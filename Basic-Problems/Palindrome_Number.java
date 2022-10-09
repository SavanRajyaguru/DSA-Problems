public class Palindrome_Number {
    
    // Time: O(x) x is number is digits
    // Space: O(1)
    protected static boolean checkPalindrome(int x){
        int rev = 0;
        int temp = x; // Need orignal number at the end that's why temp is created
        while(temp != 0){
            int lastDigit = temp%10; // get the last digit
            /* 
                Store to the reverse
                0 * 10 + 1 = 1
                1 * 10 + 2 = 12
                12 * 10 + 1 = 121
                121 * 10 + 2 = 1212
                1212 * 10 + 1 = 12121
            */ 
            rev  = rev * 10 + lastDigit; 
            temp = temp/10;
            
        }
        System.out.println("Reverse Number: "+rev);
        return (rev == x);
    }

    public static void main(String[] args) {
        int x = 12121;
        System.out.println(checkPalindrome(x));
    }
}
