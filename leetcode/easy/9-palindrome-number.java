class Solution {
    public boolean isPalindrome(int x) {
        int original = x;
        int reversedX = 0;

        while ( x > 0) {
            int lastDigit = x % 10;

            reversedX = reversedX*10 + lastDigit;

            x = x / 10 ;
        }

        return reversedX == original;   
    }
}
