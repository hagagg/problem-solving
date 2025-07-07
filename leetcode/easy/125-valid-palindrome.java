// First Solution - More Memory management  O(n)

//class Solution {
//    public boolean isPalindrome(String s) {
//        s= s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
//
//        int start = 0;
//        int end = s.length() - 1;
//
//        while (start < end) {
//            if (s.charAt(start) != s.charAt(end)) {
//                return false;
//            }
//            start++;
//            end--;
//        }
//        return true;
//    }
//}


// Solution For more optimized in memory usage  O(1)

class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {

            while (start < end && !Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            }
            while (start < end && !Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }
            if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}