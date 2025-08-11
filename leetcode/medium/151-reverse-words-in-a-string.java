// Solution 1:
// Time Complexity: O(n) - we scan the string once to split and once to join
// Space Complexity: O(n) - stores words array + output string

class Solution {
    public String reverseWords(String s) {
        
        StringBuilder sb = new StringBuilder ();
        String [] words = s.trim().split("\\s+");

        for (int i = words.length - 1 ; i >= 0 ; i--){
            sb.append (words[i]);

            if (i > 0) {
                sb.append (" ");
            }
        }
        return sb.toString ();
    }
}



// Solution 2: Two-pointer approach
// Time Complexity: O(n) - each character is visited at most twice
// Space Complexity: O(n) - only uses StringBuilder for the output (no extra array)
// More memory-efficient than split() version

class Solution {
    public String reverseWords(String s) {
      
        StringBuilder sb = new StringBuilder();
        int i = s.length() - 1; 

        while (i >= 0) {
            // Skip spaces from the end
            while (i >= 0 && s.charAt(i) == ' '){
              i--;
            }
            if (i < 0){
              break;
            }

            // Mark the end of the word
            int j = i;
          
            // Move i backward until we find the space before the word
            while (i >= 0 && s.charAt(i) != ' '){
              i--;
            }

            // add space before appending next word
            if (sb.length() > 0){
              sb.append(' ');
            }
            sb.append(s.substring(i + 1, j + 1));
    }
    return sb.toString();
}    
